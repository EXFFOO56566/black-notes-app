package c.a.a.a.a.b.b;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.widget.Toast;
import c.a.a.a.a.b.a;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import notepad.note.notas.notes.notizen.main.MainActivity;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private Context f1349a;

    /* renamed from: b  reason: collision with root package name */
    private a f1350b;

    /* renamed from: c  reason: collision with root package name */
    private b f1351c;
    private SQLiteDatabase d;

    public d(Context context) {
        this.f1349a = context;
        this.d = new a(context, "BlackNoteDB", null, 1).getWritableDatabase();
        this.f1351c = new b(context);
        this.f1350b = new a(context);
    }

    private c.a.a.a.a.b.c.d a(Cursor cursor) {
        c.a.a.a.a.b.c.d dVar = new c.a.a.a.a.b.c.d();
        dVar.b(cursor.getInt(cursor.getColumnIndex("note_id")));
        dVar.h(cursor.getString(cursor.getColumnIndex("title")));
        dVar.e(cursor.getString(cursor.getColumnIndex("no_title")));
        dVar.g(cursor.getString(cursor.getColumnIndex("is_selected")));
        dVar.f(cursor.getString(cursor.getColumnIndex("password")));
        dVar.b(Boolean.valueOf(cursor.getString(cursor.getColumnIndex("favorites"))).booleanValue());
        dVar.a(Boolean.valueOf(cursor.getString(cursor.getColumnIndex("is_deleted"))).booleanValue());
        dVar.a(this.f1350b.b(cursor.getInt(cursor.getColumnIndex("category"))));
        return dVar;
    }

    private c.a.a.a.a.b.c.d b(Cursor cursor) {
        c.a.a.a.a.b.c.d dVar = new c.a.a.a.a.b.c.d();
        dVar.b(cursor.getInt(cursor.getColumnIndex("note_id")));
        dVar.h(cursor.getString(cursor.getColumnIndex("title")));
        dVar.e(cursor.getString(cursor.getColumnIndex("no_title")));
        dVar.b(cursor.getString(cursor.getColumnIndex("content")));
        dVar.a(cursor.getInt(cursor.getColumnIndex("category")));
        dVar.g(cursor.getString(cursor.getColumnIndex("is_selected")));
        dVar.f(cursor.getString(cursor.getColumnIndex("password")));
        dVar.b(Boolean.valueOf(cursor.getString(cursor.getColumnIndex("favorites"))).booleanValue());
        dVar.c(cursor.getString(cursor.getColumnIndex("createdTime")));
        dVar.d(cursor.getString(cursor.getColumnIndex("modifiedTime")));
        dVar.a(Boolean.valueOf(cursor.getString(cursor.getColumnIndex("is_deleted"))).booleanValue());
        dVar.a(this.f1350b.b(cursor.getInt(cursor.getColumnIndex("category"))));
        return dVar;
    }

    public int a(int i) {
        int i2 = 0;
        Cursor rawQuery = this.d.rawQuery("select count() from note where category=?", new String[]{Integer.toString(i)});
        if (rawQuery.moveToNext()) {
            i2 = rawQuery.getInt(rawQuery.getColumnIndex("count()"));
        }
        rawQuery.close();
        return i2;
    }

    public ArrayList<c.a.a.a.a.b.c.d> a(int i, MainActivity.c cVar) {
        ArrayList<c.a.a.a.a.b.c.d> arrayList = new ArrayList<>();
        String str = "select*from note where category=? order by modifiedTime desc";
        if (cVar == MainActivity.c.TITLE) {
            str = "select*from note where category=? order by title asc";
        } else if (cVar != MainActivity.c.EDITED_TIME && cVar == MainActivity.c.CREATED_TIME) {
            str = "select*from note where category=? order by createdTime desc";
        }
        Cursor rawQuery = this.d.rawQuery(str, new String[]{Integer.toString(i)});
        while (rawQuery.moveToNext()) {
            arrayList.add(a(rawQuery));
        }
        rawQuery.close();
        return arrayList;
    }

    public ArrayList<c.a.a.a.a.b.c.d> a(String str) {
        ArrayList<c.a.a.a.a.b.c.d> arrayList = new ArrayList<>();
        Cursor rawQuery = this.d.rawQuery("select*from note where (title like '%'||?||'%' or content like '%'||?||'%') order by title;", new String[]{str, str});
        while (rawQuery.moveToNext()) {
            arrayList.add(a(rawQuery));
        }
        rawQuery.close();
        return arrayList;
    }

    public ArrayList<c.a.a.a.a.b.c.d> a(MainActivity.c cVar) {
        ArrayList<c.a.a.a.a.b.c.d> arrayList = new ArrayList<>();
        String str = "select*from note order by modifiedTime desc";
        if (cVar == MainActivity.c.TITLE) {
            str = "select*from note order by title asc";
        } else if (cVar != MainActivity.c.EDITED_TIME && cVar == MainActivity.c.CREATED_TIME) {
            str = "select*from note order by createdTime desc";
        }
        Cursor rawQuery = this.d.rawQuery(str, null);
        while (rawQuery.moveToNext()) {
            arrayList.add(a(rawQuery));
        }
        rawQuery.close();
        return arrayList;
    }

    public void a() {
        ArrayList arrayList = new ArrayList();
        Cursor rawQuery = this.d.rawQuery("select*from note where is_selected='true'", null);
        while (rawQuery.moveToNext()) {
            c.a.a.a.a.b.c.d dVar = new c.a.a.a.a.b.c.d();
            dVar.b(rawQuery.getInt(rawQuery.getColumnIndex("note_id")));
            dVar.a(Boolean.valueOf(rawQuery.getString(rawQuery.getColumnIndex("is_deleted"))).booleanValue());
            dVar.f(rawQuery.getString(rawQuery.getColumnIndex("password")));
            arrayList.add(dVar);
        }
        rawQuery.close();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((c.a.a.a.a.b.c.d) it.next()).h().equals(BuildConfig.FLAVOR)) {
                Toast.makeText(this.f1349a, "Please exclude the password note.", 0).show();
                return;
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            c.a.a.a.a.b.c.d dVar2 = (c.a.a.a.a.b.c.d) it2.next();
            if (dVar2.j()) {
                this.f1351c.d(dVar2.g());
            }
            this.d.execSQL("delete from note where note_id=?", new String[]{Integer.toString(dVar2.g())});
        }
    }

    public void a(int i, int i2) {
        this.d.execSQL("update note set category=? where note_id=?", new String[]{Integer.toString(i2), Integer.toString(i)});
    }

    public void a(int i, String str) {
        this.d.execSQL("update note set password=? where note_id=?", new String[]{str, Integer.toString(i)});
    }

    public void a(int i, boolean z) {
        this.d.execSQL("update note set favorites=? where note_id=?", new String[]{Boolean.toString(z), Integer.toString(i)});
    }

    public void a(String str, int i) {
        this.d.execSQL("update note set title=? where note_id=?", new String[]{str, Integer.toString(i)});
    }

    public void a(String str, String str2, int i) {
        if (!str.equals(BuildConfig.FLAVOR)) {
            this.d.execSQL("update note set title=?, content=?, modifiedTime=datetime('now', 'localtime') where note_id=?", new String[]{str, str2, Integer.toString(i)});
            return;
        }
        this.d.execSQL("update note set no_title=?, content=?, title='', modifiedTime=datetime('now', 'localtime') where note_id=?", new String[]{str2.length() > 70 ? str2.substring(0, 60) : str2, str2, Integer.toString(i)});
    }

    public void a(String str, String str2, int i, int i2, boolean z) {
        Cursor rawQuery = this.d.rawQuery("select max(rank) from note where category=?", new String[]{Integer.toString(i2)});
        int i3 = rawQuery.moveToNext() ? rawQuery.getInt(rawQuery.getColumnIndex("max(rank)")) + 1 : 0;
        rawQuery.close();
        if (!str.equals(BuildConfig.FLAVOR)) {
            this.d.execSQL("insert into note(title, content, theme, category, rank, is_deleted) values(?, ?, ?, ?, ?, ?)", new String[]{str, str2, Integer.toString(i), Integer.toString(i2), Integer.toString(i3), Boolean.toString(z)});
        } else {
            this.d.execSQL("insert into note(no_title, content, theme, category, rank, is_deleted) values(?, ?, ?, ?, ?, ?)", new String[]{str2.length() > 70 ? str2.substring(0, 60) : str2, str2, Integer.toString(i), Integer.toString(i2), Integer.toString(i3), Boolean.toString(z)});
        }
    }

    public int b() {
        Cursor rawQuery = this.d.rawQuery("select*from note where is_deleted='true' order by note_id desc limit 1", null);
        int i = rawQuery.moveToFirst() ? rawQuery.getInt(rawQuery.getColumnIndex("note_id")) : 0;
        rawQuery.close();
        return i;
    }

    public ArrayList<c.a.a.a.a.b.c.d> b(String str) {
        ArrayList<c.a.a.a.a.b.c.d> arrayList = new ArrayList<>();
        Cursor rawQuery = this.d.rawQuery("select*from note where (title like '%'||?||'%' or content like '%'||?||'%') and password = '' order by title asc", new String[]{str, str});
        while (rawQuery.moveToNext()) {
            arrayList.add(a(rawQuery));
        }
        rawQuery.close();
        return arrayList;
    }

    public void b(int i) {
        this.d.execSQL("delete from note where note_id=?", new String[]{Integer.toString(i)});
    }

    public void b(int i, boolean z) {
        this.d.execSQL("update note set is_selected=? where note_id=?", new String[]{Boolean.toString(z), Integer.toString(i)});
    }

    public int c() {
        Cursor rawQuery = this.d.rawQuery("select*from note where is_deleted='false' order by note_id desc limit 1", null);
        int i = rawQuery.moveToFirst() ? rawQuery.getInt(rawQuery.getColumnIndex("note_id")) : 0;
        rawQuery.close();
        return i;
    }

    public boolean c(int i) {
        boolean z = false;
        Cursor rawQuery = this.d.rawQuery("select*from note where note_id=?", new String[]{Integer.toString(i)});
        while (rawQuery.moveToNext()) {
            z = Boolean.valueOf(rawQuery.getString(rawQuery.getColumnIndex("is_deleted"))).booleanValue();
        }
        rawQuery.close();
        return z;
    }

    public c.a.a.a.a.b.c.d d(int i) {
        Cursor rawQuery = this.d.rawQuery("select*from note where note_id=?", new String[]{Integer.toString(i)});
        c.a.a.a.a.b.c.d dVar = null;
        while (rawQuery.moveToNext()) {
            dVar = b(rawQuery);
        }
        return dVar;
    }

    public ArrayList<c.a.a.a.a.b.c.d> d() {
        ArrayList<c.a.a.a.a.b.c.d> arrayList = new ArrayList<>();
        Cursor rawQuery = this.d.rawQuery("select*from note where favorites='true' order by note_id desc", null);
        while (rawQuery.moveToNext()) {
            arrayList.add(a(rawQuery));
        }
        rawQuery.close();
        return arrayList;
    }

    public String e(int i) {
        Cursor rawQuery = this.d.rawQuery("select*from note where note_id=?", new String[]{Integer.toString(i)});
        String str = BuildConfig.FLAVOR;
        while (rawQuery.moveToNext()) {
            str = rawQuery.getString(rawQuery.getColumnIndex("title"));
        }
        rawQuery.close();
        return str;
    }

    public void e() {
        this.d.execSQL("update note set is_selected='false' where is_selected='true'");
    }

    public void f(int i) {
        ArrayList arrayList = new ArrayList();
        Cursor rawQuery = this.d.rawQuery("select*from note where is_selected='true' order by rank asc", null);
        while (rawQuery.moveToNext()) {
            c.a.a.a.a.b.c.d dVar = new c.a.a.a.a.b.c.d();
            dVar.b(rawQuery.getInt(rawQuery.getColumnIndex("note_id")));
            arrayList.add(dVar);
        }
        rawQuery.close();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c.a.a.a.a.b.c.d dVar2 = (c.a.a.a.a.b.c.d) it.next();
            Cursor rawQuery2 = this.d.rawQuery("select max(rank) from note where category=?", new String[]{Integer.toString(i)});
            int i2 = rawQuery2.moveToNext() ? rawQuery2.getInt(rawQuery2.getColumnIndex("max(rank)")) + 1 : 0;
            rawQuery2.close();
            this.d.execSQL("update note set category=?, rank=? where note_id=?", new String[]{Integer.toString(i), Integer.toString(i2), Integer.toString(dVar2.g())});
        }
    }

    public void g(int i) {
        this.d.execSQL("update note set modifiedTime=datetime('now', 'localtime') where note_id=?", new String[]{Integer.toString(i)});
    }

    public void h(int i) {
        this.d.execSQL("update note set is_selected='true' where note_id=?", new String[]{Integer.toString(i)});
    }
}
