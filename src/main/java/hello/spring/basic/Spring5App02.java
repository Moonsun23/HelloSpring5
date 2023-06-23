package hello.spring.basic;

import hello.spring.bean.Spring5Bean02;
// 아래 코드처럼 인삿말 출력시
// 해당기능을 제각각의 이름으로 호출하는 경우
// 지나치게 복잡해지고, 기능에 따라 이름을
// 일일이 외워야 하는 불편함이 존재

// 인터페이스 프로그래밍의 장점은
// 객체간의 의존성을 낮출수 있는 것 이외에도
// 특정 기능 호출시 통일된 방식을 사용할 수 있다는 것임

public class Spring5App02 {
    // 세번째 사례
    // 인삿말을 한국어, 영어, 일본어로 출력하도록 기능 추가

    public static void main(String[] args){
        Spring5Bean02 app02 = new Spring5Bean02();

        app02.sayHelloKor("스프링");
        app02.sayHelloEng("Mr.Smith");
        app02.sayHelloJpn("나까무라");
    }


    
}
