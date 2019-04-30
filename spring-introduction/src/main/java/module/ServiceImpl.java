package module;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import srv.PersonService;

@Component("x")
public class ServiceImpl implements srv.Service {

    @Autowired
    PersonService personService;

    @Override
    public void doSometh(String s) {
        System.out.println("Hello " + personService.getPersonName());
    }
}
