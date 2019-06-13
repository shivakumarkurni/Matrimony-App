package com.matrimony.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.matrimony.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	@Query(value= "select * from matrimony.user_profile where city =?1 and gender = ?2",nativeQuery = true)
	ArrayList<User> findByCityAndGender(String city, char gender);
}
