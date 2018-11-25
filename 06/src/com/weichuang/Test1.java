//  异常处理
package com.weichuang;

public class Test1 {
    public static void main(String[] args) {

        System.out.println(div(3,4));
    }

    public  static int div(int a,int b){
        try {
            int[] arr = {1, 2, 3, 4};
            //arr = null;
            int c = a / b;
            System.out.println(arr.length);
            System.out.println("测试。。。。。");
            return c;
        }catch (NullPointerException e){
            System.out.println("空指针异常");
        }catch (ArithmeticException e){
            System.out.println("分母不能为零");
        }catch (Exception e){
            System.out.println("就是有错误");
        }finally {
            System.out.println("咋回事小老弟");
        }
        return -1;
    }
}

