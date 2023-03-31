package notepad.note.notas.notes.notizen.widget.oneByOne;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: lambda */
public final /* synthetic */ class c implements View.OnTouchListener {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ WidgetNoteActivity f6150b;

    public /* synthetic */ c(WidgetNoteActivity widgetNoteActivity) {
        this.f6150b = widgetNoteActivity;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f6150b.a(view, motionEvent);
    }
}
