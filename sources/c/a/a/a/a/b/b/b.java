package c.a.a.a.a.b.b;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import c.a.a.a.a.b.a;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import java.util.ArrayList;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private SQLiteDatabase f1347a;

    public b(Context context) {
        this.f1347a = new a(context, "BlackNoteDB", null, 1).getWritableDatabase();
    }

    private c.a.a.a.a.b.c.b a(Cursor cursor) {
        c.a.a.a.a.b.c.b bVar = new c.a.a.a.a.b.c.b();
        bVar.a(cursor.getInt(cursor.getColumnIndex("checklist_id")));
        bVar.a(cursor.getString(cursor.getColumnIndex("content")));
        bVar.a(Boolean.valueOf(cursor.getString(cursor.getColumnIndex("is_checked"))).booleanValue());
        return bVar;
    }

    public int a(int i) {
        int i2 = 0;
        Cursor rawQuery = this.f1347a.rawQuery("select count() from checklist where note=? and is_checked='false'", new String[]{Integer.toString(i)});
        if (rawQuery.moveToNext()) {
            i2 = rawQuery.getInt(rawQuery.getColumnIndex("count()"));
        }
        rawQuery.close();
        return i2;
    }

    public void a(int i, int i2) {
        this.f1347a.execSQL("update checklist set rank=? where checklist_id=?", new String[]{Integer.toString(i2), Integer.toString(i)});
    }

    public void a(int i, String str) {
        Cursor rawQuery = this.f1347a.rawQuery("select max(rank) from checklist where note=?", new String[]{Integer.toString(i)});
        int i2 = rawQuery.moveToNext() ? rawQuery.getInt(rawQuery.getColumnIndex("max(rank)")) + 1 : 0;
        rawQuery.close();
        this.f1347a.execSQL("insert into checklist(note, content, rank) values(?, ?, ?)", new String[]{Integer.toString(i), str, Integer.toString(i2)});
    }

    public void a(int i, boolean z) {
        this.f1347a.execSQL("update checklist set is_checked=? where checklist_id=?", new String[]{Boolean.toString(z), Integer.toString(i)});
    }

    public void b(int i) {
        this.f1347a.execSQL("delete from checklist where note=? and is_checked='true'", new String[]{Integer.toString(i)});
    }

    public void b(int i, String str) {
        this.f1347a.execSQL("update checklist set content=? where checklist_id=?", new String[]{str, Integer.toString(i)});
    }

    public void c(int i) {
        this.f1347a.execSQL("delete from checklist where checklist_id=?", new String[]{Integer.toString(i)});
    }

    public void d(int i) {
        this.f1347a.execSQL("delete from checklist where note=?", new String[]{Integer.toString(i)});
    }

    public String e(int i) {
        Cursor rawQuery = this.f1347a.rawQuery("select*from checklist where checklist_id=?", new String[]{Integer.toString(i)});
        String string = rawQuery.moveToFirst() ? rawQuery.getString(rawQuery.getColumnIndex("content")) : BuildConfig.FLAVOR;
        rawQuery.close();
        return string;
    }

    public ArrayList<c.a.a.a.a.b.c.b> f(int i) {
        Cursor rawQuery = this.f1347a.rawQuery("select*from checklist where note=? order by rank asc", new String[]{Integer.toString(i)});
        ArrayList<c.a.a.a.a.b.c.b> arrayList = new ArrayList<>();
        while (rawQuery.moveToNext()) {
            arrayList.add(a(rawQuery));
        }
        rawQuery.close();
        return arrayList;
    }

    public void g(int i) {
        this.f1347a.execSQL("update checklist set is_checked='false' where note=?", new String[]{Integer.toString(i)});
    }
}
