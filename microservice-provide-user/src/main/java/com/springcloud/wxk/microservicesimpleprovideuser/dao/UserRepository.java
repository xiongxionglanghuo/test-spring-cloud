package com.springcloud.wxk.microservicesimpleprovideuser.dao;

import com.springcloud.wxk.microservicesimpleprovideuser.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
