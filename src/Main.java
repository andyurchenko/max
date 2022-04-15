public class Main {
    public static final int MAX_COUNT = 10;

    public static void main(String[] args) {
        final Counter counter = new Counter();

        System.out.println("Hello, world!");

        counter.count(MAX_COUNT);
    }

}
