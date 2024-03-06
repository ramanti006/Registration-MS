package com.example.registration.Model;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.registration.Model.User;

public interface UserRepo extends JpaRepository<User,Integer> {
	User findByName(String Name);

}
