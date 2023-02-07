package component;

public class HDD extends Storage {
    private int spindleRotationSpeed;
    private int dataTransferSpeed;

    public HDD(String name, String producer, double price, int memorySize, String formFactor, int spindleRotationSpeed, int dataTransferSpeed) {
        this.spindleRotationSpeed = spindleRotationSpeed;
        this.dataTransferSpeed = dataTransferSpeed;
        this.name = name;
        this.producer = producer;
        this.price = price;
        this.memorySize = memorySize;
        this.formFactor = formFactor;
    }

    public int getSpindleRotationSpeed() {
        return spindleRotationSpeed;
    }

    public void setSpindleRotationSpeed(int spindleRotationSpeed) {
        this.spindleRotationSpeed = spindleRotationSpeed;
    }

    public int getDataTransferSpeed() {
        return dataTransferSpeed;
    }

    public void setDataTransferSpeed(int dataTransferSpeed) {
        this.dataTransferSpeed = dataTransferSpeed;
    }
}
