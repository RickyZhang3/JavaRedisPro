package com.ricky.redis.cli.redis_cli;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args){
    	
    	Jedis jedis = new Jedis("localhost");
    	jedis.set("foo", "bar");
    	String value = jedis.get("foo");
    	
    	System.out.println(value);
    }
}
