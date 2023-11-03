package api.consomeapi.controller;

import api.consomeapi.tipos.Usuarios;
import com.google.gson.Gson;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Api {

    String url;

    public Api(String url) {
        this.url = url;
    }

    private HttpURLConnection getConnection() throws IOException {
        URL apiUrl = new URL(url);
        HttpURLConnection connection = (HttpURLConnection) apiUrl.openConnection();
        connection.setRequestMethod("GET");
        int connResponseCode = connection.getResponseCode();
        if (connResponseCode != 200) {
            throw new IOException("ARQUIVO NÃO ENCONTRADO!");
        }
        return connection;
    }

    public Usuarios[] getResposta() throws IOException {
        HttpURLConnection conn = getConnection();
        InputStreamReader reader = new InputStreamReader(conn.getInputStream());
        Usuarios[] usuarios;
        Gson gson = new Gson();
        usuarios = gson.fromJson(reader, Usuarios[].class);
        reader.close();
        conn.disconnect();
        return usuarios;
    }
}
