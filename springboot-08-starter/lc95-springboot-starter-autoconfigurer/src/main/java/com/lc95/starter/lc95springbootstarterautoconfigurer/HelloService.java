package com.lc95.starter.lc95springbootstarterautoconfigurer;


public class HelloService {
    HelloServiceProperties helloServiceProperties;

    public HelloServiceProperties getHelloServiceProperties() {
        return helloServiceProperties;
    }

    public void setHelloServiceProperties(HelloServiceProperties helloServiceProperties) {
        this.helloServiceProperties = helloServiceProperties;
    }

    public String sayHello(String name) {
        return helloServiceProperties.getPrefix() + "-" + name + "-" + helloServiceProperties.getSuffix();
    }
}
