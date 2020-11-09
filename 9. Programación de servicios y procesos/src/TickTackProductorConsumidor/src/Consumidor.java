public class Consumidor extends Thread{
    private TickTack cola;

    public Consumidor(TickTack cola) {
        this.cola = cola;
    }

    @Override
    public synchronized void run() {
        System.out.println("...Consumidor empieza a consumir...");
        for (int i = 0; i < 20; i++) {

            try {
                sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(cola.getTickTack());
        }

    }
}
