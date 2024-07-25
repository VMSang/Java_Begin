package Ly_Thuyet;

import java.util.*;

public class Ly_Thuyet_06_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //----------------------------------Array 1D----------------------------------
        // Khai báo mảng, khong can don dep vi java co garbage collection tu dong don dep
        //khong the &x de nhap phan tu
        int n = 5;
        long[] arr = new long[n]; //cac phan tu == 0
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (long x : arr)
            System.out.println(x);

        int[] arr2 = {1, 2, 3, 4, 5}; //có sẵn giá trị
        //Tim sort O(nlogn)
        Arrays.sort(arr2);
        Arrays.sort(arr2, 1, 4); //sort từ 1->4
        for (int x : arr2)
            System.out.println(x);

        //muốn dùng comparator thì phải dùng wrapper class (Integer, Long, Double), khong dung primitive type (int, long, double)
        //co tinh chat stabel: giu nguyen vi tri cua cac phan tu co gia tri bang nhau
        Integer[] arr3 = {1, 2, 3, 4, 5};
        Arrays.sort(arr3, new Comparator<Integer>() {
            @Override //khong co cung duoc
            public int compare(Integer o1, Integer o2) {
                //tra ve -1 hoac 1 (1 so am hoac so duong) de so sanh
                //neu muon o1 dung truoc o2 thi tra ve -1
                //neu muon o2 dung truoc o1 thi tra ve 1
                if (o1 < o2)
                    return -1;
                else
                    return 1;
            }
        });
        for (int x : arr3)
            System.out.println(x);

        //----------------------------------Arraylist----------------------------------
        System.out.println("Arraylist");
        ArrayList<Integer> arrL = new ArrayList<>(10); //co the khai bao sang 10 phan tu
        //nhap vao tu ban phim
        int n2 = sc.nextInt();
        for (int i = 0; i < n2; i++) {
            arrL.add(sc.nextInt());
            //hoac
            //int tmp = sc.nextInt();
            //arrL.add(tmp);
        }
        //cac ham arraylist
        arrL.add(1); //them 1 phan tu
        arrL.set(0, 2); //thay doi phan tu tai vi tri 0 thanh 2, khong dung arrL.get(0) = 2
        arrL.add(0, 2); //them 2 vao vi tri 0
        for (int i = 0; i < arrL.size(); i++) {
            System.out.println(arrL.get(i)); //lay phan tu
        }

        arrL.remove(0); //xoa phan tu thu 0 //O(n)
        arrL.remove((Object) 3); //xoa phan tu co gia tri 3
        arrL.remove(Integer.valueOf(2)); //xoa phan tu co gia tri 2 //O(n)

        arrL.clear(); //xoa toan bo phan tu O(n)
        System.out.println(arrL.isEmpty()); //kiem tra rong
        System.out.println(arrL.contains(1)); //kiem tra co phan tu 1 khong //O(n)

        System.out.println(arrL.indexOf(1)); //tim vi tri cua phan tu 1 dau tien, khong co tra ve -1 //O(n)

        //for each
        arrL.forEach(x -> System.out.println(x));

        Object[] arr4 = arrL.toArray(); //chuyen arraylist sang array, kieu tra ve la Object kieu lon nhat trong Java

        //collections
        Collections.sort(arrL); //sort tang dan
        Collections.sort(arrL, Collections.reverseOrder()); //sort giam dan
        Collections.sort(arrL, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1; //giam dan
            }
        });
    }
}
