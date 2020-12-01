package com.vansaravalle.bookstoremenager.publisher.repository;

import com.vansaravalle.bookstoremenager.publisher.entity.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}

