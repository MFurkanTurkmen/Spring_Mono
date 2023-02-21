package com.furkan.spring_mono.service;


import com.furkan.spring_mono.repository.ISatisRepository;
import com.furkan.spring_mono.repository.entity.Satis;
import com.furkan.spring_mono.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class SatisService extends ServiceManager<Satis,Long> {
    private final ISatisRepository repository;
    public SatisService(ISatisRepository repository){
        super(repository);
        this.repository = repository;
    }

}
