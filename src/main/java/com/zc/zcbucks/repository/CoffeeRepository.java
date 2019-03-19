package com.zc.zcbucks.repository;


import com.zc.zcbucks.model.Coffee;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * @description:
 * @author: Zhangc
 * @date: 2019-02-27
 */

public interface CoffeeRepository extends JpaRepository<Coffee,Long> {
}
