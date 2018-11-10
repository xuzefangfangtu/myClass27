public class test22 {
    //求最大值与最小值算法
    public static void main(String[] args) {
        int[] arr = {44,78,12,33,5,99};
        int len = arr.length;
        for(int i=0;i<len;i++){
            if(arr[0]>arr[i]){
                arr[0]=arr[i];
            }
        }
        System.out.println(arr[0]);
    }
}
