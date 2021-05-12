package com.service;

import com.dao.ProviderDao;
import com.pojo.Provider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional(rollbackFor =java.lang.Exception.class)
public class ProviderServiceImpl implements ProviderService {
    @Autowired
    private ProviderDao providerDao;
    @Override
    public List<Provider> getAll() {
        return providerDao.queryAll();
    }
}
