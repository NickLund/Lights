package com.example.nick_lund.lights;

import android.os.AsyncTask;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class fetchData extends AsyncTask<Void,Void,Void> {
    String dataSpeed = "";
    String SpeedParsed = "";
    String dataColor = "";
    String ColorParsed = "";

    @Override
    protected Void doInBackground(Void... voids) {
        try {
            URL url = new URL("http://192.168.101.85:5000/turn-on-all");
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String line1 = "";
            while(line1 != null){
                line1 = bufferedReader.readLine();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } try {
            URL url = new URL("http://192.168.101.85:5000/get-speed");
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            //String line2 = "";
//            while(line2 != null) {
//                line2 = bufferedReader.readLine();
//                dataSpeed = line2;
//            }
            dataSpeed = bufferedReader.readLine();
            JSONObject JO = new JSONObject (dataSpeed);
            //SpeedParsed = "Color: " + JO.get("speed");
            SpeedParsed = JO.getString("speed");
            System.out.print("Speed \n");
            System.out.print(SpeedParsed + "\n");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        try {
            URL url = new URL("http://192.168.101.85:5000/get-color");
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
//            String line3 = "";
//            while(line3 != null){
//                line3 = bufferedReader.readLine();
//                dataColor = line3;
//            }
            dataColor = bufferedReader.readLine();

            JSONObject JO = new JSONObject (dataColor);
            ColorParsed = JO.getString("color");
            //SpeedParsed = "Color: " + JO.get("color");

            System.out.print("Color \n");
            System.out.print(ColorParsed + "\n");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
        Menu.Speed.setText(this.SpeedParsed);
        Menu.LEDColor.setText(this.ColorParsed);
    }


}
