

public class interfaces {
    static void main(String[] args) {
        Smartphone phone=new Smartphone();
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
class Smartphone implements Camera, MusicPlayer, Phone{
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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'playmusic'");
    }

}