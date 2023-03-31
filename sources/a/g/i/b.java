package a.g.i;

import a.g.d.c.f;
import a.g.e.i;
import a.g.i.c;
import a.g.k.h;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

public class b {

    /* renamed from: a  reason: collision with root package name */
    static final a.e.e<String, Typeface> f135a = new a.e.e<>(16);

    /* renamed from: b  reason: collision with root package name */
    private static final c f136b = new c("fonts", 10, 10000);

    /* renamed from: c  reason: collision with root package name */
    static final Object f137c = new Object();
    static final a.e.g<String, ArrayList<c.d<g>>> d = new a.e.g<>();
    private static final Comparator<byte[]> e = new d();

    /* access modifiers changed from: package-private */
    public static class a implements Callable<g> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f138a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f139b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f140c;
        final /* synthetic */ String d;

        a(Context context, a aVar, int i, String str) {
            this.f138a = context;
            this.f139b = aVar;
            this.f140c = i;
            this.d = str;
        }

        @Override // java.util.concurrent.Callable
        public g call() {
            g a2 = b.a(this.f138a, this.f139b, this.f140c);
            Typeface typeface = a2.f149a;
            if (typeface != null) {
                b.f135a.a(this.d, typeface);
            }
            return a2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a.g.i.b$b  reason: collision with other inner class name */
    public static class C0011b implements c.d<g> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f.a f141a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Handler f142b;

        C0011b(f.a aVar, Handler handler) {
            this.f141a = aVar;
            this.f142b = handler;
        }

        public void a(g gVar) {
            int i;
            f.a aVar;
            if (gVar == null) {
                aVar = this.f141a;
                i = 1;
            } else {
                i = gVar.f150b;
                if (i == 0) {
                    this.f141a.a(gVar.f149a, this.f142b);
                    return;
                }
                aVar = this.f141a;
            }
            aVar.a(i, this.f142b);
        }
    }

    /* access modifiers changed from: package-private */
    public static class c implements c.d<g> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f143a;

