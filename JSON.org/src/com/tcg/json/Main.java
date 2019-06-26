package com.tcg.json;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Main {

    public static void main(String[] args) {
        try {
            JSONObject obj = JSONUtils.getJSONObjectFromFile("/assets/obj.json");
            String[] names = JSONObject.getNames(obj);
            for (String string : names) {
                System.out.println(string + ": " + obj.get(string));
            }
            
            System.out.print("\n");
            
            JSONArray jsonArray = obj.getJSONArray("Array");
            for (int i = 0; i < jsonArray.length(); i++) {
                System.out.println(jsonArray.get(i));
            }
            
            System.out.print("\n");
            
            int number = obj.getInt("Number");
            System.out.println(number);
            
            System.out.print("\n");
            
            String string = obj.getString("String");
            System.out.println(string);
            
            System.out.print("\n");
            
            boolean bool = obj.getBoolean("Boolean");
            System.out.println(bool);
        } catch (JSONException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
