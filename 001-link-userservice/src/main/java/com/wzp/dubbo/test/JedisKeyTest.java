package com.wzp.dubbo.test;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Transaction;

import java.util.List;
import java.util.Set;

public class JedisKeyTest {
    public static void main(String[] args) {
        //连接redis，传递参数，端口号 ， 会返回对象
        Jedis jedis = new Jedis("192.168.153.128",6379);
       /* Jedis jedis = new Jedis("192.168.153.128",6379);
*//*        String ret = jedis.ping();
              System.out.println(ret);*//*
             Set<String> keys = jedis.keys("*");
             for (String key:keys){
                 System.out.println(key);
             }
             boolean   aBoolean      =  jedis.exists("k1");
              System.out.println(aBoolean);
              Long  ret    =    jedis.move("k2",1);
               System.out.println(ret);*/
                Transaction  transaction = jedis.multi();
                transaction.set("k6","v6");
                List<Object>  a=transaction.exec();
        System.out.println(a);
    }
}
