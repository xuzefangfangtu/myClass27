public class test25 {
    //二分查找法
    public static void main(String[] args) {
        int[] arr = {3,7,12,48,55,79};
        System.out.println(selection(arr, 79));
    }

    private static int selection(int[] arr,int var) {
        int start = 0;
        int end = arr.length - 1;
        do{
            int i =(start + end)/2;
            if(var>arr[i]){
                start = i + 1;
            }else if(var<arr[i]){
                    end = i - 1;
            }else{
                    return i;
            }
            System.out.println(i);
        }while(start <= end);
        return -1;
    }
}
