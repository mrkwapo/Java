package com.Dracodess;

public class Browser {
    public void navigate(String address){
        String ip = findIpAddress(address);
        String html = sendHttpRequest(ip);
        System.out.println(html);
    }
    /*The sendHttpRequest and findIpAddress methods are unnecessary to the Main method and
     pollute the interface of the Browser Class. Main only needs the navigate method. Therefore
     private access modifiers are used on the sendHttpRequest and findIpAddress methods*/
    private String sendHttpRequest(String ip) {
        return "<html></html>";
    }

    private String findIpAddress(String address) {
        return "127.0.0.1";
    }
}
