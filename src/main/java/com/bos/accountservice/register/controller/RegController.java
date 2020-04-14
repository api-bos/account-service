package com.bos.accountservice.register.controller;

import bca.bit.proj.library.base.ResultEntity;
import com.bos.accountservice.register.dto.RegisterField;
import com.bos.accountservice.register.dto.RegisterVerif;
import com.bos.accountservice.register.entity.SellerDim;
import com.bos.accountservice.register.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/bos/seller")
public class RegController {
    @Autowired
    RegisterService service;

    @PostMapping("/sOTP")
    public ResultEntity sendOTP(@RequestBody RegisterField registerField) {
        System.out.println("\nTrying Send OTP Service");
        return service.sendOTP(registerField);
    }

    @PostMapping("/sOTP/{phone}")
    public ResultEntity resendOTP(@PathVariable("phone") String phone){
        System.out.println("\nTrying reSend OTP Service");
        return service.resendOTP(phone);
    }

    @PostMapping("/vOTP")
    public ResultEntity verifOTP(@RequestBody RegisterVerif registerVerif){
        System.out.println("\nTrying Verification OTP Service");
        return service.verifOTP(registerVerif);
    }

    @GetMapping(value = "/seller", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResultEntity<List<SellerDim>> getAllSeller(){
        System.out.println("SELLER");
        return service.getAllSeller();
    }

    @PostMapping("/fPass/{bosId}")
    public ResultEntity<String> forgetPass(@PathVariable("bosId") String bosId){
        System.out.println("\nTrying forget password Service");
        return service.forgotPass(bosId);
    }

    @PostMapping("/fPass/{bosId}/{pass}")
    public ResultEntity<String> reNewPass(@PathVariable("bosId") String bosId, @PathVariable("pass") String pass){
        System.out.println("\nTrying re-new password service");
        return service.reNewPass(bosId, pass);
    }
}
