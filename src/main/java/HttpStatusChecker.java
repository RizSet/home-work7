import org.jsoup.Connection;
import org.jsoup.Jsoup;

import java.io.IOException;

public class HttpStatusChecker {

    public String getStatusImage(int code) throws IOException {
            Connection.Response response = Jsoup.connect("https://http.cat/" + code)
                    .ignoreContentType(true)
                    .execute();
       return "https://http.cat/" + code;
    }
}