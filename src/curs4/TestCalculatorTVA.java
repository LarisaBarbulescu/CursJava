package curs4;

public class TestCalculatorTVA {

	public static void main(String[] args) {
		
		CalculatorTVA calc1 = new CalculatorTVA(5);
		CalculatorTVA calc2 = new CalculatorTVA(9);
		CalculatorTVA calc3 = new CalculatorTVA(19);
		
		double rezult1 = calc1.adunaTVA(170.0);
		double rezult2 = calc2.adunaTVA(30);
		double rezult3 = calc3.adunaTVA(45.0);
		
		System.out.println("Resultat adunare 1: " + rezult1);
		System.out.println("Resultat adunare 2: " + rezult2);
		System.out.println("Resultat adunare 3: " + rezult3);
		
		//afisam nr total de calcule tva pe ca le facem
		System.out.println("Nr total de calcule:" + CalculatorTVA.getNrCalculTotal());
		
	}

}
