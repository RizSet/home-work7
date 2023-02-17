import org.jsoup.Connection;
import org.jsoup.Jsoup;

import java.io.*;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.stream.IntStream;

public class HttpStatusImageDownloader {
    public void downloadStatusImage(int code) throws IOException {
            Connection.Response response = Jsoup.connect(new HttpStatusChecker().getStatusImage(code))
                    .ignoreContentType(true)
                    .execute();

            byte[] buffer = response.bodyStream().readAllBytes();

            OutputStream os = new FileOutputStream(code + ".jpg");
            os.write(buffer, 0, buffer.length);
            os.close();

    }
}


