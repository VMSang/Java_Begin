package Ly_Thuyet;

import java.util.Scanner;

//Giai Thua
//So Nguyen To
//Tong, Dem uoc so
//So Chinh Phuong
//So Hoan Hao
//Phan Tich Thua So Nguyen To
//Uoc Chung Lon Nhat
//Boi Chung Nho Nhat
//So thuan nghich so Guong
//To Hop Chap K Cua N
//Tam Giac Pascal
//Fibonacci
//Luy Thua Nhi Phan
//dung cong thuc legendre de tim bac cua p trong N! (p la so nguyen to) (di tim so mu LON NHAT cua p trong n!)
//ly thuyet dong du

public class Ly_Thuyet_05_func {
    public static long giaiThua(int n) {
        if (n == 1) return 1;
        return n * giaiThua(n - 1);
    }

    public static boolean Prime(long n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static long sum_div(long n) {
        long sum = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                sum += i;  //cnt++;
                if (n / i != i)
                    sum += n / i;  //cnt++;
            }
        }
        return sum;
    }

    //là số chính phương nếu n = a^2 với a là số nguyên
    //khai căn ra số nguyên
    public static boolean chinhPhuong(long n) {
        long can = (long) Math.sqrt(n);
        return can * can == n;
    }

    //số hoàn hảo là số mà tổng các ước thật sự của nó bằng chính nó
    public static boolean soHoanHao(long n) {
        long sum = 1;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                sum += i;
                if (n / i != i) {
                    sum += n / i;
                }
            }
        }
        return sum == n;
    }

    //phân tích thua số nguyên tố: các thừa số <= sqrt(n) vì nếu có thừa số > sqrt(n) thì nó sẽ là số nguyên tố vì nó không chia hết cho các số <= sqrt(n) nên nó sẽ chia hết cho số > sqrt(n)
    //Đếm ước bằng pttsnt: T(n) = (mũ1+1)*(mũ2+1)*...*(mũn+1)
    public static void phanTichThuaSoNguyenTo(long n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            while (n % i != 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }
        if (n != 1) System.out.print(n);
    }

    public static long GCD(long a, long b) {
        while (b != 0) {
            long tmp = a;
            a = b;
            b = tmp % b;
        }
        return a;
    }

    public static long GCD_dequy(long a, long b) {
        if (b == 0) return a;
        return GCD_dequy(b, a % b);
    }

    //để là bội chung nhỏ nhất th cần chỉ ần 1 ươc chung trong tích của hai số đó, nên chia cho ucln để bổ đi 1 ước chung và đảm bảo còn một cái ước chung nữa
    public static long LCM(long a, long b) {
        return a * b / GCD(a, b);
    }

    //số thuận nghịch/số gương: số đọc từ trái sang phải giống như từ phải sang trái
    public static boolean soGuong(long n) {
        long org = n;
        long lat = 0;
        while (n != 0) {
            lat = lat * 10 + n % 10;
            n /= 10;
        }
        return lat == org;
    }

    //to hop chap k cua n
    public static long tohop(int n, int k) {
        //C(k,n) = C(n-k, n), nen cho k nho hon de giam loop
        k = Math.min(k, n - k);
        long res = 1;
        for (int i = 1; i <= k; i++) {
            //n-k+1
            res *= (n - i + 1);
            //tip: tich cua k so lien tiep, luon chia het cho k!
            res /= i;
        }
        return res;
    }

    //tam giac pascal
    //k = cot, n = dong
    public static void tamGiacPasCal(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(tohop(i, j) + " ");
            }
            System.out.println();
        }
    }

    //fibonacci: kiem tra co phai so fibonacci, liet ke n so fibonacci, in ra so thu n
    public static boolean checkFibonacci(long n) {
        if (n == 0 || n == 1)
            return true;
        long fn1 = 1, fn2 = 0;
        for (int i = 2; i <= 92; i++) {
            long fn = fn1 + fn2;
            if (fn == n)
                return true;
            fn2 = fn1;
            fn1 = fn;
        }
        return false;
    }

    public static void inra(long n) {
        if (n == 1)
            System.out.print("0");
        else if (n == 2)
            System.out.print("0 1");
        else {
            System.out.println("0 1");
            long fn1 = 1, fn2 = 0;
            for (int i = 2; i < n - 1; i++) {
                long fn = fn1 + fn2;
                System.out.print(fn + " ");
                fn2 = fn1;
                fn1 = fn;
            }
        }
    }

    public static void findN(long n) {
        if (n == 0 || n == 1)
            System.out.println(n);
        else {
            long fn1 = 1, fn2 = 2, fn = 0;
            for (int i = 2; i <= n; i++) {
                fn = fn1 + fn2;
                fn2 = fn1;
                fn1 = fn;
            }
            System.out.println(fn);
        }
    }

    public static long luyThuaNhiPhan(long a, long b) {
        long res = 1;
        while (b > 0) {
            if (b % 2 == 1) {
                res *= a;
            }
            a *= a;
            b /= 2;
        }
        return res;
    }

    //6! = 6.5.4.3.2.1
    //p = 2 => 2/2 = 1, 2*2/2 = 2, 2*3/2 = 3 => 1+2+1 = 4
    //co 4 so 2 trong 6!
    public static long nonLengendre(long n, long p) {
        long dem = 0;
        for (long i = p; i <= n; i += p) {
            long j = i;
            //dem so lan p chia het cho i
            while (j % p == 0) {
                dem++;
                j /= p;
            }
        }
        return dem;
    }

    public static long legendre(long n, long p) {
        long res = 0;
        for (long i = p; i <= n; i *= p) {
            res += n / i;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();

        System.out.println(giaiThua((int) n));
        System.out.println(Prime(n));
        System.out.println(sum_div(n));
        System.out.println(chinhPhuong(n));
        System.out.println(soHoanHao(n));
        phanTichThuaSoNguyenTo(n);
        System.out.println(GCD(a, b));
        System.out.println(GCD_dequy(a, b));
        System.out.println(LCM(a, b));
        System.out.println(soGuong(n));
        tamGiacPasCal(10);

        if (checkFibonacci(n))
            System.out.println("La so fibonacci");
        else
            System.out.println("Khong phai so fibonacci");

        inra(n);
        findN(n);
        System.out.println(luyThuaNhiPhan(a, b));
        System.out.println(nonLengendre(n, a));
        System.out.println(legendre(n, a));
    }
}
