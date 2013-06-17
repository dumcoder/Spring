package com.dumcoder.core;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class HelloWorld {

    static final Logger log = LoggerFactory.getLogger(HelloWorld.class);

    private String name;

    public void setName(String name) {
        log.debug("setting name");
        this.name = name;
    }

    public void printHello() {
        System.out.println("Spring 3 : Hello ! " + name);
    }
}