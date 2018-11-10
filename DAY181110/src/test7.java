public class test7 {
    //输出10个斐波那契（Fibonacci）数列：1 1 2 3 5 8 13 21 34 55。（特点：第1,2两个数值为1，从第三个数开始，该数是其前面两个数之和）
    public static void main(String[] args) {
        int i1 =1;
        int i2 =1;
        System.out.print(i1 +" "+ i2);
        for(int i =3;i<=10;i++){
            int number =i1 + i2;
            System.out.print(" "+number);
            i1 =i2;
            i2 = number;
        }
    }
}
