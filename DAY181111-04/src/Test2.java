public class Test2 {
    public static void main(String[] args) {
    Person1 p1 = new Person1();
    p1.setName("张三");
    p1.setage(18);
    System.out.println(p1.getName());
    System.out.println(p1.getAge());
    p1.say();
    }
}

class Person1{
    //成员变量
    private String name;// private 代表私有
    private int age;

    public void setName(String name){
        this.name = name;// this 指向方法的调用者
    }
    public String getName(){
        return this.name;
    }

    public void setage(int age){
        this.age = age;// this 指向方法的调用者
    }
    public int getAge(){
        return this.age;
    }

    void say(){
        System.out.println("我叫"+ this.name +",我今年"+this.age +"岁");
    }
}