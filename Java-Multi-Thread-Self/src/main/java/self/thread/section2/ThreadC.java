package self.thread.section2;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/16 上午10:53
 */
public class ThreadC extends Thread {

    private C c;

    public ThreadC(C c) {
        this.c = c;
    }

    @Override
    public void run() {
        //while (true) {
            c.getValue();
        //}
    }
}
