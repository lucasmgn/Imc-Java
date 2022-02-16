
public class PrincipalImc {

	public static void main(String[] args) {
		Paciente pessoa = new Paciente();
		pessoa.peso = 150;
		pessoa.altura = 1.95;
		
		Imc imc = pessoa.calcularImc();
		
		System.out.println("Abaixo do peso ideal: " + imc.abaixoDoPesoIdeal);
		System.out.println("Peso ideal: " + imc.pesoIdeal);
		System.out.println("Obeso: " + imc.obeso);
		System.out.println("Grau de obesidade: " + imc.grauDeobesidade);
	}
	
}
