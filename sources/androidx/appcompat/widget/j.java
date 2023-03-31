package androidx.appcompat.widget;

import a.a.c;
import a.a.e;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.widget.m0;

public final class j {

    /* renamed from: b  reason: collision with root package name */
    private static final PorterDuff.Mode f641b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c  reason: collision with root package name */
    private static j f642c;

    /* renamed from: a  reason: collision with root package name */
    private m0 f643a;

    /* access modifiers changed from: package-private */
    public static class a implements m0.e {

        /* renamed from: a  reason: collision with root package name */
        private final int[] f644a = {e.abc_textfield_search_default_mtrl_alpha, e.abc_textfield_default_mtrl_alpha, e.abc_ab_share_pack_mtrl_alpha};

        /* renamed from: b  reason: collision with root package name */
        private final int[] f645b = {e.abc_ic_commit_search_api_mtrl_alpha, e.abc_seekbar_tick_mark_material, e.abc_ic_menu_share_mtrl_alpha, e.abc_ic_menu_copy_mtrl_am_alpha, e.abc_ic_menu_cut_mtrl_alpha, e.abc_ic_menu_selectall_mtrl_alpha, e.abc_ic_menu_paste_mtrl_am_alpha};

        /* renamed from: c  reason: collision with root package name */
        private final int[] f646c = {e.abc_textfield_activated_mtrl_alpha, e.abc_textfield_search_activated_mtrl_alpha, e.abc_cab_background_top_mtrl_alpha, e.abc_text_cursor_material, e.abc_text_select_handle_left_mtrl_dark, e.abc_text_select_handle_middle_mtrl_dark, e.abc_text_select_handle_right_mtrl_dark, e.abc_text_select_handle_left_mtrl_light, e.abc_text_select_handle_middle_mtrl_light, e.abc_text_select_handle_right_mtrl_light};
        private final int[] d = {e.abc_popup_background_mtrl_mult, e.abc_cab_background_internal_bg, e.abc_menu_hardkey_panel_mtrl_mult};
        private final int[] e = {e.abc_tab_indicator_material, e.abc_textfield_search_material};
        private final int[] f = {e.abc_btn_check_material, e.abc_btn_radio_material, e.abc_btn_check_material_anim, e.abc_btn_radio_material_anim};

        a() {
        }

        private ColorStateList a(Context context) {
            return b(context, 0);
        }

        private void a(Drawable drawable, int i, PorterDuff.Mode mode) {
            if (e0.a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = j.f641b;
            }
            drawable.setColorFilter(j.a(i, mode));
        }

        private boolean a(int[] iArr, int i) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        private ColorStateList b(Context context) {
            return b(context, r0.b(context, a.a.a.colorAccent));
        }

        private ColorStateList b(Context context, int i) {
            int b2 = r0.b(context, a.a.a.colorControlHighlight);
            int a2 = r0.a(context, a.a.a.colorButtonNormal);
            return new ColorStateList(new int[][]{r0.f691b, r0.d, r0.f692c, r0.f}, new int[]{a2, a.g.e.a.b(b2, i), a.g.e.a.b(b2, i), i});
        }

        private ColorStateList c(Context context) {
            return b(context, r0.b(context, a.a.a.colorButtonNormal));
        }

