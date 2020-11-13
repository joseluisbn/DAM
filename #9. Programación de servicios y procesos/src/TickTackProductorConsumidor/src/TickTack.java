public class TickTack {
    private String tickTack;
    private String tickTackConsumido;
    boolean disponible;

    public TickTack() {
        disponible = false;

    }

    public synchronized String getTickTack() {
        /* Espera dormido a que este diponible el recurso
        *  cuando le avisen continua.
        * */

        while (!disponible) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


        tickTackConsumido = tickTack;
        disponible = false;
        notifyAll(); //despierta todos los hilos.
        return tickTack;

    }

    public synchronized void setTickTack(String tickTack) {

        /*
        * Si va a escribir y ya esta escrito o lo último consumido es
        * lo mismo que el pensaba escribir se queda esperando que le avisen.
        * */
        while (disponible || tickTack == tickTackConsumido) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //Cuando le avisen
        disponible = true;
        this.tickTack = tickTack;
        notifyAll();
    }
}
