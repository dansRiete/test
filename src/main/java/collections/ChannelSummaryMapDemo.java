package collections;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static collections.ChannelSummaryMapDemo.Channels.CHANNEL1;

public class ChannelSummaryMapDemo {
    @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
    static class SingleAttributionMetric {
        String metricId;
        Integer attributionModel;

        public SingleAttributionMetric(String metricId, Integer attributionModel) {
            this.metricId = metricId;
            this.attributionModel = attributionModel;
        }
    }
    @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
    static class ClientChannelData {
        String clientId;
        Double value;

        public ClientChannelData(String clientId, Double value) {
            this.clientId = clientId;
            this.value = value;
        }
    }
    @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
    static class ChannelSummaryData {
        Map<Channels, ClientChannelData> channelData;

        public ChannelSummaryData(Map<Channels, ClientChannelData> channelData) {
            this.channelData = channelData;
        }
    }
    enum Channels{
        CHANNEL1, CHANNEL2
    }
    public static void main(String[] args) {
        /*Map<SingleAttributionMetric, ChannelSummaryData> channelSummaryData = new HashMap<>();
        channelSummaryData.put(
                new SingleAttributionMetric("Session", 108),
                new ChannelSummaryData(Map.of(
                        CHANNEL1, new ClientChannelData("30000001", 100.0),
                        CHANNEL1, new ClientChannelData("30000001", 100.0)
                ))
        );
        try {
            System.out.println(new ObjectMapper().writeValueAsString(channelSummaryData));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }*/

        System.out.println(Arrays.asList(0,1,2,3).subList(2,Arrays.asList(0,1,2,3).size()));
    }
}
