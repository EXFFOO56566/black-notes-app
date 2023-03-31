package com.google.android.gms.internal.ads;

import com.github.ajalt.reprint.module.spass.BuildConfig;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class jq implements ls {

    /* renamed from: b  reason: collision with root package name */
    private static Logger f3265b = Logger.getLogger(jq.class.getName());

    /* renamed from: a  reason: collision with root package name */
    private ThreadLocal<ByteBuffer> f3266a = new ip(this);

    @Override // com.google.android.gms.internal.ads.ls
    public final mt a(d42 d42, mw mwVar) {
        int read;
        long j;
        long position = d42.position();
        this.f3266a.get().rewind().limit(8);
        do {
            read = d42.read(this.f3266a.get());
            if (read == 8) {
                this.f3266a.get().rewind();
                long a2 = mu.a(this.f3266a.get());
                byte[] bArr = null;
                if (a2 >= 8 || a2 <= 1) {
                    String f = mu.f(this.f3266a.get());
                    if (a2 == 1) {
                        this.f3266a.get().limit(16);
                        d42.read(this.f3266a.get());
                        this.f3266a.get().position(8);
                        j = mu.c(this.f3266a.get()) - 16;
                    } else {
                        j = a2 == 0 ? d42.size() - d42.position() : a2 - 8;
                    }
                    if ("uuid".equals(f)) {
                        this.f3266a.get().limit(this.f3266a.get().limit() + 16);
                        d42.read(this.f3266a.get());
                        bArr = new byte[16];
                        for (int position2 = this.f3266a.get().position() - 16; position2 < this.f3266a.get().position(); position2++) {
                            bArr[position2 - (this.f3266a.get().position() - 16)] = this.f3266a.get().get(position2);
                        }
                        j -= 16;
                    }
                    mt a3 = a(f, bArr, mwVar instanceof mt ? ((mt) mwVar).m() : BuildConfig.FLAVOR);
                    a3.a(mwVar);
                    this.f3266a.get().rewind();
                    a3.a(d42, this.f3266a.get(), j, this);
                    return a3;
                }
                Logger logger = f3265b;
                Level level = Level.SEVERE;
                StringBuilder sb = new StringBuilder(80);
                sb.append("Plausibility check failed: size < 8 (size = ");
                sb.append(a2);
                sb.append("). Stop parsing!");
                logger.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb.toString());
                return null;
            }
        } while (read >= 0);
        d42.b(position);
        throw new EOFException();
    }

    public abstract mt a(String str, byte[] bArr, String str2);
}
