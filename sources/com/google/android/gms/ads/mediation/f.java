package com.google.android.gms.ads.mediation;

import android.os.Bundle;

public interface f {

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private int f1442a;

        public final Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putInt("capabilities", this.f1442a);
            return bundle;
        }

        public final a a(int i) {
            this.f1442a = 1;
            return this;
        }
    }

    void onDestroy();

    void onPause();

    void onResume();
}
