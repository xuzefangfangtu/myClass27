import java.util.Arrays;

public class Test6 {
    public static void main(String[] args) {
        ChickenManage cm = new ChickenManage(5);
        cm.add(new Chicken(1,"咯咯哒",5,10));
        cm.add(new Chicken(2,"咯咯哒1",21,15));
        cm.add(new Chicken(3,"咯咯哒2",25,22));
        cm.add(new Chicken(4,"咯咯哒3",53,140));
        cm.add(new Chicken(5,"咯咯哒4",54,1550));
        cm.findAll();

    }
}

class ChickenManage{
    private Chicken[] ck;
    private static int acount = 0;
    public  ChickenManage(int size){
        if(size<5){
            ck = new Chicken[5];
        }else{
            ck = new Chicken[size];
        }
    }

    //加一只鸡
    public void add(Chicken c){
        if(ck.length == acount + 1){
            ck = Arrays.copyOf(ck,ck.length*2);

        }
        ck[acount] = c;
        acount++;

    }

    //发现全部鸡
    public  void findAll(){
        for(Chicken c:ck){
            if(c != null){
                c.print();
            }
        }
    }
}

class Chicken{
    private int id;
    private String name;
    private int age;
    private int weight;

    public Chicken(int id,String name,int age,int weight){
        this.id = id;
        this.name = name;
        this.age =age;
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void print(){
        System.out.println(this.id +","+this.name+","+this.age+","+this.weight);
    }
}