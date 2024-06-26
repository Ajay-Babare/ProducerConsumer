
public class Consumer extends Thread {
	Company c;
	
	Consumer(Company c){
		this.c = c;
	}
	
	synchronized public void run() {
		while(true) {
			try {
				this.c.consumeItem();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
