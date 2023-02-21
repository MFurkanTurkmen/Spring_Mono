package com.furkan.spring_mono.mvccontroller.models;

import com.furkan.spring_mono.repository.entity.Urun;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class UrunIndexModel {
    String title;
    List<String> menulistesi;
    List<Urun> urunlistesi;
}
