package ticket;

public class ticketTest {

	public static void main(String[] args) {

		ticket ti = new ticket();
		
		Thread t1 = new Thread(ti,"窗口1");
		Thread t2 = new Thread(ti,"窗口2");
		Thread t3 = new Thread(ti,"窗口3");
		Thread t4 = new Thread(ti,"窗口4");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		
	}

}
