package lv.jug.byoctj.ios.dagger;

import dagger.Component;
import lv.jug.byoctj.shared.SharedController;

@Component(modules = IOSModule.class)
public interface DaggerComponent {
    SharedController getCoreService();
}
