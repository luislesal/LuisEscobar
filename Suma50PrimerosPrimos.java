
public class Suma50PrimerosPrimos {
	public static void main(String[] args) {
		int sumaPrimos = 0;
		int primosEncontrados = 0;
		int valorActual = 1;
		while(primosEncontrados < 50 ) {
			if(esPrimo(valorActual)) {
				sumaPrimos+=valorActual;
				primosEncontrados++;
			}
			valorActual++;
		}
		System.out.println("Suma de los 50 primeros números primos "+ sumaPrimos);
	}
	
	public static boolean esPrimo(int value) {
		if (value <=1) return false;
		for(int i =2;i<value;i++) 
			if( value % i == 0 )
				return false;
		return true;
	}

}
