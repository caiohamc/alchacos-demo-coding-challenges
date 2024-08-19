package br.com.alchacos.codingchallenges.controller;

import br.com.alchacos.codingchallenges.service.Challenge001FizBuzzService;
import br.com.alchacos.codingchallenges.service.Challenge002TwoSumService;
import br.com.alchacos.codingchallenges.service.Challenge003ReverseStringService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class CodingChallengesController {

    private final Challenge001FizBuzzService challenge001FizBuzzService;
    private final Challenge002TwoSumService challenge002TwoSumService;
    private final Challenge003ReverseStringService challenge003ReverseStringService;

    @GetMapping(value = "/fizzbuzz")
    public String fizzBuzz() {
        return this.challenge001FizBuzzService.execute();
    }

    @GetMapping(value = "/twosum")
    public String twoSum() {
        return this.challenge002TwoSumService.execute();
    }

    @GetMapping(value = "/reversestring")
    public String recerseString() {
        return this.challenge003ReverseStringService.execute();
    }

}