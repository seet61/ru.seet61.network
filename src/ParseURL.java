import java.net.MalformedURLException;
import java.net.URL;

/**
 * Пример парсинга URL
 * Created by dmitry.arefyev on 13.11.2016.
 */
public class ParseURL {
    public static void main(String[] args) throws MalformedURLException {
        URL aURL = new URL("http://example.com:80/docs/books/tutorial"
                + "/index.html?name=networking#DOWNLOADING");

        System.out.println("protocol = " + aURL.getProtocol());
    }
}
