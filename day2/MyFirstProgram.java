public class MyFirstProgram {
    
    public static void main(String[] args) {

        System.out.println("Start My First Program!");
        System.out.println("Length of Args : " + args.length);

        for (String str : args) {
            System.out.println(str);
        }

        //Create An Object
        Cat shweWah = new Cat();

        shweWah.name = "Shwe Wah";
        shweWah.greet();

    }

}

class Cat {

    String name;

    void greet() {
        System.out.println("Hi I am " + name);
    }
}