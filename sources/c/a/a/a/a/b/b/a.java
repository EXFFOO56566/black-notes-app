package c.a.a.a.a.b.b;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import java.util.ArrayList;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private SQLiteDatabase f1346a;

    public a(Context context) {
        this.f1346a = new c.a.a.a.a.b.a(context, "BlackNoteDB", null, 1).getWritableDatabase();
    }

    public ArrayList<c.a.a.a.a.b.c.a> a() {
        ArrayList<c.a.a.a.a.b.c.a> arrayList = new ArrayList<>();
        Cursor rawQuery = this.f1346a.rawQuery("select*from category order by rank asc;", null);
        while (rawQuery.moveToNext()) {
            c.a.a.a.a.b.c.a aVar = new c.a.a.a.a.b.c.a();
            aVar.a(rawQuery.getInt(rawQuery.getColumnIndex("category_id")));
            aVar.a(rawQuery.getString(rawQuery.getColumnIndex("category_name")));
            aVar.b(rawQuery.getInt(rawQuery.getColumnIndex("rank")));
            arrayList.add(aVar);
        }
        rawQuery.close();
        return arrayList;
    }

    public void a(int i) {
        this.f1346a.execSQL("delete from category where category_id=?", new String[]{Integer.toString(i)});
    }

    public void a(int i, int i2) {
        this.f1346a.execSQL("update category set rank=? where category_id=?", new String[]{Integer.toString(i2), Integer.toString(i)});
    }

    public void a(int i, String str) {
        this.f1346a.execSQL("update category set category_name=? where category_id=?", new String[]{str, Integer.toString(i)});
    }

    public void a(String str) {
        Cursor rawQuery = this.f1346a.rawQuery("select max(rank) from category", null);
        int i = rawQuery.moveToNext() ? rawQuery.getInt(rawQuery.getColumnIndex("max(rank)")) + 1 : 0;
        rawQuery.close();
        this.f1346a.execSQL("insert into category(category_name, rank) values(?, ?)", new String[]{str, Integer.toString(i)});
    }

    public String b(int i) {
        Cursor rawQuery = this.f1346a.rawQuery("select*from category where category_id = " + i, null);
        String str = BuildConfig.FLAVOR;
        while (rawQuery.moveToNext()) {
            str = rawQuery.getString(rawQuery.getColumnIndex("category_name"));
        }
        rawQuery.close();
        return str;
    }
}
