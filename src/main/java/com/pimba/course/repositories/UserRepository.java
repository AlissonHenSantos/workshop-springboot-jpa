package com.pimba.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pimba.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
