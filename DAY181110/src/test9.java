public class test9 {
    //反正序5排星
    public static void main(String[] args) {
        for(int i=5;i>0;i--){

            for(int j=1;j<=5;j++){

                if(j>=i){
                    System.out.print("*");
                    continue;
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
