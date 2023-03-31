package com.google.android.gms.internal.ads;

import android.util.Log;
import com.google.android.gms.internal.ads.qc2;

final class wb2 {
    private static final int A = ag2.d("sosn");
    private static final int B = ag2.d("tvsh");
    private static final int C = ag2.d("----");
    private static final String[] D = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"};

    /* renamed from: a  reason: collision with root package name */
    private static final int f5244a = ag2.d("nam");

    /* renamed from: b  reason: collision with root package name */
    private static final int f5245b = ag2.d("trk");

    /* renamed from: c  reason: collision with root package name */
    private static final int f5246c = ag2.d("cmt");
    private static final int d = ag2.d("day");
    private static final int e = ag2.d("ART");
    private static final int f = ag2.d("too");
    private static final int g = ag2.d("alb");
    private static final int h = ag2.d("com");
    private static final int i = ag2.d("wrt");
    private static final int j = ag2.d("lyr");
    private static final int k = ag2.d("gen");
    private static final int l = ag2.d("covr");
    private static final int m = ag2.d("gnre");
    private static final int n = ag2.d("grp");
    private static final int o = ag2.d("disk");
    private static final int p = ag2.d("trkn");
    private static final int q = ag2.d("tmpo");
    private static final int r = ag2.d("cpil");
    private static final int s = ag2.d("aART");
    private static final int t = ag2.d("sonm");
    private static final int u = ag2.d("soal");
    private static final int v = ag2.d("soar");
    private static final int w = ag2.d("soaa");
    private static final int x = ag2.d("soco");
    private static final int y = ag2.d("rtng");
    private static final int z = ag2.d("pgap");

    public static qc2.a a(xf2 xf2) {
        String str;
        int b2 = xf2.b() + xf2.d();
        int d2 = xf2.d();
        int i2 = d2 >>> 24;
        wc2 wc2 = null;
        if (i2 == 169 || i2 == 65533) {
            int i3 = 16777215 & d2;
            if (i3 == f5246c) {
                int d3 = xf2.d();
                if (xf2.d() == kb2.q0) {
                    xf2.d(8);
                    String e2 = xf2.e(d3 - 16);
                    wc2 = new sc2("und", e2, e2);
                } else {
                    String valueOf = String.valueOf(kb2.c(d2));
                    Log.w("MetadataUtil", valueOf.length() != 0 ? "Failed to parse comment attribute: ".concat(valueOf) : new String("Failed to parse comment attribute: "));
                }
                xf2.c(b2);
                return wc2;
            } else if (i3 == f5244a || i3 == f5245b) {
                vc2 a2 = a(d2, "TIT2", xf2);
                xf2.c(b2);
                return a2;
            } else if (i3 == h || i3 == i) {
                vc2 a3 = a(d2, "TCOM", xf2);
                xf2.c(b2);
                return a3;
            } else if (i3 == d) {
                vc2 a4 = a(d2, "TDRC", xf2);
                xf2.c(b2);
                return a4;
            } else if (i3 == e) {
                vc2 a5 = a(d2, "TPE1", xf2);
                xf2.c(b2);
                return a5;
            } else if (i3 == f) {
                vc2 a6 = a(d2, "TSSE", xf2);
                xf2.c(b2);
                return a6;
            } else if (i3 == g) {
                vc2 a7 = a(d2, "TALB", xf2);
                xf2.c(b2);
                return a7;
            } else if (i3 == j) {
                vc2 a8 = a(d2, "USLT", xf2);
                xf2.c(b2);
                return a8;
            } else if (i3 == k) {
                vc2 a9 = a(d2, "TCON", xf2);
                xf2.c(b2);
                return a9;
            } else if (i3 == n) {
                vc2 a10 = a(d2, "TIT1", xf2);
                xf2.c(b2);
                return a10;
            }
        } else {
            try {
                if (d2 == m) {
                    int b3 = b(xf2);
                    String str2 = (b3 <= 0 || b3 > D.length) ? null : D[b3 - 1];
                    if (str2 != null) {
                        wc2 = new vc2("TCON", null, str2);
                    } else {
                        Log.w("MetadataUtil", "Failed to parse standard genre code");
                    }
                    return wc2;
                } else if (d2 == o) {
                    vc2 b4 = b(d2, "TPOS", xf2);
                    xf2.c(b2);
                    return b4;
                } else if (d2 == p) {
                    vc2 b5 = b(d2, "TRCK", xf2);
                    xf2.c(b2);
                    return b5;
                } else if (d2 == q) {
                    wc2 a11 = a(d2, "TBPM", xf2, true, false);
                    xf2.c(b2);
                    return a11;
                } else if (d2 == r) {
                    wc2 a12 = a(d2, "TCMP", xf2, true, true);
                    xf2.c(b2);
                    return a12;
                } else if (d2 == l) {
                    int d4 = xf2.d();
                    if (xf2.d() == kb2.q0) {
                        int b6 = kb2.b(xf2.d());
                        String str3 = b6 == 13 ? "image/jpeg" : b6 == 14 ? "image/png" : null;
                        if (str3 == null) {
                            StringBuilder sb = new StringBuilder(41);
                            sb.append("Unrecognized cover art flags: ");
                            sb.append(b6);
                            str = sb.toString();
                        } else {
                            xf2.d(4);
                            int i4 = d4 - 16;
                            byte[] bArr = new byte[i4];
                            xf2.a(bArr, 0, i4);
                            wc2 = new rc2(str3, null, 3, bArr);
                            xf2.c(b2);
                            return wc2;
                        }
                    } else {
                        str = "Failed to parse cover art attribute";
                    }
                    Log.w("MetadataUtil", str);
                    xf2.c(b2);
                    return wc2;
                } else if (d2 == s) {
                    vc2 a13 = a(d2, "TPE2", xf2);
                    xf2.c(b2);
                    return a13;
                } else if (d2 == t) {
                    vc2 a14 = a(d2, "TSOT", xf2);
                    xf2.c(b2);
                    return a14;
                } else if (d2 == u) {
                    vc2 a15 = a(d2, "TSO2", xf2);
                    xf2.c(b2);
                    return a15;
                } else if (d2 == v) {
                    vc2 a16 = a(d2, "TSOA", xf2);
                    xf2.c(b2);
                    return a16;
                } else if (d2 == w) {
                    vc2 a17 = a(d2, "TSOP", xf2);
                    xf2.c(b2);
                    return a17;
                } else if (d2 == x) {
                    vc2 a18 = a(d2, "TSOC", xf2);
                    xf2.c(b2);
                    return a18;
                } else if (d2 == y) {
                    wc2 a19 = a(d2, "ITUNESADVISORY", xf2, false, false);
                    xf2.c(b2);
                    return a19;
                } else if (d2 == z) {
                    wc2 a20 = a(d2, "ITUNESGAPLESS", xf2, false, true);
                    xf2.c(b2);
                    return a20;
                } else if (d2 == A) {
                    vc2 a21 = a(d2, "TVSHOWSORT", xf2);
                    xf2.c(b2);
                    return a21;
                } else if (d2 == B) {
                    vc2 a22 = a(d2, "TVSHOW", xf2);
                    xf2.c(b2);
                    return a22;
                } else if (d2 == C) {
                    String str4 = null;
                    String str5 = null;
                    int i5 = -1;
                    int i6 = -1;
                    while (xf2.b() < b2) {
                        int b7 = xf2.b();
                        int d5 = xf2.d();
                        int d6 = xf2.d();
                        xf2.d(4);
                        if (d6 == kb2.o0) {
                            str4 = xf2.e(d5 - 12);
                        } else if (d6 == kb2.p0) {
                            str5 = xf2.e(d5 - 12);
                        } else {
                            if (d6 == kb2.q0) {
                                i5 = b7;
                                i6 = d5;
                            }
                            xf2.d(d5 - 12);
                        }
                    }
                    if ("com.apple.iTunes".equals(str4) && "iTunSMPB".equals(str5) && i5 != -1) {
                        xf2.c(i5);
                        xf2.d(16);
                        wc2 = new sc2("und", str5, xf2.e(i6 - 16));
                    }
                    xf2.c(b2);
                    return wc2;
                }
            } finally {
                xf2.c(b2);
            }
        }
        String valueOf2 = String.valueOf(kb2.c(d2));
        Log.d("MetadataUtil", valueOf2.length() != 0 ? "Skipped unknown metadata entry: ".concat(valueOf2) : new String("Skipped unknown metadata entry: "));
        xf2.c(b2);
        return null;
    }

