package com.gfa.chatapp.services;

import com.gfa.chatapp.models.Message;
import com.gfa.chatapp.models.MessageDTO;
import com.gfa.chatapp.models.User;

import java.util.Optional;

public interface MessageService {
    Object findAll();

    Optional<User> findUserById(Long id);

    void saveUser(String username);

    void save(Message message);

    void saveMessage(String username, String messageText);

    Boolean broadCast(MessageDTO messageDTO);

    Boolean broadCastMyMessage(Message message);

    Iterable<Message> findAllByOrderByTimestampDesc();
}
