public class test13 {
    public static void main(String[] args) {
        function(12);
        function(12,13);
    }

    public static void function(int i) {
        System.out.println(i);
    }

    public static void function(int a,int b) {
        System.out.print(a);
        System.out.println(b);
    }
}
