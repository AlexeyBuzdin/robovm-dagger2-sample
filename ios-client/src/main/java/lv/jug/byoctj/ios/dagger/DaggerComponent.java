package lv.jug.byoctj.ios.dagger;

import dagger.Component;
import lv.jug.byoctj.shared.CoreService;

@Component(modules = IOSModule.class)
public interface DaggerComponent {
    CoreService getCoreService();
}
