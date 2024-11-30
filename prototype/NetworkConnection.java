package prototype;

import java.util.ArrayList;
import java.util.List;

public class NetworkConnection implements Cloneable {

    private String ip;
    private String data;
    private List<String> domains = new ArrayList<>();

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

    public List<String> getDomains() {
        return domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

    public void loadImportantData() throws InterruptedException {
        this.data = "Important data...";

        this.domains.add("www.abc.com");
        this.domains.add("www.pqr.com");
        this.domains.add("www.xyz.com");
        this.domains.add("www.google.com");

        Thread.sleep(5000);
    }

    @Override
    public String toString() {
        return "NetworkConnection [ip=" + ip + ", data=" + data + ", domains=" + domains + "]";
    }

    // create prototype or clone of the object
    @Override
    protected Object clone() throws CloneNotSupportedException {

        // logic for deep cloning
        NetworkConnection networkConnection = new NetworkConnection();

        networkConnection.setIp(this.getIp());
        networkConnection.setData(this.getData());

        for (String domain : this.getDomains()) {
            networkConnection.getDomains().add(domain);
        }

        return networkConnection;
    }

}
