//写一个程序，判断某一年是否为闰年（被4整除但不能被100整除能被400整除)是闰年否则是平年
import java.util.Scanner;
public class test9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("请输入年份：");
        int year = input.nextInt();
        if(year%4 == 0 && year%100 !=0 || year%400 == 0){
            System.out.print("该年份为闰年！");
        }else{
            System.out.print("该年份为平年！");
        }
    }
}
