package a.h.a;

import android.database.Cursor;
import android.widget.Filter;

class b extends Filter {

    /* renamed from: a  reason: collision with root package name */
    a f260a;

    interface a {
        Cursor a();

        Cursor a(CharSequence charSequence);

        void a(Cursor cursor);

        CharSequence b(Cursor cursor);
    }

    b(a aVar) {
        this.f260a = aVar;
    }

    public CharSequence convertResultToString(Object obj) {
        return this.f260a.b((Cursor) obj);
    }

    /* access modifiers changed from: protected */
    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor a2 = this.f260a.a(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (a2 != null) {
            filterResults.count = a2.getCount();
        } else {
            filterResults.count = 0;
            a2 = null;
        }
        filterResults.values = a2;
        return filterResults;
    }

    /* access modifiers changed from: protected */
    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor a2 = this.f260a.a();
        Object obj = filterResults.values;
        if (obj != null && obj != a2) {
            this.f260a.a((Cursor) obj);
        }
    }
}
