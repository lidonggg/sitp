package com.sitp.tjvideo.util;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @author Ls J
 * @date 2018/10/10 9:41 AM
 * 发送http请求
 */
public class HttpUtil {

    /**
     * 发送get请求
     * @param urlStr url
     * @return string
     */
    public static String sendHttpRequestGet(String urlStr)  {
        try{
            URL url = new URL(urlStr);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setDoOutput(true);
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");

            BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream(), "utf-8"));
            String line = null;
            StringBuilder result = new StringBuilder();
            while ((line = br.readLine()) != null) {
                result.append(line).append("\n");
            }
            connection.disconnect();
            return result.toString();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }

    /**
     * 发送post请求
     * @param urlStr url
     * @param param 参数
     * @return
     */
    public static String sendHttpRequestPost(String urlStr,String param){
        try{
            Long startTime = System.currentTimeMillis();
            //建立连接
            URL url=new URL(urlStr);
            HttpURLConnection httpConn=(HttpURLConnection)url.openConnection();
            //设置参数
            httpConn.setDoOutput(true);
            httpConn.setDoInput(true);
            httpConn.setUseCaches(false);
            httpConn.setRequestMethod("POST");

            //设置请求属性
            httpConn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            httpConn.setRequestProperty("Connection", "Keep-Alive");
            httpConn.setRequestProperty("Charset", "UTF-8");
            httpConn.setRequestProperty("X-Requested-With", "XMLHttpRequest");

            // 需要输出
            httpConn.setDoInput(true);
            // 需要输入
            httpConn.setDoOutput(true);

            //连接,也可以不用明文connect，使用下面的httpConn.getOutputStream()会自动connect
            httpConn.connect();

            //建立输入流，向指向的URL传入参数
            DataOutputStream dos=new DataOutputStream(httpConn.getOutputStream());
            dos.writeBytes(param);
            dos.flush();
            dos.close();

            //获得响应状态
            int resultCode=httpConn.getResponseCode();
            if(HttpURLConnection.HTTP_OK==resultCode){
                StringBuilder resultBulider=new StringBuilder();
                String readLine;
                BufferedReader responseReader=new BufferedReader(new InputStreamReader(httpConn.getInputStream(),"UTF-8"));
                while((readLine=responseReader.readLine())!=null){
                    resultBulider.append(readLine).append("\n");
                }
                responseReader.close();
                Long endTime = System.currentTimeMillis();

                System.out.println("http请求："+(endTime-startTime));
//                System.out.println(resultBuffer.toString());
                return resultBulider.toString();

            }
            return null;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }
}
