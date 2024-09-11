package Class2_Package;

public class Program_02 {
    //variable
    int qa = 10;
    //constructor
    public Program_02(){

    }
    //method
    public void method(){
        qa = 20;
        System.out.println(qa);
    }
    public static void main(String[] args) {
        //object
        Program_02 p = new Program_02();
        System.out.println(p.qa);
        p.method();
        System.out.println(p.qa);

    }
}
