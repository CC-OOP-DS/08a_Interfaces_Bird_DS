package com.cc.java;

public class Bird implements Flyable, Feathers {
    
    @Override
    public String fly(){
        return "I can fly high like a Bird.";
    }

    @Override
    public String hasFeathers(){
        return "I have azure-shining feathers.";
    }
}
