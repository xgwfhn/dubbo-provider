package dubbo.service.impl;

import java.util.ArrayList;
import java.util.List;

import dubbo.common.UserInfoExcepiton;
import dubbo.pojo.User;
import dubbo.service.UserService;

public class UserServiceImpl implements UserService {
	 
    /**
     * 实现查询，这里做模拟实现，不做具体的数据库查询
     * @throws UserExcepiton 
     */
    public List<User> queryAll()  {
        List<User> list = new ArrayList<User>();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setId(Long.valueOf(i + 1).toString());
            user.setPassword("1234567");
            user.setUserName("aqusername_" + i);
            list.add(user);
        }
       /* try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
        
        return list;
    }

	public String getExceptionMsg() throws UserInfoExcepiton {
		// TODO Auto-generated method stub
		if(true) {
			throw new UserInfoExcepiton("出错了","1");
		}
		return null;
	}
 
}