public class MethodTest {

    public static void main(String[] args) {
        sayHello();

        showAddResult(10, 5);

        int result = add(10, 10);

        System.out.println(result);
    }

    static void showAddResult(int a, int b) {
        System.out.println(a+b);
    }

    static void sayHello() {
        System.out.println("Hello");
    }

    staic int add(int a, int b) {
        return a + b;
    }
}
