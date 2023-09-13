package com.driver;

public class A {
    public String meth(){
       return "super class";
    }
}
 class B extends A{
    public String meth(){
        return "Method is overridden in Extendend class B";
    }
}
