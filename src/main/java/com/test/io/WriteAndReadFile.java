package com.test.io;



import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class WriteAndReadFile {
    
    public static void writeLog(String str)
    {
        try
        {
        String path="src/main/resources/myfile.txt";
        File file=new File(path);
        if(!file.exists())
            file.createNewFile();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        FileOutputStream fileOutputStream=new FileOutputStream(file,false);
        StringBuffer stringBuffer=new StringBuffer();
            stringBuffer.append("-----------"+simpleDateFormat.format(new Date())+"------------\n");
            stringBuffer.append(str+"\n");
            fileOutputStream.write(stringBuffer.toString().getBytes("utf-8"));
            fileOutputStream.close();
        }
        catch(IOException ex)
        {
            System.out.println(ex.getStackTrace());
        }
    }    
    public static String readLog()
    {
        StringBuffer stringBuffer=new StringBuffer();
        String tempstr=null;
        
        try
        {
            String path="src/main/resources/myfile.txt";
            File file=new File(path);
            
            if(!file.exists()) {
            	System.out.println("文件不存在");
            	throw new FileNotFoundException();
            } else {
            	FileInputStream fileInputStream=new FileInputStream(file);
            	BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(fileInputStream,"utf-8"));
            	System.out.println(bufferedReader.readLine());
            	while((tempstr=bufferedReader.readLine())!=null)
            		System.out.println("文件内容：" +tempstr);
            }
            }
        catch(IOException ex)
        {
            System.out.println(ex.getStackTrace());
        }
        return stringBuffer.toString();
    }
    public static void main(String[] args) {
        writeLog("this is a test log");
        //writeLog("日志");
        readLog();
    }

}