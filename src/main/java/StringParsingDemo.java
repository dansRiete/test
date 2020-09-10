public class StringParsingDemo {

    public static void main(String[] args) {
        String str = "abbreviation: EEST\n"
            + "client_ip: 109.229.20.78\n"
            + "datetime: 2020-07-27T13:25:05.256542+03:00\n"
            + "day_of_week: 1\n"
            + "day_of_year: 209\n"
            + "dst: true\n"
            + "dst_from: 2020-03-29T01:00:00+00:00\n"
            + "dst_offset: 3600\n"
            + "dst_until: 2020-10-25T01:00:00+00:00\n"
            + "raw_offset: 7200\n"
            + "timezone: Europe/Kiev\n"
            + "unixtime: 1595845505\n"
            + "utc_datetime: 2020-07-27T10:25:05.256542+00:00\n"
            + "utc_offset: +03:00\n"
            + "week_number: 31";
        System.out.println(
            str.substring(
                str.indexOf("unixtime: ") + 10,
                str.indexOf("unixtime: ") + 10 + 10
            )
        );
    }

}
