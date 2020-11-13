public class Main {


//esto ya es un hilo
	public static void main(String[] args) {

		Tic tic = new Tic();
		Tac tac = new Tac();
		tic.start();
		tac.start();
		

     System.out.println("******* FIN de la APP ");

	}
}