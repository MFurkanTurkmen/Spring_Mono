package com.furkan.spring_mono.repository.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;



@Data
@EqualsAndHashCode(callSuper=false)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "tblmusteri")

public class Musteri extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String tckimlik;
    String ad;
    String adres;
    Integer yas;
    String telefon;
    /**
     * kaydın aktif pasif olma durumu
     */
    boolean state;

}
