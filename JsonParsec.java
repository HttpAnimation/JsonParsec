import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JsonParsec {
    public static void main(String[] args) {
        // Specify the path to the JSON file
        String filePath = "script.json";

        try {
            // Create ObjectMapper
            ObjectMapper objectMapper = new ObjectMapper();

            // Read JSON file and parse data
            JsonNode rootNode = objectMapper.readTree(new File(filePath));

            // Print parsed data
            System.out.println("Parsed JSON Data:");
            System.out.println(rootNode.toPrettyString());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
