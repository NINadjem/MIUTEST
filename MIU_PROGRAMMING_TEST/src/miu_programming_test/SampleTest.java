
package miu_programming_test;

public class SampleTest {
        public static int isCentered(int[] array) {
        if (array == null || array.length % 2 == 0) {
            return 0;
        }
        int middleIndex = array.length / 2;
        int middleValue = array[middleIndex];
        for (int i = 0; i < array.length; i++) {
            if (i != middleIndex && array[i] <= middleValue) {
                return 0;
            }
        }
        return 1;
    }

    public static void test_isCentered() {
        int[] array = new int[]{1, 2, 3, 4, 5};
        System.out.println(isCentered(array));
        System.out.println("expected value =0");
        array = new int[]{3, 2, 1, 4, 5};
        System.out.println(isCentered(array));
        System.out.println("expected value =1");
        array = new int[]{3, 2, 1, 4, 1};
        System.out.println(isCentered(array));
        System.out.println("expected value =0");
        array = new int[]{1, 2, 3, 4};
        System.out.println(isCentered(array));
        System.out.println("expected value =0");
        array = new int[]{10};
        System.out.println(isCentered(array));
        System.out.println("expectedvalue =1");
        array = new int[]{1, 2, 30, 4, 5};
        System.out.println(isCentered(array));
        System.out.println("expected value =0");
        array = new int[]{1, 2, 0, 4, 5};
        System.out.println(isCentered(array));
        System.out.println("expected value =1");
    }

    public static char[] getSubstring(char[] a, int start, int length) {
        if (a == null || a.length == 0 || length < 0 || start < 0 || start + length > a.length) {
            return null;
        }
        char[] array = new char[length];
        for (int i = start, j = 0; j < length; i++, j++) {
            array[j] = a[i];
            System.out.print(a[i]);
        }
        return array;

    }

    public static void test_getSubstring() {
        char[] array = new char[]{'a', 'b', 'c'};
        int start = 0;
        int length = 4;
        //System.out.println(getSubstring(array,start,length).toString());
        System.out.println("expected value = null");
        start = 0;
        length = 3;
        System.out.println(getSubstring(array, start, length).toString());
        System.out.println("expected value = {‘a’, ‘b’, ‘c’}");
        start = 0;
        length = 2;
        System.out.println(getSubstring(array, start, length).toString());
        System.out.println("expected value = {‘a’, ‘b’}");
        start = 0;
        length = 1;
        System.out.println(getSubstring(array, start, length).toString());
        System.out.println("expected value = {'a'}");
        start = 1;
        length = 3;
        //System.out.println(getSubstring(array,start,length).toString());
        System.out.println("expected value = null");
        start = 1;
        length = 2;
        System.out.println(getSubstring(array, start, length).toString());
        System.out.println("expected value = {'b','c'}");
        start = 1;
        length = 1;
        System.out.println(getSubstring(array, start, length).toString());
        System.out.println("expected value = {'b'}");
        start = 2;
        length = 2;
        //System.out.println(getSubstring(array,start,length).toString());
        System.out.println("expected value = null");
        start = 2;
        length = 1;
        System.out.println(getSubstring(array, start, length).toString());
        System.out.println("expected value = {'c'}");
        start = 3;
        length = 1;
        //System.out.println(getSubstring(array,start,length).toString());
        System.out.println("expected value = null");
        start = 1;
        length = 0;
        System.out.println(getSubstring(array, start, length).length);
        System.out.println("expected value = 0 coz {}");
        start = -1;
        length = 2;
        //System.out.println(getSubstring(array,start,length).toString());
        System.out.println("expected value = null");
        start = -1;
        length = -2;
        //System.out.println(getSubstring(getSubstring(array,start,length),start,length).toString());
        System.out.println("expected value = null");
        start = 0;
        length = 1;
        //System.out.println(getSubstring(new char[]{},start,length).toString());
        System.out.println("expected value = null");
        start = 1;
        length = 3;
        System.out.println(getSubstring(new char[]{'i', 'j', 'k', 'l'}, start, length).toString());
        System.out.println("expected value = {'j','k','l'}");
    }

    public static int diffrenceOddEven(int[] array) {
        if (array == null) {
            return 0;
        }
        int x = 0, y = 0;
        for (int n : array) {
            if (n % 2 == 0) {
                y += n;
            } else {
                x += n;
            }
        }
        return x - y;
    }

    public static void test_diffrenceOddEven() {
        int[] array = new int[]{1};
        System.out.println(diffrenceOddEven(array));
        System.out.println("expected value =1");
        array = new int[]{1, 2,};
        System.out.println(diffrenceOddEven(array));
        System.out.println("expected value =-1");
        array = new int[]{3, 2, 1};
        System.out.println(diffrenceOddEven(array));
        System.out.println("expected value =2");
        array = new int[]{1, 2, 3, 4};
        System.out.println(diffrenceOddEven(array));
        System.out.println("expected value =-2");
        array = new int[]{3, 3, 4, 4};
        System.out.println(diffrenceOddEven(array));
        System.out.println("expectedvalue =-2");
        array = new int[]{3, 2, 3, 4};
        System.out.println(diffrenceOddEven(array));
        System.out.println("expected value =0");
        array = new int[]{1, 1};
        System.out.println(diffrenceOddEven(array));
        System.out.println("expected value =2");
        array = new int[]{};
        System.out.println(diffrenceOddEven(array));
        System.out.println("expected value =0");

    }

