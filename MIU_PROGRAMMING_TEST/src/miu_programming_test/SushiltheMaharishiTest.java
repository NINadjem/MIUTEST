package miu_programming_test;

import java.lang.Math;
import static miu_programming_test.OtherTests.isPerfectSquare;

public class SushiltheMaharishiTest {

    public static int nextPerfectSquare(int n) {
        if (n < 0) {
            return 0;
        }
        return (int) Math.pow((int) (Math.sqrt(n)) + 1, 2);
    }

    public static void test_nextPerfectSquare() {
        System.out.println(nextPerfectSquare(6));
        System.out.println("expected value =9");
        System.out.println(nextPerfectSquare(36));
        System.out.println("expected value =49");
        System.out.println(nextPerfectSquare(0));
        System.out.println("expected value =1");
        System.out.println(nextPerfectSquare(-5));
        System.out.println("expected value =0");
        System.out.println(nextPerfectSquare(2));
        System.out.println("expected value =4");
        System.out.println(nextPerfectSquare(16));
        System.out.println("expected value =25");

    }

    public static int nUpCount(int[] a, int n) {
        if (a == null || a.length == 0) {
            return -1;
        }
        int sum = a[0];
        int number = 0;
        if (sum >= n) {
            number++;
        }
        for (int i = 1; i < a.length; i++) {
            int currentSum = sum + a[i];
            if (currentSum > n && sum <= n) {
                number++;
            }
            sum = currentSum;
        }
        return number;
    }

    public static void test_nUpCount() {
        int[] array = new int[]{2, 3, 1, -6, 8, -3, -1, 2};
        int n = 5;
        System.out.println(nUpCount(array, n));
        System.out.println("expected value =3");
        array = new int[]{2, -3, 1, -6, -8, -3, -1, 2};
        n = 2;
        System.out.println(nUpCount(array, n));
        System.out.println("expected value =1");
        array = new int[]{2, -3, 1, -6, 8, 3, -1, 2};
        n = 20;
        System.out.println(nUpCount(array, n));
        System.out.println("expected value =0");
        array = new int[]{2, -2, 1, -1, -8, 8, -4, 4};
        n = 0;
        System.out.println(nUpCount(array, n));
        System.out.println("expected value =2");
        array = new int[]{0, 2, -1, 2};
        n = 1;
        System.out.println(nUpCount(array, n));
        System.out.println("expected value =2");

    }

