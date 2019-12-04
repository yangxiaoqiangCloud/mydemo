package com.huawei.servicecomb.controller;

import org.springframework.stereotype.Component;


@Component
public class MydemoDelegate {

    public String helloworld(String name){

        // Do Some Magic Here!
        return "Welcome, " + name;
    }
}
