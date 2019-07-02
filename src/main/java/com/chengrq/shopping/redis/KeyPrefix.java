package com.chengrq.shopping.redis;

public interface KeyPrefix {
    public int expireSeconds();

    public String getPrefix();

}
