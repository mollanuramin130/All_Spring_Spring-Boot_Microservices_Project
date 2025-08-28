//package com.omni.profile_adapter;
//
//import com.omni.profile.model.Profile;
//import com.omni.profile.repository.ProfileRepository;
//import org.springframework.stereotype.Repository;
//
//import java.util.*;
//
//@Repository
//public class ProfileRepositoryImpl implements ProfileRepository {
//
//    private final Map<Long, Profile> store = new HashMap<>();
//
//    @Override
//    public Profile save(Profile profile) {
//        store.put(profile.getId(), profile);
//        return profile;
//    }
//
//    @Override
//    public Profile findById(Long id) {
//        return store.get(id);
//    }
//
//    @Override
//    public List<Profile> findAll() {
//        return new ArrayList<>(store.values());
//    }
//}
