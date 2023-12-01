package self.thread.section2;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/16 上午10:48
 */
public class P {

    private String lock;

    public P(String lock) {
        this.lock = lock;
    }

    public void setValue() {
        try {
        	while(true) {
        		System.out.println("生产者 synchronized "+ Thread.currentThread().getName());
	            synchronized (lock) {
	                while (!ValueObject.value.equals("")) {
	                    System.out.println("生产者 " + Thread.currentThread().getName() + " waiting 了#");
	                    lock.wait();
	                }
	                System.out.println("生产者 " + Thread.currentThread().getName() + " runnable 了");
	                String value = System.currentTimeMillis() + "_" + System.nanoTime();
	                ValueObject.value = value;
	                lock.notify();
	                //lock.notifyAll();
	                System.out.println("生产者 End synchronized "+ Thread.currentThread().getName());
	            }
	            System.out.println("生产者 End while "+ Thread.currentThread().getName());
        	}
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
