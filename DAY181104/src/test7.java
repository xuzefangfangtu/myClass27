//通过键盘输入，初始化两个数将这两个数据交换位置后，输出显示交换后的数据。

public class test7 {
    public static void main(String[] args) {
//        方法1
        int a = 1;
        int b = 2;
        a = b + a;
        b = a - b;
        a = a - b;
        System.out.println(a);
        System.out.println(b);
//        方法2
         a = 1;
         b = 2;
        int c = b;
        b = a;
        a = c;
        System.out.println(a);
        System.out.println(b);
//        方法3
        a = 1;
        b = 2;
        a = a + b - (b=a);
        System.out.println(a);
        System.out.println(b);

    }
}
