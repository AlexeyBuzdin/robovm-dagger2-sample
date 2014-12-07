package lv.jug.byoctj.android.dagger;

import dagger.Component;
import lv.jug.byoctj.shared.CoreService;

@Component(modules = AndroidModule.class)
public interface DaggerComponent {
    CoreService getCoreService();
}
