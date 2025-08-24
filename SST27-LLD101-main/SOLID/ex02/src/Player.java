public class Player {
    private Frame last;
    private final Decoder decoder;
    private final UIDrawer uiDrawer;

    public Player(Decoder decoder, UIDrawer uiDrawer) {
        this.decoder = decoder;
        this.uiDrawer = uiDrawer;
    }

    public void play(byte[] fileBytes) {
        Frame f = decoder.decode(fileBytes);
        last = f;
        uiDrawer.draw(f);
        System.out.println("Cached last frame? " + (last != null));
    }
}