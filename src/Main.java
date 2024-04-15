
public class Main {
    public static void main(String[] args) {
        SmartSpeaker speaker = new SmartSpeaker(new BacklightCommand(Backlight.on),
                new MuteCommand(false),new OutputChannelDelayCommand(0), new VolumeCommand(100));

        speaker.activate();


    }
}