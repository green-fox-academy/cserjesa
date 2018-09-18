package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class SimBankController {

    ArrayList<BankAccount> bankAccounts = new ArrayList<>();

    @RequestMapping("/show")
    public String greeting(Model model) {
        bankAccounts.add(new BankAccount("Húgó", "hippo", 1,false,true));
        bankAccounts.add(new BankAccount("Simba", "lyon", 2000,false,false));
        bankAccounts.add(new BankAccount("Marcipán", "dog", 1000,false,true));
        bankAccounts.add(new BankAccount("Grabowski", "cat", 400,true,true));
        bankAccounts.add(new BankAccount("Zordon", "lyon", 500,false,false));
        bankAccounts.add(new BankAccount("Topi", "penguin", 60,false,true));
        bankAccounts.add(new BankAccount("Vuk", "fox", 700,false,true));
        model.addAttribute("accounts", bankAccounts);
        return "show";
    }

    @RequestMapping("/htmlCeption")
    public String wtf(Model model) {
        model.addAttribute("htmlString", "\"This is an <em>HTML</em> text. <b>Enjoy yourself!</b>\"");
        return "htmlCeption";
    }
}
