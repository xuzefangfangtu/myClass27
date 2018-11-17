public class Test5 {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getS();
        s1.print();
        Singleton s2 = Singleton.getS();
        s2.print();
        System.out.println(s1 == s2);

        Singleton1 a1 = Singleton1.getS();
        a1.print();
        Singleton1 a2 = Singleton1.getS();
        a2.print();
        System.out.println(a1 == a2);
    }
}

//饿汉模式
class Singleton{
    private Singleton (){};
    private static Singleton s = new Singleton();
    public static Singleton getS(){
        return s;
    }
    public void print(){
        System.out.println("单例模式");
    }
}

//懒汉模式
class Singleton1{
    private Singleton1 (){};
    private static Singleton1 s;
    public static Singleton1 getS(){
        if(s == null){
            s = new Singleton1();
        }
        return s;
    }
    public void print(){
        System.out.println("单例模式");
    }
}