package cn.com.ssh.controlle;

import javax.annotation.Resource;
import javax.annotation.Resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.com.ssh.service.UserInfoService;
import cn.com.ssh.service.impl.UserInfoServiceImpl;
/**
 * 
* @ClassName: UserInfoControlle 
* @Description: userInfo控制器
* @author  huangjian
* @date 2016年10月16日 下午3:51:16 
*
 */
@Controller
@RequestMapping("/user")
public class UserInfoControlle {

	@Autowired
	private UserInfoService userInfoServiceImpl;
	 
	@RequestMapping(value="/test",method=RequestMethod.GET)
	public String test(){
		System.out.println("user controlle test");
		//serInfoServiceImpl.test();
		return "/hello";
	}


	
}
