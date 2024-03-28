package curs4;
/*
 * scriem un program de tip calculator care calculeaza tva pt o suma
 *tva poate avea multiple valori, o sa il atribuim cand facem obiectul
 *afisam calculul pt valori diferite
 *afisam nr total de calcule tva pe ca le facem
  * 
  */


public class CalculatorTVA {

	private double tvaDouble;
	private static int nrCalculTotal = 0; //folosesti cand ai de calculat nr lor
	
	//19 --> 19/100
	
	public CalculatorTVA(int tva) {
		this.tvaDouble = tva/100.0;
		
		//System.out.println();
	}
	
	public double adunaTVA(double suma) {
		
		//calculeaza nr total de calcule tva pe ca le facem
		
		nrCalculTotal++; //nrCAlculTotal = nrCAlculTotal + 1;
		return suma * (1 + tvaDouble);
		
	}
	
	public static int getNrCalculTotal() {
		return nrCalculTotal;
		
	}
	
	
	
}
