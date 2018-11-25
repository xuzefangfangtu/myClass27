package com.weichuang;

import com.sun.org.apache.xpath.internal.SourceTree;

public class Test2 {
    public static void main(String[] args) {
        UserBean ub = new UserBean();
        UserService us =new User();
        ub.setName("admin");
        ub.setPwd("12345");
        try{
            us.login(ub);
        }catch (My_exception e){
            e.printStackTrace();  ;
        }
    }
}
