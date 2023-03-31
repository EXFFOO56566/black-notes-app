package com.google.android.material.datepicker;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import b.c.b.b.h;
import b.c.b.b.i;
import java.util.Calendar;
import java.util.Locale;

class f extends BaseAdapter {
    private static final int e = (Build.VERSION.SDK_INT >= 26 ? 4 : 1);

    /* renamed from: b  reason: collision with root package name */
    private final Calendar f5899b;

    /* renamed from: c  reason: collision with root package name */
    private final int f5900c;
    private final int d = this.f5899b.getFirstDayOfWeek();

    public f() {
        Calendar d2 = o.d();
        this.f5899b = d2;
        this.f5900c = d2.getMaximum(7);
    }

    private int a(int i) {
        int i2 = i + this.d;
        int i3 = this.f5900c;
        return i2 > i3 ? i2 - i3 : i2;
    }

    public int getCount() {
        return this.f5900c;
    }

    public Integer getItem(int i) {
        if (i >= this.f5900c) {
            return null;
        }
        return Integer.valueOf(a(i));
    }

    public long getItemId(int i) {
        return 0;
    }

    @SuppressLint({"WrongConstant"})
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(h.mtrl_calendar_day_of_week, viewGroup, false);
        }
        this.f5899b.set(7, a(i));
        textView.setText(this.f5899b.getDisplayName(7, e, Locale.getDefault()));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(i.mtrl_picker_day_of_week_column_header), this.f5899b.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }
}
