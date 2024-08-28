package poo_02;
import poo_02.aviao;
public class atividade_aviao {

	public static void main(String[] args) {
		
		aviao aviao1 = new aviao ();
		aviao aviao2 = new aviao ();
		aviao aviao3 = new aviao ();
		aviao aviao4 = new aviao ();
		
		aviao1.getMarca("asa branca");
		aviao1.getModelo("hornet");
		aviao1.getPreco(1000);
		aviao1.getLugares(9292);
		
		System.out.println("---- OBJETO 1 ----");
		System.out.println(aviao1.getMarca ());
		System.out.println(aviao1.getModelo ());
		System.out.println(aviao1.getPreco());
		System.out.println(aviao1.getLugares ());

	}

}
