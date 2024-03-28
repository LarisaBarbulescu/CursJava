package curs5;

public class StringComparison {

	public static void main(String[] args) {

		
		String first = "Java";   
		String second = "Code";
		String third = "Java";    //are aceeasi locatie cu first
		String fourth = new String("Java");   //cu new in fata java aloca o alta locatie pentru caracterul "java" si chiar daca este tot string nu le vede identice
		
		System.out.println(first);
		System.out.println(third);
		System.out.println(fourth);
	
		System.out.println( first ==  third);
		System.out.println( first ==  second);
		System.out.println( first.equals(third));
		System.out.println( first.equals(second));
		
		System.out.println("----------------------------");
		
		
		System.out.println( first ==  fourth);       //verifica locatia
		System.out.println( first.equals(fourth));  //ideal pt stringuri pt ca verifica continutul si nu locatia
	}

}
