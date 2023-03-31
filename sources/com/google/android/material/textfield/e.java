package com.google.android.material.textfield;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;

/* access modifiers changed from: package-private */
public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    TextInputLayout f6015a;

    /* renamed from: b  reason: collision with root package name */
    Context f6016b;

    /* renamed from: c  reason: collision with root package name */
    CheckableImageButton f6017c;

    e(TextInputLayout textInputLayout) {
        this.f6015a = textInputLayout;
        this.f6016b = textInputLayout.getContext();
        this.f6017c = textInputLayout.getEndIconView();
    }

    /* access modifiers changed from: package-private */
    public abstract void a();

    /* access modifiers changed from: package-private */
    public boolean a(int i) {
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean b() {
        return false;
    }
}
