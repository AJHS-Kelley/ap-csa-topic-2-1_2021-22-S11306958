
public class Dog {

    private String name;
    private String breed;
    private int age;

    public Dog(String nm, String br, int ag) {
        name = nm;
        breed = br;
        age = ag;
    }

    public void bark() {
        System.out.print("woof!");
    }

}

public class dogTester {
    public static void main(String[] args) {

        Dog graceDog = new Dog("Grace", "Lab", 1);
        graceDog.bark();
    }

}
