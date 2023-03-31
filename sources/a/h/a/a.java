package a.h.a;

import a.h.a.b;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

public abstract class a extends BaseAdapter implements Filterable, b.a {

    /* renamed from: b  reason: collision with root package name */
    protected boolean f256b;

    /* renamed from: c  reason: collision with root package name */
    protected boolean f257c;
    protected Cursor d;
    protected Context e;
    protected int f;
    protected C0021a g;
    protected DataSetObserver h;
    protected b i;

    /* access modifiers changed from: private */
    /* renamed from: a.h.a.a$a  reason: collision with other inner class name */
    public class C0021a extends ContentObserver {
        C0021a() {
            super(new Handler());
        }

        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean z) {
            a.this.b();
        }
    }

    /* access modifiers changed from: private */
    public class b extends DataSetObserver {
        b() {
        }

        public void onChanged() {
            a aVar = a.this;
            aVar.f256b = true;
            aVar.notifyDataSetChanged();
        }

        public void onInvalidated() {
            a aVar = a.this;
            aVar.f256b = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context, Cursor cursor, boolean z) {
        a(context, cursor, z ? 1 : 2);
    }

    @Override // a.h.a.b.a
    public Cursor a() {
        return this.d;
    }

    public abstract View a(Context context, Cursor cursor, ViewGroup viewGroup);

    /* access modifiers changed from: package-private */
    public void a(Context context, Cursor cursor, int i2) {
        b bVar;
        boolean z = false;
        if ((i2 & 1) == 1) {
            i2 |= 2;
            this.f257c = true;
        } else {
            this.f257c = false;
        }
        if (cursor != null) {
            z = true;
        }
        this.d = cursor;
        this.f256b = z;
        this.e = context;
        this.f = z ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i2 & 2) == 2) {
            this.g = new C0021a();
            bVar = new b();
        } else {
            bVar = null;
            this.g = null;
        }
        this.h = bVar;
        if (z) {
            C0021a aVar = this.g;
            if (aVar != null) {
                cursor.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.h;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    @Override // a.h.a.b.a
    public void a(Cursor cursor) {
        Cursor c2 = c(cursor);
        if (c2 != null) {
            c2.close();
        }
    }

    public abstract void a(View view, Context context, Cursor cursor);

    public abstract View b(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // a.h.a.b.a
    public abstract CharSequence b(Cursor cursor);

    /* access modifiers changed from: protected */
    public void b() {
        Cursor cursor;
        if (this.f257c && (cursor = this.d) != null && !cursor.isClosed()) {
            this.f256b = this.d.requery();
        }
    }

    public Cursor c(Cursor cursor) {
        Cursor cursor2 = this.d;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0021a aVar = this.g;
            if (aVar != null) {
                cursor2.unregisterContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.h;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.d = cursor;
        if (cursor != null) {
            C0021a aVar2 = this.g;
            if (aVar2 != null) {
                cursor.registerContentObserver(aVar2);
            }
            DataSetObserver dataSetObserver2 = this.h;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f = cursor.getColumnIndexOrThrow("_id");
            this.f256b = true;
            notifyDataSetChanged();
        } else {
            this.f = -1;
            this.f256b = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }

    public int getCount() {
        Cursor cursor;
        if (!this.f256b || (cursor = this.d) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        if (!this.f256b) {
            return null;
        }
        this.d.moveToPosition(i2);
        if (view == null) {
            view = a(this.e, this.d, viewGroup);
        }
        a(view, this.e, this.d);
        return view;
    }

    public Filter getFilter() {
        if (this.i == null) {
            this.i = new b(this);
        }
        return this.i;
    }

    public Object getItem(int i2) {
        Cursor cursor;
        if (!this.f256b || (cursor = this.d) == null) {
            return null;
        }
        cursor.moveToPosition(i2);
        return this.d;
    }

    public long getItemId(int i2) {
        Cursor cursor;
        if (!this.f256b || (cursor = this.d) == null || !cursor.moveToPosition(i2)) {
            return 0;
        }
        return this.d.getLong(this.f);
    }

    public View getView(int i2, View view, ViewGroup viewGroup) {
        if (!this.f256b) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.d.moveToPosition(i2)) {
            if (view == null) {
                view = b(this.e, this.d, viewGroup);
            }
            a(view, this.e, this.d);
            return view;
        } else {
            throw new IllegalStateException("couldn't move cursor to position " + i2);
        }
    }
}
