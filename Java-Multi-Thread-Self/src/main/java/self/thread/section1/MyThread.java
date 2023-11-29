package self.thread.section1;

public class MyThread extends Thread {
	@Override
	public void run() {
		try {
			Thread.sleep(2000);
			int i = 100;
			System.out.println("begin");
			if (i == 100) {
				this.stop();
			}
			System.out.println(" end");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
