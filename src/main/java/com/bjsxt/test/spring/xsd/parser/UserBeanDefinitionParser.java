package com.bjsxt.test.spring.xsd.parser;

import com.bjsxt.test.spring.xsd.domain.User;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.lang.Nullable;
import org.w3c.dom.Element;

/**
 * @author sunboyu
 * @date 2018/3/27
 */
public class UserBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {

    @Nullable
    @Override
    protected Class<?> getBeanClass(Element element) {
        return User.class;
    }

    @Override
    protected void doParse(Element element, BeanDefinitionBuilder builder) {

        String userName = element.getAttribute("userName");
        String email = element.getAttribute("email");

        builder.addPropertyValue("userName", userName);
        builder.addPropertyValue("email", email);
    }
}
