package a.m;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class s {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Object> f361a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public View f362b;

    /* renamed from: c  reason: collision with root package name */
    final ArrayList<m> f363c = new ArrayList<>();

    @Deprecated
    public s() {
    }

    public s(View view) {
        this.f362b = view;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f362b == sVar.f362b && this.f361a.equals(sVar.f361a);
    }

    public int hashCode() {
        return (this.f362b.hashCode() * 31) + this.f361a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f362b + "\n") + "    values:";
        for (String str2 : this.f361a.keySet()) {
            str = str + "    " + str2 + ": " + this.f361a.get(str2) + "\n";
        }
        return str;
    }
}
