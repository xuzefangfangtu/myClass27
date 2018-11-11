public class test12 {
    public static void main(String[] args) {
        int a =getMenu();
        System.out.println(a);
        order(1);//实参
    }

    public static int getMenu() {
        System.out.println("1.宫保鸡丁");
        System.out.println("2.水煮鱼");
        return 12;
    }

    public static void order(int no) {//形参
        if(no ==1){
            System.out.println("宫保鸡丁");
        }else{
            System.out.println("水煮鱼");
        }
    }
}
