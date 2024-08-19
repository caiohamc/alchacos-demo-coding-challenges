package br.com.alchacos.codingchallenges.service;

import org.springframework.stereotype.Service;

@Service
public class Challenge003ReverseStringService {

    public String execute() {
        String hello = "Hello";

        String helloRevertedWithStringBuilder = this.revertWithStringBuilder(hello);
        String helloRevertedManually = this.revertManually(hello);

        if (helloRevertedWithStringBuilder.equals(helloRevertedManually))
            return "Original (Hello) | Reverted (" + helloRevertedManually + ")";

        return null;
    }

    private String revertWithStringBuilder(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    private String revertManually(String input) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i=input.length() -1; i>=0; i--)
            stringBuilder.append(input.charAt(i));

        return stringBuilder.toString();
    }
}