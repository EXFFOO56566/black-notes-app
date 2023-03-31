package a.g.l;

import a.g.b;
import android.os.Build;
import android.view.ViewGroup;

public final class w {
    public static boolean a(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 21) {
            return viewGroup.isTransitionGroup();
        }
        Boolean bool = (Boolean) viewGroup.getTag(b.tag_transition_group);
        return ((bool == null || !bool.booleanValue()) && viewGroup.getBackground() == null && u.u(viewGroup) == null) ? false : true;
    }
}
