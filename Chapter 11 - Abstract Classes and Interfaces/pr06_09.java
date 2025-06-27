interface TVRemote{
    void onOff();
    void adjustSound();
    void changeChannel();
}

interface SmartTvRemote extends TVRemote{
    void useVoiceAssistant();
    void useApps();
}


class Tv implements SmartTvRemote{
    public void onOff(){
        System.out.println("Click to turn on/off the TV");
    }
    public void adjustSound(){
        System.out.println("Adjust the sound");
    }
    public void changeChannel(){
        System.out.println("Press to change the channel");
    }
    public void useVoiceAssistant(){
        System.out.println("Use Google Assistnat");
    }
    public void useApps(){
        System.out.println("Use apps");
    }
}

public class pr06_09 {
    public static void main(String[] args) {
        Tv t = new Tv();
        t.onOff();
        t.adjustSound();
        t.useVoiceAssistant();
    }
}
