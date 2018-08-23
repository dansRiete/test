package jackson;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ibm.cxa.da.explore.model.schema.domain.report.Frequency;
import com.ibm.cxa.da.explore.model.schema.utils.GuidUtils;

import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;

public class CompareDateMethodsDemo {

    public static class CompareDate {
        private String dateLabel;
        private String startDate;
        private String endDate;
        private Frequency frequency;
        private int numPeriods;

        public CompareDate() {
        }

        public String getDateLabel() {
            return this.dateLabel;
        }

        public void setDateLabel(String dateLabel) {
            this.dateLabel = dateLabel;
        }

        public String getEndDate() {
            return this.endDate;
        }

        public void setEndDate(String dateLabel) {
            this.endDate = dateLabel;
        }

        public String getStartDate() {
            return this.startDate;
        }

        public void setStartDate(String startDate) {
            this.startDate = startDate;
        }

        public Frequency getFrequency() {
            return this.frequency;
        }

        public void setFrequency(Frequency frequency) {
            this.frequency = frequency;
        }

        public int getNumPeriods() {
            return this.numPeriods;
        }

        public void setNumPeriods(int numPeriods) {
            this.numPeriods = numPeriods;
        }

        @Override public boolean equals(Object o) {
            if (this == o)
                return true;
            if (o == null || getClass() != o.getClass())
                return false;
            CompareDate that = (CompareDate) o;
            return numPeriods == that.numPeriods &&
                    Objects.equals(dateLabel, that.dateLabel) &&
                    Objects.equals(startDate, that.startDate) &&
                    Objects.equals(endDate, that.endDate) &&
                    frequency == that.frequency;
        }

        @Override public int hashCode() {

            return Objects
                    .hash(dateLabel, startDate, endDate, frequency, numPeriods);
        }
    }
    @JsonIgnoreProperties(
            ignoreUnknown = true
    )
    public static class CompareMethods {
        @JsonProperty("A_B")
        private boolean aB;
        @JsonProperty("B")
        private boolean b;
        @JsonProperty("P_B")
        private boolean pB;
        @JsonProperty("P_DIFF")
        private boolean pDiff;
        @JsonProperty("P_TOTAL_A")
        private boolean pTotalA;
        @JsonProperty("P_TOTAL_B")
        private boolean pTotalB;
        @JsonProperty("P_TOTAL_DIFF")
        private boolean pTotalDiff;
        @JsonProperty("RANK_A")
        private boolean rankA;
        @JsonProperty("RANK_B")
        private boolean rankB;
        @JsonProperty("RANK_DIFF")
        private boolean rankDiff;

        public CompareMethods() {
        }

        @JsonProperty("A_B")
        public boolean isaB() {
            return this.aB;
        }

        @JsonProperty("A_B")
        public void setaB(boolean aB) {
            this.aB = aB;
        }

        @JsonProperty("B")
        public boolean isB() {
            return this.b;
        }

        @JsonProperty("B")
        public void setB(boolean b) {
            this.b = b;
        }

        @JsonProperty("P_B")
        public boolean ispB() {
            return this.pB;
        }

        @JsonProperty("P_B")
        public void setpB(boolean pB) {
            this.pB = pB;
        }

        @JsonProperty("P_DIFF")
        public boolean ispDiff() {
            return this.pDiff;
        }

        @JsonProperty("P_DIFF")
        public void setpDiff(boolean pDiff) {
            this.pDiff = pDiff;
        }

        @JsonProperty("P_TOTAL_A")
        public boolean ispTotalA() {
            return this.pTotalA;
        }

        @JsonProperty("P_TOTAL_A")
        public void setpTotalA(boolean pTotalA) {
            this.pTotalA = pTotalA;
        }

        @JsonProperty("P_TOTAL_B")
        public boolean ispTotalB() {
            return this.pTotalB;
        }

        @JsonProperty("P_TOTAL_B")
        public void setpTotalB(boolean pTotalB) {
            this.pTotalB = pTotalB;
        }

        @JsonProperty("P_TOTAL_DIFF")
        public boolean ispTotalDiff() {
            return this.pTotalDiff;
        }

        @JsonProperty("P_TOTAL_DIFF")
        public void setpTotalDiff(boolean pTotalDiff) {
            this.pTotalDiff = pTotalDiff;
        }

        @JsonProperty("RANK_A")
        public boolean isRankA() {
            return this.rankA;
        }

