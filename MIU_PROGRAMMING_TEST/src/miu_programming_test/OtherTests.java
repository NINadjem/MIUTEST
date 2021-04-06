package miu_programming_test;

public class OtherTests {

    public static boolean isSuper(int[] a) {
        if (a == null || a.length == 0) {
            return false;
        }
        int sum = a[0];
        for (int i = 1; i < a.length; i++) {
            if (sum > a[i]) {
                return false;
            }
            sum += a[i];
        }
        return true;
    }

    public static void test_isSuper() {
        int[] array = new int[]{2, 3, 6, 13};
        System.out.println(isSuper(array));
        System.out.println("expected value =true");
        array = new int[]{2, 3, 5, 11};
        System.out.println(isSuper(array));
        System.out.println("expected value =true");
        array = new int[]{1, 0, 3, 9};
        System.out.println(isSuper(array));
        System.out.println("expected value =false");
        array = new int[]{1, 2, 3, 4};
        System.out.println(isSuper(array));
        System.out.println("expected value =false");
        array = new int[]{10};
        System.out.println(isSuper(array));
        System.out.println("expectedvalue =true");
        array = new int[]{};
        System.out.println(isSuper(array));
        System.out.println("expected value =false");
        array = new int[]{1, 2, 0, 4, 5};
        System.out.println(isSuper(array));
        System.out.println("expected value =false");
        array = new int[]{4, 5};
        System.out.println(isSuper(array));
        System.out.println("expected value =true");
        array = new int[]{1, 2, 0,};
        System.out.println(isSuper(array));
        System.out.println("expected value =false");
    }

    public static int[] fill(int[] a, int k, int n) {
        if (a == null || a.length == 0 || k < 0 || n < 0 || k > a.length) {
            return null;
        }
        int[] result = new int[n];
        for (int i = 0; i < n; i = i + k) {
            for (int j = 0; j < k && j + i < n; j++) {
                result[i + j] = a[j];
                System.out.print(a[j] + " ");
            }
        }
        return result;
    }

    public static void test_fill() {
        int[] array = new int[]{1, 2, 3, 5, 9, 6, -1, 5, 1};
        int k = 3;
        int n = 10;
        System.out.println(fill(array, k, n));
        System.out.println("expected value =123123....");
        array = new int[]{1, 2, 3, 5, 9, 6, -1, 5, 1};
        k = 5;
        n = 10;
        System.out.println(fill(array, k, n));
        System.out.println("expected value =1235912359....");
        array = new int[]{1, 2, 3, 5};
        k = 2;
        n = 10;
        System.out.println(fill(array, k, n));
        System.out.println("expected value =1212....");
        array = new int[]{1, 2, 3, 5, 9, 6, -1, 5, 1};
        k = 1;
        n = 10;
        System.out.println(fill(array, k, n));
        System.out.println("expected value =111111....");
        array = new int[]{};
        k = 5;
        n = 10;
        System.out.println(fill(array, k, n));
        System.out.println("expected value =null");
        array = new int[]{1, 2, 3, 5, 9, 6, -1, 5, 1};
        k = -5;
        n = 10;
        System.out.println(fill(array, k, n));
        System.out.println("expected value =null");
        array = new int[]{1, 2, 3, 5, 9, 6, -1, 5, 1};
        k = 5;
        n = -10;
        System.out.println(fill(array, k, n));
        System.out.println("expected value =null");
        array = new int[]{1, 2, 3};
        k = 5;
        n = 10;
        System.out.println(fill(array, k, n));
        System.out.println("expected value =null");
        array = new int[]{1, 2, 3, 5, 9, 6, -1, 5, 1};
        k = 8;
        n = 5;
        System.out.println(fill(array, k, n));
        System.out.println("expected value =12359");
        array = new int[]{1, 2, 3, 5, 9, 6, -1, 5, 1};
        k = 15;
        n = 10;
        System.out.println(fill(array, k, n));
        System.out.println("expected value =null");

    }

    public static int isHollow(int[] a) {
        if (a == null || a.length < 3) return 0;
        int midIndex = a.length / 2;
        if (a[midIndex] != 0)return 0;
        int count = 1;
        int start = midIndex - 1;
        if (a.length % 2 == 0) {
            if (a[midIndex - 1] != 0) return 0;
            count=2;
            start--;
        }
        boolean hasFinishedWithZeros = false;
        for (int i = start; i >= 0; i--) {
            if (!hasFinishedWithZeros) {
                if (a[i] == 0 && a[a.length - 1 - i] == 0) {
                    count+=2;
                   // if (i == start && count < 3)return 0;
                } else {
                    hasFinishedWithZeros = true;
                    if (count<3 ||a[i] == 0 || a[a.length - 1 - i] == 0)return 0;
                }
            } else if (a[i] == 0 || a[a.length - 1 - i] == 0)return 0;
        }
        return 1;
    }
    
    public static void test_isHollow(){
        int[] array = new int[]{1,2,0,0,0,3,4};
        System.out.println(isHollow(array));
        System.out.println("expected value =1");
        array = new int[]{1,1,1,1,0,0,0,0,0,2,1,2,18};
        System.out.println(isHollow(array));
        System.out.println("expected value =1");
        array = new int[]{1, 2, 0, 0, 3, 4};
        System.out.println(isHollow(array));
        System.out.println("expected value =0");
        array = new int[]{1,2,0,0,0,3,4,5};
        System.out.println(isHollow(array));
        System.out.println("expected value =0");
        array = new int[]{3,8,3,0,0,0,3,3};
        System.out.println(isHollow(array));
        System.out.println("expectedvalue =0");
        array = new int[]{1,2,0,0,0,3,4,0};
        System.out.println(isHollow(array));
        System.out.println("expected value =0");
        array = new int[]{0,1,2,0,0,0,3,4};
        System.out.println(isHollow(array));
        System.out.println("expected value =0");
        array = new int[]{0,0,0};
        System.out.println(isHollow(array));
        System.out.println("expected value =1");
        array = new int[]{};
        System.out.println(isHollow(array));
        System.out.println("expected value =0");
    }
    
    static boolean isPerfectSquare(int n){
        if(n<0) return false;
        return (Math.sqrt(n)==(double)((int)Math.sqrt(n)));
    }
    
    static void test_isPerfectSquare(){
        System.out.println(isPerfectSquare(4));
        System.out.println("expected value =true");
        System.out.println(isPerfectSquare(16));
        System.out.println("expected value =true");
        System.out.println(isPerfectSquare(2));
        System.out.println("expected value =false");
        System.out.println(isPerfectSquare(5));
        System.out.println("expected value =false");
        System.out.println(isPerfectSquare(25));
        System.out.println("expectedvalue =true");
        System.out.println(isPerfectSquare(7));
        System.out.println("expected value =false");
        System.out.println(isPerfectSquare(10));
        System.out.println("expected value =false");
        System.out.println(isPerfectSquare(9));
        System.out.println("expected value =true");
        System.out.println(isPerfectSquare(-4));
        System.out.println("expected value =false");
        System.out.println(isPerfectSquare(-4));
        System.out.println("expected value =false");
        System.out.println(isPerfectSquare(0));
        System.out.println("expected value =true");
    }
}
