
public class Paciente {
	double peso;
	double altura;
	
	Imc calcularImc() {
		
		Imc imc = new Imc();
		
		double indice = peso / (altura * altura);
		imc.indice = indice;
		
		if (indice < 18.5) {
			imc.abaixoDoPesoIdeal = true;
		} else if (indice < 25) {
			imc.pesoIdeal = true;
		} else {
			imc.obeso = true;
			
			if (indice < 30) {
				imc.grauDeobesidade = "Acima do peso";  
			} else if (indice < 35) {
				imc.grauDeobesidade = "I";
			} else if (indice < 40) {
				imc.grauDeobesidade = "II";
			} else {
				imc.grauDeobesidade = "III";
			}
		}
		
		return imc;
	}

}
