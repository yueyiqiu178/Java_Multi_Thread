package self.thread.section3;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/16 上午11:17
 */
public class MyStack {

    private List list = new ArrayList();

    public synchronized void push() {
        try {
            while (list.size() == 1) {
        	//if (list.size() == 1) {
            	System.out.println("push操作中的：" + Thread.currentThread().getName() + "线程呈wait状态");
                this.wait();
            }
            list.add("anyString = " + Math.random());
            this.notifyAll();
            //this.notify();
            System.out.println("push = " + list.size());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public synchronized String pop() {
        String returnValue = "";
        try {
            while (list.size() == 0) {
            //if (list.size() == 0) {
                System.out.println("pop操作中的：" + Thread.currentThread().getName() + "线程呈wait状态");
                this.wait();
            }
            System.out.println("do list.remove(0)：" + Thread.currentThread().getName());
            returnValue = "" + list.get(0) + " || "+ Thread.currentThread().getName();
            list.remove(0);
            this.notifyAll();
            //this.notify();
            System.out.println("pop = " + list.size() + " || "+ Thread.currentThread().getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return returnValue;
    }
}
