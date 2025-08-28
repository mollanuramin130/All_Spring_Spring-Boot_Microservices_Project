package com.omni.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.omni.model.UserProfile;

@Repository
public interface UserProfileRepository  extends JpaRepository<UserProfile, Long>{
	Optional<UserProfile> findByEmail(String email);

}
