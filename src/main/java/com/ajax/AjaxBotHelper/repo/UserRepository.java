package com.ajax.AjaxBotHelper.repo;

import com.ajax.AjaxBotHelper.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, String> {
    @Query("SELECT u FROM User u WHERE u.notified = false " + "AND u.description IS NOT NULL AND u.steps IS NOT NULL")
    List<User> findNewUsers()   ;
    User findByChatId(long id);

}
