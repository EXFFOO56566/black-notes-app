package notepad.note.notas.notes.notizen.util;

import android.graphics.Color;
import android.view.Window;
import androidx.recyclerview.widget.RecyclerView;

public class c {
    public static void a(androidx.appcompat.app.c cVar) {
        if (cVar.l() != null) {
            cVar.l().i();
        }
    }

    public static void a(androidx.appcompat.app.c cVar, String str) {
        Window window = cVar.getWindow();
        window.addFlags(RecyclerView.UNDEFINED_DURATION);
        window.setStatusBarColor(Color.parseColor(str));
    }
}
