package eth.vote.controller;


import eth.vote.beans.User;
import eth.vote.service.TopicService;
import eth.vote.service.TopicServiceImpl;
import eth.vote.service.UserService;
import eth.vote.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {

	    @Autowired
		UserService userService;

	    @Autowired
		TopicService topicService;

	    @RequestMapping("userlist.json")
	    public @ResponseBody List<User> getUserList() {
	        return userService.getAllUsers();
	    }

	    @RequestMapping(value = "/add", method = RequestMethod.POST)
	    public @ResponseBody void addUser(@RequestBody User user) {
	        userService.addUser(user);
			System.out.println("user added: "+user.getId());
		}

		@RequestMapping(value = "/login/{id}", method = RequestMethod.POST)
		public @ResponseBody void loginUser(@PathVariable("id") String userId){
			System.out.println("user to login: "+userId);
			userService.loginUser(userId);
			System.out.println("user logged in: " + userService.getLoggedInUser());
		}

		@RequestMapping(value = "/loggedIn/get", method = RequestMethod.GET)
		public @ResponseBody User getLoggedIn() {
			return userService.getLoggedInUser();
		}

	    @RequestMapping(value = "/remove/{id}", method = RequestMethod.DELETE)
	    public @ResponseBody void removeUser(@PathVariable("id") String id) {
	        userService.removeUser(id);
	    }

	    @RequestMapping(value = "/removeAll", method = RequestMethod.DELETE)
	    public @ResponseBody void removeAllUsers() {
	        userService.removeAll();
	    }

	    @RequestMapping("/layout")
	    public String getUserPartialPage() {
	        return "/views/users/layout.html";
	    }

	    @RequestMapping("/user")
		public String getUserStartPage() {return "/views/users/user.html";}
	    
	    @RequestMapping("/customers/layout")
	    public String getCustomerPartialPage() {
	        return "/views/users/customers/layout.html";
	    }
	    
	    
	    @RequestMapping("/providers/layout")
	    public String getProviderPartialPage() {
	        return "/views/users/providers/layout.html";
	    }
}


