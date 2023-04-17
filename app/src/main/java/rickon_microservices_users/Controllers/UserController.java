package rickon_microservices_users.Controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import rickon_microservices_users.dtos.UserModel;
import rickon_microservices_users.services.UserService;

@RestController
public class UserController {

	static final String template = "Hello, %s!";
	static final List<UserModel> users = new ArrayList<UserModel>();
	final AtomicLong counter = new AtomicLong();
	
	@Autowired
    private UserService userService;
	
	@GetMapping("/Users")
	public List<UserModel> getUsers() {
		return userService.getUsers();
	}
	
	@PostMapping("/Users")
	public ResponseEntity<UserModel> postUsers(@RequestBody UserModel userModel) {
		userService.saveUser(userModel);
		return ResponseEntity
	            .status(HttpStatus.CREATED)
	            .body(userModel);
	}
}
