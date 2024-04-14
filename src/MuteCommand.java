public class MuteCommand implements Connectivity{
    private boolean mute;
    MuteCommand(boolean mute){
        this.mute = mute;
    }
    public void muteChange(boolean mute){
        this.mute = mute;
        System.out.printf("Значение режима mute: %b", mute);
    }
    @Override
    public void execute(Object parameter) {
        muteChange((boolean)parameter);
    }
}