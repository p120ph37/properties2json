package properties2json;

import java.io.IOException;
import java.util.Map.Entry;
import java.util.Properties;

public class App {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        prop.load(System.in);
        // System.out.println(new JSONObject(prop).toString());
        System.out.append('{');
        boolean needsComma = false;
        for(Entry<Object, Object> entry : prop.entrySet()) {
            if(needsComma) {
                System.out.append(',');
            }
            System.out.append(
                "\"" +
                entry.getKey().toString().replace("\\", "\\\\").replace("\"", "\\\"") +
                "\":\"" +
                entry.getValue().toString().replace("\\", "\\\\").replace("\"", "\\\"") +
                "\""
            );
            needsComma = true;
        }
        System.out.append('}');
    }
}
