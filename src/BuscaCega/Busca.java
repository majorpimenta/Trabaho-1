package BuscaCega;

public class Busca {

	public static void main(String[] args) {
		
		ArvoreBinaria p1 = new ArvoreBinaria(1);
		ArvoreBinaria p2 = new ArvoreBinaria(2);
		ArvoreBinaria p3 = new ArvoreBinaria(3);
		ArvoreBinaria p4 = new ArvoreBinaria(4);
		ArvoreBinaria p5 = new ArvoreBinaria(5);
		ArvoreBinaria p6 = new ArvoreBinaria(6);
		ArvoreBinaria p7 = new ArvoreBinaria(7);
		ArvoreBinaria p8 = new ArvoreBinaria(8);
		ArvoreBinaria p9 = new ArvoreBinaria(9);
		ArvoreBinaria p10 = new ArvoreBinaria(10);
		ArvoreBinaria p11 = new ArvoreBinaria(11);
		ArvoreBinaria p12 = new ArvoreBinaria(12);
		ArvoreBinaria p13 = new ArvoreBinaria(13);
		ArvoreBinaria p14 = new ArvoreBinaria(14);
		ArvoreBinaria p15 = new ArvoreBinaria(15);
		
		
		p1.setEsquerda(p2);
		p1.setDireita(p3);
		
		p2.setEsquerda(p4);
		p2.setDireita(p5);
		
		p3.setEsquerda(p6);
		p3.setDireita(p7);
		
		p4.setEsquerda(p8);
		p4.setDireita(p9);
		
		p5.setEsquerda(p10);
		p5.setDireita(p11);
		
		p6.setEsquerda(p12);
		p6.setDireita(p13);
		
		p7.setEsquerda(p14);
		p7.setDireita(p15);
		
		BuscaProfunda x1 = new BuscaProfunda(9);
		x1.busca(p1);
		x1.Resposta();

	}

}
