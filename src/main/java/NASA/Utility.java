package NASA;

import com.fasterxml.jackson.databind.JsonNode;

public class Utility {
    public static void main(String[] args) {
        try {
            APIFetch client = new APIFetch();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
