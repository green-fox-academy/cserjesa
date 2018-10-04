package com.gfa.chatapp.controllers;

import com.gfa.chatapp.models.Client;
import com.gfa.chatapp.models.Message;
import com.gfa.chatapp.models.MessageDTO;
import com.gfa.chatapp.models.ResponseMessage;
import com.gfa.chatapp.services.MessageService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {
    private MessageService messageService;

    public MainController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping(value = {"/"})
    public String index(Model model) {
        if (messageService.findUserById(1L).isPresent()) {
            Message message = new Message("Jancsika", "Teszüzenet");
            model.addAttribute("user", messageService.findUserById(1L).get().getUsername());
            model.addAttribute("messages", messageService.findAllByOrderByTimestampDesc());
            return "index";
        } else return "redirect:/register";
    }

    @GetMapping(value = {"/register"})
    public String register(Model model) {
        return "register";
    }

    @PostMapping(value = {"/register"})
    public String postRegister(Model model, String username) {
        if (username == null || username.isEmpty()) {
            model.addAttribute("error", "The username field is empty");
            return "/register";
        }
        messageService.saveUser(username);
        return "redirect:/";
    }

    @PostMapping(value = {"/update-username"})
    public String updateUser(Model model, String username) {
        if (username == null || username.isEmpty()) {
            model.addAttribute("error", "The username field is empty");
        }
        messageService.saveUser(username);
        return "redirect:/";
    }

    @PostMapping(value = {"/send"})
    public String send(String messageText, Model model) {
        if (messageText == null || messageText.isEmpty()) {
            model.addAttribute("error", "The message field is empty");
        }
        Message message = new Message(messageService.findUserById(1L).get().getUsername(), messageText);
        messageService.broadCastMyMessage(message);
        messageService.save(message);
        return "redirect:/";
    }

    @CrossOrigin("*")
    @ResponseBody
    @PostMapping(value = {"/api/message/receive"})
    public ResponseEntity<ResponseMessage> receive(@RequestBody(required = false) MessageDTO messageDTO, Model model) {
        ResponseMessage responseMessage = new ResponseMessage();
        if (messageDTO == null || messageDTO.equals("")) {
            responseMessage.addErrorMessage("No message body received");
        }
        if (messageDTO.getMessage().getText().isEmpty()) {
            responseMessage.addErrorMessage("text");
        }
        if (messageDTO.getMessage().getId().equals("")) {
            responseMessage.addErrorMessage("id");
        }
        if (messageDTO.getMessage().getUsername().isEmpty()) {
            responseMessage.addErrorMessage("username");
        }
        if (messageDTO.getMessage().getTimestamp().equals("")) {
            responseMessage.addErrorMessage("timestamp");
        }

        if (responseMessage.getStatus() != null) {
            ResponseEntity<ResponseMessage> response = new ResponseEntity<ResponseMessage>(responseMessage, HttpStatus.BAD_REQUEST);
            return response;
        }

        messageService.save(messageDTO.getMessage());
        ResponseEntity<ResponseMessage> response = new ResponseEntity<>(responseMessage, HttpStatus.OK);
        messageService.broadCast(messageDTO);
        return response;
    }
}
