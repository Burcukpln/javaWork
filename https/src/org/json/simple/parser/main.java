package org.json.simple.parser;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {


        try {

            URL url = new URL("https://api.agify.io/?name=burcu%22");

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();


                StringBuilder informationString = new StringBuilder();
                Scanner scanner = new Scanner(url.openStream());

                while (scanner.hasNext()) {
                    informationString.append(scanner.nextLine());
                }

                System.out.println(informationString);


        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}