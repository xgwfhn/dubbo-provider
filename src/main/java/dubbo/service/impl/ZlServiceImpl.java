package dubbo.service.impl;

import java.util.ArrayList;
import java.util.List;

import dubbo.pojo.User;
import dubbo.service.UserService;
import dubbo.service.ZlService;

public class ZlServiceImpl implements ZlService {
	 
    /**
     * 实现查询，这里做模拟实现，不做具体的数据库查询
     */
    public List<User> queryAll() {
        List<User> list = new ArrayList<User>();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setId(Long.valueOf(i + 1).toString());
            user.setPassword("123456");
            user.setUserName("username_zl" + i);
            list.add(user);
        }
        return list;
    }
 
}