    public static int primeCount(int start, int end) {
        if (start > end || end <= 0) {
            return 0;
        }
        if (start < 0) {
            start = 0;
        }
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (i > 1) {
                boolean isPrime = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void test_primeCount() {
        System.out.println(primeCount(10, 30));
        System.out.println("expected value =6");
        System.out.println(primeCount(11, 29));
        System.out.println("expected value =6");
        System.out.println(primeCount(20, 22));
        System.out.println("expected value =0");
        System.out.println(primeCount(1, 1));
        System.out.println("expected value =0");
        System.out.println(primeCount(5, 5));
        System.out.println("expected value =1");
        System.out.println(primeCount(6, 2));
        System.out.println("expected value =0");
        System.out.println(primeCount(-10, 6));
        System.out.println("expected value =0");
    }

    public static int isFibonacci(int n) {
        if (n < 1) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        int a = 2, b = 1, sum = 0;
        while (sum < n) {
            sum = a + b;
            if (sum == n) {
                return 1;
            }
            b = a;
            a = sum;
        }
        return 0;
    }

    public static void test_isFibonacci() {
        System.out.println(isFibonacci(1));
        System.out.println("expected value =1");
        System.out.println(isFibonacci(0));
        System.out.println("expected value =0");
        System.out.println(isFibonacci(2));
        System.out.println("expected value =1");
        System.out.println(isFibonacci(-5));
        System.out.println("expected value =0");
        System.out.println(isFibonacci(5));
        System.out.println("expected value =1");
        System.out.println(isFibonacci(4));
        System.out.println("expected value =0");
        System.out.println(isFibonacci(8));
        System.out.println("expected value =1");
        System.out.println(isFibonacci(1));
        System.out.println("expected value =1");
    }

    public static int isMahdav(int[] a) {
        if (a == null || a.length < 3) {
            return 0;
        }
        //testing if a.length==n*(n+1)/2
        if (a.length != 3) {
            int l = 0;
            for (int n = 3; l < a.length; n++) {
                l = n * (n + 1) / 2;
            }
            if (l != a.length) {
                return 0;
            }
        }
        // testing the mahdav property
        int value = a[0];
        for (int i = 1, j = 1; i + j < a.length; j++, i += j) {
            int sum = 0;
            for (int k = 0; k <= j; k++) {
                sum += a[i + k];
            }
            if (sum != value) {
                return 0;
            }
        }
        return 1;
    }

    public static void test_isMahdav() {
        int[] array = new int[]{2, 1, 1};
        System.out.println(isMahdav(array));
        System.out.println("expected value =1");
        array = new int[]{2, 1, 1, 4, -1, -1};
        System.out.println(isMahdav(array));
        System.out.println("expected value =1");
        array = new int[]{6, 2, 4, 2, 2, 2, 1, 5, 0, 0};
        System.out.println(isMahdav(array));
        System.out.println("expected value =1");
        array = new int[]{18, 9, 10, 6, 6, 6};
        System.out.println(isMahdav(array));
        System.out.println("expected value =0");
        array = new int[]{-6, -3, -3, 8, -5, -4};
        System.out.println(isMahdav(array));
        System.out.println("expectedvalue =0");
        array = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, -2, -1};
        System.out.println(isMahdav(array));
        System.out.println("expected value =1");
        array = new int[]{3, 1, 2, 3, 0};
        System.out.println(isMahdav(array));
        System.out.println("expected value =0");
        array = new int[]{0, 0, 0};
        System.out.println(isMahdav(array));
        System.out.println("expected value =1");
        array = new int[]{2, 2, -1};
        System.out.println(isMahdav(array));
        System.out.println("expected value =0");

    }

    public static int isInertial(int[] a) {
        if (a == null || a.length <= 1) {
            return 0;
        }
        int count = 0;//condition1
        int max = a[0];//condition2
        int min_odd = Integer.MAX_VALUE, max_even = Integer.MIN_VALUE;//condition3
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                if (max % 2 == 0) {
                    max_even = max;
                }
                max = a[i];
            }
            if (a[i] % 2 != 0) {
                count++;
                if (min_odd > a[i]) {
                    min_odd = a[i];
                }
            } else if (max_even < a[i] && a[i] != max) {
                max_even = a[i];
            }
        }
        System.out.println("max even=" + max_even);
        if (count == 0 || max % 2 != 0 || (max_even != Integer.MIN_VALUE && min_odd <= max_even)) {
            return 0;
        }
        return 1;
    }

    public static void test_isInertial() {
        int[] array = new int[]{1};
        System.out.println(isInertial(array));
        System.out.println("expected value =0");
        array = new int[]{2};
        System.out.println(isInertial(array));
        System.out.println("expected value =0");
        array = new int[]{1, 2, 3, 4};
        System.out.println(isInertial(array));
        System.out.println("expected value =0");
        array = new int[]{1, 1, 1, 1, 1, 1, 2};
        System.out.println(isInertial(array));
        System.out.println("expected value =1");
        array = new int[]{2, 12, 4, 6, 8, 11};
        System.out.println(isInertial(array));
        System.out.println("expectedvalue =1");
        array = new int[]{2, 12, 12, 4, 6, 8, 11};
        System.out.println(isInertial(array));
        System.out.println("expected value =1");
        array = new int[]{-2, -4, -6, -8, -11};
        System.out.println(isInertial(array));
        System.out.println("expected value =0");
        array = new int[]{2, 3, 5, 7};
        System.out.println(isInertial(array));
        System.out.println("expected value =0");
        array = new int[]{2, 4, 6, 8, 10};
        System.out.println(isInertial(array));
        System.out.println("expected value =0");
    }

    public static int countSquarePairs(int[] a) {
        if (a == null || a.length < 2) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > 0 && a[j] > 0 && a[i] != a[j] && isPerfectSquare(a[i] + a[j])) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void test_countSquarePairs() {
        int[] array = new int[]{9, 0, 2, -5, 7};
        System.out.println(countSquarePairs(array));
        System.out.println("expected value =2");
        array = new int[]{9};
        System.out.println(countSquarePairs(array));
        System.out.println("expected value =0");
        array = new int[]{9, -5};
        System.out.println(countSquarePairs(array));
        System.out.println("expected value =0");
        array = new int[]{2, 2, 7, 3, 1, 15, 13};
        System.out.println(countSquarePairs(array));
        System.out.println("expected value =5");
    }

    public static int findTheFirstPrimeNumberGreaterThan(int n) {
        int firstPrime = n + 1;
        int number = n + 1;
        boolean isTheSecond = false;
        while (true) {
            if (isPrime(number)) {
                if (number % 10 == 9) {
                    if (isTheSecond) {
                        return firstPrime;
                    }
                    isTheSecond = true;
                    firstPrime = number;
                } else {
                    isTheSecond = false;
                }
            }
            number++;
        }
    }

    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void test_isPrime() {
        System.out.println(isPrime(2));
        System.out.println("expected value =true");
        System.out.println(isPrime(7));
        System.out.println("expected value =true");
        System.out.println(isPrime(4));
        System.out.println("expected value =false");
        System.out.println(isPrime(9));
        System.out.println("expected value =false");
        System.out.println(isPrime(13));
        System.out.println("expectedvalue =true");
        System.out.println(isPrime(10));
        System.out.println("expected value =false");
        System.out.println(isPrime(6));
        System.out.println("expected value =false");
        System.out.println(isPrime(3));
        System.out.println("expected value =true");
        System.out.println(isPrime(-4));
        System.out.println("expected value =false");
        System.out.println(isPrime(-40));
        System.out.println("expected value =false");
        System.out.println(isPrime(17));
        System.out.println("expected value =true");

    }

    public static void test_findTheFirstPrimeNumberGreaterThan() {
        System.out.println(findTheFirstPrimeNumberGreaterThan(0));
        System.out.println("expected value =139");
        System.out.println(findTheFirstPrimeNumberGreaterThan(138));
        System.out.println("expected value =139");
    }

    public static int isGuthrieSequence(int[] a) {
        if (a == null || a.length == 0 || a[a.length - 1] != 1) {
            return 0;
        }
        int n = a[0];
        for (int i = 1; i < a.length; i++) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = n * 3 + 1;
            }
            if (n != a[i]) {
                return 0;
            }
        }
        return 1;
    }

    public static void test_isGuthrieSequence() {
        int[] array = new int[]{1};
        System.out.println(isGuthrieSequence(array));
        System.out.println("expected value =1");
        array = new int[]{2};
        System.out.println(isGuthrieSequence(array));
        System.out.println("expected value =0");
        array = new int[]{8, 4, 2, 1};
        System.out.println(isGuthrieSequence(array));
        System.out.println("expected value =1");
        array = new int[]{8, 17, 4, 1};
        System.out.println(isGuthrieSequence(array));
        System.out.println("expected value =0");
        array = new int[]{8, 4, 1};
        System.out.println(isGuthrieSequence(array));
        System.out.println("expectedvalue =0");
        array = new int[]{8, 4, 2};
        System.out.println(isGuthrieSequence(array));
        System.out.println("expected value =0");
        array = new int[]{7, 22, 11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1};
        System.out.println(isGuthrieSequence(array));
        System.out.println("expected value =1");
        array = new int[]{10, 5, 16, 8, 4, 2, 1};
        System.out.println(isGuthrieSequence(array));
        System.out.println("expected value =1");
        array = new int[]{2, 1};
        System.out.println(isGuthrieSequence(array));
        System.out.println("expected value =1");
    }

    public static int stantonMeasure(int[] a) {
        if (a == null || a.length == 0) {
            return 0;
        }
        int n = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                n++;
            }
        }
        int s = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == n) {
                s++;
            }
        }
        return s;
    }

    public static void test_stantonMeasure() {
        int[] array = new int[]{1};
        System.out.println(stantonMeasure(array));
        System.out.println("expected value =1");
        array = new int[]{2};
        System.out.println(stantonMeasure(array));
        System.out.println("expected value =0");
        array = new int[]{0};
        System.out.println(stantonMeasure(array));
        System.out.println("expected value =1");
        array = new int[]{3, 1, 1, 4};
        System.out.println(stantonMeasure(array));
        System.out.println("expected value =0");
        array = new int[]{8, 4, 1, 1};
        System.out.println(stantonMeasure(array));
        System.out.println("expectedvalue =0");
        array = new int[]{1, 3, 1, 1, 3, 3, 2, 3, 3, 3, 4};
        System.out.println(stantonMeasure(array));
        System.out.println("expected value =6");
        array = new int[]{};
        System.out.println(stantonMeasure(array));
        System.out.println("expected value =0");
        array = new int[]{10, 5, 16, 8, 4, 2, 1};
        System.out.println(stantonMeasure(array));
        System.out.println("expected value =1");
        array = new int[]{2, 1, 1, 1, 1, 4};
        System.out.println(stantonMeasure(array));
        System.out.println("expected value =1");
    }

    public static int guthrieIndex(int n) {
        if (n <= 1) {
            return 0;
        }
        int count = 0;
        int temp = n;
        while (temp != 1) {
            count++;
            if (temp % 2 == 0) {
                temp /= 2;
            } else {
                temp = temp * 3 + 1;
            }
        }
        return count;
    }

    public static void test_guthrieIndex() {
        System.out.println(guthrieIndex(1));
        System.out.println("expected value =0");
        System.out.println(guthrieIndex(0));
        System.out.println("expected value =0");
        System.out.println(guthrieIndex(2));
        System.out.println("expected value =1");
        System.out.println(guthrieIndex(-5));
        System.out.println("expected value =0");
        System.out.println(guthrieIndex(3));
        System.out.println("expected value =7");
        System.out.println(guthrieIndex(4));
        System.out.println("expected value =2");
        System.out.println(guthrieIndex(42));
        System.out.println("expected value =8");
        System.out.println(guthrieIndex(7));
        System.out.println("expected value =16");
    }

    public static int[] solve10() {
        int[] result = new int[]{0, 0};
        int fact10 = 10;
        for (int i = 1; i < 10; i++) {
            fact10 *= i;
        }
        for (int x = 2; x < 9; x++) {
            int factx = x;
            for (int i = 2; i < x; i++) {
                factx *= i;
            }
            for (int y = x + 1; y < 10; y++) {
                int facty = y;
                for (int i = 2; i < y; i++) {
                    facty *= i;
                }
                if (factx + facty == fact10) {
                    result[0] = x;
                    result[1] = y;
                    System.out.println("x=" + x + " y=" + y);
                    return result;
                }
            }
        }
        System.out.println("x=" + result[0] + " y=" + result[1]);
        return result;
    }

    public static void test_solve10() {
        System.out.println(solve10());
    }

    public static int repsEqual(int[] a, int n) {
        if (a == null || a.length == 0) return 0;
        int temp = n;
        if (n < 0) temp *= -1;
        int start = 0;
        while (start != a.length - 1 && a[start] == 0) start++;
        int currentIndex = a.length;
        do {
            int digit = temp % 10;
            if (digit != a[--currentIndex]) {
                return 0;
            }
            temp /= 10;
        }while (temp != 0 && currentIndex >start);
        if (temp == 0 && currentIndex == start) return 1;
        return 0;
    }

    public static void test_repsEqual() {
        int[] array = new int[]{2, 3, 1, 8, 2};
        int n = 23182;
        System.out.println(repsEqual(array, n));
        System.out.println("expected value =1");
        array = new int[]{2, -3};
        n = 23;
        System.out.println(repsEqual(array, n));
        System.out.println("expected value =0");
        array = new int[]{2, 3};
        n = -23;
        System.out.println(repsEqual(array, n));
        System.out.println("expected value =1");
        array = new int[]{0, 0, 0, 0, 0, 0, 4, 0, 5, 2, 3};
        n = 40523;
        System.out.println(repsEqual(array, n));
        System.out.println("expected value =1");
        array = new int[]{0, 0, 0, 0, 0};
        n = 0;
        System.out.println(repsEqual(array, n));
        System.out.println("expected value =1");
        array = new int[]{3, 2, 0, 5, 3};
        n = 32053;
        System.out.println(repsEqual(array, n));
        System.out.println("expected value =1");
        array = new int[]{3, 2, 0, 5};
        n = 32053;
        System.out.println(repsEqual(array, n));
        System.out.println("expected value =0");
        array = new int[]{2, 3, 0, 5, 3};
        n = 32053;
        System.out.println(repsEqual(array, n));
        System.out.println("expected value =0");
        array = new int[]{9, 3, 1, 1, 2};
        n = 32053;
        System.out.println(repsEqual(array, n));
        System.out.println("expected value =0");
        array = new int[]{3, 2, 0, 5, 3, 4};
        n = 32053;
        System.out.println(repsEqual(array, n));
        System.out.println("expected value =0");
        array = new int[]{0, 3, 2, 0, 5, 3};
        n = 32053;
        System.out.println(repsEqual(array, n));
        System.out.println("expected value =1");
        array = new int[]{5, 3};
        n = 32053;
        System.out.println(repsEqual(array, n));
        System.out.println("expected value =0");

    }

    public static int isCentered15(int[] a) {
        if (a == null || a.length == 0) {
            return 0;
        }
        int mid = a.length / 2;
        int sum = a[mid];
        int index = mid - 1;
        if (a.length % 2 == 0) {
            sum += a[mid - 1];
            index--;
        }
        if (sum == 15) {
            return 1;
        }
        for (int i = index; i >= 0; i--) {
            sum += a[i] + a[a.length - 1 - i];
            if (sum == 15) {
                return 1;
            }
        }
        return 0;
    }

    public static void test_isCentered15() {
        int[] array = new int[]{3, 2, 10, 4, 1, 6, 9};
        System.out.println(isCentered15(array));
        System.out.println("expected value =1");
        array = new int[]{2, 10, 4, 1, 6, 9};
        System.out.println(isCentered15(array));
        System.out.println("expected value =0");
        array = new int[]{3, 2, 10, 4, 1, 6};
        System.out.println(isCentered15(array));
        System.out.println("expected value =0");
        array = new int[]{1, 1, 8, 3, 1, 1};
        System.out.println(isCentered15(array));
        System.out.println("expected value =1");
        array = new int[]{15};
        System.out.println(isCentered15(array));
        System.out.println("expectedvalue =1");
        array = new int[]{9, 15, 6};
        System.out.println(isCentered15(array));
        System.out.println("expected value =1");
        array = new int[]{1, 1, 2, 2, 1, 1};
        System.out.println(isCentered15(array));
        System.out.println("expected value =0");
        array = new int[]{1, 1, 15 - 1, -1};
        System.out.println(isCentered15(array));
        System.out.println("expectedvalue =1");
    }

    public static int henry(int first, int second) {
        int sum = 0;
        int count = 0;
        int f = first, s = second;
        if (first > second) {
            f = second;
            s = first;
        }
        int number = 1;
        while (count < s) {
            int sum_number = 0;
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    sum_number += i;
                }
            }
            if (sum_number == number) {
                count++;
                if (count == f || count == s) {
                    sum += number;
                }
            }
            number++;
        }
        return sum;
    }
    
    public static void test_henry(){
        System.out.println(henry(1, 3));
        System.out.println("expected value =502");
        System.out.println(henry(2, 1));
        System.out.println("expected value =34");
        System.out.println(henry(1, 2));
        System.out.println("expected value =34");
        System.out.println(henry(2, 3));
        System.out.println("expected value =524");
    }
    
    public static int isDivisible(int[] a, int n){
        if(a==null) return 0;
        if(a.length==0) return 1;
        for(int i=0;i<a.length;i++) if(a[i]%n!=0) return 0;
        return 1;
    }
    
    public static void test_isDivisible(){
        int[] array = new int[]{2, 3, 1, 8, 2};
        int n = 1;
        System.out.println(isDivisible(array, n));
        System.out.println("expected value =1");
        array = new int[]{2, -3};
        n = 23;
        System.out.println(isDivisible(array, n));
        System.out.println("expected value =0");
        array = new int[]{2, 4,6,8,16};
        n = 2;
        System.out.println(isDivisible(array, n));
        System.out.println("expected value =1");
        array = new int[]{0, 0, 0, 0, 0, 0, 40, 0, 5, 30, 10};
        n = 5;
        System.out.println(isDivisible(array, n));
        System.out.println("expected value =1");
        array = new int[]{0, 0, 0, 0, 0};
        n = 2;
        System.out.println(isDivisible(array, n));
        System.out.println("expected value =1");
        array = new int[]{};
        n = 32053;
        System.out.println(isDivisible(array, n));
        System.out.println("expected value =1");
        array = new int[]{3, 2, 0, 5};
        n = 32053;
        System.out.println(isDivisible(array, n));
        System.out.println("expected value =0");
        array = new int[]{3, 3, 6, 36};
        n = 3;
        System.out.println(isDivisible(array, n));
        System.out.println("expected value =1");
        array = new int[]{4};
        n = 2;
        System.out.println(isDivisible(array, n));
        System.out.println("expected value =1");
        array = new int[]{3, 4, 3, 6, 36};
        n = 3;
        System.out.println(isDivisible(array, n));
        System.out.println("expected value =0");
        array = new int[]{6, 12, 24, 36};
        n = 12;
        System.out.println(isDivisible(array, n));
        System.out.println("expected value =0");
        
    }

    public static int isNunique(int[] a,int n){
        if(a==null||a.length<2) return 0;
        int count=0;
        for(int i=0;i<a.length-1;i++)
            for(int j=i+1;j<a.length;j++) 
                if(a[i]+a[j]==n){
                    count++;
                    if(count==2)return 0;
                }
        if(count==0) return 0;
        return 1;
    }
    
    public static void test_isNunique(){
       int[] array = new int[]{7, 3, 3, 2, 4};
        int n = 6;
        System.out.println(isNunique(array, n));
        System.out.println("expected value =0");
        array = new int[]{7, 3, 3, 2, 4};
        n = 10;
        System.out.println(isNunique(array, n));
        System.out.println("expected value =0");
        array = new int[]{7, 3, 3, 2, 4};
        n = 11;
        System.out.println(isNunique(array, n));
        System.out.println("expected value =1");
        array = new int[]{7, 3, 3, 2, 4};
        n = 8;
        System.out.println(isNunique(array, n));
        System.out.println("expected value =0");
        array = new int[]{};
        n = 2;
        System.out.println(isNunique(array, n));
        System.out.println("expected value =0");
        array = new int[]{1};
        n = 32053;
        System.out.println(isNunique(array, n));
        System.out.println("expected value =0");
        array = new int[]{7, 3, 3, 2, 4};
        n = 4;
        System.out.println(isNunique(array, n));
        System.out.println("expected value =0"); 
     }
    
    public static int isSquare(int n){
     if(n<0) return 0;
        for (int i = 0; i <= n; i++) 
            if(i*i==n)return 1;
     return 0;   
    }
    
    public static void test_isSquare(){
      System.out.println(isSquare(4));
        System.out.println("expected value =1");
        System.out.println(isSquare(0));
        System.out.println("expected value =1");
        System.out.println(isSquare(2));
        System.out.println("expected value =0");
        System.out.println(isSquare(-5));
        System.out.println("expected value =0");
        System.out.println(isSquare(5));
        System.out.println("expected value =0");
        System.out.println(isSquare(16));
        System.out.println("expected value =1");
        System.out.println(isSquare(8));
        System.out.println("expected value =0");
        System.out.println(isFibonacci(1));
        System.out.println("expected value =1");  
    }
    
    public static int isLegalNumber(int[] a, int base){
        if(a==null||a.length==0|| base<2) return 0;
        for (int i = 0; i < a.length; i++) 
            if(a[i]>=base) return 0;
        return 1;
    }
    
    public static void test_isLegalNumber(){
       int[] array = new int[]{7, 3, 3, 2, 4};
        int n = 6;
        System.out.println(isLegalNumber(array, n));
        System.out.println("expected value =0");
        array = new int[]{7, 3, 3, 2, 4};
        n = 10;
        System.out.println(isLegalNumber(array, n));
        System.out.println("expected value =1");
        array = new int[]{7, 3, 3, 2, 4};
        n = 11;
        System.out.println(isLegalNumber(array, n));
        System.out.println("expected value =1");
        array = new int[]{7, 3, 3, 2, 4};
        n = 8;
        System.out.println(isLegalNumber(array, n));
        System.out.println("expected value =1");
        array = new int[]{};
        n = 2;
        System.out.println(isLegalNumber(array, n));
        System.out.println("expected value =0");
        array = new int[]{1};
        n = 32053;
        System.out.println(isLegalNumber(array, n));
        System.out.println("expected value =1");
        array = new int[]{7, 3, 3, 2, 4};
        n = 4;
        System.out.println(isLegalNumber(array, n));
        System.out.println("expected value =0"); 
    }
    
    public static int convertToBase10(int[] a, int base){
        if(isLegalNumber(a, base)!=1) return 0;
        int result=0;
        for(int i=a.length-1,j=0;i>=0;i--,j++)
            result+=a[i]*((int)Math.pow(base, j));
        return result;
    }
    
    public static void test_convertToBase10(){
        int[] array = new int[]{1, 0, 1, 1};
        int n = 2;
        System.out.println(convertToBase10(array, n));
        System.out.println("expected value =11");
        array = new int[]{1,1,2};
        n = 3;
        System.out.println(convertToBase10(array, n));
        System.out.println("expected value =14");
        array = new int[]{3,2,5};
        n = 8;
        System.out.println(convertToBase10(array, n));
        System.out.println("expected value =213");
        array = new int[]{3, 7, 1};
        n = 6;
        System.out.println(convertToBase10(array, n));
        System.out.println("expected value =0");
    }
    
    public static int depth(int n){
        if(n==0) return 0;
        int[] digits=new int[]{0,0,0,0,0,0,0,0,0,0,};
        int count=0,i=1,number=n;
        if(n<0)number*=-1;
        while(count<10){
         int t=number*i++;
         while(t!=0){
             int digit=t%10;
             if(digits[digit]==0){
                 count++;
                 digits[digit]=1;
             }
             t/=10;
         }
        }
        return i-1;
    }
    
    public static void test_depth(){
        System.out.println(depth(25));
    }
    
    public static int matches(int a[], int p[]){
     if(a==null||p==null||a.length==0||p.length==0) return 0;
     // verifiying the propory
     int s=0;
     for(int i=0; i<p.length;i++){
         if(p[i]==0)return 0;
         int l=p[i];
         if(l<0)l*=-1;
         s+=l;
     }
     if(s!=a.length)return 0;
     int n=0;
     for(int i=0,k=0;i<p.length;k+=n,i++){
         n=p[i];
         if(n<0) n*=-1;
         for(int j=0; j<n; j++) if(p[i]*a[k+j]<0)return 0;
     }
     return 1;   
    }
    
    public static void test_matches(){
      int[] a = new int[]{1, 2, 3, -5, -5, 2, 3, 18};
      int[] p = new int[]{3, -2, 3};
      System.out.println(matches(a,p));
      System.out.println("expected value =1");  
      a = new int[]{1, 2, 3, -5, -5, 2, 3, 18};
      p = new int[]{2, 1, -1, -1, 2, 1};
      System.out.println(matches(a,p));
      System.out.println("expected value =1");
      a = new int[]{1, 2, 3, -5, -5, 2, 3, 18};
      p = new int[]{2, 1, -1, -1, 2,};
      System.out.println(matches(a,p));
      System.out.println("expected value =0"); 
      a = new int[]{1, 2, 3, -5, -5, 2, 3, 18};
      p = new int[]{2, 1, -1, -1, 0, 1};
      System.out.println(matches(a,p));
      System.out.println("expected value =0"); 
      a = new int[]{1, 2, 3, -5, -5, 2, 3, 18};
      p = new int[]{1, 2, -1, -1, -1, 0};
      System.out.println(matches(a,p));
      System.out.println("expected value =0"); 
      a = new int[]{1, 2, 3, -5, -5, 2, 3, 18};
      p = new int[]{1, 2, -1, -1, 1, 2};
      System.out.println(matches(a,p));
      System.out.println("expected value =1"); 
      a = new int[]{1, 2, 3, -5, -5, 2, 3, 18};
      p = new int[]{2, 1, -2, 3};
      System.out.println(matches(a,p));
      System.out.println("expected value =1"); 
      a = new int[]{1, 2, 3, -5, -5, 2, 3, 18};
      p = new int[]{2, 1, -1, -1, -2, 4};
      System.out.println(matches(a,p));
      System.out.println("expected value =0"); 
      a = new int[]{1, 2, 3, -5, -5, 2, 3, 18};
      p = new int[]{1, 1, 1, -1, -1, 1, 1, 1};
      System.out.println(matches(a,p));
      System.out.println("expected value =1");
      a = new int[]{1, 2, 3, -5, -5, 2, 3, 18};
      p = new int[]{8};
      System.out.println(matches(a,p));
      System.out.println("expected value =0"); 
      a = new int[]{1, 2, 3, -5, -5, 2, 3, 18};
      p = new int[]{2, -3, 3};
      System.out.println(matches(a,p));
      System.out.println("expected value =0"); 
      a = new int[]{1, 2, 3, -5, -5, 2, 3, 18};
      p = new int[]{4, -1, 3};
      System.out.println(matches(a,p));
      System.out.println("expected value =0"); 
      
    }
    
    public static int isStacked(int n){
        if(n<=0) return 0;
        int l=0;
        for(int i=1;l<n;i++) l+=i;
        if(l!=n) return 0;
        return 1;}
    
    public static void test_isStacked(){
        System.out.println(isStacked(-1));
        System.out.println("expected value =0"); 
        System.out.println(isStacked(6));
        System.out.println("expected value =1"); 
        System.out.println(isStacked(3));
        System.out.println("expected value =1"); 
        System.out.println(isStacked(10));
        System.out.println("expected value =1"); 
        System.out.println(isStacked(7));
        System.out.println("expected value =0"); 
        System.out.println(isStacked(9));
        System.out.println("expected value =0"); 
    }
    
    public static int isSumSafe(int []a){
        if(a==null||a.length<=1)return 0;
        int sum=0;
        for(int i=0;i<a.length;i++) sum+=a[i];
        for(int i=0;i<a.length;i++) if(a[i]==sum) return 0;
        return 1;
    }
    
    public static void test_isSumSafe(){
        int[] array = new int[]{-1, 4,};
        System.out.println(isSumSafe(array));
        System.out.println("expected value =1");
        array = new int[]{5, -2, 1};
        System.out.println(isSumSafe(array));
        System.out.println("expected value =1");
        array = new int[]{5, -5, 0};
        System.out.println(isSumSafe(array));
        System.out.println("expected value =0");
        array = new int[]{5, -4, 0};
        System.out.println(isSumSafe(array));
        System.out.println("expected value =1");
        array = new int[]{1};
        System.out.println(isSumSafe(array));
        System.out.println("expected value =0");
        
    }
    
    public static int isIsolated(long n){
        if(n>2097151||n<1) return -1;
        if(n==1)return 0;
        long square=n*n;
        long cube=square*n;
        int[] cubeDigits=new int[10];
        for(int i=0;i<10;i++) cubeDigits[i]=0;
        while(cube!=0){
            int digit=(int)cube%10;
            cube/=10;
            if(cubeDigits[digit]==0) cubeDigits[digit]=1;
        }
        while(square!=0){
            int digit=(int)square%10;
            square/=10;
            if(cubeDigits[digit]==1) return 0;
        }
        return 1;
    }
    
    public static void test_isIsolated(){
        System.out.println(isIsolated(-1));
        System.out.println("expected value =-1"); 
        System.out.println(isIsolated(2));
        System.out.println("expected value =1"); 
        System.out.println(isIsolated(6));
        System.out.println("expected value =0"); 
        System.out.println(isIsolated(3));
        System.out.println("expected value =1"); 
        System.out.println(isIsolated(7));
        System.out.println("expected value =0"); 
        System.out.println(isIsolated(8));
        System.out.println("expected value =1"); 
        System.out.println(isIsolated(9));
        System.out.println("expected value =1"); 
        System.out.println(isIsolated(9));
        System.out.println("expected value =1"); 
        System.out.println(isIsolated(10));
        System.out.println("expected value =0"); 
        System.out.println(isIsolated(14));
        System.out.println("expected value =1"); 
        System.out.println(isIsolated(20));
        System.out.println("expected value =0"); 
        System.out.println(isIsolated(24));
        System.out.println("expected value =1"); 
        System.out.println(isIsolated(28));
        System.out.println("expected value =1"); 
        System.out.println(isIsolated(33));
        System.out.println("expected value =0"); 
        System.out.println(isIsolated(34));
        System.out.println("expected value =1"); 
        System.out.println(isIsolated(50));
        System.out.println("expected value =0");
        System.out.println(isIsolated(58));
        System.out.println("expected value =1"); 
        System.out.println(isIsolated(62));
        System.out.println("expected value =0");
        System.out.println(isIsolated(63));
        System.out.println("expected value =1"); 
        System.out.println(isIsolated(61));
        System.out.println("expected value =0");
    }
    
    public static int isVanila(int [] a){
        if(a==null) return 0;
        if(a.length==0) return 1;
        int digit=a[0]%10;
        if (digit<0) digit*=-1;
        for (int i = 0; i < a.length; i++) {
            int t = a[i];
            if(t<0) t*=-1;
            do{
                int d=t%10;
                t/=10;
                if(d!=digit) return 0;
            }while(t!=0);
        }
        return 1;
    }
    
    public static void test_isVanila(){
        int[] array = new int[]{1};
        System.out.println(isVanila(array));
        System.out.println("expected value =1");
        array = new int[]{11, 22, 13, 34, 125};
        System.out.println(isVanila(array));
        System.out.println("expected value =0");
        array = new int[]{9, 999, 99999, -9999};
        System.out.println(isVanila(array));
        System.out.println("expected value =1");
        array = new int[]{};
        System.out.println(isVanila(array));
        System.out.println("expected value =1");
        array = new int[]{15};
        System.out.println(isVanila(array));
        System.out.println("expectedvalue =0");
        array = new int[]{9, 15, 6};
        System.out.println(isVanila(array));
        System.out.println("expected value =0");
    }
    
    
    
    
}
