//数据结构之链表
public class Test9 {
    public static void main(String[] args) {
        NodeManage n = new NodeManage();
        n.add(1);
        n.add(2);
        n.add(3);
        n.add(4);
        n.add(5);

        n.findAll();

        System.out.println(n.find(6));
        System.out.println(n.find(3));

        n.insert(6,888);
        n.findAll();
        n.insert(2,555);
        n.findAll();

        n.del(4);
        n.findAll();

        n.change(3,66);
        n.findAll();
    }
}

class NodeManage{
    public Node root;
    public int count;
    public void add(int data){
        if(root == null){
            this.root =new Node(data);
        }else{
            this.root.addNode(data);
        }
    }
    public void insert(int index,int data){
        count = 0;
        if(this.root != null){
            Node n = new Node(data);
            if(count == index){
                n.next = this.root;
                this.root = n;
            }else{
                this.root.insertNode(index,data);
            }
        }
    }
    public void del(int data){
        if(this.root != null){
            if(this.root.data == data ){
                this.root = this.root.next;
            }else{
                this.root.delNode(data);
            }
        }
    }
    public void change(int olddata,int newdata){
        if(this.root != null){
            if(this.root.data == olddata ){
                this.root.data = newdata;
            }else{
                this.root.changeNode(olddata,newdata);
            }
        }

    }
    public Node find(int data){

        if(root.data == data){
            return this.root;
        }else{
            return this.root.findNode(data);
        }
    }
    public void findAll(){
        if(root != null){
            System.out.print(this.root.data+"-->");
            this.root.findAllNode();
            System.out.println();
        }
    }



    public class Node{
        public Node next;
        public int data;
        public Node(int data){
            this.data = data;
        }
        public void addNode(int data){
            if(this.next == null){
                this.next = new Node(data);
            }else{
                this.next.addNode(data);
            }
        }
        public void insertNode(int index,int data){
            count++;
            if(this.next != null){
                Node ns = new Node(data);
                if(count == index ){
                    ns.next = this.next;
                    this.next = ns;
                }
                else{
                    this.next.insertNode(index,data);
                }
            }else{
                this.next = new Node(data);
            }
        }
        public void delNode(int data){
            if(this.next != null){
                if(this.next.data == data){
                    this.next = this.next.next;
                }else{
                    this.next.delNode(data);
                }
            }
        }
        public void changeNode(int olddata,int newdata){
            if(this.next != null){
                if(this.next.data == olddata ){
                    this.next.data = newdata;
                }else{
                    this.next.changeNode(olddata,newdata);
                }
            }
        }
        public Node findNode(int data){
            if(this.next != null){
                if(this.next.data == data){
                    return this.next;
                }else{
                    return this.next.findNode(data);
                }
            }else{
                return null;
            }
        }
        public void findAllNode(){
            if(next != null){
                System.out.print(this.next.data+"-->");
                this.next.findAllNode();
            }
        }
        public String toString(){
            return "data"+data;
        }

    }
}