package com.ecommerceproject.service.user.UserService.repository;

import com.ecommerceproject.service.user.UserService.model.User;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * UserRepository
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> { }