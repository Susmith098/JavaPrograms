interface Camera{
    void takeSnap();
    default void recordVideo(){
        System.out.println("Recording video");
    }
}

interface wifi{
    String[] getNetworks();
    void connectToNetworks(String network);
}

class MycellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling " + phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting... ");
    }
}

class smartPhone extends MycellPhone implements Camera, wifi{
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

public class DefaultMethods {
    public static void main(String[] args) {
        smartPhone s = new smartPhone();
        s.recordVideo();
        s.takeSnap();
        String[] ar = s.getNetworks();
        for (String item: ar){
            System.out.println(item);
        }
    }
}
