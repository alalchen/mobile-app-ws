package com.example.mobile.app.ws.io.repositories;

import com.example.mobile.app.ws.io.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
//cao zuo database
@Repository
public interface UserRepository extends PagingAndSortingRepository<UserEntity, Long> {
    //UserEntity findUserByEmail(String email);
    UserEntity findByEmail(String email);
    UserEntity findByUserId(String userId);
}
