
public class sumaPrimosMenores50 {

	public static void main(String[] args) {
		int sumaPrimos = 0;
		for(int j= 1;j<=50;j++) 
		  if( esPrimo(j)) 
				sumaPrimos+=j;
		System.out.println("Suma de los números primos de los 50 primeros números "+ sumaPrimos);
	}
	
	public static boolean esPrimo(int value) {
		if (value <=1) return false;
		for(int i =2;i<value;i++) 
			if( value % i == 0 )
				return false;
		return true;
	}
	
}
