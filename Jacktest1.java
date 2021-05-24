package Jacktest;
import Person.Person;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import java.util.*;
public class Jacktest1 {
    //java对象转换为JSON字符串
    @Test
    public void test1() throws Exception {
        //1.创建一个java对象
        Person p = new Person();
        p.setName("雷手动");
        p.setAge(52);
        p.setGender("男");
        p.setBirthday(new Date());
        //1.创建一个java对象
        Person p1 = new Person();
        p1.setName("雷动");
        p1.setAge(2);
        p1.setGender("男");
        p1.setBirthday(new Date());
        //1.创建一个java对象
        Person p2 = new Person();
        p2.setName("雷手");
        p2.setAge(5);
        p2.setGender("女");
        p2.setBirthday(new Date());
        //创建List集合
        List<Person> ps = new ArrayList<>();
        ps.add(p);
        ps.add(p1);
        ps.add(p2);
        //转换
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(ps);
        //[{"name":"雷手动","age":52,"gender":"男","birthday":"2021-05-24"},
        // {"name":"雷动","age":2,"gender":"男","birthday":"2021-05-24"},
        // {"name":"雷手","age":5,"gender":"女","birthday":"2021-05-24"}]
        System.out.println(json);
        //创建List集合map集合
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("name","雷手动");
        map.put("age",52);
        map.put("gender","男");
        ObjectMapper mapper1 = new ObjectMapper();
        String json1 = mapper1.writeValueAsString(map);
        //{"gender":"男","name":"雷手动","age":52}
        System.out.println(json1);
    }
}
