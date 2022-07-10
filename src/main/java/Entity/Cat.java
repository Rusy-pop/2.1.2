package Entity;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("cat")
@Scope("prototype")
public class Cat {
    private String name;
    public Cat(){}

    public void setName(String tom) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
