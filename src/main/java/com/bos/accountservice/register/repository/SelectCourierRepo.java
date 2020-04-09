package com.bos.accountservice.register.repository;

import com.bos.accountservice.register.entity.SelectedCour;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SelectCourierRepo extends JpaRepository<SelectedCour,Integer> {

}
