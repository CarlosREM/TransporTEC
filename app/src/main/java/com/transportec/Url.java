package com.transportec;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class Url
{
    public String readTheURL(String placeURL)throws  IOException{
        String Data = "";
        InputStream inputStream = null;
        HttpsURLConnection httpsURLConnection = null;

        try {

            URL url = new URL(placeURL);
            httpsURLConnection = (HttpsURLConnection) url.openConnection();
            httpsURLConnection.connect();

            inputStream = httpsURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            StringBuffer stringBuffer = new StringBuffer();

            String line = "";

            while( (line = bufferedReader.readLine()) != null){
                stringBuffer.append(line);
            }
            Data = stringBuffer.toString();
            bufferedReader.close();

        }catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            inputStream.close();
            httpsURLConnection.disconnect();
        }
        return Data;
    }
}
