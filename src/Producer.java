
public class Producer extends Thread {
	Company c;
	Producer(Company c){
		this.c=c;
	}
	
	public void run() {
		int i=1;
		while(true) {
			try {
				try {
					this.c.produceItem(i);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			i++;
		}
	}
}
