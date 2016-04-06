package spring.mvc.test.postmanager;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import spring.mvc.dependency.injection.PostManager;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="file:src/main/webapp/WEB-INF/spring/root-context.xml") //{"classpath:root-context.xml"})
//@ContextConfiguration(locations={"classpath:SpringMVC/App/src/main/webapp/WEB-INF/spring/root-context.xml"})
public class PostManagerTest {

	@Autowired
	private ApplicationContext applicationContext;
	
	@Test
	public void postManagerTest() {
		PostManager postManager = (PostManager) applicationContext.getBean("postManager");
		System.out.println("postManager.isServiceAvailable(): " + postManager.isServiceAvailable());
		Assert.assertTrue(postManager.isServiceAvailable());
		Assert.assertTrue(postManager.publishPost("test post"));
	}
}
