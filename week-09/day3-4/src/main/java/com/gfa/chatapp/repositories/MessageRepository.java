package com.gfa.chatapp.repositories;

import com.gfa.chatapp.models.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepository extends CrudRepository<Message, Long> {
    Iterable<Message> findAllByOrderByTimestampDesc();
}
