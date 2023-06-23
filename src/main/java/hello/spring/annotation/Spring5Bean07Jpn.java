package hello.spring.annotation;


import hello.spring.bean.Spring5Bean03;
import org.springframework.stereotype.Component;

@Component("jpn")
public class Spring5Bean07Jpn implements Spring5Bean03 {

    public void sayHello(String msg){
        System.out.println("こんにちは, " + msg);

    }

}
