public class BacklightCommand implements Connectivity{
    private Backlight backlight;
    BacklightCommand(Backlight backlight){
        this.backlight = backlight;
    }
    public void backlightChange(Backlight backlight){
        this.backlight = backlight;
        System.out.printf("Состояние подсветки динамика: ",backlight);
    }
    @Override
    public void execute(Object parameter) {
        backlightChange((Backlight)parameter);
    }
}
enum Backlight{
    on,
    off,
    blinking
}
