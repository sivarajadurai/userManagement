package com.springboot.user.resp;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.user.domain.User;

public interface UserRepository extends JpaRepository<User, Integer>
{

}