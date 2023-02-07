import computer.Computer;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private final List<Computer> computersInStock;

    public Shop(List<Computer> computersInStock) {
        this.computersInStock = computersInStock;
    }

    public Shop() {
        this.computersInStock = new ArrayList<>();
    }

    public List<Computer> getComputersInStock() {
        return computersInStock;
    }

    public boolean addComputerToStock(Computer computer) {
        return computersInStock.add(computer);
    }

    public Computer sellComputer(int computerNumberInStock) {
        return computersInStock.remove(computerNumberInStock);
    }
}
