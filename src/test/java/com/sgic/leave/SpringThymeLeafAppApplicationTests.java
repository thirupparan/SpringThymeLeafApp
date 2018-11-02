//package com.sgic.leave;
//
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertNotNull;
//
//import java.util.List;
//
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import com.sgic.leave.entities.Task;
//import com.sgic.leave.entities.User;
//import com.sgic.services.TaskService;
//import com.sgic.services.UserService;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class SpringThymeLeafAppApplicationTests {
//	@Autowired
//	private UserService userService;
//	@Autowired
//	private TaskService taskService;
//	
//@Before
//	public void initDb() {
//		User newUser = new User("testUser@gmail.com", "testUser", "123456");
//		userService.createUser(newUser);
//	}
//	
//	{
//		User newUser = new User("testUser@gmail.com","testUser","123456");
//		userService.createUser(newUser);
//	}
//	
//	Task userTask =new Task("03/01/2018","00:11","11:00","you need to work");
//	User user = userService.findOne("testUser@gmail.com");
//	//taskService.addTask(userTask, user);
//
//	
//@Test
//public void testUser() {
//	User user = userService.findOne("testUser@gmail.com");
//	assertNotNull(user);
//	User admin =userService.findOne("testUser@gmail.com");
//	assertEquals(admin.getEmail(),"testUser@gmail.com");	
//}
//@Test
//public void testTask() {
//	User user = userService.findOne("testUser@gmail.com");
//	List<Task> task =taskService.findUserTask(user);
//	assertNotNull(task);
//}
//}