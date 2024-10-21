package com.ohgiraffers.basic_terminology.section01;

public class Foundation {

    // Foundation(파운데이션) : '기초' 라는 의미. (화장품 파운데이션 아님)


    // Java Spring 을 배위기 위한 기초 용어 (Spring 를 이해하는 데 필수인 기본 개념)

    /*
     * 1. 클래스(Class) : 객체를 정의하는 청사진(?)
     *   - 클래스는 속성(필드)과 행동(메소드)을 가질 수 있다.
     *
     * 2. 객체(Object) : 클래스의 인스턴스.
     *   - 클래스를 기반으로 생성된 실체.
     *
     * 3. 메소드(Method) : 클래스 내에서 정의된 함수.
     *   - 객체가 수행할 수 있는 행동을 정의.
     *
     * 4. 변수(Variable) : 데이터를 저장하는 공간.
     *   - 변수는 특정 데이터 타입을 가짐.
     *
     * 5. 인터페이스(Interface) : 클래스가 구현해야 하는 메소드의 집합.
     *   - 인터페이스를 통해 다형성을 지원.
     *
     * 6. 상속(Inheritance) : 한 클래스가 다른 클래스의 속성과 메소드를 물려받는 것.
     *   - 코드의 재사용성을 높임.
     *
     * 7. 다형성(Polymorphism) : 같은 이름의 매소드가 여러 형태로 동자할 수 있는 능럭.
     *   - 주로 메소드 오버로딩과 오버라이딩을 통해 구현됨.
     *
     * 8. 추상화(Abstraction) : 복잡함 시스템에서 불필요한 세부 사향을 숨기고 필요한 부문만을 노출하는 것.
     *
     * 9. 캡슐화(Encapsulaation) : 데이터와 메소드릃 하나의 단위로 묶고, 위부에서 접근하지 못하도록 보호하는 원칙.
     *
     * 10. 예외 처리(Exception Handling) : 프로그램 실행 중 발생할 수 있는 오류를 처리하는 방법.
     *   - try , catch , finally 블록을 사용.
     *
     * 11. 제너릭(Generics) : 클래스나 메소드에서 사용할 데이터 타입을 미리 정의하지 않고, 호출 시에 결정하는 방법.
     *
     * 12. 스래드(Thread) : 포로그램 내에서 실행되는 기본 단위.
     *   - 멀티 스레딩을 통해 여러 작업을 동시애 처리할 수 있음.
     * */

    /*
     * 필드(Field) : 클래스 내에 선언된 변수. 객체의 상태를 나타내는 데 사용됨
     *   - 필드는 객체의 속성이나 특성을 정의하며, 객체가 갖는 데이터를 저장함.
     * */

    // [필드의 주요 개념] 1. 선언
    // 필드는 클래스 내에서 선언되며, 데이터 타입과 이름으로 정의됨.

//    public class Member {
//        private String name;  // 필드 : 이름
//        private int age;      // 필드 : 나이
//    }

    /*
    * 2. 접근제어자
    * - 필드는 private , protected , public 과 같은 접근제어자를 사용하여 접근 범위를 설정할 수 있다.
    * - private 로 선언할 시 해당 클래스 내에서만 접근이 가능하고, public 으로 선언하면 외부에서도 접근할 수 있다.
    * */

    // 3. 초기화
    // 필드는 선언 시 값을 초기화할 수 있다. 또한 생성자에서 초기화할 수도 있다.
    // (↓ 예시)
    public class Member {
        private String name = "Unknown"; //  초기값 설정
        private int age;

        public Member(String name, int age) {
            this.name = name;  // 생성자에서 초기화
            this.age = age;
        }
    }


}