        c(String str) {
            this.f143a = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
            if (r0 >= r1.size()) goto L_0x002c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
            r1.get(r0).a(r5);
            r0 = r0 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
            r0 = 0;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(a.g.i.b.g r5) {
            /*
                r4 = this;
                java.lang.Object r0 = a.g.i.b.f137c
                monitor-enter(r0)
                a.e.g<java.lang.String, java.util.ArrayList<a.g.i.c$d<a.g.i.b$g>>> r1 = a.g.i.b.d     // Catch:{ all -> 0x002d }
                java.lang.String r2 = r4.f143a     // Catch:{ all -> 0x002d }
                java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x002d }
                java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ all -> 0x002d }
                if (r1 != 0) goto L_0x0011
                monitor-exit(r0)     // Catch:{ all -> 0x002d }
                return
            L_0x0011:
                a.e.g<java.lang.String, java.util.ArrayList<a.g.i.c$d<a.g.i.b$g>>> r2 = a.g.i.b.d     // Catch:{ all -> 0x002d }
                java.lang.String r3 = r4.f143a     // Catch:{ all -> 0x002d }
                r2.remove(r3)     // Catch:{ all -> 0x002d }
                monitor-exit(r0)     // Catch:{ all -> 0x002d }
                r0 = 0
            L_0x001a:
                int r2 = r1.size()
                if (r0 >= r2) goto L_0x002c
                java.lang.Object r2 = r1.get(r0)
                a.g.i.c$d r2 = (a.g.i.c.d) r2
                r2.a(r5)
                int r0 = r0 + 1
                goto L_0x001a
            L_0x002c:
                return
            L_0x002d:
                r5 = move-exception
                monitor-exit(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: a.g.i.b.c.a(a.g.i.b$g):void");
        }
    }

    static class d implements Comparator<byte[]> {
        d() {
        }

        /* renamed from: a */
        public int compare(byte[] bArr, byte[] bArr2) {
            int i;
            int i2;
            if (bArr.length != bArr2.length) {
                i2 = bArr.length;
                i = bArr2.length;
            } else {
                for (int i3 = 0; i3 < bArr.length; i3++) {
                    if (bArr[i3] != bArr2[i3]) {
                        i2 = bArr[i3];
                        i = bArr2[i3];
                    }
                }
                return 0;
            }
            return (i2 == 1 ? 1 : 0) - (i == 1 ? 1 : 0);
        }
    }

    public static class e {

        /* renamed from: a  reason: collision with root package name */
        private final int f144a;

        /* renamed from: b  reason: collision with root package name */
        private final f[] f145b;

        public e(int i, f[] fVarArr) {
            this.f144a = i;
            this.f145b = fVarArr;
        }

        public f[] a() {
            return this.f145b;
        }

        public int b() {
            return this.f144a;
        }
    }

    public static class f {

        /* renamed from: a  reason: collision with root package name */
        private final Uri f146a;

        /* renamed from: b  reason: collision with root package name */
        private final int f147b;

        /* renamed from: c  reason: collision with root package name */
        private final int f148c;
        private final boolean d;
        private final int e;

        public f(Uri uri, int i, int i2, boolean z, int i3) {
            h.a(uri);
            this.f146a = uri;
            this.f147b = i;
            this.f148c = i2;
            this.d = z;
            this.e = i3;
        }

        public int a() {
            return this.e;
        }

        public int b() {
            return this.f147b;
        }

        public Uri c() {
            return this.f146a;
        }

        public int d() {
            return this.f148c;
        }

        public boolean e() {
            return this.d;
        }
    }

    /* access modifiers changed from: private */
    public static final class g {

        /* renamed from: a  reason: collision with root package name */
        final Typeface f149a;

        /* renamed from: b  reason: collision with root package name */
        final int f150b;

        g(Typeface typeface, int i) {
            this.f149a = typeface;
            this.f150b = i;
        }
    }

    public static e a(Context context, CancellationSignal cancellationSignal, a aVar) {
        ProviderInfo a2 = a(context.getPackageManager(), aVar, context.getResources());
        return a2 == null ? new e(1, null) : new e(0, a(context, aVar, a2.authority, cancellationSignal));
    }

    static g a(Context context, a aVar, int i) {
        try {
            e a2 = a(context, (CancellationSignal) null, aVar);
            int i2 = -3;
            if (a2.b() == 0) {
                Typeface a3 = a.g.e.c.a(context, null, a2.a(), i);
                if (a3 != null) {
                    i2 = 0;
                }
                return new g(a3, i2);
            }
            if (a2.b() == 1) {
                i2 = -2;
            }
            return new g(null, i2);
        } catch (PackageManager.NameNotFoundException unused) {
            return new g(null, -1);
        }
    }

    public static ProviderInfo a(PackageManager packageManager, a aVar, Resources resources) {
        String d2 = aVar.d();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(d2, 0);
        if (resolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + d2);
        } else if (resolveContentProvider.packageName.equals(aVar.e())) {
            List<byte[]> a2 = a(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
            Collections.sort(a2, e);
            List<List<byte[]>> a3 = a(aVar, resources);
            for (int i = 0; i < a3.size(); i++) {
                ArrayList arrayList = new ArrayList(a3.get(i));
                Collections.sort(arrayList, e);
                if (a(a2, arrayList)) {
                    return resolveContentProvider;
                }
            }
            return null;
        } else {
            throw new PackageManager.NameNotFoundException("Found content provider " + d2 + ", but package was not " + aVar.e());
        }
    }

    public static Typeface a(Context context, a aVar, f.a aVar2, Handler handler, boolean z, int i, int i2) {
        String str = aVar.c() + "-" + i2;
        Typeface b2 = f135a.b(str);
        if (b2 != null) {
            if (aVar2 != null) {
                aVar2.a(b2);
            }
            return b2;
        } else if (!z || i != -1) {
            a aVar3 = new a(context, aVar, i2, str);
            if (z) {
                try {
                    return ((g) f136b.a(aVar3, i)).f149a;
                } catch (InterruptedException unused) {
                    return null;
                }
            } else {
                C0011b bVar = aVar2 == null ? null : new C0011b(aVar2, handler);
                synchronized (f137c) {
                    ArrayList<c.d<g>> arrayList = d.get(str);
                    if (arrayList != null) {
                        if (bVar != null) {
                            arrayList.add(bVar);
                        }
                        return null;
                    }
                    if (bVar != null) {
                        ArrayList<c.d<g>> arrayList2 = new ArrayList<>();
                        arrayList2.add(bVar);
                        d.put(str, arrayList2);
                    }
                    f136b.a(aVar3, new c(str));
                    return null;
                }
            }
        } else {
            g a2 = a(context, aVar, i2);
            if (aVar2 != null) {
                int i3 = a2.f150b;
                if (i3 == 0) {
                    aVar2.a(a2.f149a, handler);
                } else {
                    aVar2.a(i3, handler);
                }
            }
            return a2.f149a;
        }
    }

    private static List<List<byte[]>> a(a aVar, Resources resources) {
        return aVar.a() != null ? aVar.a() : a.g.d.c.c.a(resources, aVar.b());
    }

    private static List<byte[]> a(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    public static Map<Uri, ByteBuffer> a(Context context, f[] fVarArr, CancellationSignal cancellationSignal) {
        HashMap hashMap = new HashMap();
        for (f fVar : fVarArr) {
            if (fVar.a() == 0) {
                Uri c2 = fVar.c();
                if (!hashMap.containsKey(c2)) {
                    hashMap.put(c2, i.a(context, cancellationSignal, c2));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    private static boolean a(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    static f[] a(Context context, a aVar, String str, CancellationSignal cancellationSignal) {
        ArrayList arrayList = new ArrayList();
        Uri build = new Uri.Builder().scheme("content").authority(str).build();
        Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
        Cursor cursor = null;
        try {
            cursor = Build.VERSION.SDK_INT > 16 ? context.getContentResolver().query(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{aVar.f()}, null, cancellationSignal) : context.getContentResolver().query(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{aVar.f()}, null);
            if (cursor != null && cursor.getCount() > 0) {
                int columnIndex = cursor.getColumnIndex("result_code");
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = cursor.getColumnIndex("_id");
                int columnIndex3 = cursor.getColumnIndex("file_id");
                int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursor.getColumnIndex("font_weight");
                int columnIndex6 = cursor.getColumnIndex("font_italic");
                while (cursor.moveToNext()) {
                    int i = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                    arrayList2.add(new f(columnIndex3 == -1 ? ContentUris.withAppendedId(build, cursor.getLong(columnIndex2)) : ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3)), columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, i));
                }
                arrayList = arrayList2;
            }
            return (f[]) arrayList.toArray(new f[0]);
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }
}
