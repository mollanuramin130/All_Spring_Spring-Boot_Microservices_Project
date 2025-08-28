package com.omni.profile.repository;

import com.omni.profile.model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Long> {
    // Basic CRUD is already provided by JpaRepository
}
