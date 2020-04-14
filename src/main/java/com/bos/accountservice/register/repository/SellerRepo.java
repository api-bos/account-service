package com.bos.accountservice.register.repository;

import com.bos.accountservice.register.entity.SellerDim;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface SellerRepo extends JpaRepository<SellerDim,Integer> {
    List<SellerDim> findAll();

    @Query(value = "SELECT sd.idSeller FROM SellerDim sd WHERE sd.username = :username")
    Integer findIdSellerbyUsername(@Param("username") String username);

    @Query(value = "SELECT sd.username FROM SellerDim sd WHERE sd.username = :username")
    String findUsername(@Param("username") String username);

    @Query(value = "SELECT sd.email FROM SellerDim sd WHERE sd.email = :email")
    String findEmail(@Param("email") String email);

    @Query(value = "SELECT sd.accountNo FROM SellerDim sd WHERE sd.accountNo = :accountNo")
    String findAcctNo(@Param("accountNo") String accountNo);

    @Query(value = "SELECT sd.phone FROM SellerDim sd WHERE sd.phone = :phone")
    String findPhone(@Param("phone") String phone);

    @Query(value = "SELECT sd.username FROM SellerDim sd WHERE sd.phone = :phone")
    String findUsernamebyPhone(@Param("phone") String phone);

    @Query(value = "SELECT sd.email FROM SellerDim sd WHERE sd.username = :username")
    String findEmailbyUsername(@Param("username") String username);

    @Query(value = "SELECT sd.password FROM SellerDim sd WHERE sd.username = :username")
    String findPassbyUsername(@Param("username") String username);

    @Transactional
    @Modifying
    @Query("UPDATE SellerDim SET password = :password WHERE username = :username")
    void updatePassByUsername(@Param("password") String password, @Param("username") String username);

    @Transactional
    @Modifying
    @Query("UPDATE SellerDim SET flag = :flag WHERE username = :username")
    void updateFlagByUsername(@Param("flag") int flag, @Param("username") String username);

    @Query("SELECT flag FROM SellerDim WHERE username = :username")
    Integer getFlagByUsername(@Param("username") String username);

    @Query("SELECT flag FROM SellerDim WHERE cardNum = :cardNo")
    Integer getFlagByCardNo(@Param("cardNo") String cardNo);
}
