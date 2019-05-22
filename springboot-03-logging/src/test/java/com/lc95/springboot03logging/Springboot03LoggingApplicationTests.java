package com.lc95.springboot03logging;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot03LoggingApplicationTests {

    @Test
    public void contextLoads() {
        //可以调整的输出级别
        Logger logger = LoggerFactory.getLogger(getClass());
        logger.trace("这是trace日志");
        logger.debug("这是debug日志");
        //springboot默认使用info级别
        logger.info("这是info日志");
        logger.warn("这是warn日志");
        logger.error("这是error日志");
    }

}
