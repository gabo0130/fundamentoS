package com.fundamentos.springboot.fundamentos.bean;

public class MyOperationImplement implements MyOperation {
    @Override
    public int sum(int num) {
        return num+1;
    }
}
