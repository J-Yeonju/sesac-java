import java.util.Scanner;

public class Array02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 5개의 정수를 입력받을 배열 생성
        int[] numbers = new int[5];

        System.out.println("5개의 정수를 입력하세요:");

        // 사용자로부터 5개의 정수 입력 받기
        for (int i = 0; i < 5; i++) {
            System.out.print("정수 " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // 평균 계산
        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double average = sum / 5;

        System.out.println("평균은 " + average + "입니다.");

        // Scanner 닫기
        scanner.close();
    }
}
