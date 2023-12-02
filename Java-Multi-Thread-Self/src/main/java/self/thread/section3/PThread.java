package self.thread.section3;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/16 上午11:24
 */
public class PThread extends Thread {

    private P p;

    public PThread(P p) {
        this.p = p;
    }

    @Override
    public void run() {
        while (true) {
        	System.out.println("PHEAD：" + Thread.currentThread().getName());
            p.pushService();
        }
    }
}