    public static int reverse(int number) {
        int sign = 1;
        if (number < 0) {
            sign = -1;
        }
        int r = 0;
        int temp = sign * number;
        while (temp != 0) {
            System.out.println("temp%10=" + temp % 10 + " temp/10=" + temp / 10);
            r = r * 10 + temp % 10;
            temp /= 10;
        }
        return sign * r;
    }

    public static void test_reverse() {
        System.out.println(reverse(1234));
        System.out.println("expected value =4321");
        System.out.println(reverse(12005));
        System.out.println("expected value =50021");
        System.out.println(reverse(1));
        System.out.println("expected value =1");
        System.out.println(reverse(1000));
        System.out.println("expected value =1");
        System.out.println(reverse(0));
        System.out.println("expected value =0");
        System.out.println(reverse(-12345));
        System.out.println("expected value =-54321");
    }

    public static int[] getCommonInts(int[] first, int[] second) {
        if (first == null || second == null) {
            return null;
        }
        if (first.length == 0 || second.length == 0) {
            return new int[]{};
        }
        int[] a1 = first, a2 = second;
        if (first.length > second.length) {
            a1 = second;
            a2 = first;
        }
        int[] temp = new int[a1.length];
        int resultLen = 0;
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a2.length; j++) {
                if (a2[j] == a1[i]) {
                    temp[resultLen++] = a1[i];
                    System.out.print(a1[i]);
                    break;
                }
            }
        }
        int[] result = new int[resultLen];
        for (int i = 0; i < resultLen; i++) {
            result[i] = temp[i];
        }
        return result;
    }

    public static void test_getCommonInts() {
        int[] array = new int[]{1, 8, 3, 2}, array2 = new int[]{4, 2, 6, 1};
        System.out.println(getCommonInts(array, array2));
        System.out.println("expected value ={1, 2}");
        array = new int[]{1, 8, 3, 2, 6};
        array2 = new int[]{2, 6, 1};
        System.out.println(getCommonInts(array, array2));
        System.out.println("expected value ={2, 6, 1}");
        array = new int[]{1, 3, 7, 9};
        array2 = new int[]{7, 1, 9, 3};
        System.out.println(getCommonInts(array, array2));
        System.out.println("expected value ={1, 3, 7, 9}");
        array = new int[]{1, 2};
        array2 = new int[]{3, 4};
        System.out.println(getCommonInts(array, array2));
        System.out.println("expected value ={}");
        array = new int[]{};
        array2 = new int[]{1, 2, 3};
        System.out.println(getCommonInts(array, array2));
        System.out.println("expected value ={}");
        array = new int[]{1, 2};
        array2 = new int[]{};
        System.out.println(getCommonInts(array, array2));
        System.out.println("expected value ={}");
        array = new int[]{1, 2};
        array2 = null;
        System.out.println(getCommonInts(array, array2));
        System.out.println("expected value =null");
        array = null;
        array2 = new int[]{};
        System.out.println(getCommonInts(array, array2));
        System.out.println("expected value =null");
        array = null;
        array2 = null;
        System.out.println(getCommonInts(array, array2));
        System.out.println("expected value =null");
    }

    public static int POE(int[] a) {
        if (a == null || a.length == 0 || a.length < 3)return -1;
        int poe = a.length / 2;
        int sumBefore = 0;
        int sumAfter = 0;
        for (int i = 0; i < poe; i++) {
            sumBefore += a[i];
            if (i!=0) sumAfter += a[i + poe];
        }
        if(a.length%2!=0) sumAfter += a[a.length-1];
        while (sumAfter != sumBefore) {
            if (poe < 0 || poe >= a.length)return -1;  
            if (sumBefore > sumAfter) {
                sumBefore -= a[poe - 1];
                sumAfter += a[poe--];
                if(sumBefore < sumAfter) return -1;
            } else {
                sumAfter -= a[poe + 1];
                sumBefore += a[poe++];
                if(sumBefore > sumAfter) return -1;
            }
        }
        return poe;
    }
    
    public static void test_PEO(){
        int[] array = new int[]{1, 8, 3, 7, 10, 2};
        System.out.println(POE(array));
        System.out.println("expected value =3");
        array = new int[]{1, 5, 3, 1, 1, 1, 1, 1, 1};
        System.out.println(POE(array));
        System.out.println("expected value =2");
        array = new int[]{2, 1, 1, 1, 2, 1, 7};
        System.out.println(POE(array));
        System.out.println("expected value =5");
        array = new int[]{1, 2, 3};
        System.out.println(POE(array));
        System.out.println("expected value =-");
        array = new int[]{3, 4, 5, 10};
        System.out.println(POE(array));
        System.out.println("expectedvalue =-1");
        array = new int[]{1, 2, 10, 3, 4};
        System.out.println(POE(array));
        System.out.println("expected value =-1");
        array = new int[]{1, 2, 0, 4, -1};
        System.out.println(POE(array));
        System.out.println("expected value =2");
    }
}
