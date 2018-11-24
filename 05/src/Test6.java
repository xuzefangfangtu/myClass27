//  Object方法
public class Test6 {
    public static void main(String[] args) {
        Student s1 = new Student(1,"lisi",20);
        Student s2 = new Student(1,"lisi",20);
        System.out.println(s1.equals(s2));
        System.out.println(s1.toString());
        System.out.println(s1);
    }
}

class Student {
    private int lib;
    private String name;
    private int age;

    public Student(int lib, String name, int age) {
        this.lib = lib;
        this.name = name;
        this.age = age;
    }

    public int getLib() {
        return lib;
    }

    public void setLib(int lib) {
        this.lib = lib;
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

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Student) {
            Student s = (Student) obj;
            if (this.lib != s.lib) {
                return false;
            }
            if (!this.name.equals(s.name)) {
                return false;
            }
            if (this.age != s.age) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Student{" +
                "lib=" + lib +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

