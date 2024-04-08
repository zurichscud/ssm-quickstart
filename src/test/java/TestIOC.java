import com.lai.ssm.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: zurichscud
 * @Date: 2024/4/7 下午7:46
 * @Description: TODO
 */
public class TestIOC {
    @Test
    public void test1() {
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("bean.xml");
        Object sqlSessionFactory = ioc.getBean("sqlSessionFactory");
        System.out.println(sqlSessionFactory);
        System.out.println(ioc.getBean("dataSource"));
    }

    @Test
    public void test2() {
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("bean.xml");
        UserMapper mapper = ioc.getBean(UserMapper.class);
        System.out.println(mapper.selectAll());
    }
}
