package api.consomeapi.controller;

import api.consomeapi.tipos.Usuarios;
import com.google.gson.Gson;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class Api {

    String url;

    public Api(String url) {
        this.url = url;
    }

    private HttpURLConnection getConnection(String requestMethod) throws IOException {
        URL apiUrl = new URL(url);
        HttpURLConnection connection = (HttpURLConnection) apiUrl.openConnection();
        connection.setRequestMethod(requestMethod);
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setDoOutput(true);

//        int connResponseCode = connection.getResponseCode();
//        if (connResponseCode != 200) {
//            throw new IOException("NÃO FOI POSSIVEL ESTABELECER UMA CONEXÃO COM A API!");
//        }
        return connection;
    }

    public Usuarios[] getResposta() throws IOException {
        HttpURLConnection conn = getConnection("GET");
        Usuarios[] usuarios;
        try (InputStreamReader reader = new InputStreamReader(conn.getInputStream())) {
            Gson gson = new Gson();
            usuarios = gson.fromJson(reader, Usuarios[].class);
        }
        conn.disconnect();
        return usuarios;
    }

    public Usuarios postData(Usuarios data) throws IOException {
        HttpURLConnection conn = getConnection("POST");

        String jsonPayload = data.toJson();
        Usuarios usuarios;

        try (OutputStream os = conn.getOutputStream()) {
            byte[] input = jsonPayload.getBytes("utf-8");
            os.write(input, 0, input.length);
        }
        
        int responseCode = conn.getResponseCode();
        if (responseCode > 299) {
            throw new IOException("Não foi possivel concluir a operação");
        }
        try (InputStreamReader reader = new InputStreamReader(conn.getInputStream())) {
            Gson gson = new Gson();
            usuarios = gson.fromJson(reader, Usuarios.class);
        }
        conn.disconnect();
        return usuarios;
    }
}
