package self.thread.section4;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/20 下午2:02
 */
public class MyService {

    private ReentrantLock lock = new ReentrantLock();

    private Condition condition = lock.newCondition();

    private boolean hasValue = false;

    public void set() {
        try {
        	System.out.println("P Head: "+Thread.currentThread().getName());
            lock.lock();
            while (hasValue == true) {
                //System.out.println("有可能AA连续");
            	System.out.println("P wait: "+Thread.currentThread().getName());
                condition.await();
            }
            System.out.println("Producer: "+Thread.currentThread().getName());
            //System.out.println("打印A");
            hasValue = true;
            condition.signal();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
    public void get() {
        try {
        	System.out.println("C Head: "+Thread.currentThread().getName());
            lock.lock();
            while (hasValue == false) {
                //System.out.println("有可能BB连续");
            	System.out.println("C wait: "+Thread.currentThread().getName());
                condition.await();
            }
            System.out.println("Consumer: "+Thread.currentThread().getName());
            //System.out.println("打印B");
            hasValue = false;
            condition.signal();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
