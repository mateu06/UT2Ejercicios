import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Queremos calcular los nÃºmeros primos entre 2 nÃºmeros y imprimirlos por pantalla.
//
//Requisitos:
//
//    lee de la entrada estÃ¡ndar 2 nÃºmeros separados por espacio en la primera linea. (Ej: "2 100")
//    Utiliza un thread que realice el trabajo y se encargue de imprimir por pantalla la lista resultante.
//    Utiliza el mÃ©todo de extender un thread (extends Thread)
//    El thread principal debe esperar a la finalizaciÃ³n del thread trabajador o "worker".


public class PrimeNumbersInRange {
	static String numeros;
	public PrimeNumbersInRange() throws InterruptedException{
		//se crea un constructor de objetos hilo
		Hilo h = new Hilo();
		h.start();
		h.join();
		
		
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		// COMPLETA AQUÃ� EL EJERCICIO
		BufferedReader teclado = new BufferedReader (new InputStreamReader (System.in));
		
		System.out.println("Introduce dos números separados por un espacio");
		numeros = teclado.readLine();
		
		//System.out.println(numeros);
		
		PrimeNumbersInRange pn = new PrimeNumbersInRange();
		
	
		
	}
	
	private class Hilo extends Thread{
		
		public void run(){
			//splitear
			int n1,n2;
			System.out.println(numeros);
			String[] nums = numeros.split(" ");
			String num1 = nums[0];
			n1 = Integer.parseInt(num1);
			String num2 = nums[1];
			n2 = Integer.parseInt(num2);
			
			
			CalcPrimeNumbersThread cp = new CalcPrimeNumbersThread(n1,n2);
			cp.start();
			
			
			
		}
	}

}
