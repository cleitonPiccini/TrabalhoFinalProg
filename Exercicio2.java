import java.util.*;

public class Exercicio2 {

	public static void main (String [] args){

		Date d = new Date();
		DiaSemana dias = new DiaSemana();
		DiaMes mes = new DiaMes();
		int i = d.getDay();
		int c = d.getMonth();

		System.out.println ("Hoje é " + dias.Dia(i) + ", dia " + (d.getDate()) + " de " + mes.getMes(c) + " de " + ((d.getYear() - 100) + 2000));


	}
}