package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import androidx.lifecycle.e;

public class p extends Fragment {

    /* renamed from: b  reason: collision with root package name */
    private a f939b;

    /* access modifiers changed from: package-private */
    public interface a {
        void m0();

        void n0();

        void onResume();
    }

    public static void a(Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new p(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    private void a(e.a aVar) {
        Activity activity = getActivity();
        if (activity instanceof j) {
            ((j) activity).a().a(aVar);
        } else if (activity instanceof h) {
            e a2 = ((h) activity).a();
            if (a2 instanceof i) {
                ((i) a2).a(aVar);
            }
        }
    }

    private void a(a aVar) {
        if (aVar != null) {
            aVar.n0();
        }
    }

    private void b(a aVar) {
        if (aVar != null) {
            aVar.onResume();
        }
    }

    private void c(a aVar) {
        if (aVar != null) {
            aVar.m0();
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(this.f939b);
        a(e.a.ON_CREATE);
    }

    public void onDestroy() {
        super.onDestroy();
        a(e.a.ON_DESTROY);
        this.f939b = null;
    }

    public void onPause() {
        super.onPause();
        a(e.a.ON_PAUSE);
    }

    public void onResume() {
        super.onResume();
        b(this.f939b);
        a(e.a.ON_RESUME);
    }

    public void onStart() {
        super.onStart();
        c(this.f939b);
        a(e.a.ON_START);
    }

    public void onStop() {
        super.onStop();
        a(e.a.ON_STOP);
    }
}
