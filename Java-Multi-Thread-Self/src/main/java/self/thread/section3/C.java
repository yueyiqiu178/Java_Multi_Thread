package self.thread.section3;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/16 上午11:22
 */
public class C {

    private MyStack myStack;

    public C(MyStack myStack) {
        this.myStack = myStack;
    }

    public void popService() {

        System.out.println("popService = " + myStack.pop());
    }
}
