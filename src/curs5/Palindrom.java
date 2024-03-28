package curs5;

public class Palindrom {

	public static void main(String[] args) {
	/*
		 * cuvant =  radar --> radar.lenght() = 5
		 * cuvantIntors = ""
		 * cuvantIntors = cuvantIntors + cuvant.charAt(4)
		 * "" = "" + r
		 * cuvantIntors = cuvantIntors + cuvant.charAt(3)
		 * r = r + a
		 * cuvantIntors = cuvantIntors + cuvant.charAt(2)
		 * ra =  ra + d
		 * 
		 */
		
		String cuvant = "radar"; 
		String cuvantIntors = "";
		
		for(int i = cuvant.length()-1; i>=0; i--) {     //length o sa ia nr de litere ale cuvantului si cu -1 o sa scada o valoare 5-1 = 4
			
			cuvantIntors = cuvantIntors + cuvant.charAt(i);		// "" = "" + r
		}
		
		if(cuvant.equals(cuvantIntors)) {
			
			System.out.println("Este palindrom");

		}else {
			System.out.println("Nu este palindrom");
		}
		
	}

}
