package com.bspicinini.proxy;

import java.rmi.Naming;

public class Main {

    public static void main(String[] args) {
        try {
            var service = new MyRemoteImpl();
            Naming.rebind("RemoteHello", service);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
