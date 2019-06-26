package BuscaCega;

public class ArvoreBinaria {

	private int valor;
	private ArvoreBinaria esquerda;
	private ArvoreBinaria direita;
	
	// Montando o vetor;
	public ArvoreBinaria(int valor) {
		this.valor = valor;
		this.direita = null;
		this.esquerda = null;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public ArvoreBinaria getEsquerda() {
		return esquerda;
	}

	public void setEsquerda(ArvoreBinaria esquerda) {
		this.esquerda = esquerda;
	}

	public ArvoreBinaria getDireita() {
		return direita;
	}

	public void setDireita(ArvoreBinaria direita) {
		this.direita = direita;
	}

}
