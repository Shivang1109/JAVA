import org.w3c.dom.ls.LSOutput;

public class interfaces {
    static void main(String[] args) {
        Smartphones phone=new Smartphones();
        phone.takepic();
        phone.playmusic();
        phone.makecall();
    }
}
interface Camera{
    void takepic();
}
interface MusicPlayer{
    void playmusic();
}
interface Phone{
    void makecall();
}
class Smartphones implements Camera, MusicPlayer, Phone{
    @Override
    public void takepic() {
        System.out.println("Taking pic..");
    }

    @Override
    public void makecall() {
        System.out.println("Making Call");
    }

    @Override
    public void playmusic() {

    }
}