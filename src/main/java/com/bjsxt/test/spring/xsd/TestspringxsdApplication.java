package com.bjsxt.test.spring.xsd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({
        "classpath:testXsd.xml"
})
public class TestspringxsdApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestspringxsdApplication.class, args);
    }
}
