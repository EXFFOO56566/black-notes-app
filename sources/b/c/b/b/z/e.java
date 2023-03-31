package b.c.b.b.z;

public class e extends d {

    /* renamed from: a  reason: collision with root package name */
    float f1310a = -1.0f;

    @Override // b.c.b.b.z.d
    public void a(m mVar, float f, float f2, float f3) {
        mVar.a(0.0f, f3 * f2, 180.0f, 180.0f - f);
        double d = (double) f3;
        double d2 = (double) f2;
        mVar.a((float) (Math.sin(Math.toRadians((double) f)) * d * d2), (float) (Math.sin(Math.toRadians((double) (90.0f - f))) * d * d2));
    }
}
