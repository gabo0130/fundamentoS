package com.fundamentos.springboot.fundamentos.bean;

public class MyBeanWithDependencyImplement implements MyBeanWithDependency{
    private MyOperation myOperation;

    public MyBeanWithDependencyImplement(MyOperation myOperation){
         this.myOperation=myOperation;
    }
    @Override
    public void printWithDependency() {
        int numero = 1;
        System.out.println("numero caremonda "+myOperation.sum(numero));
        System.out.println("hola desde otra impplenet estoy mamao de los impement ");
    }
}
