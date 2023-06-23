package hello.spring.basic;

import hello.spring.bean.*;

public class Spring5App03 {
    // 네번째 사례
    // 인삿말을 한국어, 영어, 일본어로 출력하도록 기능 추가

    // 인터페이스를 도입하면
    // 확장성이 높고 유연한 코드를 작성할 수 있음
    // 또한, 객체간의 tightly coupled를 피할 수 있고
    // 객체간의 의존성을 낮출수도 있음

    // 하지만, new 연산자로 객체를 생성하는 코드가 노출됨
    // 다시 말해, Spring5Bean03은
    // Spring5Bean03Kor, HelloSpring5Bean03Eng,
    // Spring5Bean03Jpn에 의존적이라는 의미

    // 해결 : factory 패턴을 이용해서
    // 객체생성을 전담하는 클래스를 만들어
    // 객체생성 과정을 캡슐화 함

    public static void main(String[] args){
        // 인터페이스는 불완전 클래스이기 때문에
        // 객체화 불가
        // 다형성으로 인해 유연하게 변경이 가능하다
        // 인터페이스 공부하기



        Spring5Bean03 app03 = null;

        app03= new Spring5Bean03Kor();
        app03.sayHello("스프링5!");

        app03= new Spring5Bean03Eng();
        app03.sayHello("Mr.Smith");

        app03= new Spring5Bean03Jpn();
        app03.sayHello("나까무라");
    }


    
}
