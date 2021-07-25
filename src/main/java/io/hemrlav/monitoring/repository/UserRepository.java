package io.hemrlav.monitoring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.hemrlav.monitoring.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
