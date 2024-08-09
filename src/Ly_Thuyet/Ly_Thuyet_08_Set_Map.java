package Ly_Thuyet;

import java.util.*;

public class Ly_Thuyet_08_Set_Map {
    Scanner sc = new Scanner(System.in);

    //Set
    //HashSet: phần tử khác nhau, tìm kiếm O(1), không thứ tự, lưu kiểu đối tượng
    Set<Integer> set1 = new HashSet<>();
    HashSet<Integer> set2 = new HashSet<>();
    // add, remove, size, contains (Kiem tra su ton tai), clear, isEmpty

    //linkedHashSet: phần tử khác nhau, tìm kiếm O(1), có thứ tự là thứ tự lúc bạn nhập vào, lưu kiểu đối tượng
    Set<Integer> set3 = new LinkedHashSet<>();
    HashSet<Integer> set4 = new LinkedHashSet<>();
    //dùng liệt kê các giá trị khác nhau theo thứ tự xuất hiện

    //TreSet: phần tử khác nhau, red-black tree, tìm kiếm và xóa O(logN), thứ tự tăng dần, lưu kiểu đối tượng
    TreeSet<Integer> set5 = new TreeSet<>();
    //ngoài các hàm kia còn có: floor , ceiling, first, last, lower, higher

    //Map
    //HashMap: khong thu tu
    Map<Integer, Integer> map1 = new HashMap<>();
    HashMap<Integer, Integer> map2 = new HashMap<>();
    //put thêm, size, isEmpty, clear, containsKey, containsValue, get trả về value cho key, remove, replace(x,y)

    //LinkedhashMap: băm +dslk, có thứ tự theo thứ tự thêm vào
    Map<Integer, Integer> map3 = new LinkedHashMap<>();
    LinkedHashMap<Integer, Integer> map4 = new LinkedHashMap<>();

    //TreeMap: red-black tree, tang dan
    Map<Integer, Integer> map6 = new TreeMap<>();
    TreeMap<Integer, Integer> map7 = new TreeMap<>();
    //firstKey, lastKey, firstEntry cặp phần tử đầu tiên, lastEntry, floorKey, floorEntry, ceilingKey, ceilingEntry
}
