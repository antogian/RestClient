package com.antogian.Utilities;

import com.antogian.DTO.OrderDTO;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Consumer
{
//    public static List<OrderDetails> getOrderDetails(String url)
//    {
//        List<OrderDetails> allItems = new ArrayList();
//
//        String json = "";
//
//        HttpURLConnection c = null;
//        try
//        {
//            URL u = new URL(url);
//            c = (HttpURLConnection) u.openConnection();
//            c.setRequestMethod("GET");
//            c.setRequestProperty("Content-length", "0");
//            c.setUseCaches(false);
//            c.setAllowUserInteraction(false);
//            c.setConnectTimeout(60000);
//            c.setReadTimeout(60000);
//            c.connect();
//            int status = c.getResponseCode();
//
//            switch (status)
//            {
//                case 200:
//                case 201:
//                    BufferedReader br = new BufferedReader(new InputStreamReader(c.getInputStream()));
//                    StringBuilder sb = new StringBuilder();
//                    String line;
//                    while ((line = br.readLine()) != null)
//                    {
//                        sb.append(line+"\n");
//                    }
//                    br.close();
//                    json = sb.toString();
//            }
//            Gson gson = new Gson();
//            Type itemListType = new TypeToken<ArrayList<OrderDetails>>(){}.getType();
//
//            allItems = gson.fromJson(json, itemListType);
//        }
//        catch (Exception e)
//        {
//            //Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
//        }
//        finally
//        {
//            if (c != null)
//            {
//                try
//                {
//                    c.disconnect();
//                }
//                catch (Exception ex)
//                {
//                    //Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//        }
//
//        return allItems;
//    }

    public static List<OrderDTO> getAllOrders(String url)
    {
        List<OrderDTO> allOrderDTOS = new ArrayList();

        String json = "";

        HttpURLConnection c = null;
        try
        {
            URL u = new URL(url);
            c = (HttpURLConnection) u.openConnection();
            c.setRequestMethod("GET");
            c.setRequestProperty("Content-length", "0");
            c.setUseCaches(false);
            c.setAllowUserInteraction(false);
            c.setConnectTimeout(60000);
            c.setReadTimeout(60000);
            c.connect();
            int status = c.getResponseCode();

            switch (status)
            {
                case 200:
                case 201:
                    BufferedReader br = new BufferedReader(new InputStreamReader(c.getInputStream()));
                    StringBuilder sb = new StringBuilder();
                    String line;
                    while ((line = br.readLine()) != null)
                    {
                        sb.append(line+"\n");
                    }
                    br.close();
                    json = sb.toString();
            }
            Gson gson = new Gson();
            Type itemListType = new TypeToken<ArrayList<OrderDTO>>(){}.getType();

            allOrderDTOS = gson.fromJson(json, itemListType);
        }
        catch (Exception e)
        {
            //Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            if (c != null)
            {
                try
                {
                    c.disconnect();
                }
                catch (Exception ex)
                {
                    //Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        return allOrderDTOS;
    }
}
