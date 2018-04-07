package entity;

/**
 * Created by victor on 07/04/2017
 */

public class Senha {
	
	//atributos
    private String servico;
    private String tipo;
    private String numeroSenha;
    private String horaCadastro;
    private String prevIniAtendimento;
    private String prevTerAtendimento;
    
    
    //construtor
    public Senha() {
    	this.servico = null;
    	this.tipo = null;
    	this.numeroSenha = null;
    	this.horaCadastro = null;
    	this.prevIniAtendimento = null;
    	this.prevTerAtendimento = null;
    }

    
    //metodos getters e setters
    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNumeroSenha() {
        return numeroSenha;
    }

    public void setNumeroSenha(String numeroSenha) {
        this.numeroSenha = numeroSenha;
    }

    public String getHoraCadastro() {
        return horaCadastro;
    }

    public void setHoraCadastro(String horaCadastro) {
        this.horaCadastro = horaCadastro;
    }

    public String getPrevIniAtendimento() {
        return prevIniAtendimento;
    }

    public void setPrevIniAtendimento(String prevIniAtendimento) {
        this.prevIniAtendimento = prevIniAtendimento;
    }

    public String getPrevTerAtendimento() {
        return prevTerAtendimento;
    }

    public void setPrevTerAtendimento(String prevTerAtendimento) {
        this.prevTerAtendimento = prevTerAtendimento;
    } 
    
    
    //método para exibir no console a senha adidionada a fila
    public String toString() {
    	return this.servico + " " + this.numeroSenha + " " + this.tipo + " " + this.horaCadastro + " " + this.prevIniAtendimento + " " + this.prevTerAtendimento;
    }

}
