package component;

public class PowerSupply extends Component {
    private int maxPower;

    public PowerSupply(String name, String producer, double price, int maxPower) {
        this.name = name;
        this.producer = producer;
        this.price = price;
        this.maxPower = maxPower;
    }

    public PowerSupply() {
    }

    public int getMaxPower() {
        return maxPower;
    }

    public void setMaxPower(int maxPower) {
        this.maxPower = maxPower;
    }
}
