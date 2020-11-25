
public class Saludo extends Thread{

    int numHilo = 0;

    public Saludo(int i) {
        this.numHilo = i;
    }

    @Override
    public void run() {

        System.out.println("Arranca el hilo " + numHilo);

        for (int i = 0; i < 5; i++) {

            System.out.println("Hola desde el hilo " + numHilo + " - Intento " + (i+1));
        }

        System.out.println("- Fin de ejecución del hilo " + numHilo);

    }

}
