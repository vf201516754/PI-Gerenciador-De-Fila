package service;

import entity.Fila;
import entity.Senha;

public class FilaService {
	
	public Fila filaPreferencial;
	public Fila filaNormal;
	public Fila filaEspecial;
	
	// método para criar a fila de cada servico
	public void criarFilas(String tipoDaFila) {
		
		filaPreferencial = new Fila(tipoDaFila);
		filaNormal = new Fila(tipoDaFila);
		filaEspecial = new Fila(tipoDaFila);
		
	}
	
	//método pega a senha gerada e coloca na fila de acordo com o tipo. Os servicos são subdivididos em tipos de filas (preferencial, normal, especial)
	public void colocaSenhaNaFila(String servico, String tipo, String senhaAnterior) {
		SenhaService novaSenha = new SenhaService();
		Senha senha = new Senha();
		senha = novaSenha.gerarNovaSenha(servico, tipo, senhaAnterior);

		if (tipo.equals("preferencial")) {
			System.out.println("Fila Preferencial");
			filaPreferencial.enfileirar(senha);
			filaPreferencial.exibeFila();
		} 
		else if (tipo.equals("normal")) {
			System.out.println("Fila Normal");
			filaNormal.enfileirar(senha);
			filaNormal.exibeFila();
		} else {
			System.out.println("Fila Especial");
			filaEspecial.enfileirar(senha);
			filaEspecial.exibeFila();
		}
	}
	
	public void removeSenhaDaFila() {
		Senha senha = new Senha();
		if(!filaPreferencial.cheia()) {
			System.out.println("Fila Preferencial");
			senha = filaPreferencial.desenfileirar();
			filaPreferencial.exibeFila();
			
		}else if (!filaEspecial.cheia() ) {
			System.out.println("Fila Especiail");
			filaEspecial.enfileirar(senha);
			filaEspecial.exibeFila();
		}
		
		else {
			System.out.println("Fila Normal");
			filaNormal.enfileirar(senha);
			filaNormal.exibeFila();
		}
	}
}
