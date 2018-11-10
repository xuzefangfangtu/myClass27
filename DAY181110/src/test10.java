public class test10 {
    //正反序5排星
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--){
                System.out.print(" ");
            }
           for(int a=1;a<=2*i-1;a++){
               System.out.print("*");
           }
            System.out.println();
        }
    }
}
