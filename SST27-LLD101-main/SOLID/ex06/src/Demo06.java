public class Demo06 {
    public static void main(String[] args) {
        Aviary aviary = new Aviary();
        aviary.release(new Bird());
        // aviary.release(new Penguin()); // compile-time error: Penguin is not Flyable
    }
}
