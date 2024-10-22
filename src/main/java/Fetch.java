import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class Fetch {
    private static final String PDS_API_URL = "https://pds.nasa.gov/api/v1/";
    private static String TEST_API_URL = "https://jsonplaceholder.typicode.com/posts/1";

    public static void main(String[] args) {

        OkHttpClient client = new OkHttpClient();
        ObjectMapper objectMapper = new ObjectMapper();

        System.out.println("Attempting to connect to: " + TEST_API_URL);

        Request request = new Request.Builder()
                .url(TEST_API_URL)
                .build();

        try (Response response = client.newCall(request).execute()) {

            if (response == null) {
                System.out.println("Response is null");
                return;
            }

            if (response.isSuccessful()) {
                String responseData = response.body().string();

                // Parse JSON using Jackson
                JsonNode jsonNode = objectMapper.readTree(responseData);
                // Example: Print the first field
                System.out.println("Parsed Data: " + jsonNode.toPrettyString());
            } else {
                System.out.println("Request failed: " + response.message());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
