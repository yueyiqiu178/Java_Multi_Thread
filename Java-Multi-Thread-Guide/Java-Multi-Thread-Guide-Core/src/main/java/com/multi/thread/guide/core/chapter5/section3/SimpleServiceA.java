package com.multi.thread.guide.core.chapter5.section3;

import java.util.concurrent.CountDownLatch;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2019/01/20 下午3:57
 */
public class SimpleServiceA extends AbstractService {

    public SimpleServiceA(CountDownLatch latch) {
        super(latch);
    }

    @Override
    protected void doStart() throws Exception {

    }
}
