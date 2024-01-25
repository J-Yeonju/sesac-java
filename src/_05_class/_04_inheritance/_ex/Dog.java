package _05_class._04_inheritance._ex;

public class Dog extends Animal {

    // 추가적인 속성 혹은 동작이 있다면 필드와 메소드를 추가

    // 생성자
    public Dog(String name, int age) {
        // Animal 클래스의 생성자 호출하여 초기화
        super("강아지", name, age);
    }

    // makeSound 메소드를 오버라이드하여 각 동물이 내는 소리 출력
    @Override
    public void makeSound() {
        System.out.println("멍멍~");
    }
}
