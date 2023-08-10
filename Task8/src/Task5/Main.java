package Task5;

public class Main {
    static String[] names = new String[]{"Vaska", " Jack", "Julia", "Rex", "Mitrofan"};
    static int[] ages = new int[]{12, 3, 4, 1, 15, 2};
    static boolean[] tail = new boolean[]{true, false};

    public static void main(String[] args) {
        Animal[] animals = new Animal[5];
        for (int i = 0; i < animals.length; i++) {
            animals[i] = new Animal(
                    names[(int) (Math.random() * names.length)],
                    ages[(int) (Math.random() * ages.length)],
                    tail[(int) (Math.random() * tail.length)]);
            System.out.println("\u001b[38;5;32m" + animals[i]);
        }

        equalsAnimal(animals);
        Animal animal = new Animal("Rex", 12, true);
        Animal animal2 = new Animal("Rex", 12, true);
        System.out.println("\u001b[0m" + animal2.hashCode() + " " + animal.hashCode());
        System.out.println(animal2.equals(animal));
    }

    private static void equalsAnimal(Animal[] animals) {
        System.out.println("\u001b[38;5;23m" + "hashCode animal[0]: " +
                animals[0].hashCode());
        for (int i = 1; i < animals.length; i++) {
            System.out.println("\u001b[38;5;48m" + "Equals animals: " +
                    animals[0].equals(animals[i]));
            System.out.println("\u001b[38;5;23m" + "hashCode animal[" + i + "]: " +
                    animals[i].hashCode());
        }
    }
}
