package jackson;

import ch.qos.logback.core.util.StringCollectionUtil;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import jdk.nashorn.internal.ir.ObjectNode;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashSet;
import java.util.StringJoiner;

public class ReadListJackson {

    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());
        /*try {
            List<String> str = objectMapper.readTree(new File("src/main/resources/serverLocal.yml")).get("targetServers").forEach(node -> node.textValue()).;

            for(final JsonNode node : js){
                System.out.println(node.textValue());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }*/
        /*final String content = "{\"cme-widget--8745\":{\"sizeWidth\":4,\"sizeHeight\":2,\"widgetPosition\":1,\"isHidden\":false}}";
        final JsonNode jsonNode = objectMapper.readTree(content);
        final JsonNode jsonNode2 = jsonNode.with("cme-widget--87451");
//        System.out.println(String.join(",", "First", "Second"));
        String configsJson = content;
        configsJson = configsJson.substring(1, configsJson.length() - 1);
        String widgetConfigJson = content.replace("8745", "0000");
        widgetConfigJson = widgetConfigJson.substring(
                1, widgetConfigJson.length() - 1
        );
        widgetConfigJson = "";
        StringJoiner stringJoiner = new StringJoiner(",","{","}");
        if(!configsJson.isEmpty()){
            stringJoiner.add(configsJson);
        }
        if(!widgetConfigJson.isEmpty()){
            stringJoiner.add(widgetConfigJson);
        }
        System.out.println(stringJoiner.toString());*/

        HashSet<String> set = new HashSet<>();
        set.add("dsffa");
        set.add("dsffad");
        set.remove(null);

        System.out.println(String.valueOf(new Long(5)));

    }
}
