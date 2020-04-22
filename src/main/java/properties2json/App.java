package properties2json;

import java.io.IOException;
import java.util.Properties;

import org.json.JSONObject;


public class App {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        prop.load(System.in);
        System.out.println(new JSONObject(prop).toString());
    }
}
