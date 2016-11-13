import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

/**
 * Created by dmitry.arefyev on 13.11.2016.
 */
public class Reverse {
    public static void main(String[] args) throws Exception {
        if (args.length != 2) {
            System.err.println("Usage: java Reverse http://<location of your servlet/script> string_to_reverse");
            System.exit(1);
        }
        String stringToReverse = URLEncoder.encode(args[1], "UTF-8");

        System.out.println("Start");

        URL url = new URL(args[0]);
        URLConnection connection = url.openConnection();
        connection.setDoOutput(true);

        try (OutputStreamWriter out = new OutputStreamWriter(connection.getOutputStream());
             BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()))
        ) {
            out.write("string="+stringToReverse);
            String decodedString;
            while ((decodedString=in.readLine()) != null) {
                System.out.println(decodedString);
            }
        }

        System.out.println("Stop");
    }
}
