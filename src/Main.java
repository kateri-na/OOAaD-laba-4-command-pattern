
public class Main {
    public static void main(String[] args) {
        SmartSpeaker speaker = new SmartSpeaker(new BacklightCommand(Backlight.on),
                new MuteCommand(false),new OutputChannelDelayCommand(0), new VolumeCommand(100));
        System.out.println("Состояние умного динамика по умолчанию:");
        speaker.activate();
        System.out.println("-------Заданные параметры-------");
        speaker.setOutputChannel(new OutputChannelDelayCommand(200));
        speaker.setBacklight(new BacklightCommand(Backlight.blinking));
        speaker.setVolume(new VolumeCommand(90));
        speaker.activate();
        speaker.setVolume(new VolumeCommand(80));
        System.out.println("--------------------------------");
        speaker.activate();
        speaker.setVolume(new VolumeCommand(70));
        System.out.println("--------------------------------");
        speaker.activate();
        speaker.setVolume(new VolumeCommand(60));
        System.out.println("--------------------------------");
        speaker.activate();
        speaker.setVolume(new VolumeCommand(50));
        speaker.setMute(new MuteCommand(true));
        System.out.println("--------------------------------");
        speaker.activate();
    }
}