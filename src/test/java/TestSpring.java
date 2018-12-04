import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.zs.hello.HelloSpring;

public class TestSpring {
	@Test
public void TestHello(){
	//环境获得bean.xml在classpath下target classes
	ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
	//通过bean的id获得对象
	HelloSpring hs=(HelloSpring) ac.getBean("hello");
	//调用对象方法
	hs.hello();
	
	
}
}
