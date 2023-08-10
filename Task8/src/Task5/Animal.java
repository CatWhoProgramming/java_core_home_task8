package Task5;

public class Animal {
    String name;
    int age;
    boolean tail;

    public Animal(String name, int age, boolean tail) {
        this.name = name;
        this.age = age;
        this.tail = tail;
    }

    public String toString() {
        if (tail)
            return "Name: " + name + " Age: " + age + " Tail: yes";
        return "Name: " + name + " Age: " + age + " Tail: no";
    }

    @Override
    public int hashCode() {

        if (tail) {
            return (byte) ((byte) age | 34) * name.hashCode();
        }
        return (byte) ((byte) age | 34) * name.hashCode() + 1;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || this.getClass() != obj.getClass())
            return false;
        if (name != ((Animal) obj).name || age != ((Animal) obj).age || tail != ((Animal) obj).tail)
            return false;
        return true;
    }
}
