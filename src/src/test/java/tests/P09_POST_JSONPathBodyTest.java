package tests;

import org.json.JSONObject;
import org.testng.annotations.Test;

public class P09_POST_JSONPathBodyTest {


    @Test
    public void test01() {

        String url = "";
        JSONObject bookingDates = new JSONObject();
        bookingDates.put("checkin","2021-06-01");
        bookingDates.put("checkout","2021-06-10");

    }
}