        private ColorStateList d(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList c2 = r0.c(context, a.a.a.colorSwitchThumbNormal);
            if (c2 == null || !c2.isStateful()) {
                iArr[0] = r0.f691b;
                iArr2[0] = r0.a(context, a.a.a.colorSwitchThumbNormal);
                iArr[1] = r0.e;
                iArr2[1] = r0.b(context, a.a.a.colorControlActivated);
                iArr[2] = r0.f;
                iArr2[2] = r0.b(context, a.a.a.colorSwitchThumbNormal);
            } else {
                iArr[0] = r0.f691b;
                iArr2[0] = c2.getColorForState(iArr[0], 0);
                iArr[1] = r0.e;
                iArr2[1] = r0.b(context, a.a.a.colorControlActivated);
                iArr[2] = r0.f;
                iArr2[2] = c2.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        @Override // androidx.appcompat.widget.m0.e
        public ColorStateList a(Context context, int i) {
            if (i == e.abc_edit_text_material) {
                return a.a.k.a.a.b(context, c.abc_tint_edittext);
            }
            if (i == e.abc_switch_track_mtrl_alpha) {
                return a.a.k.a.a.b(context, c.abc_tint_switch_track);
            }
            if (i == e.abc_switch_thumb_material) {
                return d(context);
            }
            if (i == e.abc_btn_default_mtrl_shape) {
                return c(context);
            }
            if (i == e.abc_btn_borderless_material) {
                return a(context);
            }
            if (i == e.abc_btn_colored_material) {
                return b(context);
            }
            if (i == e.abc_spinner_mtrl_am_alpha || i == e.abc_spinner_textfield_background_material) {
                return a.a.k.a.a.b(context, c.abc_tint_spinner);
            }
            if (a(this.f645b, i)) {
                return r0.c(context, a.a.a.colorControlNormal);
            }
            if (a(this.e, i)) {
                return a.a.k.a.a.b(context, c.abc_tint_default);
            }
            if (a(this.f, i)) {
                return a.a.k.a.a.b(context, c.abc_tint_btn_checkable);
            }
            if (i == e.abc_seekbar_thumb_material) {
                return a.a.k.a.a.b(context, c.abc_tint_seek_thumb);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.m0.e
        public PorterDuff.Mode a(int i) {
            if (i == e.abc_switch_thumb_material) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // androidx.appcompat.widget.m0.e
        public Drawable a(m0 m0Var, Context context, int i) {
            if (i != e.abc_cab_background_top_material) {
                return null;
            }
            return new LayerDrawable(new Drawable[]{m0Var.a(context, e.abc_cab_background_internal_bg), m0Var.a(context, e.abc_cab_background_top_mtrl_alpha)});
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0046  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0061 A[RETURN] */
        @Override // androidx.appcompat.widget.m0.e
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean a(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
            /*
                r6 = this;
                android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.j.a()
                int[] r1 = r6.f644a
                boolean r1 = r6.a(r1, r8)
                r2 = 16842801(0x1010031, float:2.3693695E-38)
                r3 = -1
                r4 = 0
                r5 = 1
                if (r1 == 0) goto L_0x0017
                int r2 = a.a.a.colorControlNormal
            L_0x0014:
                r8 = -1
            L_0x0015:
                r1 = 1
                goto L_0x0044
            L_0x0017:
                int[] r1 = r6.f646c
                boolean r1 = r6.a(r1, r8)
                if (r1 == 0) goto L_0x0022
                int r2 = a.a.a.colorControlActivated
                goto L_0x0014
            L_0x0022:
                int[] r1 = r6.d
                boolean r1 = r6.a(r1, r8)
                if (r1 == 0) goto L_0x002d
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
                goto L_0x0014
            L_0x002d:
                int r1 = a.a.e.abc_list_divider_mtrl_alpha
                if (r8 != r1) goto L_0x003c
                r2 = 16842800(0x1010030, float:2.3693693E-38)
                r8 = 1109603123(0x42233333, float:40.8)
                int r8 = java.lang.Math.round(r8)
                goto L_0x0015
            L_0x003c:
                int r1 = a.a.e.abc_dialog_material_background
                if (r8 != r1) goto L_0x0041
                goto L_0x0014
            L_0x0041:
                r8 = -1
                r1 = 0
                r2 = 0
            L_0x0044:
                if (r1 == 0) goto L_0x0061
                boolean r1 = androidx.appcompat.widget.e0.a(r9)
                if (r1 == 0) goto L_0x0050
                android.graphics.drawable.Drawable r9 = r9.mutate()
            L_0x0050:
                int r7 = androidx.appcompat.widget.r0.b(r7, r2)
                android.graphics.PorterDuffColorFilter r7 = androidx.appcompat.widget.j.a(r7, r0)
                r9.setColorFilter(r7)
                if (r8 == r3) goto L_0x0060
                r9.setAlpha(r8)
            L_0x0060:
                return r5
            L_0x0061:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.j.a.a(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        @Override // androidx.appcompat.widget.m0.e
        public boolean b(Context context, int i, Drawable drawable) {
            LayerDrawable layerDrawable;
            Drawable findDrawableByLayerId;
            int i2;
            if (i == e.abc_seekbar_track_material) {
                layerDrawable = (LayerDrawable) drawable;
                a(layerDrawable.findDrawableByLayerId(16908288), r0.b(context, a.a.a.colorControlNormal), j.f641b);
                findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908303);
                i2 = a.a.a.colorControlNormal;
            } else if (i != e.abc_ratingbar_material && i != e.abc_ratingbar_indicator_material && i != e.abc_ratingbar_small_material) {
                return false;
            } else {
                layerDrawable = (LayerDrawable) drawable;
                a(layerDrawable.findDrawableByLayerId(16908288), r0.a(context, a.a.a.colorControlNormal), j.f641b);
                findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908303);
                i2 = a.a.a.colorControlActivated;
            }
            a(findDrawableByLayerId, r0.b(context, i2), j.f641b);
            a(layerDrawable.findDrawableByLayerId(16908301), r0.b(context, a.a.a.colorControlActivated), j.f641b);
            return true;
        }
    }

    public static synchronized PorterDuffColorFilter a(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter a2;
        synchronized (j.class) {
            a2 = m0.a(i, mode);
        }
        return a2;
    }

    static void a(Drawable drawable, u0 u0Var, int[] iArr) {
        m0.a(drawable, u0Var, iArr);
    }

    public static synchronized j b() {
        j jVar;
        synchronized (j.class) {
            if (f642c == null) {
                c();
            }
            jVar = f642c;
        }
        return jVar;
    }

    public static synchronized void c() {
        synchronized (j.class) {
            if (f642c == null) {
                j jVar = new j();
                f642c = jVar;
                jVar.f643a = m0.a();
                f642c.f643a.a(new a());
            }
        }
    }

    public synchronized Drawable a(Context context, int i) {
        return this.f643a.a(context, i);
    }

    /* access modifiers changed from: package-private */
    public synchronized Drawable a(Context context, int i, boolean z) {
        return this.f643a.a(context, i, z);
    }

    public synchronized void a(Context context) {
        this.f643a.a(context);
    }

    /* access modifiers changed from: package-private */
    public synchronized ColorStateList b(Context context, int i) {
        return this.f643a.b(context, i);
    }
}
