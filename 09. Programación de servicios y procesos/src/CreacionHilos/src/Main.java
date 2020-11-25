
public class Main {

    public static void main(String[] args) throws Exception {

        for (int i=0; i < 5; i++) {

            Saludo s = new Saludo(i+1);
            s.start();
            s.join();
        }
        System.out.println("---Fin del programa---");
    }
}
