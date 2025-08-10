package com.robert.springSecurityLearn.Repository;

import com.robert.springSecurityLearn.Model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {

    Users findByUserName(String username);
}
