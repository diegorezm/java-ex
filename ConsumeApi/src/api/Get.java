package api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Get {

    private String apiUrl;

    public Get(String apiUrl) {
        this.apiUrl = apiUrl;
    }

    private HttpURLConnection createConnection() throws IOException {
        URL url = new URL(apiUrl);

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        return connection;
    }

    public String getResponse() throws IOException {
        HttpURLConnection conn = createConnection();

        int responseCode = conn.getResponseCode();
        if (responseCode != 200) {
            throw new RuntimeException("INTERNAL SERVER ERROR");
        }
        BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String line;
        StringBuilder response = new StringBuilder();
        while((line = reader.readLine()) != null){
            response.append(line);
        }
        conn.disconnect();
        return response.toString();
    }

}
