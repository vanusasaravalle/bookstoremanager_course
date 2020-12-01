package com.vansaravalle.bookstoremenager.user.repository;

import com.vansaravalle.bookstoremenager.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
