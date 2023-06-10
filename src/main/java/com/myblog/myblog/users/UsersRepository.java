package com.myblog.myblog.users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
public interface UsersRepository extends JpaRepository<Users, Long> {

}