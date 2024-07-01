package finalexam.task5;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class CommunicationManager {
    private static final String REQUEST_METHOD = "POST";
    private static final String CONTENT_TYPE = "application/json";
    private static final String CHARSET = "UTF-8";
    private static final String ENDPOINT = "http://example.com"; // replace with your endpoint

    public void sendPostRequest(String message) {
        try {
            URL url = new URL(ENDPOINT);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod(REQUEST_METHOD);
            connection.setRequestProperty("Content-Type", CONTENT_TYPE);
            connection.setRequestProperty("Accept-Charset", CHARSET);
            connection.setDoOutput(true);

            try (OutputStream output = connection.getOutputStream()) {
                output.write(message.getBytes(CHARSET));
            }

            int responseCode = connection.getResponseCode();
            System.out.println("POST Response Code :: " + responseCode);

            connection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}