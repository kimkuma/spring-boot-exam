package com.kuma.springboot;

public class Solution7 {
    public int solution(int num, int[] mark) {
        if (mark[0] == 0) {
            return 0;
        }

        int[] marked1 = new int[mark.length];
        int[] marked2 = new int[mark.length];

        int detectFirst = 0;
        int detectSecond = 0;

        int answer = 0;
        marked1[0] = 1;

        for (int i = 1 ; i <= (mark.length * 3) ; i++) {
            if (i > num) {
                return answer;
            }

            answer = mark[answer];

            if (detectFirst > 0) {
                // marked2
                if (marked2[answer] == 1) {
                    detectSecond = i;
                    break;
                }
                marked2[answer] = 1;
            } else {
                // marked1
                if (marked1[answer] == 1) {
                    marked2[answer] = 1;
                    detectFirst = i;
                } else {
                    marked1[answer] = 1;
                }
            }
        }

//        System.out.println("d1=" + detectFirst);
//        System.out.println("d2=" + detectSecond);

        int x = detectSecond - detectFirst;

        if (x == 1) {
            return answer;
        }

        int nnum = (num - detectSecond) % x;

        for (int i = 0 ; i < nnum  ; i++) {
            answer = mark[answer];
        }

        return answer;
    }

    public static void main(String args[]) {
        Solution7 s = new Solution7();

        System.out.println(s.solution(3, new int[]{1,2,3,1}));
        System.out.println(s.solution(5, new int[]{1,2,3,1}));

        System.out.println(s.solution(3, new int[]{0,2,3,1}));
        System.out.println(s.solution(6, new int[]{1,2,3,1}));
        System.out.println(s.solution(9, new int[]{1,2,3,1}));
        System.out.println(s.solution(11, new int[]{1,2,3,1}));
        System.out.println(s.solution(9, new int[]{1,2,3,0}));
        System.out.println(s.solution(12, new int[]{1,2,3,0}));
        System.out.println(s.solution(12, new int[]{1,2,3,3}));
        System.out.println(s.solution(2000000000, new int[]{1,2,3,0}));
        System.out.println(s.solution(2000000000, new int[]{1,2,3,1}));
    }
}

