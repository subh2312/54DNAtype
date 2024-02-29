package com.subhankar.must_54dnatype.repository;

import com.subhankar.must_54dnatype.model.DO.UserDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<UserDO, String>{
    boolean existsByUserId(String userId);

    boolean existsByEmail(String email);

    boolean existsByPhone(String phone);

    UserDO findByEmail(String email);

    @Query("SELECT u FROM UserDO u WHERE u.email = :userName OR u.userId = :userName")
    UserDO findByEmailOrUserId(String userName);
}
