public class DatacenterConfig {

    public static final String DEFAULT_REGION = "us-east-1";

    public static void printSop() {
        System.out.println("Standard Operating Procedure:");
        System.out.println("All nodes must be toggled ON before memory allocation.");
        System.out.println("Default region: " + DEFAULT_REGION);
    }
}