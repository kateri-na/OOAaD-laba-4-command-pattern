public class MuteCommand implements Connectivity{
    private boolean mute;
    MuteCommand(boolean mute){
        this.mute = mute;
    }
    public void setMute(boolean mute) {
        this.mute = mute;
    }
    public boolean isMute() {
        return mute;
    }
    @Override
    public void execute() {
        System.out.printf("Значение режима mute: %b\n", mute);
    }
}