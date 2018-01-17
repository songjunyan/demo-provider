package com.example.demo.dao;

import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author sls
 * @date 2018/1/2
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}
