
public class Company {
	int n;
	boolean flag = false;
	synchronized public void produceItem(int n) throws Exception {
		if(flag) {
			wait();
		}
		this.n = n;
		System.out.println("Produced : "+n);
		flag=true;
		notify();
	}
	
	synchronized public int consumeItem() throws Exception {
		if(!flag) {
			wait();
		}
		System.out.println("Consumed : "+n);
		flag=false;
		notify();
		return this.n;
	}
}
