package com.google.android.gms.internal.ads;

class kb2 {
    public static final int A = ag2.d("minf");
    public static final int B = ag2.d("stbl");
    public static final int C = ag2.d("avcC");
    public static final int D = ag2.d("hvcC");
    public static final int E = ag2.d("esds");
    public static final int F = ag2.d("moof");
    public static final int G = ag2.d("mvex");
    public static final int H = ag2.d("tkhd");
    public static final int I = ag2.d("edts");
    public static final int J = ag2.d("elst");
    public static final int K = ag2.d("mdhd");
    public static final int L = ag2.d("hdlr");
    public static final int M = ag2.d("stsd");
    public static final int N = ag2.d("sinf");
    public static final int O = ag2.d("schm");
    public static final int P = ag2.d("schi");
    public static final int Q = ag2.d("tenc");
    public static final int R = ag2.d("encv");
    public static final int S = ag2.d("enca");
    public static final int T = ag2.d("frma");
    public static final int U = ag2.d("pasp");
    public static final int V = ag2.d("TTML");
    public static final int W = ag2.d("mp4v");
    public static final int X = ag2.d("stts");
    public static final int Y = ag2.d("stss");
    public static final int Z = ag2.d("ctts");
    public static final int a0 = ag2.d("stsc");

    /* renamed from: b  reason: collision with root package name */
    public static final int f3364b = ag2.d("ftyp");
    public static final int b0 = ag2.d("stsz");

    /* renamed from: c  reason: collision with root package name */
    public static final int f3365c = ag2.d("avc1");
    public static final int c0 = ag2.d("stz2");
    public static final int d = ag2.d("avc3");
    public static final int d0 = ag2.d("stco");
    public static final int e = ag2.d("hvc1");
    public static final int e0 = ag2.d("co64");
    public static final int f = ag2.d("hev1");
    public static final int f0 = ag2.d("tx3g");
    public static final int g = ag2.d("s263");
    public static final int g0 = ag2.d("wvtt");
    public static final int h = ag2.d("d263");
    public static final int h0 = ag2.d("stpp");
    public static final int i = ag2.d("mp4a");
    public static final int i0 = ag2.d("c608");
    public static final int j = ag2.d(".mp3");
    public static final int j0 = ag2.d("samr");
    public static final int k = ag2.d("wave");
    public static final int k0 = ag2.d("sawb");
    public static final int l = ag2.d("lpcm");
    public static final int l0 = ag2.d("udta");
    public static final int m = ag2.d("sowt");
    public static final int m0 = ag2.d("meta");
    public static final int n = ag2.d("ac-3");
    public static final int n0 = ag2.d("ilst");
    public static final int o = ag2.d("dac3");
    public static final int o0 = ag2.d("mean");
    public static final int p = ag2.d("ec-3");
    public static final int p0 = ag2.d("name");
    public static final int q = ag2.d("dec3");
    public static final int q0 = ag2.d("data");
    public static final int r = ag2.d("dtsc");
    public static final int r0 = ag2.d("st3d");
    public static final int s = ag2.d("dtsh");
    public static final int s0 = ag2.d("sv3d");
    public static final int t = ag2.d("dtsl");
    public static final int t0 = ag2.d("proj");
    public static final int u = ag2.d("dtse");
    public static final int u0 = ag2.d("vp08");
    public static final int v = ag2.d("ddts");
    public static final int v0 = ag2.d("vp09");
    public static final int w = ag2.d("moov");
    public static final int w0 = ag2.d("vpcC");
    public static final int x = ag2.d("mvhd");
    public static final int x0 = ag2.d("camm");
    public static final int y = ag2.d("trak");
    public static final int y0 = ag2.d("alac");
    public static final int z = ag2.d("mdia");

    /* renamed from: a  reason: collision with root package name */
    public final int f3366a;

    static {
        ag2.d("mdat");
        ag2.d("tfdt");
        ag2.d("tfhd");
        ag2.d("trex");
        ag2.d("trun");
        ag2.d("sidx");
        ag2.d("traf");
        ag2.d("mehd");
        ag2.d("pssh");
        ag2.d("saiz");
        ag2.d("saio");
        ag2.d("sbgp");
        ag2.d("sgpd");
        ag2.d("uuid");
        ag2.d("senc");
        ag2.d("vmhd");
        ag2.d("emsg");
    }

    public kb2(int i2) {
        this.f3366a = i2;
    }

    public static int a(int i2) {
        return (i2 >> 24) & 255;
    }

    public static int b(int i2) {
        return i2 & 16777215;
    }

    public static String c(int i2) {
        StringBuilder sb = new StringBuilder(4);
        sb.append((char) (i2 >>> 24));
        sb.append((char) ((i2 >> 16) & 255));
        sb.append((char) ((i2 >> 8) & 255));
        sb.append((char) (i2 & 255));
        return sb.toString();
    }

    public String toString() {
        return c(this.f3366a);
    }
}
