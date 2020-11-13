public class ProductorTack extends Thread {

    TickTack cola;

    public ProductorTack(TickTack cola) {
        this.cola = cola;
    }

    @Override
    public synchronized void run() {
        for (int i = 0; i < 10; i++) {
            cola.setTickTack("     Tack");
        }
    }
}
