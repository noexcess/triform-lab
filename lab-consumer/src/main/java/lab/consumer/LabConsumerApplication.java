package lab.consumer;

import io.triform.rpc.support.GeneralServiceBootstrap;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/** 消费方: 构造器注入 TinyFacade(lab-api), 无任何 triform 注解/配置。 */
@SpringBootApplication
public class LabConsumerApplication {

    public static void main(String[] args) {
        GeneralServiceBootstrap.run(LabConsumerApplication.class, args);
    }
}
