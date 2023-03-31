package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

public final class m implements Iterable<Intent> {

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<Intent> f792b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private final Context f793c;

    public interface a {
        Intent d();
    }

    private m(Context context) {
        this.f793c = context;
    }

    public static m a(Context context) {
        return new m(context);
    }

    public m a(Activity activity) {
        Intent d = activity instanceof a ? ((a) activity).d() : null;
        if (d == null) {
            d = f.a(activity);
        }
        if (d != null) {
            ComponentName component = d.getComponent();
            if (component == null) {
                component = d.resolveActivity(this.f793c.getPackageManager());
            }
            a(component);
            a(d);
        }
        return this;
    }

    public m a(ComponentName componentName) {
        int size = this.f792b.size();
        try {
            Context context = this.f793c;
            while (true) {
                Intent a2 = f.a(context, componentName);
                if (a2 == null) {
                    return this;
                }
                this.f792b.add(size, a2);
                context = this.f793c;
                componentName = a2.getComponent();
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    public m a(Intent intent) {
        this.f792b.add(intent);
        return this;
    }

    public void a() {
        a((Bundle) null);
    }

    public void a(Bundle bundle) {
        if (!this.f792b.isEmpty()) {
            ArrayList<Intent> arrayList = this.f792b;
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (!a.g.d.a.a(this.f793c, intentArr, bundle)) {
                Intent intent = new Intent(intentArr[intentArr.length - 1]);
                intent.addFlags(268435456);
                this.f793c.startActivity(intent);
                return;
            }
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }

    @Override // java.lang.Iterable
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f792b.iterator();
    }
}
