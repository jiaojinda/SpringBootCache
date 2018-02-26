package com.jiao.service;

import com.jiao.Person;

/**
 * Created by Administrator on 2018/2/26.
 */
public interface DemoService {
    public Person save(Person person);

    public void remove(Long id);

    public Person findOne(Person person);
}