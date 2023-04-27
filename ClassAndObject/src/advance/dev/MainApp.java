package advance.dev;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Student[] students = new Student[10];

        input(students);

        print(students);
    }

    private static void print(Student[] students) {
		// TODO Auto-generated method stub
		
	}

	public static void input(Student[] students) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < students.length; i++) {
            System.out.println("Nhập thông tin sinh viên thứ " + (i + 1) + ":");

            System.out.print("Tên: ");
            String name = scanner.nextLine();

            System.out.print("Tuổi: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ kí tự '\n' còn lại sau dòng nhập số nguyên

            System.out.print("Địa chỉ: ");
            String address = scanner.nextLine();

            System.out.print("Số điện thoại: ");
            String phoneNumber = scanner.nextLine();

            System.out.print("Điểm trung bình: ");
            double averageScore = scanner.nextDouble();
            scanner.nextLine(); // Đọc
            
        }
	}
}