package com.qiang.demo.service.consumer;

import com.qiang.demo.redis.RedisManager;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lj on 2017/7/13.
 */
public class ConsumerTest {

    public static void main(String[] args) throws Exception{
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring/*.xml");
        RedisManager redisManager = ctx.getBean(RedisManager.class);
        redisManager.set("lj", "lllll");
        System.out.println(redisManager.get("lj"));
//        List<String> keys = redisManager.scan("ad:ssp:schedulelist:10a263d0aa8445cb908a728c88aa01a5:20180508*");
////        List<String> key1s = redisManager.keys("ad:ssp:schedulelist:10a263d0aa8445cb908a728c88aa01a5:20180508*");
////        redisManager.batchDel(keys);
    }

}
