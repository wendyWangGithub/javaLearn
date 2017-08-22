package com.test.io;



import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class W {
    //д�ļ���֧�������ַ�����linux redhad�²��Թ�
    public static void writeLog(String str)
    {
        try
        {
        String path="D:\\wwr20170213\\1.txt";
        File file=new File(path);
        if(!file.exists())
            file.createNewFile();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        FileOutputStream out=new FileOutputStream(file,false); //���׷�ӷ�ʽ��true        
        StringBuffer sb=new StringBuffer();
        sb.append("-----------"+sdf.format(new Date())+"------------\n");
        sb.append(str+"\n");
        out.write(sb.toString().getBytes("utf-8"));//ע����Ҫת����Ӧ���ַ���
        out.close();
        }
        catch(IOException ex)
        {
            System.out.println(ex.getStackTrace());
        }
    }    
    public static String readLog()
    {
        StringBuffer sb=new StringBuffer();
        String tempstr=null;
        
        try
        {
            String path="D:\\wwr20170213\\1.txt";
            File file=new File(path);
            
            if(!file.exists()) {
            	System.out.println("11111111");
            	throw new FileNotFoundException();
            } else {
            	
            	         
//            BufferedReader br=new BufferedReader(new FileReader(file));            
//            while((tempstr=br.readLine())!=null)
//                sb.append(tempstr);    
            	//��һ�ֶ�ȡ��ʽ
            	FileInputStream fis=new FileInputStream(file);
            	BufferedReader br=new BufferedReader(new InputStreamReader(fis));
            	System.out.println("11111111");
            	System.out.println(br.readLine());
            	while((tempstr=br.readLine())!=null)
            		System.out.println("11111111");
            	sb.append(tempstr);
            }
            }
        catch(IOException ex)
        {
            System.out.println(ex.getStackTrace());
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        writeLog("this is a test log");
        writeLog("���Ĳ��Կ���");
        readLog();
        
       // System.out.println(readLog());
    }

}