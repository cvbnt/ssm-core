import com.hao123.pojo.Books;
import com.hao123.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookServiceImpl =(BookService) context.getBean("bookServiceImpl");
        for (Books b:bookServiceImpl.queryAllBook()){
            System.out.println(b);
        }
    }
}
