package module;

import org.springframework.stereotype.Component;
import srv.PersonService;

@Component
public class PersonServiceImpl implements PersonService {
    @Override
    public String getPersonName() {
        return "Hossein";
    }
}
