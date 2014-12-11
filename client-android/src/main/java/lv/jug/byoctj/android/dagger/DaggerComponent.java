package lv.jug.byoctj.android.dagger;

import dagger.Component;
import lv.jug.byoctj.shared.SharedController;

@Component(modules = AndroidModule.class)
public interface DaggerComponent {
    SharedController getSharedController();
}
