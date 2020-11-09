public class Main {
    public static void main(String[] args) throws InterruptedException {
        TickTack cola = new TickTack();
        ProductorTack tack = new ProductorTack(cola);
        ProductorTick tick = new ProductorTick(cola);
        Consumidor consumidor = new Consumidor(cola);

        consumidor.start();
        tick.start();
        tack.start();
        consumidor.join();
        tick.join();
        tack.join();
        System.out.println("THE END");


    }
}
