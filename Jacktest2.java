package Jacktest;
import Person.Person;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
public class Jacktest2 {
    //JSON字符串转换为java对象
    @Test
    public void test1() throws Exception {
      //1.初始化JSON字符串
      String json = "{\"gender\":\"男\",\"name\":\"张三\",\"age\":23}";
      //2.创建一个ObjectMapper对象
        ObjectMapper mapper = new ObjectMapper();
        //转换为java对象，Person对象。
        Person person = mapper.readValue(json, Person.class);
        System.out.println(person);
    }
}
