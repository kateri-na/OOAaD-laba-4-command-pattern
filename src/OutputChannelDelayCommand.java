public class OutputChannelDelayCommand implements Connectivity{
    private int delay;
    OutputChannelDelayCommand(int delay) {
        if(delay>=0 && delay<= 1024) {
            this.delay = delay;
        }
        else throw new IllegalArgumentException("Недопустимое значение задержки выходного канала: должно быть 0-1024");
    }
    public void setDelay(int delay) {
        if(delay>=0 && delay<= 1024) {
            this.delay = delay;
        }
        else throw new IllegalArgumentException("Недопустимое значение задержки выходного канала: должно быть 0-1024");
    }

    public int getDelay() {
        return delay;
    }

    @Override
    public void execute() {
        System.out.printf("Задержка выходного канала: %d\n", delay);
    }
}
