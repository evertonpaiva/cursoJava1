
public class TesteConversao {

	public static void main(String[] args) {
		double salario = 1270.50;
		int valor = (int) salario;
		System.out.println(valor);
		
		long numeroGrande = 99999999999999999L;
		System.out.println(numeroGrande);
	
		short valorPequeno = 2131;
		System.out.println(valorPequeno);
		
		byte b = 127;
		System.out.println(b);
		
		float pontoFlutuante = 3.14f;
		System.out.println(pontoFlutuante);
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1+valor2;
		System.out.println(total);
		
	}
}
