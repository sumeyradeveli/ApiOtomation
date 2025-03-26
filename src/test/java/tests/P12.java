package tests;

import org.json.JSONObject;

public class P12 {
    /*
     https://restful-booker.herokuapp.com/booking url'ine
       asagidaki body'ye sahip bir POST request gonderdigimizde
       donen response'un bookingid haric asagidaki gibi oldugunu test edin.

       Request body
       {
       "firstname" : "Hasan",
       "lastname" : "Yagmur",
       "totalprice" : 500,
       "depositpaid" : false,
       "bookingdates" : {
           "checkin" : "2021-06-01",
           "checkout" : "2021-06-10"
           },
       "additionalneeds" : "wi-fi"
       }

       Response Body
       {
       "bookingid":24,
       "booking":{
           "firstname":"Hasan",
           "lastname":"Yagmur",
           "totalprice":500,
           "depositpaid":false,
           "bookingdates":{
               "checkin":"2021-06-01",
               "checkout":"2021-06-10"
               },
       "additionalneeds":"wi-fi"
       }
       }
     */


    public void test01(){
        String url =" https://restful-booker.herokuapp.com/booking";
        JSONObject bookingdates = new JSONObject();
    }







}
