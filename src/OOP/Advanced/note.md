Kế thừa (inheritance)
lớp cha, cơ sở (base class, superClass) chứa thuộc tính và phương thức chung truyền lại cho lớp con, dẫn xuất (derived
class, sub class)
lớp con bắt buộc có hàm tạo nếu lớp cha có hàm tạo

```java
public class Person {
    private String name, birth;

    // Constructor cho lớp Person
    public Person(String name, String birth) {
        this.name = name;
        this.birth = birth;
    }

    // Phương thức getName trả về tên của Person
    public String getName() {
        return this.name;
    }
}

public class Student extends Person {
    private String lop;
    private double gpa;

    // Constructor cho lớp Student
    // Gọi super(name, birth) để gọi constructor của lớp cha (Person)
    public Student(String lop, double gpa, String name, String birth) {
        super(name, birth);
        this.lop = lop;
        this.gpa = gpa;
    }
}

public class Main {
    public static void main(String[] args) {
        // Tạo một đối tượng Student và in ra tên
        Student s = new Student("CNTT1", 3.2, "Nguyen Van A", "22/12/2002");
        System.out.println(s.getName()); // In ra "Nguyen Van A"
    }
}
```

ghi đè: một phương thức có ở hai lớp cha và con giống nhau thì ghi đè:

- ưu tiên tìm trong lớp con trước, nếu không có thì qua lớp cha tìm
- lấy ra thuộc tính của cha thông qua super.toString()
- Lấy ra bằng cách đổi private thành protected (không thể truy cập ngoài lớp đó ngoại trừ lớp con của nó)

-đa hình

+ Interface
+ Abtract class
+ mối quan hệ các lớp