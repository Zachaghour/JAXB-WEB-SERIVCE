import jakarta.xml.ws.Endpoint;
import ws.BanqueService;

public class ServerJWS {
    public static void main(String[] args) {
        String http =  "http://0.0.0.0:9191/";
        Endpoint.publish(http, new BanqueService());
        System.out.println("Web Service deploye sur " + http);
    }
}
