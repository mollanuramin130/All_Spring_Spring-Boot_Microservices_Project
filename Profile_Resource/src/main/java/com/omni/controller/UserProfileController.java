package com.omni.controller;

import java.net.HttpURLConnection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.omni.dto.ResponseMessage;
import com.omni.model.UserProfile;
import com.omni.services.UserProfileService;
import com.omni.uitlly.Constants;


@RestController
public class UserProfileController {

	@Autowired
	private UserProfileService userService;


	@PostMapping("/register")
	public ResponseEntity<ResponseMessage> createNewRegister(@RequestBody UserProfile users) {
 		 UserProfile register = userService.createRegister(users);
		return    ResponseEntity.ok(new ResponseMessage(HttpURLConnection.HTTP_OK, Constants.SUCCESS, "UserProfile Register created successfully", register));
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Void> deleteUserProfileById(@PathVariable Long id) {
		userService.deleteById(id);
	    return new ResponseEntity<>(HttpStatus.NO_CONTENT); // or HttpStatus.OK if you want


 	}

}
