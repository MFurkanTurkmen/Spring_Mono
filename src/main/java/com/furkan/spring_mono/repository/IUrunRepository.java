package com.furkan.spring_mono.repository;

import com.furkan.spring_mono.repository.entity.Urun;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUrunRepository extends JpaRepository<Urun,Long> {
}
