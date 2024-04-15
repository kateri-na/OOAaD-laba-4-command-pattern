public class SmartSpeaker {
    private Connectivity backlight;
    private Connectivity mute;
    private Connectivity outputChannel;
    private Connectivity volume;

    public SmartSpeaker(Connectivity backlight, Connectivity mute, Connectivity outputChannel, Connectivity volume) {
        this.backlight = backlight;
        this.mute = mute;
        this.outputChannel = outputChannel;
        this.volume = volume;
    }

    public void activate(){
        volume.execute();
        mute.execute();
        backlight.execute();
        outputChannel.execute();
    }
    public void setBacklight(Connectivity backlight) {
        this.backlight = backlight;
    }
    public void setMute(Connectivity mute) {
        this.mute = mute;
    }
    public void setOutputChannel(Connectivity outputChannel) {
        this.outputChannel = outputChannel;
    }
    public void setVolume(Connectivity volume) {
        this.volume = volume;
    }
}
