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
        bankAccounts.add(new BankAccount("Húgó", "hippo", 1));
        bankAccounts.add(new BankAccount("Simba", "lyon", 2000));
        model.addAttribute("accounts", bankAccounts);
        return "show";
    }
}
