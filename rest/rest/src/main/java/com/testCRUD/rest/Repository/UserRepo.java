package com.testCRUD.rest.Repository;

import com.testCRUD.rest.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {
}
