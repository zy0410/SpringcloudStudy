package com.atguigu.cloud.controller;

import cn.hutool.core.util.IdUtil;
import com.atguigu.cloud.config.RestTemplateConfig;
import com.atguigu.cloud.constant.ResultData;
import com.atguigu.cloud.entities.PayDTO;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.TimeUnit;

/**
 * @author Zhanye
 * @since 2024/03/24 16:40
 */
@RestController
public class orderController {
    //public static final String PaymentSrv_URL = "http://localhost:8001";
    public static final String PaymentSrv_URL = "http://cloud-payment-service";
    @Resource
    private RestTemplate restTemplate;

    @PostMapping("/consumer/pay/add")
    public ResultData addOrder(PayDTO payDTO){
       return restTemplate.postForObject(PaymentSrv_URL+"/pay/add",payDTO,ResultData.class);
    }

    @GetMapping("/consumer/pay/get/{id}")
    public ResultData getById(@PathVariable Integer id){
        return restTemplate.getForObject(PaymentSrv_URL+"/pay/get/"+id,ResultData.class,id);
    }

    @DeleteMapping("/consumer/pay/del/{id}")
    public ResultData deleteById(@PathVariable Integer id){
        return restTemplate.postForObject(PaymentSrv_URL+"/pay/del/"+id,id,ResultData.class);
    }

    @PutMapping("/consumer/pay/update")
    public ResultData updateOrder(PayDTO payDTO){
        return restTemplate.postForObject(PaymentSrv_URL+"/pay/update",payDTO,ResultData.class);
    }

    @GetMapping(value = "/consumer/pay/get/info")
    private String getInfoByConsul()
    {
        return restTemplate.getForObject(PaymentSrv_URL + "/pay/get/info", String.class);
    }



}
