package com.bjsxt.test.spring.xsd.test;

import com.bjsxt.test.spring.xsd.domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author sunboyu
 * @date 2018/3/27
 */
public class Test {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("testXsd.xml");
        User user = (User) applicationContext.getBean("testUser");
        System.out.println(user.getUserName() + ":" + user.getEmail());
    }
}
