import java.util.*;
class RomanToInt {  // LeetCode - EASY : "Roman to Int"
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("input roman number: ");
        String s = sc.nextLine();
        
        int count = 0;
        int arr[] = new int[s.length()+1];
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'I':
                    arr[i] = 1; break;
                case 'V':
                    arr[i] = 5; break;
                case 'X':
                    arr[i] = 10; break;
                case 'L':
                    arr[i] = 50; break;
                case 'C':
                    arr[i] = 100; break;
                case 'D':
                    arr[i] = 500; break;
                case 'M':
                    arr[i] = 1000; break;
            }
        }
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] >= arr[i+1]) {
                count = count + arr[i];
            } else {
                count = count - arr[i];
            }
        }
        System.out.println("integer: " + count);
        sc.close();
    }
}
