package br.com.alchacos.codingchallenges.service;

import org.springframework.stereotype.Service;

@Service
public class Challenge001FizBuzzService {

    public String execute() {
        String returnValue = "Return =";

        for (int i=1; i<=100; i++) {
            if(i%3 == 0 && i%5 == 0)
                returnValue = returnValue + " FizzBuzz" + " |";
            else if(i%3 == 0)
                returnValue = returnValue + " Fizz" + " |";
            else if(i%5 == 0)
                returnValue = returnValue + " Buzz" + " |";
            else
                returnValue = returnValue + " " + i + " |";
        }

        return returnValue;
    }
}