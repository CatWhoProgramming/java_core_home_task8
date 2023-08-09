package Task2;

public class Monitor extends Device {
    private int resolutionX;
    private int resolutionY;
    private static final int RANDOM = (int) (Math.random() * 100);

    {
        System.out.println(" const for class Monitor: " + RANDOM);
    }

    public Monitor(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY) {
        super(manufacturer, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }

    @Override
    public String toString() {

        return "Manufacturer " + manufacturer + " Price " + price + " SerialNumber " + serialNumber +
                "X= " + resolutionX + "Y= " + resolutionY;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Monitor o = (Monitor) obj;
        if (manufacturer != o.manufacturer && price != o.price && serialNumber != o.serialNumber &&
                resolutionX != o.resolutionX && resolutionY != o.resolutionY)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = serialNumber.hashCode();
        result *= (int) (price * manufacturer.hashCode());
        result += (resolutionX * resolutionY);
        result *= RANDOM;
        return result;
    }
}
