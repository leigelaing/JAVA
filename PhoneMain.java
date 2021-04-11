package com.sadff;

public class PhoneMain {
    public static void main(String[] args) {
        Phone ph = new Phone();
        ph.Call();
        ph.send();
        ph.show();
        System.out.println("===========================");
        newPhone phnew = new newPhone();
        phnew.Call();
        phnew.send();
        phnew.show();
    }
}
