package hello.spring.annotation;


import hello.spring.bean.Spring5Bean03;
import org.springframework.stereotype.Component;

@Component("kor")
public class Spring5Bean07Kor implements Spring5Bean03 {
    public void sayHello(String msg){
        System.out.println("안녕하세요, " + msg);

    }


}
