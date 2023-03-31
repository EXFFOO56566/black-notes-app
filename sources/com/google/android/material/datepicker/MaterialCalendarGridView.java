package com.google.android.material.datepicker;

import a.g.k.d;
import a.g.l.d0.c;
import a.g.l.u;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import b.c.b.b.f;
import java.util.Calendar;

final class MaterialCalendarGridView extends GridView {

    /* renamed from: b  reason: collision with root package name */
    private final Calendar f5890b;

    class a extends a.g.l.a {
        a() {
        }

        @Override // a.g.l.a
        public void a(View view, c cVar) {
            super.a(view, cVar);
            cVar.a((Object) null);
        }
    }

    public MaterialCalendarGridView(Context context) {
        this(context, null);
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5890b = o.d();
        if (h.b(getContext())) {
            setNextFocusLeftId(f.cancel_button);
            setNextFocusRightId(f.confirm_button);
        }
        u.a(this, new a());
    }

    private static int a(View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }

    private void a(int i, Rect rect) {
        int a2;
        if (i == 33) {
            a2 = getAdapter().b();
        } else if (i == 130) {
            a2 = getAdapter().a();
        } else {
            super.onFocusChanged(true, i, rect);
            return;
        }
        setSelection(a2);
    }

    private static boolean a(Long l, Long l2, Long l3, Long l4) {
        return l == null || l2 == null || l3 == null || l4 == null || l3.longValue() > l2.longValue() || l4.longValue() < l.longValue();
    }

    @Override // android.widget.GridView, android.widget.GridView, android.widget.AdapterView
    public j getAdapter() {
        return (j) super.getAdapter();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        j adapter = getAdapter();
        d<?> dVar = adapter.f5920c;
        c cVar = adapter.d;
        Long item = adapter.getItem(adapter.a());
        Long item2 = adapter.getItem(adapter.b());
        for (d<Long, Long> dVar2 : dVar.c()) {
            F f = dVar2.f192a;
            if (f != null) {
                if (dVar2.f193b == null) {
                    continue;
                } else {
                    long longValue = f.longValue();
                    long longValue2 = dVar2.f193b.longValue();
                    if (!a(item, item2, Long.valueOf(longValue), Long.valueOf(longValue2))) {
                        if (longValue < item.longValue()) {
                            i2 = adapter.a();
                            i = adapter.b(i2) ? 0 : materialCalendarGridView.getChildAt(i2 - 1).getRight();
                        } else {
                            materialCalendarGridView.f5890b.setTimeInMillis(longValue);
                            i2 = adapter.a(materialCalendarGridView.f5890b.get(5));
                            i = a(materialCalendarGridView.getChildAt(i2));
                        }
                        if (longValue2 > item2.longValue()) {
                            i4 = adapter.b();
                            i3 = adapter.c(i4) ? getWidth() : materialCalendarGridView.getChildAt(i4).getRight();
                        } else {
                            materialCalendarGridView.f5890b.setTimeInMillis(longValue2);
                            i4 = adapter.a(materialCalendarGridView.f5890b.get(5));
                            i3 = a(materialCalendarGridView.getChildAt(i4));
                        }
                        int itemId = (int) adapter.getItemId(i2);
                        int itemId2 = (int) adapter.getItemId(i4);
                        while (itemId <= itemId2) {
                            int numColumns = getNumColumns() * itemId;
                            int numColumns2 = (getNumColumns() + numColumns) - 1;
                            View childAt = materialCalendarGridView.getChildAt(numColumns);
                            canvas.drawRect((float) (numColumns > i2 ? 0 : i), (float) (childAt.getTop() + cVar.f5896a.b()), (float) (i4 > numColumns2 ? getWidth() : i3), (float) (childAt.getBottom() - cVar.f5896a.a()), cVar.h);
                            itemId++;
                            materialCalendarGridView = this;
                        }
                    } else {
                        return;
                    }
                }
            }
            materialCalendarGridView = this;
        }
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i, Rect rect) {
        if (z) {
            a(i, rect);
        } else {
            super.onFocusChanged(false, i, rect);
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().a()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(getAdapter().a());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView
    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof j) {
            super.setAdapter(listAdapter);
        } else {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), j.class.getCanonicalName()));
        }
    }

    public void setSelection(int i) {
        if (i < getAdapter().a()) {
            i = getAdapter().a();
        }
        super.setSelection(i);
    }
}
