package ticket;

public class ticket implements Runnable{
	
	private int tickets = 100;

	
	@Override
	public void run() {
		execute();
	}
	
	public synchronized void execute() {
		while(true) {
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(tickets > 0 ) {
				System.out.println(Thread.currentThread().getName()+"在售第"+tickets--);
			}else {
				System.out.println("票售完了");
				break;
			}
			
		}
	}
	
	


}
