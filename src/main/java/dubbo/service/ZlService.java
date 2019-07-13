package dubbo.service;

import java.util.List;

import dubbo.pojo.User;
//直连service
public interface ZlService {
	/**
     * 查询所有的用户数据
     *
     * @return
     */
    public List<User> queryAll();
}
