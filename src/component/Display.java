package component;

public class Display {
    private byte screenSize;
    private String matrixType;
    private String resolution;
    private double price;

    public Display(byte screenSize, String matrixType, String resolution, double price) {
        this.screenSize = screenSize;
        this.matrixType = matrixType;
        this.resolution = resolution;
        this.price = price;
    }

    public Display() {
    }

    public byte getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(byte screenSize) {
        this.screenSize = screenSize;
    }

    public String getMatrixType() {
        return matrixType;
    }

    public void setMatrixType(String matrixType) {
        this.matrixType = matrixType;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
