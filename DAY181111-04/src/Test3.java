public class Test3 {
    public static void main(String[] args) {
        Weapon w1 = new Weapon();
        Haro h1 = new Haro();
        h1.setName("刘备");
        w1.setName("雌雄双股剑");
        h1.setW(w1);
        w1.setH(h1);
        System.out.println("我是"+w1.getName()+",我的主人是"+w1.getH().getName());
        System.out.println("我是"+h1.getName()+",我的武器是"+h1.getW().getName());
    }
}

class Weapon{
    private String name;
    private int lever;
    private Haro h;

    public Haro getH() {
        return h;
    }

    public void setH(Haro h) {
        this.h = h;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLever() {
        return lever;
    }

    public void setLever(int lever) {
        this.lever = lever;
    }
}

class Haro{
    private String name;
    private int age;
    private Weapon w;

    public Weapon getW() {
        return w;
    }

    public void setW(Weapon w) {
        this.w = w;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

