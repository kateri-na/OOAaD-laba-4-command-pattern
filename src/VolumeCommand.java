public class VolumeCommand implements Connectivity{
    private int volume;
    public VolumeCommand(int volume){
        if(volume>=0 && volume<=100) {
            this.volume = volume;
        }
        else throw new IllegalArgumentException("Недопустимое значение громкости: должно быть 0-100");
    }
    public void setVolume(int volume) {
        if(volume>=0 && volume<=100) {
            this.volume = volume;
        }
        else throw new IllegalArgumentException("Недопустимое значение громкости: должно быть 0-100");
    }
    @Override
    public void execute() {
        System.out.printf("Значение громкости: %d\n", volume);
    }
}