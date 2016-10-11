import java.util.Iterator;
import java.util.List;

public class CalcPrimeNumbersRunnable implements Runnable {
	private int num1;
	private int num2;
	

	public void CalcPrimeNumbersRunnable(int from, int to) {
		this.num1 = from;
		this.num2= to;
    }
	
	public CalcPrimeNumbersRunnable(int n1, int n2){
		num1 = n1;
		num2 = n2;
	}
	
	@Override
	public void run() {
		// COMPLETAR AQUÃ� EL EJERCICIO
PrimeNumbers pm = new PrimeNumbers();
		
		List<Integer> listaPrimos = pm.primesInRange(num1,num2);
		Iterator<Integer> numsPrimos = listaPrimos.iterator();
		
		while (numsPrimos.hasNext()){
			int numero = numsPrimos.next();
			System.out.print(numero+", ");
		}
	}

}
