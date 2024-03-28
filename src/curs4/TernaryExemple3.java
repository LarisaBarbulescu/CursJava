package curs4;

/*
 * 1. verific daca cosul este gol si printam 
 * 2. verific daca total cos este peste 100
 * 3. verific daca nr de produse este mai mare ca 5 si total cos este mai mare ca 120
 * -> numar de produse este mare si total cos este mare
 * -> numar de produse este mai mic si totalul este mic
 * 
 */


public class TernaryExemple3 {

	public static void main(String[] args) {

	int totalCosCumparaturi = 120;
	int numarProduseInCos = 3;
	
	//1. 
	//verific daca cosul este gol si printam 
	
	String mesaj = (numarProduseInCos == 0) ?"Cosul este gol" :"Cosul nu este gol";
	System.out.println(mesaj);
	
	//2. 
	//verific daca total cos este peste 100
	mesaj =	(totalCosCumparaturi>100) ?"Total cumparaturi peste 100" : "Total sub 100";
	System.out.println(mesaj);
	
	 //3. verific daca nr de produse este mai mare ca 5 
	// -> daca este verific si ca total cos este mai mare ca 120
	 // -> numar de produse este mare si total cos este mare
	 // -> numar de produse este mai mare si totalul este mic
	// -> nr produse este mic
	
	mesaj =(numarProduseInCos>5 ) ?(totalCosCumparaturi>120)?
		"numar de produse este mare si total cos este mare": 
			"numar de produse este mai mare si totalul este mic":
				"nr produse este mic";
	System.out.println(mesaj);
	
	
	

	}

}
