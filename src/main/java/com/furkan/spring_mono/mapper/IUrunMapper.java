package com.furkan.spring_mono.mapper;

import com.furkan.spring_mono.dto.request.UrunSaveRequestDto;
import com.furkan.spring_mono.dto.request.UrunUpdateRequestDto;
import com.furkan.spring_mono.repository.entity.Urun;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface IUrunMapper {

    IUrunMapper INSTANCE = Mappers.getMapper(IUrunMapper.class);

    Urun urunFromDto(final UrunSaveRequestDto dto);

    Urun urunFromUpdateDto(final UrunUpdateRequestDto dto);
}
