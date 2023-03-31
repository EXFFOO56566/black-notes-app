package androidx.appcompat.view.menu;

import a.a.g;
import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.b;
import androidx.appcompat.view.menu.m;
import com.github.ajalt.reprint.module.spass.SpassReprintModule;

class h implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, m.a {

    /* renamed from: b  reason: collision with root package name */
    private g f527b;

    /* renamed from: c  reason: collision with root package name */
    private b f528c;
    e d;
    private m.a e;

    public h(g gVar) {
        this.f527b = gVar;
    }

    public void a() {
        b bVar = this.f528c;
        if (bVar != null) {
            bVar.dismiss();
        }
    }

    public void a(IBinder iBinder) {
        g gVar = this.f527b;
        b.a aVar = new b.a(gVar.e());
        e eVar = new e(aVar.b(), g.abc_list_menu_item_layout);
        this.d = eVar;
        eVar.a(this);
        this.f527b.a(this.d);
        aVar.a(this.d.b(), this);
        View i = gVar.i();
        if (i != null) {
            aVar.a(i);
        } else {
            aVar.a(gVar.g());
            aVar.a(gVar.h());
        }
        aVar.a(this);
        b a2 = aVar.a();
        this.f528c = a2;
        a2.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f528c.getWindow().getAttributes();
        attributes.type = SpassReprintModule.STATUS_LOCKED_OUT;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f528c.show();
    }

    @Override // androidx.appcompat.view.menu.m.a
    public void a(g gVar, boolean z) {
        if (z || gVar == this.f527b) {
            a();
        }
        m.a aVar = this.e;
        if (aVar != null) {
            aVar.a(gVar, z);
        }
    }

    @Override // androidx.appcompat.view.menu.m.a
    public boolean a(g gVar) {
        m.a aVar = this.e;
        if (aVar != null) {
            return aVar.a(gVar);
        }
        return false;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f527b.a((i) this.d.b().getItem(i), 0);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.d.a(this.f527b, true);
    }

    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f528c.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f528c.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f527b.a(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f527b.performShortcut(i, keyEvent, 0);
    }
}
