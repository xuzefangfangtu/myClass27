//通过键盘输入声明初始化一个圆柱体的高和底面半径,pai值是3.14,求圆柱体的体积,  并显示输出圆柱体的体积; π(r^2)h。
import java.util.Scanner;
public class test2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入圆柱体的高：");
        int a = input.nextInt();
        System.out.println("请输入圆柱体的底面半径：");
        int b = input.nextInt();
        System.out.print("圆柱体的体积为"+(3.14*a*a*b));

    }
}
