package com.zc.zcbucks.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * @description:
 * @author: Zhangc
 * @date: 2019-02-27
 */
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "T_ORDER")
@Data
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CoffeeOrder extends BaseEntity implements Serializable {
    private String  customer;
    @ManyToMany
    @JoinColumn(name = "T_ORDER_COFFEE")
    @OrderBy("id")
    private List<Coffee>    items;
    @Enumerated
    @Column(nullable = false)
    private OrderState state;
}
