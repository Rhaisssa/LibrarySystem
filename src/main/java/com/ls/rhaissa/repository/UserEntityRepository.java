package com.ls.rhaissa.repository;
import com.ls.rhaissa.domain.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserEntityRepository extends JpaRepository <UserEntity, Long> {

}
