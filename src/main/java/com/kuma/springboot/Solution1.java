package com.kuma.springboot;

class Solution {
    public  String solution(String s1, String s2) {

        int minLength = s1.length() < s2.length() ? s1.length() : s2.length();

        String case1 = null;
        String case2 = null;

        for (int i = 1; i <= minLength; i++) {
            if (s2.startsWith(s1.substring(s1.length() - i))) {
                case1 = s1.substring(0, s1.length() - i) + s2;
            }
        }

        for (int i = 1; i <= minLength; i++) {
            if (s1.startsWith(s2.substring(s2.length() - i))) {
                case2 = s2.substring(0, s2.length() - i) + s1;
            }
        }

        if (case1 == null) {
            return case2;
        } else if (case2 == null) {
            return case1;
        }
          // 해당건은 사전적 순서를 늦게봐서
          else if (case1.length() == case2.length()) {
            if (case1.compareTo(case2) > 0) {
                return case2;
            } else {
                return case1;
            }
        } else if (case1.length() <= case2.length()) {
            return case1;
        } else {
            return case2;
        }
    }

    public static void main(String[] args) {
        Solution ss = new Solution();
        ss.solution("xyZA","ABCxy");
    }
}
