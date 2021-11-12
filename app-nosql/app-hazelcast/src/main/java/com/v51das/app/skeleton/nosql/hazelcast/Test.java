package com.v51das.app.skeleton.nosql.hazelcast;

import com.hazelcast.collection.IQueue;
import com.hazelcast.config.Config;
import com.hazelcast.core.*;
import com.hazelcast.map.IMap;

import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) {
        HazelcastInstance node1 = Hazelcast.newHazelcastInstance();
        HazelcastInstance node2 = Hazelcast.newHazelcastInstance();
        IMap<Integer, Integer> map1 = node1.getMap("data");
        for (int i = 0; i < 100; i++) {
            map1.put(i, i);
        }
        for (int i = 0; i < 4; i++) {
            map1.lock(i);
        }
        IMap<Integer, Integer> map2 = node2.getMap("data");
        System.out.println("map size before evict all = " + map2.size());
        map2.evictAll();
        System.out.println("map size after evict all = " + map1.size());
    }
}
