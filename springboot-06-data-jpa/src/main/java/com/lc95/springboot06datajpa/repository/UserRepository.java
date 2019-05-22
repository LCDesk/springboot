package com.lc95.springboot06datajpa.repository;

import com.lc95.springboot06datajpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

//继承JpaRepository
public interface UserRepository extends JpaRepository<User, Integer> {
}