    private static vc2 a(int i2, String str, xf2 xf2) {
        int d2 = xf2.d();
        if (xf2.d() == kb2.q0) {
            xf2.d(8);
            return new vc2(str, null, xf2.e(d2 - 16));
        }
        String valueOf = String.valueOf(kb2.c(i2));
        Log.w("MetadataUtil", valueOf.length() != 0 ? "Failed to parse text attribute: ".concat(valueOf) : new String("Failed to parse text attribute: "));
        return null;
    }

    private static wc2 a(int i2, String str, xf2 xf2, boolean z2, boolean z3) {
        int b2 = b(xf2);
        if (z3) {
            b2 = Math.min(1, b2);
        }
        if (b2 >= 0) {
            return z2 ? new vc2(str, null, Integer.toString(b2)) : new sc2("und", str, Integer.toString(b2));
        }
        String valueOf = String.valueOf(kb2.c(i2));
        Log.w("MetadataUtil", valueOf.length() != 0 ? "Failed to parse uint8 attribute: ".concat(valueOf) : new String("Failed to parse uint8 attribute: "));
        return null;
    }

    private static int b(xf2 xf2) {
        xf2.d(4);
        if (xf2.d() == kb2.q0) {
            xf2.d(8);
            return xf2.g();
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    private static vc2 b(int i2, String str, xf2 xf2) {
        int d2 = xf2.d();
        if (xf2.d() == kb2.q0 && d2 >= 22) {
            xf2.d(10);
            int h2 = xf2.h();
            if (h2 > 0) {
                StringBuilder sb = new StringBuilder(11);
                sb.append(h2);
                String sb2 = sb.toString();
                int h3 = xf2.h();
                if (h3 > 0) {
                    String valueOf = String.valueOf(sb2);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 12);
                    sb3.append(valueOf);
                    sb3.append("/");
                    sb3.append(h3);
                    sb2 = sb3.toString();
                }
                return new vc2(str, null, sb2);
            }
        }
        String valueOf2 = String.valueOf(kb2.c(i2));
        Log.w("MetadataUtil", valueOf2.length() != 0 ? "Failed to parse index/count attribute: ".concat(valueOf2) : new String("Failed to parse index/count attribute: "));
        return null;
    }
}
