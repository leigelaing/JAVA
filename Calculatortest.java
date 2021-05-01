package com.demo02;

public class Calculatortest {
    public static void main(String[] args) {
        //创建对象
        Calculator cal = new Calculator();
        //调用方法
        int resultadd = cal.add(1,3);
        System.out.println(resultadd);
        int resultsub = cal.sub(4,3);
        System.out.println(resultsub);
    }
}
