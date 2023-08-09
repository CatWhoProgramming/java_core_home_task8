package Task2;

public class EthernetAdapter extends Device {
    private String mac;
    private int speed;
    private static final int RANDOM = (int) (Math.random() * 100);

    {
        System.out.println(" const for class EthernetAdapter: " + RANDOM);
    }

    public EthernetAdapter(String manufacturer, float price, String serialNumber, String mac, int speed) {
        super(manufacturer, price, serialNumber);
        this.mac = mac;
        this.speed = speed;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {

        return "Manufacturer " + manufacturer + " Price " + price + " SerialNumber " + serialNumber +
                "mac: " + mac + "speed= " + speed;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        EthernetAdapter o = (EthernetAdapter) obj;
        if (manufacturer != o.manufacturer && price != o.price && serialNumber != o.serialNumber &&
                mac != o.mac && speed != o.speed)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = serialNumber.hashCode();
        result *= (int) (price * manufacturer.hashCode());
        result += (mac.hashCode() * speed);
        result *= RANDOM;
        return result;
    }
}
