// 策略模式
public class Test4 {
    public static void main(String[] args) {
        ISave is = new UserIsave();
        Service bs = new UserService();
        bs.setIsave(is);
        bs.ser("user");
    }
}

interface ISave{
    public abstract void save(String data);
}
class UserIsave implements ISave{
    public void save(String data){
        System.out.println("添加到文件上"+data);
    }
}
class TeacherIsave implements ISave{
    public  void save(String data){
        System.out.println("添加到网络上"+data);
    }
}

abstract class Service{
    public ISave isave;
    public void setIsave(ISave isave){
        this.isave = isave;
    }
    public void ser(String data){
        isave.save(data);
    }
}
class UserService extends Service{

}
class TeacherService extends Service {

}