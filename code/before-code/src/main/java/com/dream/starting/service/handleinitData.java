package com.dream.starting.service;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.HashMap;
import java.util.Map;

/**
 * 实现CommandLineRunner类可以实现项目启动的时候初始化数据的操作
 */
@Component
public class handleinitData implements CommandLineRunner
{

    @Override
    public void run(String... args) throws Exception {
        Map<String,String> map = new HashMap<>();
        map.put("data","1");
        System.out.println("初始化数据完成!");
    }
}
