//根据天数（46）计算周数和剩余的天数，天数是通过键盘输入。
import java.util.Scanner;
public class test4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("请输入天数：");
        int day = input.nextInt();
        System.out.print("周数是："+day / 7+"\n"+"剩余天数为："+day % 7);
    }
}
