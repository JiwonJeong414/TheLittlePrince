package NASA;

import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;


public class APIFetch {
    private static final String EXOPLANET_TAP_URL = "https://exoplanetarchive.ipac.caltech.edu/TAP/sync";
    private final HttpClient httpClient;
    private final ObjectMapper objectMapper;

    public APIFetch() {
        this.httpClient = HttpClient.newHttpClient();
        this.objectMapper = new ObjectMapper();
    }

    public JsonNode getExoplanetData(String query) throws Exception {
        // Encode the query string
        String sqlQuery = "SELECT * FROM ps WHERE pl_name LIKE '%" + query + "%'";
        String encodedQuery = URLEncoder.encode(sqlQuery, StandardCharsets.UTF_8);
        String url = EXOPLANET_TAP_URL + "?query=" + encodedQuery + "&format=json";

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("Accept", "application/json")
                .GET()
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        JsonNode jsonNode = objectMapper.readTree(response.body());

        // Log some example fields
        if (jsonNode.isArray() && jsonNode.size() > 0) {
            JsonNode firstResult = jsonNode.get(0);
            System.out.println("Exoplanet Name: " + firstResult.get("pl_name").asText());
            System.out.println("Orbital Period: " + firstResult.get("pl_orbper").asText());
            System.out.println("Mass: " + firstResult.get("pl_bmasse").asText());
        }

        return jsonNode;
    }

    public static void main(String[] args) {
        try {
            APIFetch apiFetch = new APIFetch();
            apiFetch.getExoplanetData("HD 23472");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}