interface Camera2{
    void takeSnap();
    default void recordVideo(){
        System.out.println("Recording video");
    }
}

interface wifi2{
    String[] getNetworks();
    void connectToNetworks(String network);
}

class MycellPhone2{
    void callNumber(int phoneNumber){
        System.out.println("Calling " + phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting... ");
    }
}

class smartPhone2 extends MycellPhone2 implements Camera2, wifi2{
    public void takeSnap(){
        System.out.println("Taking a Snap");
    }

    public void recordVideo(){
        System.out.println("Recording a video");
    }

    public String[] getNetworks(){
        System.out.println("Getting list of networks");
        String[] networkList = {"net1", "net2", "net3"};
        return networkList;
    }

    public void connectToNetworks(String network){
        System.out.println("Connecting to networks"+ network);
    }
}


public class Polymorphism {
    public static void main(String[] args) {
        Camera2 c = new smartPhone2();//this is a smartphone but please use it as a camera
        c.takeSnap();

    }
}
