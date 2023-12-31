public class Two {
    public static void main(String[] args){
        System.out.println("this is argument = " + args[0]);
        hak(args);
        System.out.println("this is final output  " + args.length);
    }
    
    public static void hak(String[] hakArgs){
        System.out.println(hakArgs);
        for(String s: hakArgs){
            System.out.println(s);
        }
    }

}