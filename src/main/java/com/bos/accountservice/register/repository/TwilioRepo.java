package com.bos.accountservice.register.repository;

import com.bos.accountservice.register.entity.TwilioDim;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TwilioRepo extends JpaRepository<TwilioDim,String> {
    @Query(nativeQuery = true,
           value = "select auth_token,account_sid from twilio order by created_time desc limit 1")
    TwilioDim getToken();
}
