package self.thread.section3;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/16 上午11:22
 */
public class P {

    private MyStack myStack;

    public P(MyStack myStack) {
        this.myStack = myStack;
    }

    public void pushService() {
        myStack.push();
    }
}
