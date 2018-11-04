//面试题：&和&&的区别
public class test5 {
    public static void main(String[] args){
        int a = 10;
        int b = 13;
        System.out.println(9<7 & a++>b);
        System.out.println(a);
        a = 10;
        b = 13;
        System.out.println(9<7 && a++>b);
        System.out.println(a);
    }
}