        @JsonProperty("RANK_A")
        public void setRankA(boolean rankA) {
            this.rankA = rankA;
        }

        @JsonProperty("RANK_B")
        public boolean isRankB() {
            return this.rankB;
        }

        @JsonProperty("RANK_B")
        public void setRankB(boolean rankB) {
            this.rankB = rankB;
        }

        @JsonProperty("RANK_DIFF")
        public boolean isRankDiff() {
            return this.rankDiff;
        }

        @JsonProperty("RANK_DIFF")
        public void setRankDiff(boolean rankDiff) {
            this.rankDiff = rankDiff;
        }

        @Override public boolean equals(Object o) {
            if (this == o)
                return true;
            if (o == null || getClass() != o.getClass())
                return false;
            CompareMethods that = (CompareMethods) o;
            return aB == that.aB &&
                    b == that.b &&
                    pB == that.pB &&
                    pDiff == that.pDiff &&
                    pTotalA == that.pTotalA &&
                    pTotalB == that.pTotalB &&
                    pTotalDiff == that.pTotalDiff &&
                    rankA == that.rankA &&
                    rankB == that.rankB &&
                    rankDiff == that.rankDiff;
        }

        @Override public int hashCode() {

            return Objects
                    .hash(aB, b, pB, pDiff, pTotalA, pTotalB, pTotalDiff, rankA,
                            rankB,
                            rankDiff);
        }
    }

    @JsonIgnoreProperties(
            ignoreUnknown = true
    )
    public static class CompareSegment {
        @JsonProperty("name")
        private String name;
        @JsonProperty("displayName")
        private String displayName;
        @JsonProperty("id")
        private String id;

        public CompareSegment() {
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDisplayName() {
            return this.displayName;
        }

        public void setDisplayName(String displayName) {
            this.displayName = displayName;
        }

        public String getId() {
            return this.id;
        }

        public void setId(String id) {
            if (id.startsWith("cme-segment--")) {
                this.id = GuidUtils.getStringIdFromGuid(id);
            } else {
                this.id = id;
            }

        }

        @Override public boolean equals(Object o) {
            if (this == o)
                return true;
            if (o == null || getClass() != o.getClass())
                return false;
            CompareSegment that = (CompareSegment) o;
            return Objects.equals(name, that.name) &&
                    Objects.equals(displayName, that.displayName) &&
                    Objects.equals(id, that.id);
        }

        @Override public int hashCode() {

            return Objects.hash(name, displayName, id);
        }
    }


    public static void main(String[] args) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();

        CompareDate compareDate = new CompareDate();
        compareDate.setDateLabel("sfadsf");
        compareDate.setStartDate("dasfdasf");
        compareDate.setEndDate("dsfagdasg");
        compareDate.setFrequency(Frequency.CDR);
        compareDate.setNumPeriods(234);

        CompareMethods compareMethods = new CompareMethods();
        compareMethods.setaB(true);
        compareMethods.setB(true);
        compareMethods.setpTotalA(true);
        compareMethods.setRankA(true);

        CompareSegment compareSegment = new CompareSegment();
        compareSegment.setDisplayName("name");
        compareSegment.setId("id");
        compareSegment.setDisplayName("display name");

        String compareDateAsSting = objectMapper.writeValueAsString(new CompareDate[]{compareDate, compareDate, compareDate});
        String compareMethodsAsSting = objectMapper.writeValueAsString(compareMethods);
        String compareSegmentAsSting = objectMapper.writeValueAsString(new CompareSegment[]{compareSegment, compareSegment, compareSegment});

        System.out.println(compareDateAsSting + '\n' + compareMethodsAsSting + '\n' + compareSegmentAsSting);

        CompareDate[] deserializedCompareDate = objectMapper.readValue(compareDateAsSting, CompareDate[].class);
        CompareMethods deserializedCompareMethods = objectMapper.readValue(compareMethodsAsSting, CompareMethods.class);
        CompareSegment[] deserializedCompareSegment = objectMapper.readValue(compareSegmentAsSting, CompareSegment[].class);

        System.out.println(
                Arrays.equals(deserializedCompareDate, new CompareDate[] { compareDate, compareDate, compareDate })
                        + " " + deserializedCompareMethods.equals(compareMethods)
                        + " " + Arrays.equals(deserializedCompareSegment, new CompareSegment[] { compareSegment, compareSegment, compareSegment }));
    }

}
