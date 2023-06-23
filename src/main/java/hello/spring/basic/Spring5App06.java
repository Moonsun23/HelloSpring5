package hello.spring.basic;

import hello.spring.bean.Spring5Bean03;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class Spring5App06 {
    // 스프링 프레임워크 두번째 사례
    // BeanFactory가 아닌 ApplicationContext로 DI를 실행해 봄

    // 추가 라이브러리
    // spring-context
    // spring-expression
    // spring-aop

    public static void main(String[] args){
        ApplicationContext ctx = new FileSystemXmlApplicationContext("src/bean05.xml");


        Spring5Bean03 bean = null;

        bean = (Spring5Bean03) ctx.getBean("kor");
        // alt+enter 치면 해결책 나옴
        bean.sayHello("스프링5");

        bean = (Spring5Bean03) ctx.getBean("eng");
        // alt+enter 치면 해결책 나옴
        bean.sayHello("Mr.Smith");

        bean = (Spring5Bean03) ctx.getBean("jpn");
        // alt+enter 치면 해결책 나옴
        bean.sayHello("나까무라");

    }


    
}
