package service;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import entity.Senha;

public class SenhaService {
	
	public Senha senha;
	
    public Senha gerarNovaSenha(String servico, String tipo, String senhaAnterior) {
    	
    	senha = new Senha();
    	
    	//numero senha
        int numero = Integer.parseInt(senhaAnterior);
        numero++;
        String novoNumero = Integer.toString(numero);
        String siglaTipoServico = servico.substring(0, 3);
        String numeroSenha = siglaTipoServico + novoNumero;
        senha.setNumeroSenha(numeroSenha);
        
        //hora cadastro
        SimpleDateFormat horaformatada = new SimpleDateFormat("HH:mm:ss");
        Calendar cal = new GregorianCalendar(); 
        senha.setHoraCadastro(horaformatada.format(cal.getTime()));
        
        senha.setTipo(tipo);
        senha.setPrevIniAtendimento("00:00");
        senha.setPrevTerAtendimento("00:00");
        senha.setServico(servico);
        return senha;
        
    }

}

