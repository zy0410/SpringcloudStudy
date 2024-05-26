package com.atguigu.cloud.service;

/**
 * @author Zhanye
 * @since 2024/05/10 17:02
 */
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Service;

@Service
public class FlowLimitService
{
    @SentinelResource(value = "common")
    public void common()
    {
        System.out.println("------FlowLimitService come in");
    }
}
