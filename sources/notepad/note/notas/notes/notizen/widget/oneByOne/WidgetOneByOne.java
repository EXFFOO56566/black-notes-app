package notepad.note.notas.notes.notizen.widget.oneByOne;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.net.Uri;
import android.widget.RemoteViews;
import c.a.a.a.a.b.b.b;
import c.a.a.a.a.b.b.d;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.github.ajalt.reprint.module.spass.R;
import notepad.note.notas.notes.notizen.widget.oneByOne.selectColor.a;

public class WidgetOneByOne extends AppWidgetProvider {
    private void a(Context context) {
        Intent intent;
        String str;
        AppWidgetManager instance = AppWidgetManager.getInstance(context);
        int[] appWidgetIds = instance.getAppWidgetIds(new ComponentName(context, WidgetOneByOne.class));
        d dVar = new d(context);
        b bVar = new b(context);
        int i = 0;
        SharedPreferences sharedPreferences = context.getSharedPreferences("widgetNoteId", 0);
        SharedPreferences sharedPreferences2 = context.getSharedPreferences("widgetColor", 0);
        for (int i2 = 0; i2 < appWidgetIds.length; i2++) {
            int i3 = sharedPreferences.getInt(Integer.toString(appWidgetIds[i2]), i);
            c.a.a.a.a.b.c.d d = dVar.d(i3);
            if (d != null) {
                String string = sharedPreferences2.getString(Integer.toString(appWidgetIds[i2]), "green");
                RemoteViews remoteViews = new RemoteViews(context.getPackageName(), (int) R.layout.layout_widget_note_one_by_one);
                remoteViews.setInt(R.id.note_onebyone, "setBackgroundColor", Color.parseColor(a.a(string)));
                if (d.j()) {
                    intent = new Intent(context, WidgetChecklistActivity.class);
                    if (d.i() != null) {
                        remoteViews.setTextViewText(R.id.widgetTitle, d.i() + " (" + bVar.a(i3) + ")");
                    }
                } else {
                    intent = new Intent(context, WidgetNoteActivity.class);
                    if (d.i() != null) {
                        if (!d.i().equals(BuildConfig.FLAVOR)) {
                            str = d.i();
                        } else if (d.f() != null) {
                            str = d.f();
                        }
                        remoteViews.setTextViewText(R.id.widgetTitle, str);
                    }
                    i = 8;
                }
                remoteViews.setViewVisibility(R.id.imgCheck, i);
                intent.putExtra("noteId", i3);
                intent.putExtra("widgetId", appWidgetIds[i2]);
                intent.setData(Uri.parse(intent.toUri(1)));
                i = 0;
                remoteViews.setOnClickPendingIntent(R.id.note_onebyone, PendingIntent.getActivity(context, 0, intent, 0));
                instance.updateAppWidget(appWidgetIds[i2], remoteViews);
            }
        }
    }

    public void onDeleted(Context context, int[] iArr) {
        super.onDeleted(context, iArr);
        SharedPreferences.Editor edit = context.getSharedPreferences("widgetNoteId", 0).edit();
        SharedPreferences.Editor edit2 = context.getSharedPreferences("widgetColor", 0).edit();
        for (int i = 0; i < iArr.length; i++) {
            edit.remove(Integer.toString(iArr[i]));
            edit.apply();
            edit2.remove(Integer.toString(iArr[i]));
            edit2.apply();
        }
    }

    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
        a(context);
    }

    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        a(context);
    }
}
