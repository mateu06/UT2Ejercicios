import java.util.Iterator;
import java.util.List;

public class CalcPrimeNumbersThread extends Thread {
	// COMPLETAR AQUÃ� EL EJERCICIO
	int num1, num2;
	public CalcPrimeNumbersThread(int n1, int n2){
		num1 = n1;
		num2 = n2;
	}
	
	public void run(){
		PrimeNumbers pm = new PrimeNumbers();
		
		List<Integer> listaPrimos = pm.primesInRange(num1,num2);
		Iterator<Integer> numsPrimos = listaPrimos.iterator();
		
		while (numsPrimos.hasNext()){
			int numero = numsPrimos.next();
			System.out.print(numero+", ");
		}
		
	}
}
