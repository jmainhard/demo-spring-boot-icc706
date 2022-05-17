package com.example.demospringbooticc706.repository;

import com.example.demospringbooticc706.models.User;
import org.springframework.data.repository.CrudRepository;

//
/*

 */

/**
 * @param address test
 */
public interface UserRepository extends CrudRepository<User, Long> {
    Iterable<User> findAllByAddress(String address);
}
