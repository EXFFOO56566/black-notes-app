package c.a.a.a.a.b;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;

public class a extends SQLiteOpenHelper {
    public a(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i) {
        super(context, str, cursorFactory, i);
    }

    private void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL((((("create table category(" + "category_id integer primary key autoincrement") + ", category_name varchar(50) default ''") + ", rank integer default 0") + ", password varchar(50) default ''") + ", team integer default 0)");
    }

    private void b(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL((((("create table checklist(" + "checklist_id integer primary key autoincrement") + ", note integer default 0") + ", content varchar(300) default ''") + ", is_checked boolean default 'false'") + ", rank integer default 0)");
    }

    private void c(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(((((("create table daily_check(" + "checklist_id integer primary key autoincrement") + ", note integer default 0") + ", content varchar(300) default ''") + ", is_checked boolean default 'false'") + ", rank integer default 0") + ", is_todo boolean default 'true');");
    }

    private void d(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(((("create table images(" + "images_id integer primary key autoincrement") + ", note integer default 0") + ", img blob") + ", rank integer default 0)");
    }

    private void e(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL((((((((((((("create table note(" + "note_id integer primary key autoincrement") + ", title varchar(50) default ''") + ", no_title varchar(50) default ''") + ", content varchar(300) default ''") + ", category integer default 0") + ", rank integer default 0") + ", favorites boolean default 'false'") + ", is_selected boolean default 'false'") + ", is_deleted boolean default 'false'") + ", password varchar(20) default ''") + ", createdTime datetime default (datetime('now', 'localtime'))") + ", modifiedTime datetime default (datetime('now', 'localtime'))") + ", theme integer default 0)");
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        a(sQLiteDatabase);
        e(sQLiteDatabase);
        b(sQLiteDatabase);
        c(sQLiteDatabase);
        d(sQLiteDatabase);
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
        if (Build.VERSION.SDK_INT >= 28) {
            sQLiteDatabase.disableWriteAheadLogging();
        }
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
