package test;

import static org.junit.Assert.*;

import java.util.List;
  
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dubbo.pojo.User;
import dubbo.service.UserService;    
 
public class UserServiceTest {
 
    private UserService userService;//从这里我们可以看出，使用了dubbo后感觉调用服务是在自己的工程一样，但是其实我们是调用的b系统，因为b将服务接口暴露出来了，我们通过访问注册中心的服务接口来获取服务的实现。
 
    // 一般报以下错误  是配置文件没有找到   配置文件要在target\classes 目录下 才能查找到
    //org.springframework.beans.factory.NoSuchBeanDefinitionException: 
    //No qualifying bean of type [dubbo.service.UserService] is defined
    @Before
    public void setUp() throws Exception {
    	//容器上下文初始化   相当于启动服务
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "classpath:dubbo-provider.xml");//即便是找不到文件  applicationContext 不会为空  
        this.userService = (UserService) applicationContext.getBean(UserService.class);
    }
 

    //获取服务方提供的数据
    @Test
    public void testQueryAll() {
        List<User>	users = this.userService.queryAll();
        for (User user : users) {
            System.out.println(user.getUserName());   
        }
    }
    
    
 
}
