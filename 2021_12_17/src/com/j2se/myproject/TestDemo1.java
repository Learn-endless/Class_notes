package com.j2se.myproject;

import java.net.InetAddress;
import java.net.UnknownHostException;


/**
*通过域名获取IP
*/
public class TestDemo1 {
    public static void main(String[] args) {
        IntegerAddress adder = new InetAdderss();
        try {
            InetAddress name = getByName("www.baidu.com");

        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
