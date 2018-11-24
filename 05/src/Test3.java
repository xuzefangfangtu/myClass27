//设计模式2：模块方法模式
public class Test3 {
    public static void main(String[] args) {
        BaseManage bm = new UserManage();
        bm.action("admin","add");
        BaseManage bm2 = new TeacherManage();
        bm2.action("admin","yes");
    }
}

abstract class BaseManage{
    public void action(String name,String method){
        if("admin".equals(name)){
            execute(method);
        }else{
            System.out.println("没有权限");
        }
    }
    public abstract void execute(String method);
}

class UserManage extends BaseManage{
    public void  execute(String method){
        if("add".equals(method)){
            System.out.println("++++++++++++++++++");
        }else if("next".equals(method)){
            System.out.println("------------------");
        }
    }
}

class TeacherManage extends BaseManage{
    public void execute(String method){
        if("yes".equals(method)){
            System.out.println("yesyesyesyes");
        }else if("no".equals(method)){
            System.out.println("nononononono");
        }
    }
}