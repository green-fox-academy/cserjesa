package com.gfa.frontend.controllers;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;

@org.springframework.web.bind.annotation.RestController
public class ArrayController {

    @PostMapping("/arrays")
    public ArrayResult arrayResult(@RequestBody(required = false) ArrayInput arrayInput) {
        ArrayResult arrayResult = new ArrayResult();

        if (arrayInput == null || arrayInput.getNumbers() == null || arrayInput.getWhat() == null || arrayInput.getNumbers().isEmpty()) {
            arrayResult.setError("Please provide what to do with the numbers!");
        } else if (arrayInput.getWhat().equals("sum")) {
            int numbersSum = 0;
            for (int numbers : arrayInput.getNumbers()) {
                numbersSum += numbers;
            }
            ArrayList<Integer> resultList = new ArrayList<>();
            resultList.add(numbersSum);
            arrayResult.setResult(resultList);
        } else if (arrayInput.getWhat().equals("multiply")) {
            int numbersSum = 1;
            for (int numbers : arrayInput.getNumbers()) {
                numbersSum = numbersSum * numbers;
            }
            ArrayList<Integer> resultList = new ArrayList<>();
            resultList.add(numbersSum);
            arrayResult.setResult(resultList);
        } else if (arrayInput.getWhat().equals("double")) {
            ArrayList<Integer> resultList = new ArrayList<>();
            for (int numbers : arrayInput.getNumbers()) {
                numbers = numbers * 2;
                resultList.add(numbers);
            }
            arrayResult.setResult(resultList);
        } else {
            arrayResult.setError("Please provide what to do with the numbers!");
        }
        return arrayResult;
    }

    public static class ArrayInput {
        String what;
        ArrayList<Integer> numbers;

        public ArrayInput(String what, ArrayList<Integer> numbers) {
            this.what = what;
            this.numbers = numbers;
        }

        public ArrayInput() {
        }

        public String getWhat() {
            return what;
        }

        public void setWhat(String what) {
            this.what = what;
        }

        public ArrayList<Integer> getNumbers() {
            return numbers;
        }

        public void setNumbers(ArrayList<Integer> numbers) {
            this.numbers = numbers;
        }
    }

    public static class ArrayResult {

        private ArrayList<Integer> result;
        private String error;


        public ArrayResult() {
        }

        public ArrayList<Integer> getResult() {
            return result;
        }

        public void setResult(ArrayList result) {
            this.result = result;
        }

        public String getError() {
            return error;
        }

        public void setError(String error) {
            this.error = error;
        }

    }
}
