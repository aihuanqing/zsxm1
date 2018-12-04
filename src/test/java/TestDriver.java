
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zs.hello.Driver;

public class TestDriver {
@Test
public void testdriver(){
	//获得bean.xml并生成对象
	ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
	//获得driver对象
	Driver driver=(Driver)ac.getBean("Driver");
	//调用业务方法
	 driver.driver();
}
}
