package com.classcodes;

import java.net.UnknownHostException;
import java.net.*;

public class Networking {
    public static void main(String[] args) throws UnknownHostException  {
        InetAddress obj = InetAddress.getByName("cisco.com");
        System.out.print(obj.getHostName());
    }
}
