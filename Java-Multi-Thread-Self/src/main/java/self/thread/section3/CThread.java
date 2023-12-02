package self.thread.section3;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/16 上午11:24
 */
public class CThread extends Thread {

    private C c;

    public CThread(C c) {
        this.c = c;
    }

    @Override
    public void run() {
        while (true) {
        	System.out.println("CHEAD：" + Thread.currentThread().getName());
            c.popService();
        }
    }
}
