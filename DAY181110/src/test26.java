import java.util.Arrays;

public class test26 {
    //新版冒泡法
    public static void main(String[] args) {
        int[] arr = {44,78,34,56,12};
        int len = arr.length;
        for(int i=0;i<len;i++){
            for(int j=0;j<len-i-1;j++){
                if(arr[j]>arr[j+1]){
                    arr[j+1]=arr[j]+arr[j+1]-(arr[j]=arr[j+1]);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
