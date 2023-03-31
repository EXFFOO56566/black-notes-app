package androidx.appcompat.widget;

import a.g.l.u;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public class SearchView extends i0 implements a.a.n.c {
    static final k r0 = new k();
    private Rect A;
    private Rect B;
    private int[] C;
    private int[] D;
    private final ImageView E;
    private final Drawable F;
    private final int G;
    private final int H;
    private final Intent I;
    private final Intent J;
    private final CharSequence K;
    private m L;
    private l M;
    View.OnFocusChangeListener N;
    private n O;
    private View.OnClickListener P;
    private boolean Q;
    private boolean R;
    a.h.a.a S;
    private boolean T;
    private CharSequence U;
    private boolean V;
    private boolean W;
    private int a0;
    private boolean b0;
    private CharSequence c0;
    private CharSequence d0;
    private boolean e0;
    private int f0;
    SearchableInfo g0;
    private Bundle h0;
    private final Runnable i0;
    private Runnable j0;
    private final WeakHashMap<String, Drawable.ConstantState> k0;
    private final View.OnClickListener l0;
    View.OnKeyListener m0;
    private final TextView.OnEditorActionListener n0;
    private final AdapterView.OnItemClickListener o0;
    private final AdapterView.OnItemSelectedListener p0;
    final SearchAutoComplete q;
    private TextWatcher q0;
    private final View r;
    private final View s;
    private final View t;
    final ImageView u;
    final ImageView v;
    final ImageView w;
    final ImageView x;
    private final View y;
    private p z;

    public static class SearchAutoComplete extends d {
        private int e;
        private SearchView f;
        private boolean g;
        final Runnable h;

        class a implements Runnable {
            a() {
            }

            public void run() {
                SearchAutoComplete.this.b();
            }
        }

        public SearchAutoComplete(Context context) {
            this(context, null);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, a.a.a.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.h = new a();
            this.e = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i < 600) {
                return (i < 640 || i2 < 480) ? 160 : 192;
            }
            return 192;
        }

        /* access modifiers changed from: package-private */
        public boolean a() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        /* access modifiers changed from: package-private */
        public void b() {
            if (this.g) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.g = false;
            }
        }

        public boolean enoughToFilter() {
            return this.e <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.d
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.g) {
                removeCallbacks(this.h);
                post(this.h);
            }
            return onCreateInputConnection;
        }

        /* access modifiers changed from: protected */
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        /* access modifiers changed from: protected */
        public void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            this.f.j();
        }

        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f.hasFocus() && getVisibility() == 0) {
                this.g = true;
                if (SearchView.a(getContext())) {
                    SearchView.r0.a(this, true);
                }
            }
        }

        public void performCompletion() {
        }

        /* access modifiers changed from: protected */
        public void replaceText(CharSequence charSequence) {
        }

        /* access modifiers changed from: package-private */
        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.g = false;
                removeCallbacks(this.h);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.g = false;
                removeCallbacks(this.h);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.g = true;
            }
        }

        /* access modifiers changed from: package-private */
        public void setSearchView(SearchView searchView) {
            this.f = searchView;
        }

        public void setThreshold(int i) {
            super.setThreshold(i);
            this.e = i;
        }
    }

    class a implements TextWatcher {
        a() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            SearchView.this.b(charSequence);
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            SearchView.this.l();
        }
    }

    class c implements Runnable {
        c() {
        }

        public void run() {
            a.h.a.a aVar = SearchView.this.S;
            if (aVar instanceof q0) {
                aVar.a((Cursor) null);
            }
        }
    }

    class d implements View.OnFocusChangeListener {
        d() {
        }

        public void onFocusChange(View view, boolean z) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.N;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z);
            }
        }
    }

    class e implements View.OnLayoutChangeListener {
        e() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            SearchView.this.d();
        }
    }

    class f implements View.OnClickListener {
        f() {
        }

        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.u) {
                searchView.h();
            } else if (view == searchView.w) {
                searchView.g();
            } else if (view == searchView.v) {
                searchView.i();
            } else if (view == searchView.x) {
                searchView.k();
            } else if (view == searchView.q) {
                searchView.e();
            }
        }
    }

    class g implements View.OnKeyListener {
        g() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.g0 == null) {
                return false;
            }
            if (searchView.q.isPopupShowing() && SearchView.this.q.getListSelection() != -1) {
                return SearchView.this.a(view, i, keyEvent);
            }
            if (SearchView.this.q.a() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.a(0, (String) null, searchView2.q.getText().toString());
            return true;
        }
    }

    class h implements TextView.OnEditorActionListener {
        h() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            SearchView.this.i();
            return true;
        }
    }

    class i implements AdapterView.OnItemClickListener {
        i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.a(i, 0, (String) null);
        }
    }

    class j implements AdapterView.OnItemSelectedListener {
        j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.d(i);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* access modifiers changed from: private */
    public static class k {

        /* renamed from: a  reason: collision with root package name */
        private Method f577a;

        /* renamed from: b  reason: collision with root package name */
        private Method f578b;

        /* renamed from: c  reason: collision with root package name */
        private Method f579c;

        k() {
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f577a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f578b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f579c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        /* access modifiers changed from: package-private */
        public void a(AutoCompleteTextView autoCompleteTextView) {
            Method method = this.f578b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void a(AutoCompleteTextView autoCompleteTextView, boolean z) {
            Method method = this.f579c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.valueOf(z));
                } catch (Exception unused) {
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void b(AutoCompleteTextView autoCompleteTextView) {
            Method method = this.f577a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }
    }

    public interface l {
        boolean a();
    }

    public interface m {
        boolean a(String str);

        boolean b(String str);
    }

    public interface n {
        boolean a(int i);

        boolean b(int i);
    }

    /* access modifiers changed from: package-private */
    public static class o extends a.i.a.a {
        public static final Parcelable.Creator<o> CREATOR = new a();
        boolean d;

        static class a implements Parcelable.ClassLoaderCreator<o> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public o createFromParcel(Parcel parcel) {
                return new o(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public o createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new o(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public o[] newArray(int i) {
                return new o[i];
            }
        }

        public o(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.d = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        o(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.d + "}";
        }

        @Override // a.i.a.a
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.d));
        }
    }

    private static class p extends TouchDelegate {

        /* renamed from: a  reason: collision with root package name */
        private final View f580a;

        /* renamed from: b  reason: collision with root package name */
        private final Rect f581b = new Rect();

        /* renamed from: c  reason: collision with root package name */
        private final Rect f582c = new Rect();
        private final Rect d = new Rect();
        private final int e;
        private boolean f;

        public p(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            a(rect, rect2);
            this.f580a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.f581b.set(rect);
            this.d.set(rect);
            Rect rect3 = this.d;
            int i = this.e;
            rect3.inset(-i, -i);
            this.f582c.set(rect2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0041  */
        /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouchEvent(android.view.MotionEvent r8) {
            /*
            // Method dump skipped, instructions count: 111
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.p.onTouchEvent(android.view.MotionEvent):boolean");
        }
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.a.a.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.A = new Rect();
        this.B = new Rect();
        this.C = new int[2];
        this.D = new int[2];
        this.i0 = new b();
        this.j0 = new c();
        this.k0 = new WeakHashMap<>();
        this.l0 = new f();
        this.m0 = new g();
        this.n0 = new h();
        this.o0 = new i();
        this.p0 = new j();
        this.q0 = new a();
        w0 a2 = w0.a(context, attributeSet, a.a.j.SearchView, i2, 0);
        LayoutInflater.from(context).inflate(a2.g(a.a.j.SearchView_layout, a.a.g.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(a.a.f.search_src_text);
        this.q = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.r = findViewById(a.a.f.search_edit_frame);
        this.s = findViewById(a.a.f.search_plate);
        this.t = findViewById(a.a.f.submit_area);
        this.u = (ImageView) findViewById(a.a.f.search_button);
        this.v = (ImageView) findViewById(a.a.f.search_go_btn);
        this.w = (ImageView) findViewById(a.a.f.search_close_btn);
        this.x = (ImageView) findViewById(a.a.f.search_voice_btn);
        this.E = (ImageView) findViewById(a.a.f.search_mag_icon);
        u.a(this.s, a2.b(a.a.j.SearchView_queryBackground));
        u.a(this.t, a2.b(a.a.j.SearchView_submitBackground));
        this.u.setImageDrawable(a2.b(a.a.j.SearchView_searchIcon));
        this.v.setImageDrawable(a2.b(a.a.j.SearchView_goIcon));
        this.w.setImageDrawable(a2.b(a.a.j.SearchView_closeIcon));
        this.x.setImageDrawable(a2.b(a.a.j.SearchView_voiceIcon));
        this.E.setImageDrawable(a2.b(a.a.j.SearchView_searchIcon));
        this.F = a2.b(a.a.j.SearchView_searchHintIcon);
        y0.a(this.u, getResources().getString(a.a.h.abc_searchview_description_search));
        this.G = a2.g(a.a.j.SearchView_suggestionRowLayout, a.a.g.abc_search_dropdown_item_icons_2line);
        this.H = a2.g(a.a.j.SearchView_commitIcon, 0);
        this.u.setOnClickListener(this.l0);
        this.w.setOnClickListener(this.l0);
        this.v.setOnClickListener(this.l0);
        this.x.setOnClickListener(this.l0);
        this.q.setOnClickListener(this.l0);
        this.q.addTextChangedListener(this.q0);
        this.q.setOnEditorActionListener(this.n0);
        this.q.setOnItemClickListener(this.o0);
        this.q.setOnItemSelectedListener(this.p0);
        this.q.setOnKeyListener(this.m0);
        this.q.setOnFocusChangeListener(new d());
        setIconifiedByDefault(a2.a(a.a.j.SearchView_iconifiedByDefault, true));
        int c2 = a2.c(a.a.j.SearchView_android_maxWidth, -1);
        if (c2 != -1) {
            setMaxWidth(c2);
        }
        this.K = a2.e(a.a.j.SearchView_defaultQueryHint);
        this.U = a2.e(a.a.j.SearchView_queryHint);
        int d2 = a2.d(a.a.j.SearchView_android_imeOptions, -1);
        if (d2 != -1) {
            setImeOptions(d2);
        }
        int d3 = a2.d(a.a.j.SearchView_android_inputType, -1);
        if (d3 != -1) {
            setInputType(d3);
        }
        setFocusable(a2.a(a.a.j.SearchView_android_focusable, true));
        a2.a();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.I = intent;
        intent.addFlags(268435456);
        this.I.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.J = intent2;
        intent2.addFlags(268435456);
        View findViewById = findViewById(this.q.getDropDownAnchor());
        this.y = findViewById;
        if (findViewById != null) {
            findViewById.addOnLayoutChangeListener(new e());
        }
        b(this.Q);
        r();
    }

    private Intent a(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.h0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        int i2 = 1;
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String str = null;
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i2 = searchableInfo.getVoiceMaxResults();
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i2);
        if (searchActivity != null) {
            str = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    private Intent a(Cursor cursor, int i2, String str) {
        int i3;
        String a2;
        try {
            String a3 = q0.a(cursor, "suggest_intent_action");
            if (a3 == null) {
                a3 = this.g0.getSuggestIntentAction();
            }
            if (a3 == null) {
                a3 = "android.intent.action.SEARCH";
            }
            String a4 = q0.a(cursor, "suggest_intent_data");
            if (a4 == null) {
                a4 = this.g0.getSuggestIntentData();
            }
            if (!(a4 == null || (a2 = q0.a(cursor, "suggest_intent_data_id")) == null)) {
                a4 = a4 + "/" + Uri.encode(a2);
            }
            return a(a3, a4 == null ? null : Uri.parse(a4), q0.a(cursor, "suggest_intent_extra_data"), q0.a(cursor, "suggest_intent_query"), i2, str);
        } catch (RuntimeException e2) {
            try {
                i3 = cursor.getPosition();
            } catch (RuntimeException unused) {
                i3 = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + i3 + " returned exception.", e2);
            return null;
        }
    }

    private Intent a(String str, Uri uri, String str2, String str3, int i2, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.d0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.h0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i2 != 0) {
            intent.putExtra("action_key", i2);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.g0.getSearchActivity());
        return intent;
    }

    private void a(Intent intent) {
        if (intent != null) {
            try {
                getContext().startActivity(intent);
            } catch (RuntimeException e2) {
                Log.e("SearchView", "Failed launch activity: " + intent, e2);
            }
        }
    }

    private void a(View view, Rect rect) {
        view.getLocationInWindow(this.C);
        getLocationInWindow(this.D);
        int[] iArr = this.C;
        int i2 = iArr[1];
        int[] iArr2 = this.D;
        int i3 = i2 - iArr2[1];
        int i4 = iArr[0] - iArr2[0];
        rect.set(i4, i3, view.getWidth() + i4, view.getHeight() + i3);
    }

    private void a(boolean z2) {
        this.v.setVisibility((!this.T || !o() || !hasFocus() || (!z2 && this.b0)) ? 8 : 0);
    }

    static boolean a(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private Intent b(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    private void b(boolean z2) {
        this.R = z2;
        int i2 = 0;
        int i3 = z2 ? 0 : 8;
        boolean z3 = !TextUtils.isEmpty(this.q.getText());
        this.u.setVisibility(i3);
        a(z3);
        this.r.setVisibility(z2 ? 8 : 0);
        if (this.E.getDrawable() == null || this.Q) {
            i2 = 8;
        }
        this.E.setVisibility(i2);
        q();
        c(!z3);
        t();
    }

    private boolean b(int i2, int i3, String str) {
        Cursor a2 = this.S.a();
        if (a2 == null || !a2.moveToPosition(i2)) {
            return false;
        }
        a(a(a2, i3, str));
        return true;
    }

    private CharSequence c(CharSequence charSequence) {
        if (!this.Q || this.F == null) {
            return charSequence;
        }
        int textSize = (int) (((double) this.q.getTextSize()) * 1.25d);
        this.F.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.F), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private void c(boolean z2) {
        int i2 = 8;
        if (this.b0 && !f() && z2) {
            this.v.setVisibility(8);
            i2 = 0;
        }
        this.x.setVisibility(i2);
    }

    private void e(int i2) {
        CharSequence b2;
        Editable text = this.q.getText();
        Cursor a2 = this.S.a();
        if (a2 != null) {
            if (!a2.moveToPosition(i2) || (b2 = this.S.b(a2)) == null) {
                setQuery(text);
            } else {
                setQuery(b2);
            }
        }
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(a.a.d.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(a.a.d.abc_search_view_preferred_width);
    }

    private void m() {
        this.q.dismissDropDown();
    }

    private boolean n() {
        SearchableInfo searchableInfo = this.g0;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = null;
        if (this.g0.getVoiceSearchLaunchWebSearch()) {
            intent = this.I;
        } else if (this.g0.getVoiceSearchLaunchRecognizer()) {
            intent = this.J;
        }
        return (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
    }

    private boolean o() {
        return (this.T || this.b0) && !f();
    }

    private void p() {
        post(this.i0);
    }

    private void q() {
        boolean z2 = true;
        boolean z3 = !TextUtils.isEmpty(this.q.getText());
        int i2 = 0;
        if (!z3 && (!this.Q || this.e0)) {
            z2 = false;
        }
        ImageView imageView = this.w;
        if (!z2) {
            i2 = 8;
        }
        imageView.setVisibility(i2);
        Drawable drawable = this.w.getDrawable();
        if (drawable != null) {
            drawable.setState(z3 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    private void r() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.q;
        if (queryHint == null) {
            queryHint = BuildConfig.FLAVOR;
        }
        searchAutoComplete.setHint(c(queryHint));
    }

    private void s() {
        this.q.setThreshold(this.g0.getSuggestThreshold());
        this.q.setImeOptions(this.g0.getImeOptions());
        int inputType = this.g0.getInputType();
        int i2 = 1;
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.g0.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | 524288;
            }
        }
        this.q.setInputType(inputType);
        a.h.a.a aVar = this.S;
        if (aVar != null) {
            aVar.a((Cursor) null);
        }
        if (this.g0.getSuggestAuthority() != null) {
            q0 q0Var = new q0(getContext(), this, this.g0, this.k0);
            this.S = q0Var;
            this.q.setAdapter(q0Var);
            q0 q0Var2 = (q0) this.S;
            if (this.V) {
                i2 = 2;
            }
            q0Var2.a(i2);
        }
    }

    private void setQuery(CharSequence charSequence) {
        this.q.setText(charSequence);
        this.q.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    private void t() {
        this.t.setVisibility((!o() || !(this.v.getVisibility() == 0 || this.x.getVisibility() == 0)) ? 8 : 0);
    }

    @Override // a.a.n.c
    public void a() {
        if (!this.e0) {
            this.e0 = true;
            int imeOptions = this.q.getImeOptions();
            this.f0 = imeOptions;
            this.q.setImeOptions(imeOptions | 33554432);
            this.q.setText(BuildConfig.FLAVOR);
            setIconified(false);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, String str, String str2) {
        getContext().startActivity(a("android.intent.action.SEARCH", (Uri) null, (String) null, str2, i2, str));
    }

    /* access modifiers changed from: package-private */
    public void a(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public void a(CharSequence charSequence, boolean z2) {
        this.q.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.q;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.d0 = charSequence;
        }
        if (z2 && !TextUtils.isEmpty(charSequence)) {
            i();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean a(int i2, int i3, String str) {
        n nVar = this.O;
        if (nVar != null && nVar.b(i2)) {
            return false;
        }
        b(i2, 0, null);
        this.q.setImeVisibility(false);
        m();
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean a(View view, int i2, KeyEvent keyEvent) {
        if (this.g0 != null && this.S != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i2 == 66 || i2 == 84 || i2 == 61) {
                return a(this.q.getListSelection(), 0, (String) null);
            }
            if (i2 == 21 || i2 == 22) {
                this.q.setSelection(i2 == 21 ? 0 : this.q.length());
                this.q.setListSelection(0);
                this.q.clearListSelection();
                r0.a(this.q, true);
                return true;
            } else if (i2 != 19 || this.q.getListSelection() == 0) {
                return false;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void b(CharSequence charSequence) {
        Editable text = this.q.getText();
        this.d0 = text;
        boolean z2 = !TextUtils.isEmpty(text);
        a(z2);
        c(!z2);
        q();
        t();
        if (this.L != null && !TextUtils.equals(charSequence, this.c0)) {
            this.L.a(charSequence.toString());
        }
        this.c0 = charSequence.toString();
    }

    @Override // a.a.n.c
    public void c() {
        a(BuildConfig.FLAVOR, false);
        clearFocus();
        b(true);
        this.q.setImeOptions(this.f0);
        this.e0 = false;
    }

    public void clearFocus() {
        this.W = true;
        super.clearFocus();
        this.q.clearFocus();
        this.q.setImeVisibility(false);
        this.W = false;
    }

    /* access modifiers changed from: package-private */
    public void d() {
        if (this.y.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.s.getPaddingLeft();
            Rect rect = new Rect();
            boolean a2 = c1.a(this);
            int dimensionPixelSize = this.Q ? resources.getDimensionPixelSize(a.a.d.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(a.a.d.abc_dropdownitem_text_padding_left) : 0;
            this.q.getDropDownBackground().getPadding(rect);
            int i2 = rect.left;
            this.q.setDropDownHorizontalOffset(a2 ? -i2 : paddingLeft - (i2 + dimensionPixelSize));
            this.q.setDropDownWidth((((this.y.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean d(int i2) {
        n nVar = this.O;
        if (nVar != null && nVar.a(i2)) {
            return false;
        }
        e(i2);
        return true;
    }

    /* access modifiers changed from: package-private */
    public void e() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.q.refreshAutoCompleteResults();
            return;
        }
        r0.b(this.q);
        r0.a(this.q);
    }

    public boolean f() {
        return this.R;
    }

    /* access modifiers changed from: package-private */
    public void g() {
        if (!TextUtils.isEmpty(this.q.getText())) {
            this.q.setText(BuildConfig.FLAVOR);
            this.q.requestFocus();
            this.q.setImeVisibility(true);
        } else if (this.Q) {
            l lVar = this.M;
            if (lVar == null || !lVar.a()) {
                clearFocus();
                b(true);
            }
        }
    }

    public int getImeOptions() {
        return this.q.getImeOptions();
    }

    public int getInputType() {
        return this.q.getInputType();
    }

    public int getMaxWidth() {
        return this.a0;
    }

    public CharSequence getQuery() {
        return this.q.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.U;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.g0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.K : getContext().getText(this.g0.getHintId());
    }

    /* access modifiers changed from: package-private */
    public int getSuggestionCommitIconResId() {
        return this.H;
    }

    /* access modifiers changed from: package-private */
    public int getSuggestionRowLayout() {
        return this.G;
    }

    public a.h.a.a getSuggestionsAdapter() {
        return this.S;
    }

    /* access modifiers changed from: package-private */
    public void h() {
        b(false);
        this.q.requestFocus();
        this.q.setImeVisibility(true);
        View.OnClickListener onClickListener = this.P;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    /* access modifiers changed from: package-private */
    public void i() {
        Editable text = this.q.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            m mVar = this.L;
            if (mVar == null || !mVar.b(text.toString())) {
                if (this.g0 != null) {
                    a(0, (String) null, text.toString());
                }
                this.q.setImeVisibility(false);
                m();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void j() {
        b(f());
        p();
        if (this.q.hasFocus()) {
            e();
        }
    }

    /* access modifiers changed from: package-private */
    public void k() {
        Intent a2;
        SearchableInfo searchableInfo = this.g0;
        if (searchableInfo != null) {
            try {
                if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                    a2 = b(this.I, searchableInfo);
                } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    a2 = a(this.J, searchableInfo);
                } else {
                    return;
                }
                getContext().startActivity(a2);
            } catch (ActivityNotFoundException unused) {
                Log.w("SearchView", "Could not find voice search activity");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void l() {
        int[] iArr = this.q.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.s.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.t.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.i0);
        post(this.j0);
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.i0
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        if (z2) {
            a(this.q, this.A);
            Rect rect = this.B;
            Rect rect2 = this.A;
            rect.set(rect2.left, 0, rect2.right, i5 - i3);
            p pVar = this.z;
            if (pVar == null) {
                p pVar2 = new p(this.B, this.A, this.q);
                this.z = pVar2;
                setTouchDelegate(pVar2);
                return;
            }
            pVar.a(this.B, this.A);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        if (r0 <= 0) goto L_0x0039;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004b  */
    @Override // androidx.appcompat.widget.i0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            boolean r0 = r3.f()
            if (r0 == 0) goto L_0x000a
            super.onMeasure(r4, r5)
            return
        L_0x000a:
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L_0x002c
            if (r0 == 0) goto L_0x0022
            if (r0 == r2) goto L_0x001d
            goto L_0x0039
        L_0x001d:
            int r0 = r3.a0
            if (r0 <= 0) goto L_0x0039
            goto L_0x0030
        L_0x0022:
            int r4 = r3.a0
            if (r4 <= 0) goto L_0x0027
            goto L_0x0039
        L_0x0027:
            int r4 = r3.getPreferredWidth()
            goto L_0x0039
        L_0x002c:
            int r0 = r3.a0
            if (r0 <= 0) goto L_0x0031
        L_0x0030:
            goto L_0x0035
        L_0x0031:
            int r0 = r3.getPreferredWidth()
        L_0x0035:
            int r4 = java.lang.Math.min(r0, r4)
        L_0x0039:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            if (r0 == r1) goto L_0x004b
            if (r0 == 0) goto L_0x0046
            goto L_0x0053
        L_0x0046:
            int r5 = r3.getPreferredHeight()
            goto L_0x0053
        L_0x004b:
            int r0 = r3.getPreferredHeight()
            int r5 = java.lang.Math.min(r0, r5)
        L_0x0053:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r2)
            super.onMeasure(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.onMeasure(int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof o)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        o oVar = (o) parcelable;
        super.onRestoreInstanceState(oVar.a());
        b(oVar.d);
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        o oVar = new o(super.onSaveInstanceState());
        oVar.d = f();
        return oVar;
    }

    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        p();
    }

    public boolean requestFocus(int i2, Rect rect) {
        if (this.W || !isFocusable()) {
            return false;
        }
        if (f()) {
            return super.requestFocus(i2, rect);
        }
        boolean requestFocus = this.q.requestFocus(i2, rect);
        if (requestFocus) {
            b(false);
        }
        return requestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.h0 = bundle;
    }

    public void setIconified(boolean z2) {
        if (z2) {
            g();
        } else {
            h();
        }
    }

    public void setIconifiedByDefault(boolean z2) {
        if (this.Q != z2) {
            this.Q = z2;
            b(z2);
            r();
        }
    }

    public void setImeOptions(int i2) {
        this.q.setImeOptions(i2);
    }

    public void setInputType(int i2) {
        this.q.setInputType(i2);
    }

    public void setMaxWidth(int i2) {
        this.a0 = i2;
        requestLayout();
    }

    public void setOnCloseListener(l lVar) {
        this.M = lVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.N = onFocusChangeListener;
    }

    public void setOnQueryTextListener(m mVar) {
        this.L = mVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.P = onClickListener;
    }

    public void setOnSuggestionListener(n nVar) {
        this.O = nVar;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.U = charSequence;
        r();
    }

    public void setQueryRefinementEnabled(boolean z2) {
        this.V = z2;
        a.h.a.a aVar = this.S;
        if (aVar instanceof q0) {
            ((q0) aVar).a(z2 ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.g0 = searchableInfo;
        if (searchableInfo != null) {
            s();
            r();
        }
        boolean n2 = n();
        this.b0 = n2;
        if (n2) {
            this.q.setPrivateImeOptions("nm");
        }
        b(f());
    }

    public void setSubmitButtonEnabled(boolean z2) {
        this.T = z2;
        b(f());
    }

    public void setSuggestionsAdapter(a.h.a.a aVar) {
        this.S = aVar;
        this.q.setAdapter(aVar);
    }
}
