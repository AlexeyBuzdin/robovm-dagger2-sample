package lv.jug.byoctj.shared;

import javax.inject.Inject;

public class CoreService {

    MySecondService service;

    @Inject
    public CoreService(MySecondService service) {
        this.service = service;
    }

    public String provideString(String platform) {
        return service.provideHello(platform);
    }
}
