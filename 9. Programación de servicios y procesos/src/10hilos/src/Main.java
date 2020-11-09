
public class Main {
	// esto ya es un hilo
	public static void main(String[] args) {

		for (int i = 0; i < 15; i++) {
	        Saludo s = new Saludo(i+1);
	        s.start();
	        try {
				s.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
        System.out.println("******* FIN de la APP ");

	}
}
