package com.google.android.material.internal;

import a.g.l.d0.c;
import a.g.l.u;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import android.widget.ImageButton;
import androidx.appcompat.widget.m;

public class CheckableImageButton extends m implements Checkable {
    private static final int[] g = {16842912};
    private boolean d;
    private boolean e;
    private boolean f;

    class a extends a.g.l.a {
        a() {
        }

        @Override // a.g.l.a
        public void a(View view, c cVar) {
            super.a(view, cVar);
            cVar.b(CheckableImageButton.this.a());
            cVar.c(CheckableImageButton.this.isChecked());
        }

        @Override // a.g.l.a
        public void b(View view, AccessibilityEvent accessibilityEvent) {
            super.b(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }
    }

    /* access modifiers changed from: package-private */
    public static class b extends a.i.a.a {
        public static final Parcelable.Creator<b> CREATOR = new a();
        boolean d;

        static class a implements Parcelable.ClassLoaderCreator<b> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public b createFromParcel(Parcel parcel) {
                return new b(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public b[] newArray(int i) {
                return new b[i];
            }
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            a(parcel);
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }

        private void a(Parcel parcel) {
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.d = z;
        }

        @Override // a.i.a.a
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.d ? 1 : 0);
        }
    }

    public CheckableImageButton(Context context) {
        this(context, null);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.a.a.imageButtonStyle);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = true;
        this.f = true;
        u.a(this, new a());
    }

    public boolean a() {
        return this.e;
    }

    public boolean isChecked() {
        return this.d;
    }

    public int[] onCreateDrawableState(int i) {
        return this.d ? ImageButton.mergeDrawableStates(super.onCreateDrawableState(i + g.length), g) : super.onCreateDrawableState(i);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.a());
        setChecked(bVar.d);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.d = this.d;
        return bVar;
    }

    public void setCheckable(boolean z) {
        if (this.e != z) {
            this.e = z;
            sendAccessibilityEvent(0);
        }
    }

    public void setChecked(boolean z) {
        if (this.e && this.d != z) {
            this.d = z;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public void setPressable(boolean z) {
        this.f = z;
    }

    public void setPressed(boolean z) {
        if (this.f) {
            super.setPressed(z);
        }
    }

    public void toggle() {
        setChecked(!this.d);
    }
}
