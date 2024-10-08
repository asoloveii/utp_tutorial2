// TODO We need Adder and Subtractor classes!!!!

// OK, I will add `Adder` and s31376 will add `Subtractor`

public class Main {
    public static void main(String[] args) {
        Adder adder = new Adder();
        System.out.println(adder.add(3, 5));
        Subtractor subtractor = new Subtractor();

        System.out.println(subtractor.subtract(6, 3));
    }
}
