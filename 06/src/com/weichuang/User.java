package com.weichuang;

public class User extends UserService {
    public void login(UserBean u) {
       if(!"admin".equals(u.getName())) {
           throw new My_exception("用户名错误");
       }
       if(!"1234".equals(u.getPwd())){
           throw new My_exception("密码错误");
       }
        System.out.println("登陆成功");
    }
}
