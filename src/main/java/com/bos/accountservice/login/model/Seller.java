package com.bos.accountservice.login.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "seller")
public class Seller {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_seller;
    private String username;
    private String password;
    private String name;
    private String card_number;
    private String phone;
    private String shop_name;
    private String image_path;
    private int flag;
    private int id_kab_kota;
}
