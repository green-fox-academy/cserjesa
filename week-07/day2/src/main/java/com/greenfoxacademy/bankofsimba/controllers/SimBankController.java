package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

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

    @RequestMapping("/show")
    public String show(Model model) {
        model.addAttribute("accounts", bankAccounts);
        return "show";
    }

    @PostMapping("/raise")
    public String raise(BankAccount b, Model model) {
        b.raiser(10);
        System.out.println(b.getBalance());
        return "show";
    }

    @RequestMapping("/htmlCeption")
    public String wtf(Model model) {
        model.addAttribute("htmlString", "\"This is an <em>HTML</em> text. <b>Enjoy yourself!</b>\"");
        return "htmlCeption";
    }
}
