package spring_example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring_example.dao.UserJdbcDao;

public class Management {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		UserJdbcDao dao = context.getBean("userJdbcDao",UserJdbcDao.class);
		System.out.println();
//		dao.getAllUser();
		
		System.out.println(dao.getAllUser().size());
		
	}

}
