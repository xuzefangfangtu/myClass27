public class Test1 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "zhangsan";
        new Person().eat();
        p1.eat();
    }
}
class Person{
    String name;
    int age;
    void eat() {
        System.out.println(name+"吃的好多啊。。。");
    }
    }
