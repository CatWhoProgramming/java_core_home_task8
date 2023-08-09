package Task2;

public class Device {
    protected String manufacturer;
    protected float price;
    protected String serialNumber;
    private static final int RANDOM = (int) (Math.random() * 100);

    static {
        System.out.println(" const for class Device: " + RANDOM);
    }

    public Device(String manufacturer, float price, String serialNumber) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "Manufacturer " + manufacturer + " Price " + price + " SerialNumber " + serialNumber;
    }

    @Override
    public boolean equals(Object device) {
        if (this == device)
            return true;
        if (device == null || getClass() != device.getClass()) return false;
        Device o = (Device) device;
        if (manufacturer != o.manufacturer && price != o.price && serialNumber != o.serialNumber)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = getClass().hashCode();
        result *= (int) (price * manufacturer.hashCode());
        result *= serialNumber.hashCode();
        result *= RANDOM;
        return result;
    }
}
