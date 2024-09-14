package Class4_Package;

public class JumpStatement {
    public static void main(String[] args) {
        System.out.println("workflow of break");
        int i=0;
        for (i=1;i<=100;i++){
            if(i==5)
                break;
            System.out.println(i);

        }
        System.out.println("workflow of continue");

        int j=0;
        for(j=1;j<=10;j++){
            if(j==5)
                continue;
            System.out.println(j);
        }


        }


}
