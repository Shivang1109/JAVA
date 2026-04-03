class Device{

    void On(){
        System.out.println("ON");
    }
    void Off(){
        System.out.println("OFF");
    }
}
class Telephone extends Device{

    void Call(){
        System.out.println("Calling");
    }
}
class Mobile extends Telephone{

    void Message(){
        System.out.println("Messaging");
    }
}
class Smartphone extends Mobile{

    void Internet(){
        System.out.println("Internet Surfing");
    }
}

public class inheritance{
    public static void main(String[] args){
        Smartphone s1=new Smartphone();
        s1.On();
        s1.Off();
        s1.Call();
        s1.Message();
        s1.Internet();
    }
}