package com.bos.accountservice.login.repository;

import com.bos.accountservice.login.model.Seller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface SellerRepository extends JpaRepository<Seller, Integer> {
    @Query(value = "SELECT * FROM seller WHERE username = :username", nativeQuery = true)
    Seller getSellerByUsername(@Param("username") String username);
}
