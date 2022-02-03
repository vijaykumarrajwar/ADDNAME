package com.sangamone.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sangamone.model.Customer1;

public interface CustomerRepo extends JpaRepository<Customer1, Integer> {

}
