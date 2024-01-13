package OOp;

public class Class01 {
	// class attributes
	String name;
	int age;

	public Class01() {
		// nếu có một construction khác thì phải ghi thủ công cái này!
	}

	// "new" : constructor, khi tạo object bằng new thì chạy vào đây đầu tiên
	// if don't create, Java auto create new constructor
	// nếu tạo constructor thì phải khác nhau ít nhất là giá trị truyền vào
	public Class01(String name1, int age1) {
		this.name = name1;
		this.age = age1;
	}

	// class method/function
	// this function can move to new other class
	public static void main(String[] args) {
		Class01 lop12a = new Class01("minh sang", 10); // create new obj
		System.out.println("ten cua ban la: " + lop12a.name + ", ban: " + lop12a.age + "tuoi");

	}
}
