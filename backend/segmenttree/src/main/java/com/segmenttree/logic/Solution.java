package com.segmenttree.logic;

import java.io.IOException;
import java.util.Scanner;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Solution {

//    public static void main(String[] args) {
//
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        String seq = in.next();
//        char[] S = seq.toCharArray();
//        int[] V = new int[S.length];
//        int open = 0;
//        int max = 0;
//        for (int i=0; i<S.length; i++) {
//            if (S[i] == '{') open++;
//            if (S[i] == '}' && open > 0) {
//                V[i] = 2 + V[i-1] + (i-2-V[i-1] > 0 ? V[i-2-V[i-1]] : 0);
//                open--;
//            }
//            if (V[i] > max) max = V[i];
//        }
//        int start = -1;
//        for(int i =0 ;i<V.length;i++){
//            if(V[i] == max){
//                start = i;
//            }
//
//        }
//        System.out.println(max);
//        System.out.print(start-max+2);
//        System.out.print(" ");
//        System.out.println(start+1);
//
//
//
//    }
//
    public static boolean isCapital(char c){
        if(c <= 'Z' && c >= 'A'){
            return true;
        }
        else return false;
    }
    public static boolean isNumeric(char c){
        if(c <= '9' && c >= '0'){
            return true;
        }
        else return false;
    }

    public static boolean isAny(char c){
        char[] A = {'A','B','C','F','G','H','L','J','P','T','K'};
        for(char p : A){
            if(c == p) return true;
        }
        return false;
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        int ans = 0;
        String text = in.nextLine();
        for(int i=0;i<text.length()-10;i++){
            if(isCapital(text.charAt(i))){
                if(isCapital(text.charAt(i+4))){
                    if(text.charAt(i) == text.charAt(i+4)){
                        int count = 0;
                        for(int j=1;j<=3;j++){
                            if(isCapital(text.charAt(i+j))){
                                count++;
                            }
                        }
                        if(count == 3){
                            for(int j=5;j<9;j++){
                                if(isNumeric(text.charAt(i+j))){
                                    count++;
                                }
                            }
                            if(count == 7 && isCapital(text.charAt(i+9)) && isAny(text.charAt(i+3))){
                                ans++;
                            }
                        }
                    }
                }
            }

        }
        System.out.println(ans);

    }


//
//        int V_SUM_MAX = 100000;
//        int N_MAX = 100;
//        int W_MAX = 1000000000;
//
//        // To store the states of DP
//        int dp[][] = new int[V_SUM_MAX + 1][N_MAX];
//        boolean v[][] = new boolean [V_SUM_MAX + 1][N_MAX];
//
//        // Function to solve the recurrence relation
//        public int solveDp(int r, int i, int w[],
//                           int val[], int n)
//        {
//            // Base cases
//            if (r <= 0)
//                return 0;
//
//            if (i == n)
//                return W_MAX;
//
//            if (v[r][i])
//                return dp[r][i];
//
//            // Marking state as solved
//            v[r][i] = true;
//
//            // Recurrence relation
//            dp[r][i] = Math.min(solveDp(r, i + 1, w, val, n),
//                    w[i] + solveDp(r - val[i],
//                            i + 1, w, val, n));
//
//            return dp[r][i];
//        }
//
//        // Function to return the maximum weight
//        public int maxWeight(int w[], int val[],
//                             int n, int c)
//        {
//
//            for (int i = V_SUM_MAX; i >= 0; i--)
//            {
//                if (solveDp(i, 0, w, val, n) <= c)
//                {
//                    return i;
//                }
//            }
//            return 0;
//        }
//
//        // Driver code
//        public static void main (String[] args)
//        {
//
//            Scanner in = new Scanner(System.in);
//            int N = in.nextInt();
//            int C = in.nextInt();
//            int w[] = new int[N];
//            int val[] = new int[N];
//            for(int i=0;i<N;i++){
//                w[i] = in.nextInt();
//                val[i] = in.nextInt();
//            }
//            int n = w.length;
//
//
//            System.out.println(new Solution().maxWeight(w, val, n, C));
//        }
//



}