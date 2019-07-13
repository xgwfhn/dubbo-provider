package dubbo.service;

import java.util.List;

import dubbo.common.UserInfoExcepiton;
import dubbo.pojo.User; 

public interface UserService  {
	/**
     * 查询所有的用户数据
     *
     * @return
     */
    public List<User> queryAll();
    
    public String getExceptionMsg () throws UserInfoExcepiton;  
}
