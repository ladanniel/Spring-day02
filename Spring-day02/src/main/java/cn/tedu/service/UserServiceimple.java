package cn.tedu.service;

import cn.tedu.dao.UserDao;

public class UserServiceimple implements UserService{
	private UserDao userDao;
	
	public UserServiceimple() {
       System.out.println("UserServiceimple���޲ι���");
	}
	
	public UserServiceimple(UserDao userDao) {
		this.userDao = userDao;
		System.out.println("UserServiceimple���вι���"+userDao);
	}
/**�Ƽ�ʹ��set����ʵ������ע�루һ��һ��ֵ�������Ƽ����췽������ע�루һ�Զ෽����ֵ��
 * @param userDao
 */
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	public void addUser() {
		userDao.insertUser();
		System.out.println("����û��ɹ�");
	}
}
