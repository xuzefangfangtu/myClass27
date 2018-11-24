//  适配器模式
public class Test8 {
    public static void main(String[] args) {
        PowerB pb =new PowerBImpl();
        PowerA PA = new ChangeBtoA(pb);
        work(PA);
    }
    public static void work(PowerA pa){
        System.out.println("正在连接");
        pa.insert();
        System.out.println("完成连接");
    }
}

class ChangeBtoA implements PowerA{
    public PowerB pb;
    public ChangeBtoA(PowerB pb){
        this.pb = pb;
    }
    public void insert(){
        pb.insert();
    }
}

interface PowerB{
    public void insert();
}
class PowerBImpl implements PowerB{
    public void insert(){
        System.out.println("PowerB++++++++++++++++++++");
    }
}

interface PowerA{
    public  void insert();
}
class PowerAImpl implements PowerA{
    public void insert(){
        System.out.println("PowerA+++++++++++++++++++++");
    }
}