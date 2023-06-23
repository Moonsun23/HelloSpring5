package hello.spring.annotation;


import hello.spring.bean.Spring5Bean03;
import org.springframework.stereotype.Component;

@Component("eng")           //bean05에서 정보를 가져온다..
public class Spring5Bean07Eng implements Spring5Bean03 {

    public void sayHello(String msg){
        System.out.println("Hello, " + msg);

    }


}
