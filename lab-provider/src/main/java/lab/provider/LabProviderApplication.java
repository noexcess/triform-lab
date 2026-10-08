package lab.provider;

import io.triform.rpc.support.GeneralServiceBootstrap;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/** 提供方: 纯 @SpringBootApplication, 无任何 triform 注解。 */
@SpringBootApplication
public class LabProviderApplication {

    public static void main(String[] args) {
        GeneralServiceBootstrap.run(LabProviderApplication.class, args);
    }
}
