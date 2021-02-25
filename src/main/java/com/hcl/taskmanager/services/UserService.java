package com.hcl.taskmanager.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.hcl.taskmanager.model.User;
import com.hcl.taskmanager.model.UserPrincipal;
import com.hcl.taskmanager.repository.UserRepository;

@Service
public class UserService implements UserDetailsService{
	
	@Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    UserRepository userRepository;
    
    public User addUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    public User getUserByName(String username) {
        return userRepository.findUserByUsername(username);
    }
    
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		User user = userRepository.findUserByUsername(username);
		return new UserPrincipal(user);
	}

}
