package self.thread.section4;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/20 下午2:06
 */
public class MyThreadB extends Thread {

    private MyService service;

    public MyThreadB(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            service.get();
        }
    }
}
