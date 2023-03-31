package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.a;

public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f759a = (IconCompat) aVar.a(remoteActionCompat.f759a, 1);
        remoteActionCompat.f760b = aVar.a(remoteActionCompat.f760b, 2);
        remoteActionCompat.f761c = aVar.a(remoteActionCompat.f761c, 3);
        remoteActionCompat.d = (PendingIntent) aVar.a(remoteActionCompat.d, 4);
        remoteActionCompat.e = aVar.a(remoteActionCompat.e, 5);
        remoteActionCompat.f = aVar.a(remoteActionCompat.f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) {
        aVar.a(false, false);
        aVar.b(remoteActionCompat.f759a, 1);
        aVar.b(remoteActionCompat.f760b, 2);
        aVar.b(remoteActionCompat.f761c, 3);
        aVar.b(remoteActionCompat.d, 4);
        aVar.b(remoteActionCompat.e, 5);
        aVar.b(remoteActionCompat.f, 6);
    }
}
