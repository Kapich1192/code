package com.code.repo.user;

import com.code.models.user.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Long> {

}
