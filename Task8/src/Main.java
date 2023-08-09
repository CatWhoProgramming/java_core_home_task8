import Task2.Device;
import Task2.EthernetAdapter;
import Task2.Monitor;

import java.awt.*;

public class Main {

    private static String ansiColor;
    static Device[] devices = new Device[]{
            new Monitor("Samsung", 1250, "ABCDMN0465", 1950, 1700),
            new EthernetAdapter("STARLink", 2000, "ERTHAY2348", "12-34-43-34-12-23", 100),
            new Monitor("Samsung", 1250, "ABCDMN0465", 1950, 1700),
            new Monitor("HP", 1500, "AKLJLNJ643", 1950, 1680),
            new EthernetAdapter("STARLink", 2000, "ERTHAY19876", "11-54-13-74-11-03", 300)};
    static Device[] devices2 = new Device[]{
            new Device("Samsung", 1250, "ABCDMN0465"),
            new Device("STARLink", 2000, "ERTHAY2348"),
            new Device("Samsung", 1250, "ABCDMN0465"),
            new Device("HP", 1500, "AKLJLNJ643"),
            new Device("STARLink", 2000, "ERTHAY19876")};

    public static void main(String[] args) {
        ansiColor = "\u001b[38;5;" + generateColor() + "m";
        for (int i = 0; i < devices.length; i++) {

            System.out.println(ansiColor + "Hashcode for object of  " + devices[i].getClass() + "  " + devices[i].getClass().hashCode());

        }
        ansiColor = "\u001B[38;5;" + generateColor() + "m";
        for (int i = 0; i < devices2.length; i++) {

            System.out.println(ansiColor + "Hashcode for object of  " + devices2[i].getClass() + "  " + devices2[i].getClass().hashCode());

        }
        ansiColor = "\u001B[38;5;" + generateColor() + "m";
        System.out.println(ansiColor + "Equals two arrays by Class " + devices.getClass().equals(devices2.getClass()));
        boolean equal = false;
        ansiColor = "\u001B[38;5;" + generateColor() + "m";
        for (int i = 0; i < devices2.length; i++) {
            for (int j = 0; j < devices.length; j++) {
                equal = devices2[i].equals(devices[j]);
                if (equal) {
                    System.out.println(ansiColor + "Equals objects from array devices2 and devices " + equal);
                    break;
                }
            }
            System.out.println(ansiColor + "Equals objects from array devices2 and devices " + equal);
        }
        ansiColor = "\u001B[38;5;" + generateColor() + "m";
        for (int i = 1; i < devices.length; i++) {

            System.out.println(ansiColor + "Equals objects from array devices " + devices[0].equals(devices[i]));


        }
    }

    public static int generateColor() {
        return (int) (Math.random() * (1 + 255));
    }
}