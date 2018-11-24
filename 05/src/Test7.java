// 代理模式
public class Test7 {
    public static void main(String[] args) {
        Shopping s = new UserImpl();
        ShoppingUserImpl su = new ShoppingUserImpl(s);
        su.buy();
    }
}

class ShoppingUserImpl implements Shopping{
    private Shopping s;
    public ShoppingUserImpl(Shopping s){
        this.s = s;
    }
    public void buy(){
        Long startTime =  System.currentTimeMillis();
        //...
        s.buy();
        Long endTime =  System.currentTimeMillis();
        System.out.println("本次花费时间为"+(endTime-startTime));
    }
}

interface Shopping{
    public void buy();
}

class UserImpl implements Shopping{
    public void buy(){
        for(int i=0;i<20;i++){
            System.out.println("我正在shopping.........");
        }
    }
}
