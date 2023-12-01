package com.multi.thread.chapter3.section1.example14;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/16 上午10:48
 */
public class C {

    private String lock;

    public C(String lock) {
        this.lock = lock;
    }

    public void getValue() {
        try {
        	while(true) {
        		System.out.println("消费者 synchronized "+ Thread.currentThread().getName());
	            synchronized (lock) {
	                while (ValueObject.value.equals("")) {
	                    System.out.println("消费者 " + Thread.currentThread().getName() + " waiting 了$");
	                    lock.wait();
	                }
	                System.out.println("消费者 " + Thread.currentThread().getName() + " runnable 了");
	                ValueObject.value = "";
	                lock.notify();
	                //lock.notifyAll();
	                System.out.println("消费者 End synchronized "+ Thread.currentThread().getName());
	            }
	            System.out.println("消费者 End while "+ Thread.currentThread().getName());
        	}
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
