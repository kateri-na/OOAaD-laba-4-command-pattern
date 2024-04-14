public class VolumeCommand implements Connectivity{
    private int volume;
    public VolumeCommand(int volume){
        this.volume= volume;
    }
    public void volumeChange(int volume){
        if(volume>=0 && volume<=100) {
            this.volume = volume;
            System.out.printf("Значение громкости: %d", volume);
        }
        else{
            System.out.println("Недопустимое значение громкости");
        }
    }
    @Override
    public void execute(Object volume) {
        volumeChange((int)volume);
    }
}