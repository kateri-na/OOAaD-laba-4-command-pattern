import junit.framework.TestCase;
import org.junit.Assert;

public class SmartSpeakerTest extends TestCase {
    SmartSpeaker speaker = new SmartSpeaker(new BacklightCommand(Backlight.on),
            new MuteCommand(false),new OutputChannelDelayCommand(0), new VolumeCommand(100));
    public void testSetBacklight() {
        String expected = "blinking";
        speaker.setBacklight(new BacklightCommand(Backlight.blinking));
        Assert.assertEquals(expected, ((BacklightCommand)speaker.getBacklight()).getBacklight());
    }
    public void testSetMute() {
        Boolean expected = true;
        speaker.setMute(new MuteCommand(true));
        Assert.assertEquals(expected, ((MuteCommand)speaker.getMute()).isMute());
    }
    public void testSetOutputChannel() {
        int expected = 850;
        speaker.setOutputChannel(new OutputChannelDelayCommand(850));
        Assert.assertEquals(expected, ((OutputChannelDelayCommand)speaker.getOutputChannel()).getDelay());
    }

    public void testSetVolume() {
        int expected =45;
        speaker.setVolume(new VolumeCommand(45));
        Assert.assertEquals(expected,((VolumeCommand)speaker.getVolume()).getVolume());
    }
}