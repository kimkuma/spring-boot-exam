package com.kuma.springboot;

public class Solution2 {
    public static boolean solution(int n) {
        boolean answer = true;

        String[] s = String.valueOf(n).split("");
        int sLength = s.length;

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < sLength; i++) {
            sb.append(s[sLength - i - 1]);
        }

        if(n != Integer.parseInt(sb.toString())) {
            answer = false;
        }

        return answer;


//
//        public boolean solution(int n) {
//            boolean answer = true;
//
//            String s = String.valueOf(n);
//            int sLength = s.length() - 1;
//            int hLength = s.length() / 2;
//
//            for(int i = 0; i < hLength; i++) {
//                if(s.charAt(i) != s.charAt(sLength - i)) {
//                    return false;
//                }
//            }
//
//            return answer;
//        }

    }

    public static void main(String[] args) {
        System.out.println(solution(21453));

    }

}

//
//    문제 설명
//    앞뒤를 뒤집어도 똑같은 문자를 palindrome(팰린드롬)이라고 합니다. 예를 들어 12321은 팰린드롬이며, 21453은 팰린드롬이 아닙니다.
//
//        자연수 n이 매개변수로 주어질 때, n이 팰린드롬이면 true를, 아니면 false를 반환하도록 함수 solution 을 완성하세요.
//
//        제한사항
//        n은 231 - 1 보다 작거나 같은 자연수입니다.
//        입출력 예
//        n	result
//        12321	true
//        21453	false
//        입출력 예 설명
//        입출력 예 #1
//        12321을 뒤집으면 12321이 되어 팰린드롬입니다.
//
//        입출력 예 #2
//        21453을 뒤집으면 35412가 되어 팰린드롬이 아닙니다.