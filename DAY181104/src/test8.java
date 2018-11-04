//输入一个字符，判断是大写字母还是小写字母，输出提示信息。
import java.util.Scanner;
public class test8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char a = input.next().charAt(0); //输入的字符串的第一个
        if (a>=65 && a<=90){
            System.out.print("大写字母");
        }else{
            System.out.print("小写字母");
        }
    }
}
