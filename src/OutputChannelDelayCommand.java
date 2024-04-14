public class OutputChannelDelayCommand implements Connectivity{
    private int delay;
    OutputChannelDelayCommand(int delay){
        this.delay= delay;
    }
    public void ChangeOutputChannelDelay(int delay){
        if(delay>=0 && delay<= 1024) {
            this.delay = delay;
            System.out.printf("Задержка выходного канала: %d", delay);
        }
        else{
            System.out.println("Недопустимое значение задержки выходного канала");
        }
    }
    @Override
    public void execute(Object parameter) {
        ChangeOutputChannelDelay((int)parameter);
    }
}
