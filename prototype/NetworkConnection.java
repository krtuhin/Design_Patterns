package prototype;

public class NetworkConnection implements Cloneable {

    private String ip;
    private String data;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void loadImportantData() throws InterruptedException {
        this.data = "Important data...";
        Thread.sleep(5000);
    }

    @Override
    public String toString() {
        return "NetworkConnection [ip=" + ip + ", data=" + data + "]";
    }

    // create prototype or clone of the object
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
