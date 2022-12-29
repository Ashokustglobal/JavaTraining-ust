package com.user.demo.UserRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.user.demo.dto.Userdto;
import com.user.demo.model.User;
@Repository
@EnableJpaRepositories
public interface UserRepositry extends JpaRepository<Userdto, Integer>{

	User existsByuserName(String userName);

}
