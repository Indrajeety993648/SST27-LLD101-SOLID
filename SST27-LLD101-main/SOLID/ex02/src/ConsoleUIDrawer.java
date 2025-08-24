public class ConsoleUIDrawer implements UIDrawer {
    @Override
    public void draw(Frame frame) {
        System.out.println("\u25B6 Playing " + frame.data.length + " bytes");
    }
}