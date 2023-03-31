package notepad.note.notas.notes.notizen.util;

import android.content.Context;
import android.content.SharedPreferences;

public class d {
    public static int a(Context context) {
        return context.getSharedPreferences("SETTING", 0).getInt("noteTextSize", 1);
    }

    public static void a(Context context, int i) {
        SharedPreferences.Editor edit = context.getSharedPreferences("SETTING", 0).edit();
        edit.putInt("noteTextSize", i);
        edit.apply();
    }
}
