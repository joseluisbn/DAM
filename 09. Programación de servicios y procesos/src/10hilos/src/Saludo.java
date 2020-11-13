
public class Saludo extends Thread{
    int nunHilo = 0;
    public Saludo(int i) {
        this.nunHilo= i;
    }
    @Override
    public void run() {
        System.out.println("Arranca hilo: " + nunHilo);

        for (int i = 0; i < 15; i++) {
            System.out.println("--hola desde el hilo: "+nunHilo+ ". for= " + i);
        }
        System.out.println("Termina el hilo: "+nunHilo);

    }

}