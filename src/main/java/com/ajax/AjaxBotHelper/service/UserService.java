package com.ajax.AjaxBotHelper.service;

import com.ajax.AjaxBotHelper.model.User;
import com.ajax.AjaxBotHelper.repo.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional(readOnly = true)
    public User findByChatId(long id) {
        return userRepository.findByChatId(id);
    }

    @Transactional(readOnly = true)
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    @Transactional
    public void addUser(User user) {
        userRepository.save(user);
    }


    @Transactional
    public List<User> findNewUsers() {
        List<User> users = userRepository.findNewUsers();
        users.forEach(user -> user.setNotified(true));
        userRepository.saveAll(users);
        return users;
    }

    @Transactional
    public void updateUser(User user) {
        userRepository.save(user);
    }


}