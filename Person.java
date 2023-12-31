public class Person {
    public static void main(String[] args) {
        hay();       

        System.out.println("------------------");
        System.out.println("----Hello from Hak package----");
        System.out.println("------------------"); 
    }

    public static void hay(){
        String[] strArr = new String[3];
        strArr[0] = "htet";
        strArr[1] = "aung";
        strArr[2] = "khant";
        for(String s: strArr){
            System.out.println("this is hay method name " + s );
        }        
    }
    
}