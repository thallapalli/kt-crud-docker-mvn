package kt.crud.docker.mvn.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import kt.crud.docker.mvn.entity.User;
import kt.crud.docker.mvn.exception.UserNotFoundException;
import kt.crud.docker.mvn.repo.UserRepository;

@RestController
public class UserController {
	@Autowired
	private UserRepository userRepository;
	@GetMapping("/users")
	public Iterable<User>  getAllusers() {
		Iterable<User> allUsers = userRepository.findAll();
		return allUsers;
	}
	@GetMapping("/user/{Id}")
	public Optional<User>   getAllusers(@PathVariable Long Id) {
		return userRepository.findById(Id);
	}
	@PostMapping("/users")
	public User  save(@RequestBody User user) {
		Optional<User> user1 = userRepository.findById(user.getId());
		if(!user1.isPresent()) {
			throw new UserNotFoundException("User not found !!!");
			
		}
		return userRepository.save(user);
		
		
	}
	@PutMapping("/users")
	public User  create(@RequestBody User user) {
		return userRepository.save(user);
		
	}
	@DeleteMapping("/user/{Id}")
	public void  create(@PathVariable Long Id) {
		Optional<User> user1 = userRepository.findById(Id);
		if(!user1.isPresent()) {
			throw new UserNotFoundException("User not found !!!");
			
		}
		userRepository.delete(user1.get());
		
	}
	
	
}
