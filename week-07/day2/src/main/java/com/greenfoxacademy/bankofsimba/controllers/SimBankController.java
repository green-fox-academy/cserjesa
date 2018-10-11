package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Controller
public class SimBankController {
    List<BankAccount> bankAccounts = Arrays.asList(
            new BankAccount("Húgó", "hippo", 1, false, true),
            new BankAccount("Marcipán", "dog", 1000, false, true),
            new BankAccount("Grabowski", "mouse", 400, true, true),
            new BankAccount("Zordon", "lyon", 500, false, false),
            new BankAccount("Topi", "penguin", 60, false, true),
            new BankAccount("Vuk", "fox", 700, false, true),
            new BankAccount("Simba", "lyon", 2000, false, false)
    );

    @GetMapping("/show")
    public String show(Model model) {
        model.addAttribute("accounts", bankAccounts);
        return "show";
    }

    @PostMapping("/raise/{urlParamName}")
    public String raise(@PathVariable String urlParamName, Model model) {
        Optional<BankAccount> raiseAccount = bankAccounts.stream()
                .filter(bankAccount -> bankAccount.getName().equals(urlParamName))
                .findFirst();
        if (raiseAccount.isPresent()) {
            raiseAccount.get().raiser(10);
        }
        return "redirect:/show";
    }

    @GetMapping("/htmlCeption")
    public String wtf(Model model) {
        model.addAttribute("htmlString", "\"This is an <em>HTML</em> text. <b>Enjoy yourself!</b>\"");
        return "htmlCeption";
    }
}
