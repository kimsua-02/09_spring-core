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
     *
     * 13. 속성(Attribute) : 객체가 가진 데이터
     *   - 클래스의 필드(멤버 변수)로 표현됨.
     *
     * 14. 추상 클래스(Abstract Class) : 인스턴스를 만들 수 없으며, 자식 클래스에서 구현해야 하는 추상 메소드를
     *      가질 수 있는 클래스.
     *
     * 15. 클래스 경로(Classpath) : Java Program 이 클래스 파일을 찾는 경로
     *   - JAR 파일과 디렉토리를 포함.
     *
     * 16. JDK, JRE, JVM
     *   ▶ JDK(Java Development Kit) : 자바 개발을 위한 도구 세트.
     *      - 컴파일러와 API 포함
     *   ▶ JRE(Java Runtime Environment) : 자바 프로그램을 실행하기 위한 환경.
     *      - JVM 포함.
     *   ▶ JVM(Java Virtual Machine) : 자바 바이트코드를 실행하는 가상 머신.
     * */


    /*
    * 1. 필드의 정의
    *   1) 구성 : 필드는 데이터 타입과 이름으로 구성됨.
    *       ex) int age; 와 같이 선언할 수 있음
    *     1-1) 일반적으로 클래스의 맨 위에 선언됨. 접근 제어자와 데이터 타입, 변수 이름으로 구성됨.
    *
    *   2) 접근 제어자 : 필드는 일반적으로 접근 제어자를 사용하여 접근 범위를 설정함
    *     ↓ 주요 접근 제어자
    *       - private : 클래스 내부에서만 접근 가능. 캡슐화를 통해 데이터 보호
    *       - protected : 같은 패키지 내 또는 상속받은 클래스에서 접근 가능
    *       - public : 클래스 외부에서 접근 가능
    *       - default : 접근 제어자를 명시하지 않으면 적용. 같은 패키지 내에서만 접근 가능
    * */

    /*
    * 2. 필드의 종류
    *   1) 인스턴드 필드 : 객체마다 별도의 값을 가지는 필드
    *       - 클래스의 인스턴스를 생성할 때마다 새로운 메모리 공간이 할당되며,각 객체는 고유한 값을 가질 수 있음.
    *
    *   2) 스태틱 필드(Static Field) : 클래스 자체에 속하는 필드로, 모든 객체가 공유함.
    *       - static 키워드를 사용하여 선언.
    *       - 클래스가 메모리에 로드될 때 한 번만 생성됨.
    *       - 모든 객체에서 동일한 값을 공유함.
    *
    *   3) 정적 필드(Final Static Field)
    *       - 정의 : 한 번 초기화된 후 변경할 수 없는 필드
    *       - 특징 : ▶ final 키워드를 사용하여 선언.
    *               ▶ 상수와 유사하게 사용됨.(상수 값을 정의할 때 사용)
    *
    *   4) 인스턴스 필드와 스태틱 필드의 차이
    *       - 메모리 할당 : 인스턴스 필드는 각 객체마다 별도로 메모리를 할당하지만, 스태틱 필드는 클래스당 하나만 할당됨.
    *       - 접근 방식 : 인스턴스 필드는 객체를 통해 접근하고, 스태틱 필드는 클래스 이름을 통해 접근할 수 있음.
    *
    *   5) 임시 필드(Transient Fields)
    *       - 정의 : transient 키워드로 선언된 필드로, 객체를 직렬화(Serialization)을 할 때 해당 필드는 저장되지 않음
    *               보안이나 메모리 관리 등을 위해 사용됨.
    *
    *    *** 필드(Field) 는 객체의 속성을 정의하고, 데이터의 구조를 설정하는 데 중요한 역할을 함. ***
    * */

    // 인스턴드 필드 예시
    public class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    // 스태틱 필드 예시
    public class Counter {
        static int count = 0; // 스태틱 필드

        public Counter() {
            count ++;         // 생성될 때마다 count 증가
        }
    }

    /*
    *
    * */

}