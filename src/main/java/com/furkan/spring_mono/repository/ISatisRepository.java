package com.furkan.spring_mono.repository;

import com.furkan.spring_mono.repository.entity.Satis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISatisRepository extends JpaRepository<Satis,Long> {
}
