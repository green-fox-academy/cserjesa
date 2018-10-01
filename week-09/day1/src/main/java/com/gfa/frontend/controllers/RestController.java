package com.gfa.frontend.controllers;


import org.springframework.web.bind.annotation.*;

@org.springframework.web.bind.annotation.RestController
public
class RestController {


    @GetMapping("/doubling")
    public DoublingResult doubling(@RequestParam(required = false) Integer input) {
        DoublingResult doublingResult;
        if (input == null) {
            doublingResult = new DoublingResult();
            doublingResult.setError("Please provide an input!");
        } else {
            doublingResult = new DoublingResult(input);
            doublingResult.setResult(input * 2);
            doublingResult.setError("NO error");
        }
        return doublingResult;
    }


    public class DoublingResult {
        int received;
        int result;
        String error;

        public DoublingResult() {

        }

        public String getError() {
            return error;
        }

        public void setError(String error) {
            this.error = error;
        }

        public int getResult() {
            return result;
        }

        void setResult(int result) {
            this.result = result;
        }

        DoublingResult(int received) {
            this.received = received;
        }

        public int getReceived() {
            return received;
        }

        public void setReceived(int received) {
            this.received = received;
        }
    }


    @GetMapping("/greeter")
    public GreetingResult greeter(@RequestParam(required = false) String name, String title) {
        GreetingResult greetingResult;
        if (name == null) {
            greetingResult = new GreetingResult();
            greetingResult.setError("Please provide a name!");
        } else if (title == null) {
            greetingResult = new GreetingResult();
            greetingResult.setError("Please provide a title!");
        } else {
            greetingResult = new GreetingResult();
            greetingResult.setError("NO error");
            greetingResult.setWelcome_message("Oh, hi there " + name + ", my dear " + title + "!");
        }
        return greetingResult;
    }

    public class GreetingResult {
        String welcome_message;
        String error;

        public GreetingResult() {

        }

        public String getWelcome_message() {
            return welcome_message;
        }

        public void setWelcome_message(String welcome_message) {
            this.welcome_message = welcome_message;
        }

        public String getError() {
            return error;
        }

        public void setError(String error) {
            this.error = error;
        }

        public GreetingResult(String welcome_message) {
            this.welcome_message = welcome_message;
        }
    }

    @GetMapping("/appenda/{name}")
    public AppendResult appenda(@PathVariable(required = false) String name) {
        AppendResult appendResult;
        if (name == null) {
            appendResult = new AppendResult();
            appendResult.setAppended("404");
        } else {
            appendResult = new AppendResult();
            appendResult.setAppended(name + "a");
        }
        return appendResult;
    }

    public class AppendResult {
        String appended;

        public AppendResult(String appended) {
            this.appended = appended;
        }

        public AppendResult() {
        }

        public String getAppended() {
            return appended;
        }

        public void setAppended(String appended) {
            this.appended = appended;
        }
    }

    @PostMapping("/dountil/{action}")
    public UntilResult dountil(@PathVariable(required = false) String action, @RequestBody(required = false) UntilInput untilInput) {
        UntilResult untilResult = new UntilResult();
        if (action == null || untilInput == null){
            untilResult.setError("Please provide a number!");
        } else{
            if (action.equals("sum")) {
                int sumResult = 0;
                for (int i = 1; i <= untilInput.getUntil(); i++) {
                    sumResult = sumResult + i;
                }
                untilResult.setResult(sumResult);
            } else {
                if (action.equals("factor")) {
                    int sumResult = 1;
                    for (int i = 1; i <= untilInput.getUntil(); i++) {
                        sumResult = sumResult * i;
                    }
                    untilResult.setResult(sumResult);
                }

            }
        }
        return untilResult;
    }

    public class UntilResult {
        int result;
        String error;

        public UntilResult(int result) {
            this.result = result;
        }

        public UntilResult() {
        }

        public Integer getResult() {
            return result;
        }

        public void setResult(int result) {
            this.result = result;
        }

        public String getError() {
            return error;
        }

        public void setError(String error) {
            this.error = error;
        }
    }

    public static class UntilInput {
        Integer until;

        public UntilInput() {
        }

        public UntilInput(int until) {
            this.until = until;
        }

        public Integer getUntil() {
            return until;
        }

        public void setUntil(int until) {
            this.until = until;
        }
    }
}




