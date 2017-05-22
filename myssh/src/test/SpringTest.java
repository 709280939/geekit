package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
	public static void main(String[] args) {
		// 加载spring配置文件，初始化IoC容器
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		// 从容器 接管Bean
		TUser user = (TUser) ac.getBean("TUser");
		// 输出欢迎信息
		System.out.println("Hello:" + user.getUsername() + ";u is in " + user.getAddress() + " ; and u is  "
				+ user.getAllname());
	}
}
