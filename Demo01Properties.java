package com.demo02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/*
    java.util.Properties集合，extends Hashtable<k,v> implements Map<k,v>
    Properties类表示一个持久的属性集。Propertise 可保存在流中或从流中加载。
    Properties集合是一个唯一和IO流相结合的集合。
      可以使用Propertise集合中的方法store，把集合中的临时数据，持久化写入到硬盘中存储。
      可以使用Propertise集合中的方法load，把硬盘中保存的文件（键值对），读取到集合中使用

      属性列表中每个键及其对应值都是一个字符串。
        Properties集合是一个双列集合，Key与value默认都是字符串。
   */
public class Demo01Properties {
       public static void main(String[] args) throws IOException {
           show01();
           show02();
           show03();
       }
       /*
         可以使用Propertise集合中的方法load，把硬盘中保存的文件（键值对），读取到集合中使用
          void load(InputStream inStream) :从输入字节流读取属性列表（键和元素对）。
          void load(Reader reader) :以简单的线性格式从输入字符流读取属性列表（关键字和元素对）。
          参数：
          InputStream inStream：字节输入流，不能读取含有中文的键值对
          Reader reader：字符输入流，可以读取含有中文的键值对
          使用步骤：
          1.创建Propertise集合对象，
          2.使用Propertise集合对象中的方法load，读取保存键值对的文件
          3.遍历Propertise集合
          注意事项：
          1.存储键值对的文件中，键与值默认的连接符号，可以使用等号，，空格，（其他符号）
          2.存储键值对的文件中，可以使用#进行注释，被注释的键值对不会再被读取。
          3.存储键值对的文件中，键与值默认都是字符串，不用加引号。
        */
    private static void show03() throws IOException {
           // 1.创建Propertise集合对象
            Properties pro = new Properties();
           // 2.使用Propertise集合对象中的方法load，读取保存键值对的文件
          pro.load(new FileReader("F:\\Javayunama\\leigeliang\\2021.4.24（JAVA）\\d.txt"));
           //3.遍历Propertise集合
           Set<String> set = pro.stringPropertyNames();
           for(String key:set){
              String value =  pro.getProperty(key);
               System.out.println(key+"="+value);
           }
    }

    /*
      可以使用Propertise集合中的方法store，把集合中的临时数据，持久化写入到硬盘中存储。
      void store (OutputStream out,String comments)
      void store (Writer writer , String comments)
      参数：
        OutputStream out；字节输出流，不能写入中文
        Writer writer：字符输出流，能写中文
        String comments；注释，用来解释说明保存的文件是干什么用的。
          注意：注释不能使用中文，会产生乱码，因为默认是UNicode编码。
            一般使用“空字符串”。
        使用步骤：
        1.创建Propertise集合对象，添加数据
        2.创建字节输出流/字符输出流对象，构造方法中绑定要输出的目的地
        3.使用Properties集合中的方法store， 把集合中的临时数据，持久化写入到硬盘中存储
        4.释放资源

    */
     private static void show02() throws IOException {
         //创建一个Properties集合对象(泛型不用写)
         Properties prop = new Properties();
         //使用setPropertie往集合中添加数据
         prop.setProperty("雷葛亮a","156");
         prop.setProperty("雷葛亮b","155");
         prop.setProperty("雷葛亮c","150");
         prop.setProperty("雷葛亮d","146");
         prop.setProperty("雷葛亮f","126");
         // 2.创建字节输出流/字符输出流对象，构造方法中绑定要输出的目的地
         FileWriter fu = new FileWriter("F:\\Javayunama\\leigeliang\\2021.4.24（JAVA）\\d.txt");
         prop.store(fu,"save data");
         fu.close();
       }

    /*
   使用Properties集合存储数据，遍历取出Propertise集合中数据。
    Properties集合是一个双列集合，Key与value默认都是字符串。
     Properties集合有一些操作字符串特有的方法：
     （1）(存入数据) Object setProperty(String key,String Value) 底层调用Hashtable的方法，put
     （2）String getProperty(String key)用指定的键在此属性列表中搜索属性。
      （通过key找到Value值，此方法相当于Map集合中的get（key）方法）
     （3）set<String>stringPropertyName()返回此属性列表中的键集，其中该键及其对应值是字符串
      此方法相当于Map集合中的keyset方法
    */
       private static void show01() {
         //创建一个Properties集合对象(泛型不用写)
           Properties prop = new Properties();
           //使用setPropertie往集合中添加数据
           prop.setProperty("雷葛亮a","156");
           prop.setProperty("雷葛亮b","155");
           prop.setProperty("雷葛亮c","150");
           prop.setProperty("雷葛亮d","146");
           prop.setProperty("雷葛亮f","126");
           //使用stringPropertyName()把Properties集合中的键给它取出，存储到一个Set集合中。
           Set<String> set = prop.stringPropertyNames();
           //遍历set集合，取出Properties集合的每一个键。
           for(String key:set){
               //使用getProperty方法，通过Key来获取Value
             String value = prop.getProperty(key);
               System.out.println(key+"="+value);

           }
       }
   }
