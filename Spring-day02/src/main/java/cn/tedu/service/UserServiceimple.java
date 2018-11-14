package cn.tedu.service;

import cn.tedu.dao.UserDao;

public class UserServiceimple implements UserService{
	private UserDao userDao;
	
	public UserServiceimple() {
       System.out.println("UserServiceimple的无参构造");
	}
	
	public UserServiceimple(UserDao userDao) {
		this.userDao = userDao;
		System.out.println("UserServiceimple的有参构造"+userDao);
	}
/**推荐使用set方法实现依赖注入（一对一赋值），不推荐构造方法依赖注入（一对多方法赋值）
 * @param userDao
 */
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	public void addUser() {
		userDao.insertUser();
		System.out.println("添加用户成功");
	}
}
