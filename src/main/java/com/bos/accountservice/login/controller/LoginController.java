package com.bos.accountservice.login.controller;

import bca.bit.proj.library.base.ResultEntity;
import com.bos.accountservice.login.model.Seller;
import com.bos.accountservice.login.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/bos", consumes = "application/json", produces = "application/json")
@CrossOrigin(origins = {"*"})
public class LoginController {
    @Autowired
    LoginService g_loginService;

    @PostMapping("/login")
    public ResultEntity loginSeller(@RequestBody Seller p_seller){
        return g_loginService.loginSeller(p_seller);
    }

}
