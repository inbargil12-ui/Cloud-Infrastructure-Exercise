public class DatabaseNode extends CloudResource {

    private int storageCapacityGb;

    public DatabaseNode(String resourceId, int storageCapacityGb) {
        super(resourceId);
        this.storageCapacityGb = storageCapacityGb;
    }

    @Override
    public void allocateMemory(int gigabytes) {
        System.out.println("Reserving " + gigabytes + " GB RAM for database indexing.");
    }

    @Override
    public String generateHealthReport() {
        if (isActive) {
            return "Database Node " + resourceId + " is Healthy. Storage capacity: "
                    + storageCapacityGb + " GB";
        }

        return "Database Node " + resourceId + " is Offline.";
    }

    @Override
    public int getUptime() {
        return 48;
    }
}
