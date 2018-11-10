import java.util.Arrays;

public class test21 {
    //冒泡排序法
    public static void main(String[] args) {
        int[] arr= {44,78,34,56,12};
        int len = arr.length;
        for(int i=0;i<=4;i++){
            for(int j=i+1 ; j<4;j++){
                if(arr[i]>arr[j]){
                    arr[j]=arr[i]+arr[j]-(arr[i]=arr[j]);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
