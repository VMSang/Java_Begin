package Ly_Thuyet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Ly_Thuyet_07_Sort_Search {
    public static void main(String[] args) {
        //Arrays. dùng cho mảng, Collections dùng cho ArraysList

        int[] a1 = {1, 2, 3, 4, 5, 6, 6, 7, 7, 7, 7, 8};
        // linear search chi co ham danh cho Wrapping, nên phải tự viết linear
        if (LinearSearch(a1, 12, 7)) {
            System.out.println("Y");
        } else {
            System.out.println("N");
        }
        Arrays.sort(a1);
        if (Arrays.binarySearch(a1, 3) >= 0)
            System.out.println("Y");
        else
            System.out.println("N");

//----------------------------------------------------------------------------------------------

        ArrayList<Integer> a2 = new ArrayList<>();
        Collections.addAll(a2, 1, 2, 3, 3, 3, 6, 7, 8, 9);
        //tự viết linearSearch giống mảng, nhưng có thể dùng các hàm bên dưới là linearSearch
        //a2.contain(số muốn tìm) boolean
        //a2.indexof(so muon tim) vi tri

        Collections.sort(a2);
        if (Collections.binarySearch(a2, 3) >= 0)
            System.out.println("FIND");
        else
            System.out.println("NOT FOUND");
    }

    public static boolean LinearSearch(int a[], int n, int x) {
        for (int i = 0; i < n; i++) {
            if (a[i] == x)
                return true;
        }
        return false;
    }
}
