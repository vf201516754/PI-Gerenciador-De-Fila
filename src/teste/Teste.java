package teste;

import service.FilaService;
import javax.swing.*;

public class Teste {
	
	
	
    public static void main(String[] args) {
    	
    	// estou setanto um tipo de fila lembrando que esse tipo de fila deve ser informado pelo adminstrador do sistema quando ele cadastrar um serviço novo
    	String tipoDaFila = "autenticação"; 
    	
    	
    	
    	//cria as filas de acordo com oo tipo
    	FilaService fila = new FilaService();
    	
    	fila.criarFilas(tipoDaFila);
    	
    	int opcao  = 1;
    	while(opcao != 4) {
    		opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "1-Usuario (Gerar Senha) \n" + "2-Atendente (Chamar Senha)"));
    		String servico;
    		String tipo;
    		switch (opcao) {
    			case 1:
    				servico = JOptionPane.showInputDialog(null, "Digite o servico desejado:");
    				tipo = JOptionPane.showInputDialog(null, "Digite o tipo desejado: (normal, preferencial, especial)");
    				fila.colocaSenhaNaFila(servico, tipo, "5");
    				break;
    			case 2:
    				JOptionPane.showMessageDialog(null, "Senha retirada e encaminhada para o segundo subserviço");
    				fila.removeSenhaDaFila();
    				break;
    		}
    	}
    	

    }

}
