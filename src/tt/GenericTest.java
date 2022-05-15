package tt;

public class GenericTest<E> {
    private E element;     //제네릭 타입 변수

    void set(E element){       //제네릭 파라미터 메소드
        this.element = element;
    }

    E get() {
        return element;
    }
}
