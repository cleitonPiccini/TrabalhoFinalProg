public class DiaSemana {
	
	public String Dia (int d){

		if (d == 0){

			return "Sabado";
		}

		if (d == 1){

			return "Domingo";
		}

		if (d == 2){

			return "Segunda";
		}

		if (d == 3){

			return "Terca";
		}

		if (d == 4){

			return "Quarta";
		}

		if (d == 5){

			return "Quinta";
		}

		if (d == 6){

			return "Sexta";
		}

		return "Error";
	}
}