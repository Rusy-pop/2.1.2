import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("Entity")
public class AppConfig {
 
    @Bean(name="helloworld")
    public HelloWorld getHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld;
    }
//    @Bean(name = "cat")
//    @Scope("prototype")
//    public Entity.Cat cat() {
//        Entity.Cat cat = new Entity.Cat();
//        cat.setName("Tom");
//        return cat;
//    }
}
