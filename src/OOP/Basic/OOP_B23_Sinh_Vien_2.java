package OOP.Basic;

import java.util.ArrayList;
import java.util.Scanner;

public class OOP_B23_Sinh_Vien_2 {
    private final String MSSV;
    private String Name;
    private String Birth;
    private String ClassStudent;
    private float Gpa;
    private static int stt = 1;

    OOP_B23_Sinh_Vien_2() {
        this.MSSV = String.format("SV%03d", stt);
        this.Name = "";
        this.Birth = "";
        this.ClassStudent = "";
        this.Gpa = 0;
        stt++;
    }

    //ngắn gọn hơn
//    public OOP_B23_Sinh_Vien_2(String name, String birth, String classStudent, float gpa) {
//        this.MSSV = String.format("SV%03d", stt);
//        Name = name;
//        Birth = birth;
//        ClassStudent = classStudent;
//        Gpa = gpa;
//    }

    //khong can getter vi co the dung tostring

    public float getGpa() {
        return Gpa;
    }

    //setter
    public void setName(String name) {
        Name = chuanHoaTen(name);
    }

    public void setBirth(String birth) {
        Birth = chuanHoaNgaySinh(birth);
    }

    public void setClassStudent(String classStudent) {
        ClassStudent = classStudent;
    }

    public void setGpa(float gpa) {
        Gpa = gpa;
    }

    // Chuan hoa ten
    private String chuanHoaTen(String name) {
        String[] words = name.toLowerCase().trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                sb.append(Character.toUpperCase(word.charAt(0)));
                sb.append(word.substring(1)).append(" ");
            }
        }
        return sb.toString().trim();
    }

    // Chuan hoa ngay sinh
    private String chuanHoaNgaySinh(String birth) {
        String[] parts = birth.split("[/-]");
        if (parts.length == 3) {
            return String.format("%02d/%02d/%04d",
                    Integer.parseInt(parts[0]),
                    Integer.parseInt(parts[1]),
                    Integer.parseInt(parts[2]));
        }
        return birth; // return original if format is not recognized
    }

    public String toString() {
        return this.MSSV + " " + this.Name + " " + this.ClassStudent + " " + this.Birth + " " + String.format("%.2f", this.Gpa);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        ArrayList<OOP_B23_Sinh_Vien_2> arrL = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            OOP_B23_Sinh_Vien_2 sv = new OOP_B23_Sinh_Vien_2();

//            sv.setMSSV(String.format("SV%03d", i + 1));
            sv.setName(sc.nextLine());
            sv.setBirth(sc.nextLine());
            sv.setClassStudent(sc.nextLine());
            sv.setGpa(sc.nextFloat());
            sc.nextLine(); //chuan bi cho lan doc tiep theo

            arrL.add(sv);
        }

        for (OOP_B23_Sinh_Vien_2 sv : arrL) {
            System.out.println(sv);
        }

        //tim gpa cao nhat va in ra nguoi do
        float maxGpa = 0;
        for (OOP_B23_Sinh_Vien_2 sv : arrL) {
            maxGpa = Math.max(maxGpa, sv.getGpa());
        }
        for (OOP_B23_Sinh_Vien_2 sv : arrL) {
            if (maxGpa == sv.getGpa()) {
                System.out.println("GPA cao nhat: ");
                System.out.println(sv);
                break;
            }
        }
    }
}
