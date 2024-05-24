package question2;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int controller = 3, l = 0, r = controller - 1, res = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (i != 0) {
                map.put(i, map.get(i - 1) + arr[i]);
            } else {
                map.put(i, arr[i]);
            }
        }

        while (controller <= n) {
            while (r < n) {
                if (l != 0) {
                    res += map.get(r);
                    res -= map.get(l - 1);
                } else {
                    res += map.get(r);
                }
                l++;
                r++;
            }
            controller += 2;
            l=0;
            r=controller-1;
        }
        res += map.get(arr.length - 1);
        System.out.println(res);
    }
}
