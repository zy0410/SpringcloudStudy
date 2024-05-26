package com.atguigu.cloud;

import java.time.ZonedDateTime;

/**
 * @author Zhanye
 * @since 2024/04/26 19:37
 */
public class Main {
    public static void main(String[] args)
    {
        ZonedDateTime zbj = ZonedDateTime.now(); // 默认时区
        System.out.println(zbj);
    }
}
