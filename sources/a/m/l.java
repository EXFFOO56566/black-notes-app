package a.m;

import android.view.ViewGroup;

public class l {

    /* renamed from: a  reason: collision with root package name */
    private ViewGroup f338a;

    /* renamed from: b  reason: collision with root package name */
    private Runnable f339b;

    public static l a(ViewGroup viewGroup) {
        return (l) viewGroup.getTag(j.transition_current_scene);
    }

    static void a(ViewGroup viewGroup, l lVar) {
        viewGroup.setTag(j.transition_current_scene, lVar);
    }

    public void a() {
        Runnable runnable;
        if (a(this.f338a) == this && (runnable = this.f339b) != null) {
            runnable.run();
        }
    }
}
