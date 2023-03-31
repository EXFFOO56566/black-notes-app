package a.g.j;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;

public class c implements Spannable {

    /* renamed from: b  reason: collision with root package name */
    private final Spannable f172b;

    /* renamed from: c  reason: collision with root package name */
    private final a f173c;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final TextPaint f174a;

        /* renamed from: b  reason: collision with root package name */
        private final TextDirectionHeuristic f175b;

        /* renamed from: c  reason: collision with root package name */
        private final int f176c;
        private final int d;
        final PrecomputedText.Params e = null;

        /* renamed from: a.g.j.c$a$a  reason: collision with other inner class name */
        public static class C0014a {

            /* renamed from: a  reason: collision with root package name */
            private final TextPaint f177a;

            /* renamed from: b  reason: collision with root package name */
            private TextDirectionHeuristic f178b;

            /* renamed from: c  reason: collision with root package name */
            private int f179c;
            private int d;

            public C0014a(TextPaint textPaint) {
                this.f177a = textPaint;
                if (Build.VERSION.SDK_INT >= 23) {
                    this.f179c = 1;
                    this.d = 1;
                } else {
                    this.d = 0;
                    this.f179c = 0;
                }
                this.f178b = Build.VERSION.SDK_INT >= 18 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : null;
            }

            public C0014a a(int i) {
                this.f179c = i;
                return this;
            }

            public C0014a a(TextDirectionHeuristic textDirectionHeuristic) {
                this.f178b = textDirectionHeuristic;
                return this;
            }

            public a a() {
                return new a(this.f177a, this.f178b, this.f179c, this.d);
            }

            public C0014a b(int i) {
                this.d = i;
                return this;
            }
        }

        public a(PrecomputedText.Params params) {
            this.f174a = params.getTextPaint();
            this.f175b = params.getTextDirection();
            this.f176c = params.getBreakStrategy();
            this.d = params.getHyphenationFrequency();
        }

        a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            this.f174a = textPaint;
            this.f175b = textDirectionHeuristic;
            this.f176c = i;
            this.d = i2;
        }

        public int a() {
            return this.f176c;
        }

        public boolean a(a aVar) {
            PrecomputedText.Params params = this.e;
            if (params != null) {
                return params.equals(aVar.e);
            }
            if ((Build.VERSION.SDK_INT >= 23 && (this.f176c != aVar.a() || this.d != aVar.b())) || this.f174a.getTextSize() != aVar.d().getTextSize() || this.f174a.getTextScaleX() != aVar.d().getTextScaleX() || this.f174a.getTextSkewX() != aVar.d().getTextSkewX()) {
                return false;
            }
            if ((Build.VERSION.SDK_INT >= 21 && (this.f174a.getLetterSpacing() != aVar.d().getLetterSpacing() || !TextUtils.equals(this.f174a.getFontFeatureSettings(), aVar.d().getFontFeatureSettings()))) || this.f174a.getFlags() != aVar.d().getFlags()) {
                return false;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                if (!this.f174a.getTextLocales().equals(aVar.d().getTextLocales())) {
                    return false;
                }
            } else if (i >= 17 && !this.f174a.getTextLocale().equals(aVar.d().getTextLocale())) {
                return false;
            }
            return this.f174a.getTypeface() == null ? aVar.d().getTypeface() == null : this.f174a.getTypeface().equals(aVar.d().getTypeface());
        }

        public int b() {
            return this.d;
        }

        public TextDirectionHeuristic c() {
            return this.f175b;
        }

        public TextPaint d() {
            return this.f174a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!a(aVar)) {
                return false;
            }
            return Build.VERSION.SDK_INT < 18 || this.f175b == aVar.c();
        }

        public int hashCode() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                return a.g.k.c.a(Float.valueOf(this.f174a.getTextSize()), Float.valueOf(this.f174a.getTextScaleX()), Float.valueOf(this.f174a.getTextSkewX()), Float.valueOf(this.f174a.getLetterSpacing()), Integer.valueOf(this.f174a.getFlags()), this.f174a.getTextLocales(), this.f174a.getTypeface(), Boolean.valueOf(this.f174a.isElegantTextHeight()), this.f175b, Integer.valueOf(this.f176c), Integer.valueOf(this.d));
            } else if (i >= 21) {
                return a.g.k.c.a(Float.valueOf(this.f174a.getTextSize()), Float.valueOf(this.f174a.getTextScaleX()), Float.valueOf(this.f174a.getTextSkewX()), Float.valueOf(this.f174a.getLetterSpacing()), Integer.valueOf(this.f174a.getFlags()), this.f174a.getTextLocale(), this.f174a.getTypeface(), Boolean.valueOf(this.f174a.isElegantTextHeight()), this.f175b, Integer.valueOf(this.f176c), Integer.valueOf(this.d));
            } else if (i >= 18) {
                return a.g.k.c.a(Float.valueOf(this.f174a.getTextSize()), Float.valueOf(this.f174a.getTextScaleX()), Float.valueOf(this.f174a.getTextSkewX()), Integer.valueOf(this.f174a.getFlags()), this.f174a.getTextLocale(), this.f174a.getTypeface(), this.f175b, Integer.valueOf(this.f176c), Integer.valueOf(this.d));
            } else if (i >= 17) {
                return a.g.k.c.a(Float.valueOf(this.f174a.getTextSize()), Float.valueOf(this.f174a.getTextScaleX()), Float.valueOf(this.f174a.getTextSkewX()), Integer.valueOf(this.f174a.getFlags()), this.f174a.getTextLocale(), this.f174a.getTypeface(), this.f175b, Integer.valueOf(this.f176c), Integer.valueOf(this.d));
            } else {
                return a.g.k.c.a(Float.valueOf(this.f174a.getTextSize()), Float.valueOf(this.f174a.getTextScaleX()), Float.valueOf(this.f174a.getTextSkewX()), Integer.valueOf(this.f174a.getFlags()), this.f174a.getTypeface(), this.f175b, Integer.valueOf(this.f176c), Integer.valueOf(this.d));
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x00e3  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String toString() {
            /*
            // Method dump skipped, instructions count: 329
            */
            throw new UnsupportedOperationException("Method not decompiled: a.g.j.c.a.toString():java.lang.String");
        }
    }

    public a a() {
        return this.f173c;
    }

    public char charAt(int i) {
        return this.f172b.charAt(i);
    }

    public int getSpanEnd(Object obj) {
        return this.f172b.getSpanEnd(obj);
    }

    public int getSpanFlags(Object obj) {
        return this.f172b.getSpanFlags(obj);
    }

    public int getSpanStart(Object obj) {
        return this.f172b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        return (T[]) this.f172b.getSpans(i, i2, cls);
    }

    public int length() {
        return this.f172b.length();
    }

    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.f172b.nextSpanTransition(i, i2, cls);
    }

    public void removeSpan(Object obj) {
        if (!(obj instanceof MetricAffectingSpan)) {
            this.f172b.removeSpan(obj);
            return;
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
    }

    public void setSpan(Object obj, int i, int i2, int i3) {
        if (!(obj instanceof MetricAffectingSpan)) {
            this.f172b.setSpan(obj, i, i2, i3);
            return;
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
    }

    public CharSequence subSequence(int i, int i2) {
        return this.f172b.subSequence(i, i2);
    }

    public String toString() {
        return this.f172b.toString();
    }
}
