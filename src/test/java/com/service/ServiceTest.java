package com.service;

import com.pojo.Provider;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class ServiceTest {
    private ApplicationContext ac;
    private ProviderService bean;
    @Before
    public void init(){
        ac = new ClassPathXmlApplicationContext("applicationContext-jdbc.xml");
        bean = ac.getBean(ProviderService.class);
    }

    @Test
    public void testGetAll(){
        List<Provider> all = bean.getAll();
        for (Provider p:all) {
            System.out.println(p);
        }
    }

    @Test
    public void testGetByPid(){
        Provider p = bean.getByPid(2);
        System.out.println(p);
    }

    @Test
    public void testAdd(){
        Provider p = new Provider();
        p.setProName("林家浩");
        bean.add(p);
        testGetAll();
    }
}
