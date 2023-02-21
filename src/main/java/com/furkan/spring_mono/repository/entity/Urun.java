package com.furkan.spring_mono.repository.entity;

import lombok.*;
import lombok.experimental.SuperBuilder;

import jakarta.persistence.*;

@Data
@EqualsAndHashCode(callSuper=false)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "tblurun")
public class Urun  extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String ad;
    Double fiyat;
    String barkod;
    Integer kdv;
    String resim;
}
