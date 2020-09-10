package http;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

/**
 * Read bytes from a URL
 */
public class UrlDemo {

    public static void main(String[] args) throws IOException {
        URL url = new URL("https://ua.korrespondent.net/");
        byte[] buffer = new byte[256 * 1024];
        int len;
        InputStream inputStream = url.openStream();
        int i = 0;
        while ((len = inputStream.read(buffer)) >= 0) {
            i++;
            System.out.println(Arrays.toString(buffer));
        }
        System.out.println(String.format("Iterated %d times", i));
    }

}
