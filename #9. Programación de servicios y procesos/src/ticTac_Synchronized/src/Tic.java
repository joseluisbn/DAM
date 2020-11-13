
public class Tic extends Thread{
	@Override
    public void run() {
		synchronized(this) {
			System.out.println("Arranca hilo: tic");
			
	        for (int i = 0; i < 100; i++) {
	            System.out.println("Tic " + i);
	            try {
					sleep(0); // 
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        }
	        System.out.println("Termina el hilo tic: ");
	
		    }
		}
		

}


  