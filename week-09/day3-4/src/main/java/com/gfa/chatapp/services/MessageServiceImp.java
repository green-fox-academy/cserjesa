package com.gfa.chatapp.services;

import com.gfa.chatapp.models.*;
import com.gfa.chatapp.repositories.MessageRepository;
import com.gfa.chatapp.repositories.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Service
public class MessageServiceImp implements MessageService {
    private MessageRepository messageRepository;

    public MessageServiceImp(MessageRepository messageRepository, UserRepository userRepository) {
        this.messageRepository = messageRepository;
        this.userRepository = userRepository;
    }

    private UserRepository userRepository;

    @Override
    public Iterable<Message> findAll() {
        return messageRepository.findAll();
    }

    @Override
    public Optional<User> findUserById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public void saveUser(String username) {
        userRepository.save(new User(username));
    }

    @Override
    public void save(Message message) {
        messageRepository.save(message);
    }

    @Override
    public void saveMessage(String username, String messageText) {
        Message message = new Message(username, messageText);
        save(message);
    }

    @Override
    public Boolean broadCastMyMessage(Message message) {
        Client client = new Client();
        client.setId(System.getenv("CHAT_APP_UNIQUE_ID"));
        MessageDTO messageDTO = new MessageDTO();
        messageDTO.setMessage(message);
        messageDTO.setClient(client);
        broadCast(messageDTO);
        RestTemplate restTemplate = new RestTemplate();
        ResponseMessage answer = restTemplate.postForObject("http://" + System.getenv("CHAT_APP_PEER_ADDRESS") + ":8080/api/message/receive", messageDTO, ResponseMessage.class);
        return true;
    }

    @Override
    public Iterable findAllByOrderByTimestampDesc() {
        return messageRepository.findAllByOrderByTimestampDesc();
    }

    @Override
    public Boolean broadCast(MessageDTO messageDTO) {
        if (!messageDTO.getClient().getId().equals(System.getenv("CHAT_APP_UNIQUE_ID"))) {
            RestTemplate restTemplate = new RestTemplate();
            ResponseMessage answer = restTemplate.postForObject("http://" + System.getenv("CHAT_APP_PEER_ADDRESS") + ":8080/api/message/receive", messageDTO, ResponseMessage.class);
        }
        return true;
    }
}
