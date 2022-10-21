package com.atguigu;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class SpringBootRedisTest {
    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void set() {
        ValueOperations ops = redisTemplate.opsForValue();
        ops.set("age",41);
    }

    @Test
    public void get() {
        ValueOperations ops = redisTemplate.opsForValue();
        Object age = ops.get("age");
        System.out.println(age);
    }

    @Test
    public void hset() {
        HashOperations ops = redisTemplate.opsForHash();
        ops.put("info","b","bb");
    }

    @Test
    public void hget() {
        HashOperations ops = redisTemplate.opsForHash();
        Object val = ops.get("info", "b");
        System.out.println(val);
    }


}
