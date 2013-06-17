package com.dumcoder;

import com.dumcoder.core.HelloWorld;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    static final Logger log = LoggerFactory.getLogger(HelloWorld.class);
    public static void main( String[] args )
    {

        log.debug("Starting application");
        log.error("Starting application");
        log.info("Starting application");
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringContext.xml");
        HelloWorld helloBean = (HelloWorld) context.getBean("helloBean");
        helloBean.printHello();
    }
}
