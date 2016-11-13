import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * Created by dmitry.arefyev on 13.11.2016.
 */
public class URLReader {
    public static void main(String[] args) throws IOException {
        System.out.println("Start network stream");
        URL oracle = new URL("http://google.com/");
        try (BufferedReader in = new BufferedReader(new InputStreamReader(oracle.openStream()))) {
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                System.out.println(inputLine);
            }
        }
        System.out.println("Stop network stream");
    }
}
