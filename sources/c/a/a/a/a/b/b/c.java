package c.a.a.a.a.b.b;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import c.a.a.a.a.b.a;
import c.a.a.a.a.b.c.b;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import java.util.ArrayList;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private SQLiteDatabase f1348a;

    public c(Context context) {
        this.f1348a = new a(context, "BlackNoteDB", null, 1).getWritableDatabase();
    }

    private b a(Cursor cursor) {
        b bVar = new b();
        bVar.a(cursor.getInt(cursor.getColumnIndex("checklist_id")));
        bVar.a(cursor.getString(cursor.getColumnIndex("content")));
        bVar.a(Boolean.valueOf(cursor.getString(cursor.getColumnIndex("is_checked"))).booleanValue());
        bVar.b(Boolean.valueOf(cursor.getString(cursor.getColumnIndex("is_todo"))).booleanValue());
        return bVar;
    }

    public int a(boolean z) {
        int i = 0;
        Cursor rawQuery = this.f1348a.rawQuery("select count() from daily_check where is_checked='false' and is_todo=?", new String[]{Boolean.toString(z)});
        if (rawQuery.moveToNext()) {
            i = rawQuery.getInt(rawQuery.getColumnIndex("count()"));
        }
        rawQuery.close();
        return i;
    }

    public void a(int i) {
        this.f1348a.execSQL("delete from daily_check where checklist_id=?", new String[]{Integer.toString(i)});
    }

    public void a(int i, int i2) {
        this.f1348a.execSQL("update daily_check set rank=? where checklist_id=?", new String[]{Integer.toString(i2), Integer.toString(i)});
    }

    public void a(int i, String str) {
        this.f1348a.execSQL("update daily_check set content=? where checklist_id=?", new String[]{str, Integer.toString(i)});
    }

    public void a(int i, boolean z) {
        this.f1348a.execSQL("update daily_check set is_checked=? where checklist_id=?", new String[]{Boolean.toString(z), Integer.toString(i)});
    }

    public void a(String str, boolean z) {
        Cursor rawQuery = this.f1348a.rawQuery("select max(rank) from daily_check where is_todo=?", new String[]{Boolean.toString(z)});
        int i = rawQuery.moveToNext() ? rawQuery.getInt(rawQuery.getColumnIndex("max(rank)")) + 1 : 0;
        rawQuery.close();
        this.f1348a.execSQL("insert into daily_check(content, rank, is_todo) values(?, ?, ?)", new String[]{str, Integer.toString(i), Boolean.toString(z)});
    }

    public String b(int i) {
        Cursor rawQuery = this.f1348a.rawQuery("select*from daily_check where checklist_id=?", new String[]{Integer.toString(i)});
        String string = rawQuery.moveToFirst() ? rawQuery.getString(rawQuery.getColumnIndex("content")) : BuildConfig.FLAVOR;
        rawQuery.close();
        return string;
    }

    public ArrayList<b> b(boolean z) {
        Cursor rawQuery = this.f1348a.rawQuery("select*from daily_check where is_todo=? order by rank asc", new String[]{Boolean.toString(z)});
        ArrayList<b> arrayList = new ArrayList<>();
        while (rawQuery.moveToNext()) {
            arrayList.add(a(rawQuery));
        }
        rawQuery.close();
        return arrayList;
    }
}
