public class BacklightCommand implements Connectivity{
    private Backlight backlight;
    BacklightCommand(Backlight backlight){
        this.backlight = backlight;
    }
    public void setBacklight(Backlight backlight) {
        this.backlight = backlight;
    }
    @Override
    public void execute() {
        System.out.printf("Состояние подсветки динамика: %s\n",backlight.name());
    }
}
enum Backlight{
    on,
    off,
    blinking
}
