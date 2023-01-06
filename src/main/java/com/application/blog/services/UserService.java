package com.application.blog.services;

import java.util.List;

import com.application.blog.entities.User;
import com.application.blog.payloads.UserDto;

public interface UserService {
	
	UserDto createUser(UserDto user);
	UserDto updateUser(UserDto user,Integer userId);
	UserDto getUserbyId(Integer Id);
	List<UserDto> getAllUsers();
	void deleteUser(Integer userId);

}
