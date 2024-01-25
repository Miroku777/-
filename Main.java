package Main;


import java.sql.Time;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static Main.CrptApi.dtfTime;

public class Main {



    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String exp = scn.nextLine();
        CrptApi crptApi = new CrptApi((LocalTime.parse(exp, dtfTime)), 20);
        System.out.println(crptApi.documentCreation(crptApi.getHttps(), crptApi.getObg()));
    }
}
    class CrptApi {
        private volatile int time;
        private volatile Object times;
        public static DateTimeFormatter dtfTime = DateTimeFormatter.ofPattern("H:mm:ss");

        private String link = "https://ismp.crpt.ru/api/v3/lk/documents/create";
        private Object objec = "{\"description\":\n" +
                "{ \"participantInn\": \"string\" }, \"doc_id\": \"string\", \"doc_status\": \"string\",\n" +
                "\"doc_type\": \"LP_INTRODUCE_GOODS\", 109 \"importRequest\": true,\n" +
                "\"owner_inn\": \"string\", \"participant_inn\": \"string\", \"producer_inn\":\n" +
                "\"string\", \"production_date\": \"2020-01-23\", \"production_type\": \"string\",\n" +
                "\"products\": [ { \"certificate_document\": \"string\",\n" +
                "\"certificate_document_date\": \"2020-01-23\",\n" +
                "\"certificate_document_number\": \"string\", \"owner_inn\": \"string\",\n" +
                "\"producer_inn\": \"string\", \"production_date\": \"2020-01-23\",\n" +
                "\"tnved_code\": \"string\", \"uit_code\": \"string\", \"uitu_code\": \"string\" } ],\n" +
                "\"reg_date\": \"2020-01-23\", \"reg_number\": \"string\"}";

        public static int requestLimit(int j) {
            int i = 0;
            while (!(i <= j)){
                i++;
                break;
            }
            return i;
        }

        public CrptApi(LocalTime localTime, int requestLimit) {
            localTime = new Time(20).toLocalTime();
            this.times = localTime;
            this.time = requestLimit;
        }

        public void setHttps(String https) {
            link = https;
        }
        public String getHttps (){
            return link;
        }

        public void setObg (Object object) {
            objec = object;
        }
        public Object getObg () {
            return objec;
        }


        public Object documentCreation(String https, Object object) {




           /* Map<String, Object> map = new HashMap<String, Object>();
            map.put("https://ismp.crpt.ru/api/v3/lk/documents/create", "{\"description\":\n" +
                    "{ \"participantInn\": \"string\" }, \"doc_id\": \"string\", \"doc_status\": \"string\",\n" +
                    "\"doc_type\": \"LP_INTRODUCE_GOODS\", 109 \"importRequest\": true,\n" +
                    "\"owner_inn\": \"string\", \"participant_inn\": \"string\", \"producer_inn\":\n" +
                    "\"string\", \"production_date\": \"2020-01-23\", \"production_type\": \"string\",\n" +
                    "\"products\": [ { \"certificate_document\": \"string\",\n" +
                    "\"certificate_document_date\": \"2020-01-23\",\n" +
                    "\"certificate_document_number\": \"string\", \"owner_inn\": \"string\",\n" +
                    "\"producer_inn\": \"string\", \"production_date\": \"2020-01-23\",\n" +
                    "\"tnved_code\": \"string\", \"uit_code\": \"string\", \"uitu_code\": \"string\" } ],\n" +
                    "\"reg_date\": \"2020-01-23\", \"reg_number\": \"string\"}");
            return String = (String) map.get("https://ismp.crpt.ru/api/v3/lk/documents/create");*/
return object;
        }
}
