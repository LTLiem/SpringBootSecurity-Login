package io.upskills.auth;

import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import lle.crud.data.util.DataHibernateUtil;
import lle.crud.model.User;
import lle.crud.service.RoleService;
import lle.crud.service.UserService;

@SpringBootApplication
public class WebApplication implements CommandLineRunner  {
	
	

	public static void main(String[] args) throws Exception {
		SpringApplication.run(WebApplication.class, args);
		
		
		
		
	}
	
	 @Override
	    public void run(String... args) throws Exception {

	/*	 PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
			UserService userService = DataHibernateUtil.getUserService();
			RoleService roleService = DataHibernateUtil.getRoleService();
			
			User user = new User();
			user.setName("PIKACHU");
			user.setPwd(passwordEncoder.encode("12345678"));
			System.out.println(passwordEncoder.encode("12345678"));
			
			user.setActivedDate(new Date());
			user.setStatus("ACTIVE");
			user.setRole(roleService.getAllRole().get(0));
			
			userService.createUser(user);*/
	    }
}
