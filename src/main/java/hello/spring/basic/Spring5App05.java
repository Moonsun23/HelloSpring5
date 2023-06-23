package hello.spring.basic;

import hello.spring.bean.Spring5Bean03;
import hello.spring.bean.Spring5Bean04Factory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class Spring5App05 {
    // 스프링 프레임워크 첫번째 사례


    public static void main(String[] args){
        BeanFactory bf = new XmlBeanFactory(
                new FileSystemResource("src/bean05.xml"));
        Spring5Bean03 bean = null;

        bean = (Spring5Bean03) bf.getBean("kor");
        // alt+enter 치면 해결책 나옴
        bean.sayHello("스프링5");

        bean = (Spring5Bean03) bf.getBean("eng");
        // alt+enter 치면 해결책 나옴
        bean.sayHello("Mr.Smith");

        bean = (Spring5Bean03) bf.getBean("jpn");
        // alt+enter 치면 해결책 나옴
        bean.sayHello("나까무라");

    }


    
}
