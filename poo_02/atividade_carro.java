package poo_02;
import poo_02.carro;
public class atividade_carro {

	public static void main(String[] args) {
		
		carro carro1 = new carro();
		carro carro2 = new carro();
		carro carro3 = new carro();
		carro carro4 = new carro();
		
		carro1.setMarca("Lamborghini");
		carro1.setModelo("Aventador");
		carro1.setPreco(10000);
		carro1.setAno(2010);
		
		carro2.setMarca("Ferrari");
		carro2.setModelo("458 Spider");
		carro2.setPreco(50000);
		carro2.setAno(2020);
		
		carro3.setMarca("Porsche");
		carro3.setModelo("911");
		carro3.setPreco(100000);
		carro3.setAno(2024);
		
		carro4.setMarca("Pagani");
		carro4.setModelo("huaira");
		carro4.setPreco(200000);
		carro4.setAno(2021);
		
		System.out.println("---- OBJETO 1 ----");
		System.out.println(carro1.getMarca ());
		System.out.println(carro1.getModelo ());
		System.out.println(carro1.getPreco ());
		System.out.println(carro1.getAno ());
		
		System.out.println("---- OBJETO 2 ----");
		System.out.println(carro2.getMarca ());
		System.out.println(carro2.getModelo ());
		System.out.println(carro2.getPreco ());
		System.out.println(carro2.getAno ());
		
		System.out.println("---- OBJETO 3 ----");
		System.out.println(carro3.getMarca ());
		System.out.println(carro3.getModelo ());
		System.out.println(carro3.getPreco ());
		System.out.println(carro3.getAno ());
		
		System.out.println("---- OBJETO 4 ----");
		System.out.println(carro4.getMarca ());
		System.out.println(carro4.getModelo ());
		System.out.println(carro4.getPreco ());
		System.out.println(carro4.getAno ());

	}

}
