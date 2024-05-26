package com.atguigu.cloud.service;

import com.atguigu.cloud.entities.Pay;

import java.util.List;

/**
 * @author Zhanye
 * @since 2024/03/22 20:51
 */
public interface PayService {
    int add(Pay pay);
    int delete(Integer id);
    int update(Pay pay);
    Pay query(Integer id);
    List<Pay> queryAll();
}
