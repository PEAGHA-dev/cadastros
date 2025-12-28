package run;

import java.time.LocalDate;
import java.util.Date;

import entidades.Pessoa;

public class Principal{
	public static void main(String[] args){
		
		LocalDate data = LocalDate.now();
		
		Pessoa p = new Pessoa(0, "Peagha", "(027) 99526-2584", 30, "Masculino", data);
		System.out.println("Olá Mundo! "+p.toString());
	}
}