package lv.jug.byoctj.shared;

import javax.inject.Inject;

public class MySecondService {

    @Inject
    public MySecondService() {
    }

    public String provideHello(String platform) {
        return "Hello from " + platform;
    }
}
