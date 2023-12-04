import java.util.*;
import java.io.*;
// import java.util.stream.IntStream;

class Solution {
    public double solution(int[] arr) {
        // int sum = IntStream.of(arr).sum();
        // return (double)(sum)/arr.length;
        
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum += arr[i];
        }
        return (double)(sum) / arr.length;
    }
}