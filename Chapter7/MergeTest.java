package Chapter7;

import java.util.Arrays;

public class MergeTest {
    public static void main(String[] agrs) {
        char[] a = {'a','b','c'};
        char[] b = {'d','e','f'};
        System.out.println(Arrays.toString(merge(a,b)));
    }
    public static char[] merge(char[] first, char[] second) {
        char[] answer = new char[first.length + second.length];
        for (int i = 0; i < first.length; i++) {
            answer[i] = first[i];
        }

        for (int i = 0; i < second.length; i++) {
            answer[first.length + i] = second[i];
        }

        return answer;
    }
}
