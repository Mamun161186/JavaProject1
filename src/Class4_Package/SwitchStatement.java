package Class4_Package;

public class SwitchStatement {
    public static void main(String[] args) {
        String weather = "cloudy";
        switch(weather){

            case "sunny":
                System.out.println("this is a sunny day");
                break;
            case "cloudy":
                System.out.println("weather is cloudy");
                break;
            case "overcast":
                System.out.println("overcast weather");
            default:
                System.out.println("missing weather information");
        }
    }
}
