public class Main {

    public static void main(String[] args) {

        DatacenterConfig.printSop();

        System.out.println();

        ComputeNode node1 = new ComputeNode("C-01", 16);
        DatabaseNode node2 = new DatabaseNode("DB-01", 1024);

        node1.togglePower();
        node2.togglePower();

        System.out.println();

        node1.allocateMemory(32);
        node2.allocateMemory(32);

        System.out.println();

        System.out.println(node1.generateHealthReport());
        System.out.println("Uptime: " + node1.getUptime() + " hours");

        System.out.println();

        System.out.println(node2.generateHealthReport());
        System.out.println("Uptime: " + node2.getUptime() + " hours");
    }
}