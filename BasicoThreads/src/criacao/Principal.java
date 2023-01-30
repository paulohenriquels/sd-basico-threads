package criacao;

public class Principal {
	
	public static void main(String[] args) {
	
		System.out.println(Thread.currentThread().getName());
		
		Thread t0 = new Thread(new MinhaThread());
		Thread t1 = new Thread(new MinhaThread());
		//t0.run();
		t0.start();
		t1.start();
		
		Thread t2 = new Thread(
				
				() -> System.out.println("Sou outra thread...")
				
				);
		
		t2.start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				 
				System.out.println(Thread.currentThread().getName());
			}
			
		}).start();
		
	}
	
}
