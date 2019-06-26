package BuscaCega;

import java.util.Stack;

public class BuscaProfunda {
	
	private Stack<ArvoreBinaria> pilhaArvore;
        private Stack<ArvoreBinaria> pilhaAux;
	private int valorBusca;
	private int contador = 0 ; 
	private String resposta;
	private String vetor = "";
	
	public BuscaProfunda(int valor){
		this.pilhaArvore = new Stack<ArvoreBinaria>();
		this.valorBusca = valor;
	}
	
	
	
	public boolean VerificaResultado(ArvoreBinaria p) {
		//compara valor do no com valor da busca;
		return p.getValor() == valorBusca;
	}
	
	public boolean busca (ArvoreBinaria p) {
		this.pilhaArvore.add(p);
		this.contador ++;
                this.pilhaAux = new Stack<ArvoreBinaria>();
                this.pilhaAux = this.pilhaArvore;
                
                
                this.vetor = "" +this.vetor  + " " +p.getValor() ;
                System.out.println(" Caminho percorrido: " +this.vetor);
                /*
                while(this.pilhaAux.size() > 0) {
			this.vetor = this.pilhaAux.pop().getValor() + ", " + this.vetor;
			
		}
                */
      
                
		if (VerificaResultado(p)) {
			RespostaPilha();
			System.out.println("Numero de comparaçoes:" +this.contador);
			return true;
			
		}else {
			if (p.getEsquerda() != null && this.busca(p.getEsquerda())) {
				return true;
			
				
			}
			if(p.getDireita() != null && this.busca(p.getDireita())){
				return true;
				
			}
		}
		this.pilhaArvore.pop();
		return false;
	}
	
	
	public void RespostaPilha() {
		String aux = "";
		while(this.pilhaArvore.size() > 0) {
			aux = this.pilhaArvore.pop().getValor() + ", " + aux;
			
		}
		this.resposta = aux;
		
	}
	/*
        public void CaminhoTotal() {
		String aux = "";
		while(this.pilhaAux.size() > 0) {
			aux = this.pilhaAux.pop().getValor() + ", " + aux;
			
		}
		this.vetor = aux;
		
	}
        */
	public void Resposta(){
		if(this.resposta != null) {
			System.out.println("O caminho é: " +resposta);
		}else {
			System.out.println("Valor buscado nao encontrado");
			System.out.println("Numero de comparacoes:" +this.contador);
		} 
			
		
	}
	
}
