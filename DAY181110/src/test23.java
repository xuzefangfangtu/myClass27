import java.util.Arrays;

public class test23 {
    //选择排序算法
    public static void main(String[] args) {
        int[] arr = {44,78,34,56,12};
        int len = arr.length;
        for(int i=0;i<len;i++){
            int minIndex=i;
            for(int j=i+1;j<len;j++){
                if(arr[minIndex]>arr[j]){
                    minIndex=j;
                }
            }
            arr[i]=arr[i]+arr[minIndex]-(arr[minIndex]=arr[i]);
        }
        System.out.println(Arrays.toString(arr));
    }
}
