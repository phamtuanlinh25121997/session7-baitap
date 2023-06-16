package bai1;

class MyClass {
    private String myString;

    // Constructor
    public MyClass(String str) {
        myString = str;
    }

    // Getter method
    public String getMyString() {
        return myString;
    }

    // Setter method
    public void setMyString(String str) {
        myString = str;
    }
}

public class Main {
    public static void main(String[] args) {
        // Bước 2: Khởi tạo đối tượng từ lớp MyClass
        MyClass myObject = new MyClass("Hello");

        // Hiển thị giá trị thuộc tính myString của đối tượng vừa tạo
        System.out.println("Giá trị ban đầu của myString: " + myObject.getMyString());

        // Bước 3: Thay đổi giá trị thuộc tính myString của đối tượng
        myObject.setMyString("World");

        // Hiển thị giá trị mới của thuộc tính myString
        System.out.println("Giá trị mới của myString: " + myObject.getMyString());
    }
}

