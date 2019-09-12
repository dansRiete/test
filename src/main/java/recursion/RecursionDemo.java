package recursion;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class RecursionDemo {

    public static StringBuilder translateSegmentCriteria(
            SegmentDefinition segmentDefinition,
            StringBuilder stringBuilder
    ){
        stringBuilder.append("(");
        for(int i = 0; i < segmentDefinition.getCriteria().size(); i++){
            SegmentDefinition currentSegment = segmentDefinition.getCriteria().get(i);

            if(currentSegment.getCriteria() != null){
                translateSegmentCriteria(currentSegment, stringBuilder);
            }
            if(currentSegment.getCriteria() == null){
                stringBuilder.append(currentSegment);
            }
            if (i + 1 < segmentDefinition.getCriteria().size()) {
                stringBuilder.append(" ").append(segmentDefinition.getOp())
                        .append(" ");
            }
            System.out.println();
        }
        stringBuilder.append(")");
        return stringBuilder;
    }

    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        SegmentDefinition segmentDefinition = objectMapper.readValue(
                new File("src/main/java/recursion/SegmentDefinition.json"), SegmentDefinition.class
        );
        System.out.println(translateSegmentCriteria(segmentDefinition, new StringBuilder()));

    }
}
