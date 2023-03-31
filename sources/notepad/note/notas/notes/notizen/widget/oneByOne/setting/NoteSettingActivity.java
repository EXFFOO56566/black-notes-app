package notepad.note.notas.notes.notizen.widget.oneByOne.setting;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.RemoteViews;
import android.widget.Toast;
import androidx.appcompat.app.c;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c.a.a.a.a.b.b.b;
import c.a.a.a.a.b.b.d;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.github.ajalt.reprint.module.spass.R;
import notepad.note.notas.notes.notizen.ui.MyTextView;
import notepad.note.notas.notes.notizen.widget.oneByOne.WidgetChecklistActivity;
import notepad.note.notas.notes.notizen.widget.oneByOne.WidgetNoteActivity;
import notepad.note.notas.notes.notizen.widget.oneByOne.WidgetSearchActivity;
import notepad.note.notas.notes.notizen.widget.oneByOne.setting.a;

public class NoteSettingActivity extends c {
    private notepad.note.notas.notes.notizen.util.a s;
    private a t;
    private int u;
    private int v;
    private String w = "purpleLight";
    private d x;
    private MyTextView y;
    private b z;

    /* access modifiers changed from: package-private */
    public class a implements a.AbstractC0100a {
        a() {
        }

        @Override // notepad.note.notas.notes.notizen.widget.oneByOne.setting.a.AbstractC0100a
        public void a(String str) {
            NoteSettingActivity.this.w = str;
        }
    }

    private void o() {
        finish();
        overridePendingTransition(0, R.anim.activity_fade_out);
    }

    private void p() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.u = extras.getInt("appWidgetId", 0);
            notepad.note.notas.notes.notizen.util.c.a(this, "#000000");
            this.s = new notepad.note.notas.notes.notizen.util.a();
            this.z = new b(this);
            this.t = new a();
            RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
            recyclerView.setLayoutManager(new GridLayoutManager(this, 5));
            recyclerView.setAdapter(this.t);
            this.y = (MyTextView) findViewById(R.id.txtSelectedNoteTitle);
            this.x = new d(this);
            return;
        }
        finish();
        overridePendingTransition(0, 0);
    }

    private void q() {
        this.t.a(new a());
    }

    public void btnClick(View view) {
        Intent intent;
        String str;
        if (this.s.a()) {
            if (view.getId() == R.id.btnSelectNote) {
                startActivityForResult(new Intent(this, WidgetSearchActivity.class), 1);
                overridePendingTransition(R.anim.activity_right_to_left, 0);
            } else if (view.getId() == R.id.btnComplete) {
                if (this.v != 0) {
                    SharedPreferences.Editor edit = getSharedPreferences("widgetNoteId", 0).edit();
                    SharedPreferences.Editor edit2 = getSharedPreferences("widgetColor", 0).edit();
                    int i = this.u;
                    if (i != 0) {
                        edit.putInt(Integer.toString(i), this.v);
                        edit.apply();
                        edit2.putString(Integer.toString(this.u), this.w);
                        edit2.apply();
                    }
                    AppWidgetManager instance = AppWidgetManager.getInstance(this);
                    RemoteViews remoteViews = new RemoteViews(getPackageName(), (int) R.layout.layout_widget_note_one_by_one);
                    remoteViews.setInt(R.id.note_onebyone, "setBackgroundColor", Color.parseColor(notepad.note.notas.notes.notizen.widget.oneByOne.selectColor.a.a(this.w)));
                    c.a.a.a.a.b.c.d d = this.x.d(this.v);
                    if (d != null) {
                        if (this.x.c(this.v)) {
                            intent = new Intent(this, WidgetChecklistActivity.class);
                            if (d.i() != null) {
                                remoteViews.setTextViewText(R.id.widgetTitle, d.i() + " (" + this.z.a(this.v) + ")");
                            }
                            remoteViews.setViewVisibility(R.id.imgCheck, 0);
                        } else {
                            intent = new Intent(this, WidgetNoteActivity.class);
                            if (d.i() != null) {
                                if (!d.i().equals(BuildConfig.FLAVOR)) {
                                    str = d.i();
                                } else if (d.f() != null) {
                                    str = d.f();
                                }
                                remoteViews.setTextViewText(R.id.widgetTitle, str);
                            }
                            remoteViews.setViewVisibility(R.id.imgCheck, 8);
                        }
                        intent.putExtra("noteId", this.v);
                        intent.putExtra("widgetId", this.u);
                        intent.setData(Uri.parse(intent.toUri(1)));
                        remoteViews.setOnClickPendingIntent(R.id.note_onebyone, PendingIntent.getActivity(this, 0, intent, 0));
                        instance.updateAppWidget(this.u, remoteViews);
                        Intent intent2 = new Intent();
                        intent2.putExtra("appWidgetId", this.u);
                        setResult(-1, intent2);
                        o();
                        return;
                    }
                }
                Toast.makeText(this, "Select the note.", 0).show();
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.d
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 1) {
            int intExtra = intent.getIntExtra("noteId", 0);
            this.v = intExtra;
            this.y.setText(this.x.e(intExtra));
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.e, androidx.appcompat.app.c
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_widget_setting);
        p();
        q();
    }
}
