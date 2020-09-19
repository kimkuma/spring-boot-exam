package com.kuma.springboot;

public class Solution5 {
    public int[] solution(String logs) {
        int[] answer = new int[24];

        String[] log = logs.split("\n");

        for(String l : log) {
            int hour = (Integer.valueOf(l.substring(11, 13)) + 9) % 24;
            answer[hour] ++;
        }

        return answer;

    }
}
