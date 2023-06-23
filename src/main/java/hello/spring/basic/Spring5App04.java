package hello.spring.basic;

import hello.spring.bean.*;

public class Spring5App04 {
    // 다섯번째 사례
    // 문자열을 통해 생성해야 할 객체를 취사선택하게 됨
    // 개발자가 신경써야 할 부분이 늘어났다는 단점 발생
    // 즉, 비지니스 코드 작성하는 것도 버거운데
    // 객체 생성관련 클래스를 따로 작성하는 것은 더욱 힘듦

    // 해결 : 객체 생성부분은 외부의 힘을 빌림
    // 즉, 스프링의 IoC 컨테이너가 객체를 생성해주고
    // 그것을 주입받음

    public static void main(String[] args){
        // 인터페이스는 불완전 클래스이기 때문에
        // 객체화 불가
        // 다형성으로 인해 유연하게 변경이 가능하다
        // 인터페이스 공부하기

        Spring5Bean03 app04 = null;

        app04= Spring5Bean04Factory.create("kor");
        app04.sayHello("스프링5!");

        app04= Spring5Bean04Factory.create("eng");
        app04.sayHello("Mr.Smith");

        app04= Spring5Bean04Factory.create("jpn");
        app04.sayHello("나까무라");
    }


    
}
