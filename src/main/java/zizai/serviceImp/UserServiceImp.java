package zizai.serviceImp;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import zizai.dao.UserMapper;
import zizai.model.User;
import zizai.service.UserService;

@Service("userService")
public class UserServiceImp implements UserService {
	@Resource
	private UserMapper userMapper;
	
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return userMapper.selectByPrimaryKey(id);
	}

	public int addUser(User user) {
		// TODO Auto-generated method stub
		return userMapper.insert(user);
	}

	public User getUserByName(String name) {
		// TODO Auto-generated method stub
		return userMapper.selectByName(name);
	}
	public int updateUserPwdByName(User user) {
		// TODO Auto-generated method stub
		return userMapper.updateUserPwdByName(user);
	}

}
