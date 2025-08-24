public class Demo02 {
    public static void main(String[] args) {
        Decoder decoder = new SimpleDecoder();
        UIDrawer uiDrawer = new ConsoleUIDrawer();
        Player player = new Player(decoder, uiDrawer);
        player.play(new byte[] { 1, 2, 3, 4 });
    }
}
