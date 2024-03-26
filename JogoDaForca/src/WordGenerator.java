import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WordGenerator {
    public static String genWord() throws IOException {
        URL url = new URL("https://random-word-api.herokuapp.com/word");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        int responseCode = connection.getResponseCode();
        if (responseCode == 200) {
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = in.readLine()) != null) {
                response.append(line);
            }
            in.close();
            connection.disconnect();
            String stringResponse = response.toString();
            stringResponse = stringResponse.substring(1,stringResponse.length() - 1);
            String replaceQuotes = String.valueOf('"');
            stringResponse = stringResponse.replaceAll(replaceQuotes,"");
            return stringResponse;
        }
        return "";
    }
}
