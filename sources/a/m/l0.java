package a.m;

import android.view.View;
import android.view.WindowId;

/* access modifiers changed from: package-private */
public class l0 implements m0 {

    /* renamed from: a  reason: collision with root package name */
    private final WindowId f340a;

    l0(View view) {
        this.f340a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof l0) && ((l0) obj).f340a.equals(this.f340a);
    }

    public int hashCode() {
        return this.f340a.hashCode();
    }
}
