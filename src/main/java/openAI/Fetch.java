package openAI;

import okhttp3.*;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Fetch {
    private static final String PDS_API_URL = "https://pds.mcp.nasa.gov/api/search/1/properties";
    private static String TEST_API_URL = "https://jsonplaceholder.typicode.com/posts/1";
    private static final String DALLE_API_URL = "https://api.openai.com/v1/images/generations";
    private static final String GPT4_API_URL = "https://api.openai.com/v1/chat/completions";

    public static void main(String[] args) {
        String apiKey = loadApiKey("src/main/java/config.properties");

        String jsonBody = "{"
                + "\"model\":\"gpt-3.5-turbo\","
                + "\"messages\":["
                + "    {\"role\":\"system\",\"content\":\"You are ChatGPT, an AI language model.\"},"
                + "    {\"role\":\"user\",\"content\":\"Tell me a story in the style of The Little Prince.\"}"
                + "],"
                + "\"max_tokens\":50"
                + "}";

        RequestBody body = RequestBody.create(
                jsonBody, MediaType.parse("application/json"));

        OkHttpClient client = new OkHttpClient();
        ObjectMapper objectMapper = new ObjectMapper();

        // Build the request
        Request request = new Request.Builder()
                .url(GPT4_API_URL)
                .header("Authorization", "Bearer " + apiKey)
                .post(body)
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (response != null && response.body() != null && response.isSuccessful()) {
                String responseData = response.body().string();
                JsonNode jsonNode = objectMapper.readTree(responseData);

                // Print the response from GPT-4
                System.out.println("GPT-4 Response: " + jsonNode.toPrettyString());
            } else {
                String errorResponse = response.body() != null ? response.body().string() : "No response body";
                System.out.println("Request failed: " + response.code() + " - " + errorResponse);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String loadApiKey(String fileName) {
        Properties properties = new Properties();
        try (FileInputStream input = new FileInputStream(fileName)) {
            properties.load(input);
            return properties.getProperty("api_key");
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
