import java.util.Arrays;

public class test24 {
    //直接插入式排序
    public static void main(String[] args) {
        int[] arr = {44,78,34,56,12};
        int len =arr.length;
        for(int i=1;i<len;i++){
            int temp = arr[i];
            for(int j=i-1;j>=0;j--){
                if(arr[j]>temp){
                    arr[j+1] = arr[j];
                }else{
                    arr[j+1] = temp;
                    break;
                }
                if(j == 0){
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
