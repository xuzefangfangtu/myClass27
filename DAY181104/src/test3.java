//定义一个五位整数，求各个位上的数的和。
public class test3 {
    public static void main(String[] args) {
        int num = 12345;
        int w = num / 10000;
        int q = num / 1000 %10;
        int b = num / 100 %10;
        int s = num / 10 %10;
        int g = num % 10;
        System.out.print("各位数之和是："+(w+q+b+s+g));
    }
}
