public class Main {
    public static final int MAX_COUNT = 10;

    public static void main(String[] args) {
        final Counter counter = new Counter();
        System.out.println("Hello, world!\n\n");
        System.out.println("Start counter");
        
        for(int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        counter.count(MAX_COUNT);
        System.out.println("Stop counter");
    }
}
