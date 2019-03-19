package com.zc.zcbucks.repository;

import com.zc.zcbucks.model.CoffeeOrder;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;


/**
 * @description:
 * @author: Zhangc
 * @date: 2019-02-27
 */

public interface CoffeeOrderRepository extends JpaRepository<CoffeeOrder,Long> {
    List<CoffeeOrder> findByCustomerOrderById(String customer);
    List<CoffeeOrder> findByItemsName(String name);
}
