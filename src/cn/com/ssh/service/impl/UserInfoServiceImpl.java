package cn.com.ssh.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.ssh.dao.impl.UserInfoDaoImpl;
import cn.com.ssh.service.UserInfoService;

@Service
public class UserInfoServiceImpl implements UserInfoService{

	@Override
	public void test() {
		System.out.println("test ok");
		
	}

}
