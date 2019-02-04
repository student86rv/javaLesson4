package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("Робот вернулся? " + roboLocator("URDLL"));
    }

    public static boolean roboLocator(String route) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < route.length(); i++) {
            switch (route.charAt(i)) {
                case 'R' :
                    x ++;
                    break;
                case 'L' :
                    x --;
                    break;
                case 'U' :
                    y ++;
                    break;
                case 'D' :
                    y --;
                default:
                    break;
            }
        }
        if (x == 0 && y == 0) {
            return true;
        }
        return false;
    }
}
