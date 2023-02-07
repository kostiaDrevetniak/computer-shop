package component;

public class Processor extends Component{
    private float maxFrequency;
    private byte totalCores;
    private byte totalThreads;

    public Processor(String name, String producer, double price, float maxFrequency, byte totalCores, byte totalThreads) {
        this.name = name;
        this.producer = producer;
        this.price = price;
        this.maxFrequency = maxFrequency;
        this.totalCores = totalCores;
        this.totalThreads = totalThreads;
    }

    public Processor() {
    }

    public float getMaxFrequency() {
        return maxFrequency;
    }

    public void setMaxFrequency(float maxFrequency) {
        this.maxFrequency = maxFrequency;
    }

    public byte getTotalCores() {
        return totalCores;
    }

    public void setTotalCores(byte totalCores) {
        this.totalCores = totalCores;
    }

    public byte getTotalThreads() {
        return totalThreads;
    }

    public void setTotalThreads(byte totalThreads) {
        this.totalThreads = totalThreads;
    }
}
