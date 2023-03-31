package a.a.n;

import a.a.i;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;

public class d extends ContextWrapper {

    /* renamed from: a  reason: collision with root package name */
    private int f23a;

    /* renamed from: b  reason: collision with root package name */
    private Resources.Theme f24b;

    /* renamed from: c  reason: collision with root package name */
    private LayoutInflater f25c;
    private Configuration d;
    private Resources e;

    public d() {
        super(null);
    }

    public d(Context context, int i) {
        super(context);
        this.f23a = i;
    }

    public d(Context context, Resources.Theme theme) {
        super(context);
        this.f24b = theme;
    }

    private Resources b() {
        Resources resources;
        if (this.e == null) {
            Configuration configuration = this.d;
            if (configuration == null) {
                resources = super.getResources();
            } else if (Build.VERSION.SDK_INT >= 17) {
                resources = createConfigurationContext(configuration).getResources();
            }
            this.e = resources;
        }
        return this.e;
    }

    private void c() {
        boolean z = this.f24b == null;
        if (z) {
            this.f24b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f24b.setTo(theme);
            }
        }
        a(this.f24b, this.f23a, z);
    }

    public int a() {
        return this.f23a;
    }

    /* access modifiers changed from: protected */
    public void a(Resources.Theme theme, int i, boolean z) {
        theme.applyStyle(i, true);
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    public Resources getResources() {
        return b();
    }

    @Override // android.content.Context, android.content.ContextWrapper
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f25c == null) {
            this.f25c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f25c;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f24b;
        if (theme != null) {
            return theme;
        }
        if (this.f23a == 0) {
            this.f23a = i.Theme_AppCompat_Light;
        }
        c();
        return this.f24b;
    }

    public void setTheme(int i) {
        if (this.f23a != i) {
            this.f23a = i;
            c();
        }
    }
}
