package br.com.alchacos.codingchallenges.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class Challenge002TwoSumService {

    public String execute() {
        int[] array = {2, 3, 7, 4, 8};
        int target = 7;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<array.length; i++) {
            int expected = target - array[i];

            if(map.containsKey(expected)) {
                var first = "First (Array Position=" + map.get(expected) + " Value=" + expected + ") | ";
                var second = "Second (Array Position=" + i + " Value=" + array[i] + ")";
                return "7 (target) = " + first + second;
            }

            map.put(array[i], i);
        }

        return null;
    }
}