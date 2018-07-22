package cases;

import cucumber.api.java.After;
import infrastructure.Context;

public class Hooks {

    @After
    public void afterScenario(){
        Context.tearDown();
    }
}
