public class Test4 {
    public static void main(String[] args) {
        User u1 = new User("刘翔");
        User u2 = new User("马云");
        User u3 = new User("雷军");
        u1.print();
        u2.print();
        u3.print();
    }
}

class User{
    private String name;
    private static String country = "中国";

    public User(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getCountry() {
        return country;
    }

    public static void setCountry(String country) {
        User.country = country;
    }
    public void print(){
        System.out.println(this.name+" "+this.country);
    }
}