package assignments;

public class Assign43 {
    String name;
    int age;

    public Assign43() {
        this.name = "Unknown";
        this.age = 0;
    }

    public Assign43(String name) {
        this.name = name;
        this.age = 0;
    }

    public Assign43(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void show() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Assign43 s1 = new Assign43();
        Assign43 s2 = new Assign43("Ravi");
        Assign43 s3 = new Assign43("Asha", 22);

        s1.show();
        s2.show();
        s3.show();
    }
}

