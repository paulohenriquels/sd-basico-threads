package criacao;

public class MinhaThread implements Runnable{

	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().getName());
		System.out.println("Olá mundo paralelo.");
		
	}

}
