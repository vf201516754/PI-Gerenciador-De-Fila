package entity;

public class Fila {
	String tipo;
	int tamanho;
	int inicio;
	int fim;
	int total;
	Senha vetor[];
	
	public Fila(String tipo) {
		tipo = tipo;
		inicio = 0;
		fim = 0;
		total = 0;
		tamanho = 10000;
		vetor = new Senha[tamanho];
	}


	public boolean vazia () {
		if(total == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean cheia () {
		if(total >= tamanho) { 
			return true;
		} 
		else {
			return false;
		}
	}
		
	public void enfileirar(Senha senha) {
		if(!cheia()) {
			vetor[fim] = senha;
			fim++;
			total++;
			if(fim >= tamanho) {
				fim = 0;
			}
		} else {
			System.out.println("Fila cheia");
		}
	}
	
	public Senha desenfileirar() {
		Senha senha = new Senha();
		String filaVazia;
		{ if (vazia() == false ) {
			senha = vetor[inicio];
			inicio++;
			if (inicio >= tamanho) {
				inicio = 0;
			}
			total--;
		} else
			filaVazia = "Fila vazia";
		}
		return senha;
	}
	
	public void exibeFila() {
		for (int i = 0; i < total; i++) {
			System.out.println(vetor[i]);
			
		}
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
 }
