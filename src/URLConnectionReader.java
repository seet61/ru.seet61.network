import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;


/**
 * Created by dmitry.arefyev on 13.11.2016.
 */
public class URLConnectionReader{
    public static void main(String[] args) throws IOException {
        System.out.println("Start network stream");
        URL google = new URL("http://google.com");
        URLConnection yc = google.openConnection();
        try (
             BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()))
        ) {
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                System.out.println(inputLine);
            }
            System.out.println("Stop network stream");
        }
        catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
