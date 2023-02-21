package com.furkan.spring_mono.service;

import com.furkan.spring_mono.dto.request.UrunSaveRequestDto;
import com.furkan.spring_mono.dto.request.UrunUpdateRequestDto;
import com.furkan.spring_mono.mapper.IUrunMapper;
import com.furkan.spring_mono.repository.IUrunRepository;
import com.furkan.spring_mono.repository.entity.Urun;
import com.furkan.spring_mono.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class UrunService extends ServiceManager<Urun,Long> {
    public UrunService(IUrunRepository repository){
        super(repository);
    }

    public void save(UrunSaveRequestDto dto){
        save(IUrunMapper.INSTANCE.urunFromDto(dto));
    }

    public void update(UrunUpdateRequestDto dto){
        update(IUrunMapper.INSTANCE.urunFromUpdateDto(dto));
    }
}
