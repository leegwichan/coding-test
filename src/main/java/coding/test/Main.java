package coding.test;

import java.io.*;
import java.util.*;

public class Main {

    private static final BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer ST;

    public static void main(String[] args) {
        
    }

    private static int[] inputInts() {
        ST = new StringTokenizer(inputLine());
        int count = ST.countTokens();
        int[] ints = new int[count];
        for (int i = 0; i < count; i++) {
            ints[i] = Integer.parseInt(ST.nextToken());
        }
        return ints;
    }

    private static long[] inputLongs() {
        ST = new StringTokenizer(inputLine());
        int count = ST.countTokens();
        long[] ints = new long[count];
        for (int i = 0; i < count; i++) {
            ints[i] = Integer.parseInt(ST.nextToken());
        }
        return ints;
    }

    private static int inputInt() {
        return Integer.parseInt(inputLine());
    }

    private static long inputLong() {
        return Long.parseLong(inputLine());
    }

    private static String[] inputStrings() {
        return inputLine().split(" ");
    }

    private static String inputLine() {
        try {
            return BR.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void println(Object o) {
        System.out.println(o);
    }

    private static void print(Object o) {
        System.out.print(o);
    }
}
