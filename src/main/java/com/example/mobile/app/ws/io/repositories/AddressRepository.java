package com.example.mobile.app.ws.io.repositories;

import java.util.List;

import com.example.mobile.app.ws.io.entity.AddressEntity;
import com.example.mobile.app.ws.io.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AddressRepository extends CrudRepository<AddressEntity, Long> {
    List<AddressEntity> findAllByUserDetails(UserEntity userEntity);
    AddressEntity findByAddressId(String addressId);
}
