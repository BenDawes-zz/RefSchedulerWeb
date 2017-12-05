package com.refscheduler.refschedulerweb.web.utils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class BackendInteractionUtils {


    // @TODO: Return type?

    public static JsonNode makeRequest(String backendURL, String requestMethod) {
        StringBuffer response = new StringBuffer();
        try {
            URL obj = new URL(backendURL);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            con.setRequestMethod(requestMethod);
            /* @TODO: Reinclude AUTH
            if (authToken != null && !authToken.isEmpty()) {
                con.setRequestProperty(AUTHORIZATION, authToken);
            } else {
                throw new NoSuchUserException();
            }
            */
            con.setDoOutput(true);
            con.setRequestProperty("Content-Type", "application/json");

            int responseCode = con.getResponseCode();
            System.out.println("GET Response Code :: " + responseCode);

            if (responseCode == HttpURLConnection.HTTP_OK) { // success
                BufferedReader in = new BufferedReader(new InputStreamReader(
                        con.getInputStream()));
                String inputLine;

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();

                // print result
                System.out.println(response.toString());
            } else {
                System.out.println("GET request not worked");
            }
            String responseStr = response.toString();
            JsonNode result = new ObjectMapper().readTree(responseStr);
            return result;
        } catch (IOException e) {
            System.out.println("Could not process Request : " + e.getMessage());
        }
        return null;
    }
}
