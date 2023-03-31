package notepad.note.notas.notes.notizen.util;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private long f6140a = 0;

    public boolean a() {
        if (System.currentTimeMillis() - this.f6140a < 600) {
            return false;
        }
        this.f6140a = System.currentTimeMillis();
        return true;
    }
}
