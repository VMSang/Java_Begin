package OOP.Basic;

public class OOP_B05_Lop_Nhan_Vien_2 {
    private final String MNV = "00001";
    private String name;
    private String gender;
    private String birth;
    private String hometown;
    private String MST;
    private String dateSign;

    public OOP_B05_Lop_Nhan_Vien_2(String name, String gender, String birth, String hometown, String MST, String dateSign) {
        this.name = name;
        this.gender = gender;
        this.birth = birth;
        this.hometown = hometown;
        this.MST = MST;
        this.dateSign = dateSign;
    }

    public void chuanHoaTen(String name) {

    }

    @Override
    public String toString() {
        return MNV + " " + name + " " + gender + " " + birth + " " + hometown + " " + dateSign;
    }
}
