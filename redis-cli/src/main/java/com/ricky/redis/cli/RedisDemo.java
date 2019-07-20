package com.ricky.redis.cli;

import redis.clients.jedis.Jedis;

public class RedisDemo {

	public static void main(String[] args) {
		Jedis jedis = new Jedis("localhost");
    	jedis.set("foo", "bar");
    	String value = jedis.get("foo");
    	
    	System.out.println(value);
    	
    	Long result = jedis.del("foo");
    	
    	System.out.println(result);
	}

}
