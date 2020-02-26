package gzip;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

import org.h2.util.IOUtils;

public class GzipByteArrayDemo {

    static String helloString = "Hellllllllo world! Hellllllllo world!"
        + " Hellllllllo world! Hellllllllo world!"
        + " Hellllllllo world! Hellllllllo world!"
        + " Hellllllllo world! Hellllllllo world!"
        + " Hellllllllo world! Hellllllllo world!"
        + " Hellllllllo world! Hellllllllo world!";

    public static void main(String[] args) throws IOException {
        System.out.println("Hello string uncompressed is " + helloString.getBytes().length + " bytes");
        byte[] compressedBytes = new byte[0];

        try (
            ByteArrayOutputStream out = new ByteArrayOutputStream(helloString.getBytes().length);
            GZIPOutputStream gzipOutputStream = new GZIPOutputStream(out);
        ) {
            gzipOutputStream.write(helloString.getBytes(/*StandardCharsets.ISO_8859_1*/));
            gzipOutputStream.close();
            compressedBytes = out.toByteArray();
            System.out.println("Hello string compressed is " + compressedBytes.length + " bytes");
        } catch (IOException e) {
            e.printStackTrace();
        }

        byte[] unCompressed;

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(compressedBytes);
        GZIPInputStream gzipInputStream = new GZIPInputStream(byteArrayInputStream);
        unCompressed = gzipInputStream.readAllBytes();

        /*ByteArrayOutputStream out = new ByteArrayOutputStream();
        try{
            IOUtils.copy(new GZIPInputStream(new ByteArrayInputStream(compressedBytes)), out);
        } catch(IOException e){
            throw new RuntimeException(e);
        }
        unCompressed = out.toByteArray();*/

        System.out.println("Hello string uncompressed is " + unCompressed.length + " bytes");
    }
}

