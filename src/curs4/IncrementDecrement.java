package curs4;

/*
 * operator unar --> un operand .. numar++
 * operatori binari --> doi operanzi .. numar1 + numar 2
 * operator ternar --> trei operanzi (operator conditional)

 * 
 */


public class IncrementDecrement {

	public static void main(String[] args) {
		
		//num++ --> POST increment (creste cu 1)
		//++num --> PRE increment
		// num-- --> POST decrement (scade cu 1)
		//--num --> PRE decrement
		
		//num++ (doar la numere) --> num = num +1 sau num += 1 (poate fi folosit la string)
		
		//Post -> mai intai executa linia si apoi face incrementul

		int num =10;
		System.out.println("Numar :" + num);
		System.out.println("Numar POST increment :" + num++); 
		System.out.println("Numar :" + num);
		System.out.println("---------");
		
		//PRE -> mai intai face incrementul, iar apoi executa linia
		
		int num2 = 10;
		System.out.println("Numar :" + num2);
		System.out.println("Numar PRE increment :" + ++num2); 
		System.out.println("Numar :" + num2);
		

	}

}
