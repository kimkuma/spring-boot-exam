package com.kuma.springboot;

public class Solution4 {
    public boolean[] solution(String[] infos, String[] actions) {
        boolean[] answer = new boolean[actions.length];

        int state = 0;

        for (int i = 0 ; i < actions.length ; i++) {
            if (state == 0) {
                if (actions[i].length() > 5 && "LOGIN".equals(actions[i].substring(0, 5))) {
                    boolean loginok = false;

                    for (int j = 0;  j < infos.length; j++ ) {
                        if (infos[j].equals(actions[i].substring(6))) {
                            loginok = true;
                            break;
                        }
                    }

                    if (loginok) {
                        state = 1;
                        answer[i] = true;
                    }

                } else {
                    answer[i] = false;
                }
            } else if ( state == 1) {
                if (actions[i].length() > 3 && "ADD".equals(actions[i].substring(0, 3))) {
                    answer[i] = true;
                    state = 2;
                }
            } else {
                if (actions[i].length() > 3 && "ADD".equals(actions[i].substring(0, 3))) {
                    answer[i] = true;
                } else if (actions[i].length() == 5 && "ORDER".equals(actions[i])) {
                    answer[i] = true;
                    state = 1;
                }
            }
        }

        return answer;
    }
}
