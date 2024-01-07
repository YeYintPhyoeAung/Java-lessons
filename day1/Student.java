public class Student {
    
    static int count;
    String name;

    void show() {
        System.out.println("Count :" + count);
        System.out.println("Name :" + name);
    }

    void countUp() {
        count ++;
    }

    public static void main(String [] args) {
        Student s1 = new Student();
        s1.countUp();
        s1.name = "Aung Aung";
        s1.show();

        Student s2 = new Student();
        s2.countUp();
        s2.name = "Thidar";
        s2.show();
    }
}