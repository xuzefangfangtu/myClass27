import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
//        CosmeticManage cm = new CosmeticManage();
//        cm.add(new Cosmetic("雅诗兰黛","进口",1000));
//        cm.add(new Cosmetic("香奈儿","进口",800));
//        cm.add(new Cosmetic("大宝","国产",20));
//        cm.add(new Cosmetic("郁美净","国产",5));
//        cm.show();

//        SortCosmeticManage cm = new SortCosmeticManage();
//        cm.add(new Cosmetic("雅诗兰黛","进口",1000));
//        cm.add(new Cosmetic("香奈儿","进口",800));
//        cm.add(new Cosmetic("郁美净","国产",5));
//        cm.add(new Cosmetic("大宝","国产",20));
//        cm.show();

        TypeCosmeticManage cm = new TypeCosmeticManage();
        cm.add(new Cosmetic("雅诗兰黛","进口",1000));
        cm.add(new Cosmetic("香奈儿","进口",800));
        cm.add(new Cosmetic("圣罗兰","进口",700));
        cm.add(new Cosmetic("兰蔻","进口",600));
        cm.add(new Cosmetic("郁美净","国产",5));
        cm.add(new Cosmetic("大宝","国产",20));
        cm.show();
    }
}

class TypeCosmeticManage extends CosmeticManage{
    public void show(){
        for(int i=0;i<count;i++){
            if(cs[i].getType().equals("国产")){
                cs[i] = cs[count];
                cs[count - 1] = null;
                count--;
            }
        }
        for(Cosmetic c:cs){
            if(null != c){
                c.print();
            }
        }
    }
}

class SortCosmeticManage extends CosmeticManage{
    public void show(){
        for(int i=0;i<count;i++ ){
            for(int j=i;j<count;j++){
                if(cs[i].getPrice()>cs[j].getPrice()){
                    Cosmetic temp = cs[i];
                    cs[i] = cs[j];
                    cs[j] = temp;
                }
            }
        }
        for(Cosmetic c:cs){
            if(null != c){
                c.print();
            }
        }
    }
}

class CosmeticManage{
    protected Cosmetic[] cs = new Cosmetic[5];
    protected  int count = 0;
    public void add(Cosmetic c){
        if(cs.length == count){
            cs = Arrays.copyOf(cs,cs.length*2);
        }
        cs[count] = c;
        count++;
    }

    public void show(){
        for(Cosmetic c:cs){
            if(null != c){
            c.print();
            }
        }
    }
}

class Cosmetic{
    private String name;
    private String type;
    private int price;
    public Cosmetic(String name,String type,int price){
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void print(){
        System.out.println(name+","+type+","+price);
    }
}
