package Jacktest;
import Person.Person;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import java.util.Date;
public class Jacktest {
    //java对象转换为JSON字符串
    @Test
    public void test1() throws Exception {
        //1.创建一个java对象
        Person p = new Person();
        p.setName("雷手动");
        p.setAge(52);
        p.setGender("男");
        p.setBirthday(new Date());
    // 转换：
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(p);

        //{"name":"雷手动","age":52,"gender":"男","birthday":1621851823546}
        /*
        "birthday":1621851823546 是一个毫秒值
        1.排除属性：
         @JsonIgnore  //忽略该属性   就是没有birthday
         private Date birthday;
        2.这样不好出现了第二种方法：
         @JsonFormat(pattern = "yyyy-MM-dd")
         private Date birthday;
         */
        System.out.println(json);
    }
}
