package com.bjsxt.test.spring.xsd.config;

import com.bjsxt.test.spring.xsd.parser.UserBeanDefinitionParser;
import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * @author sunboyu
 * @date 2018/3/27
 */
public class TestNamespaceHandler extends NamespaceHandlerSupport {
    @Override
    public void init() {
        registerBeanDefinitionParser("user", new UserBeanDefinitionParser());
    }
}
