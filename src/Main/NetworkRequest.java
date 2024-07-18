package Main;

public abstract class NetworkRequest {
    public void checkDNS(){
        System.out.println("Checking DNS");
    }

    public abstract void sendRequest();
}
