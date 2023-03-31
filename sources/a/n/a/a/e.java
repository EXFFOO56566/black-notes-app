package a.n.a.a;

import a.g.d.c.g;
import a.g.e.b;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class e {

    /* access modifiers changed from: private */
    public static class a implements TypeEvaluator<b.C0009b[]> {

        /* renamed from: a  reason: collision with root package name */
        private b.C0009b[] f384a;

        a() {
        }

        /* renamed from: a */
        public b.C0009b[] evaluate(float f, b.C0009b[] bVarArr, b.C0009b[] bVarArr2) {
            if (b.a(bVarArr, bVarArr2)) {
                if (!b.a(this.f384a, bVarArr)) {
                    this.f384a = b.a(bVarArr);
                }
                for (int i = 0; i < bVarArr.length; i++) {
                    this.f384a[i].a(bVarArr[i], bVarArr2[i], f);
                }
                return this.f384a;
            }
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
    }

    private static int a(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray a2 = g.a(resources, theme, attributeSet, a.j);
        int i = 0;
        TypedValue b2 = g.b(a2, xmlPullParser, "value", 0);
        if ((b2 != null) && a(b2.type)) {
            i = 3;
        }
        a2.recycle();
        return i;
    }

    private static int a(TypedArray typedArray, int i, int i2) {
        TypedValue peekValue = typedArray.peekValue(i);
        boolean z = true;
        boolean z2 = peekValue != null;
        int i3 = z2 ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i2);
        if (peekValue2 == null) {
            z = false;
        }
        return ((!z2 || !a(i3)) && (!z || !a(z ? peekValue2.type : 0))) ? 0 : 3;
    }

    public static Animator a(Context context, int i) {
        return Build.VERSION.SDK_INT >= 24 ? AnimatorInflater.loadAnimator(context, i) : a(context, context.getResources(), context.getTheme(), i);
    }

    public static Animator a(Context context, Resources resources, Resources.Theme theme, int i) {
        return a(context, resources, theme, i, 1.0f);
    }

    public static Animator a(Context context, Resources resources, Resources.Theme theme, int i, float f) {
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = resources.getAnimation(i);
            Animator a2 = a(context, resources, theme, xmlResourceParser, f);
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            return a2;
        } catch (XmlPullParserException e) {
            Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
            notFoundException.initCause(e);
            throw notFoundException;
        } catch (IOException e2) {
            Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
            notFoundException2.initCause(e2);
            throw notFoundException2;
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }

    private static Animator a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, float f) {
        return a(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser), null, 0, f);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r15v0, resolved type: android.animation.AnimatorSet */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.animation.Animator a(android.content.Context r18, android.content.res.Resources r19, android.content.res.Resources.Theme r20, org.xmlpull.v1.XmlPullParser r21, android.util.AttributeSet r22, android.animation.AnimatorSet r23, int r24, float r25) {
        /*
        // Method dump skipped, instructions count: 263
        */
        throw new UnsupportedOperationException("Method not decompiled: a.n.a.a.e.a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int, float):android.animation.Animator");
    }

    private static Keyframe a(Keyframe keyframe, float f) {
        return keyframe.getType() == Float.TYPE ? Keyframe.ofFloat(f) : keyframe.getType() == Integer.TYPE ? Keyframe.ofInt(f) : Keyframe.ofObject(f);
    }

    private static Keyframe a(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, int i, XmlPullParser xmlPullParser) {
        TypedArray a2 = g.a(resources, theme, attributeSet, a.j);
        float a3 = g.a(a2, xmlPullParser, "fraction", 3, -1.0f);
        TypedValue b2 = g.b(a2, xmlPullParser, "value", 0);
        boolean z = b2 != null;
        if (i == 4) {
            i = (!z || !a(b2.type)) ? 0 : 3;
        }
        Keyframe ofInt = z ? i != 0 ? (i == 1 || i == 3) ? Keyframe.ofInt(a3, g.b(a2, xmlPullParser, "value", 0, 0)) : null : Keyframe.ofFloat(a3, g.a(a2, xmlPullParser, "value", 0, 0.0f)) : i == 0 ? Keyframe.ofFloat(a3) : Keyframe.ofInt(a3);
        int c2 = g.c(a2, xmlPullParser, "interpolator", 1, 0);
        if (c2 > 0) {
            ofInt.setInterpolator(d.a(context, c2));
        }
        a2.recycle();
        return ofInt;
    }

    private static ObjectAnimator a(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, float f, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        a(context, resources, theme, attributeSet, objectAnimator, f, xmlPullParser);
        return objectAnimator;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.animation.PropertyValuesHolder a(android.content.Context r9, android.content.res.Resources r10, android.content.res.Resources.Theme r11, org.xmlpull.v1.XmlPullParser r12, java.lang.String r13, int r14) {
        /*
        // Method dump skipped, instructions count: 234
        */
        throw new UnsupportedOperationException("Method not decompiled: a.n.a.a.e.a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, java.lang.String, int):android.animation.PropertyValuesHolder");
    }

    private static PropertyValuesHolder a(TypedArray typedArray, int i, int i2, int i3, String str) {
        PropertyValuesHolder propertyValuesHolder;
        PropertyValuesHolder propertyValuesHolder2;
        TypedValue peekValue = typedArray.peekValue(i2);
        boolean z = peekValue != null;
        int i4 = z ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i3);
        boolean z2 = peekValue2 != null;
        int i5 = z2 ? peekValue2.type : 0;
        if (i == 4) {
            i = ((!z || !a(i4)) && (!z2 || !a(i5))) ? 0 : 3;
        }
        boolean z3 = i == 0;
        PropertyValuesHolder propertyValuesHolder3 = null;
        if (i == 2) {
            String string = typedArray.getString(i2);
            String string2 = typedArray.getString(i3);
            b.C0009b[] a2 = b.a(string);
            b.C0009b[] a3 = b.a(string2);
            if (a2 == null && a3 == null) {
                return null;
            }
            if (a2 != null) {
                a aVar = new a();
                if (a3 == null) {
                    propertyValuesHolder2 = PropertyValuesHolder.ofObject(str, aVar, a2);
                } else if (b.a(a2, a3)) {
                    propertyValuesHolder2 = PropertyValuesHolder.ofObject(str, aVar, a2, a3);
                } else {
                    throw new InflateException(" Can't morph from " + string + " to " + string2);
                }
                return propertyValuesHolder2;
            } else if (a3 == null) {
                return null;
            } else {
                return PropertyValuesHolder.ofObject(str, new a(), a3);
            }
        } else {
            f a4 = i == 3 ? f.a() : null;
            if (z3) {
                if (z) {
                    float dimension = i4 == 5 ? typedArray.getDimension(i2, 0.0f) : typedArray.getFloat(i2, 0.0f);
                    if (z2) {
                        propertyValuesHolder = PropertyValuesHolder.ofFloat(str, dimension, i5 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f));
                    } else {
                        propertyValuesHolder = PropertyValuesHolder.ofFloat(str, dimension);
                    }
                } else {
                    propertyValuesHolder = PropertyValuesHolder.ofFloat(str, i5 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f));
                }
                propertyValuesHolder3 = propertyValuesHolder;
            } else if (z) {
                int dimension2 = i4 == 5 ? (int) typedArray.getDimension(i2, 0.0f) : a(i4) ? typedArray.getColor(i2, 0) : typedArray.getInt(i2, 0);
                if (z2) {
                    propertyValuesHolder3 = PropertyValuesHolder.ofInt(str, dimension2, i5 == 5 ? (int) typedArray.getDimension(i3, 0.0f) : a(i5) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0));
                } else {
                    propertyValuesHolder3 = PropertyValuesHolder.ofInt(str, dimension2);
                }
            } else if (z2) {
                propertyValuesHolder3 = PropertyValuesHolder.ofInt(str, i5 == 5 ? (int) typedArray.getDimension(i3, 0.0f) : a(i5) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0));
            }
            if (propertyValuesHolder3 == null || a4 == null) {
                return propertyValuesHolder3;
            }
            propertyValuesHolder3.setEvaluator(a4);
            return propertyValuesHolder3;
        }
    }

    private static ValueAnimator a(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f, XmlPullParser xmlPullParser) {
        TypedArray a2 = g.a(resources, theme, attributeSet, a.g);
        TypedArray a3 = g.a(resources, theme, attributeSet, a.k);
        if (valueAnimator == null) {
            valueAnimator = new ValueAnimator();
        }
        a(valueAnimator, a2, a3, f, xmlPullParser);
        int c2 = g.c(a2, xmlPullParser, "interpolator", 0, 0);
        if (c2 > 0) {
            valueAnimator.setInterpolator(d.a(context, c2));
        }
        a2.recycle();
        if (a3 != null) {
            a3.recycle();
        }
        return valueAnimator;
    }

    private static void a(ValueAnimator valueAnimator, TypedArray typedArray, int i, float f, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator;
        String a2 = g.a(typedArray, xmlPullParser, "pathData", 1);
        if (a2 != null) {
            String a3 = g.a(typedArray, xmlPullParser, "propertyXName", 2);
            String a4 = g.a(typedArray, xmlPullParser, "propertyYName", 3);
            if (i != 2) {
            }
            if (a3 == null && a4 == null) {
                throw new InflateException(typedArray.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
            }
            a(b.b(a2), objectAnimator, f * 0.5f, a3, a4);
            return;
        }
        objectAnimator.setPropertyName(g.a(typedArray, xmlPullParser, "propertyName", 0));
    }

    private static void a(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f, XmlPullParser xmlPullParser) {
        long b2 = (long) g.b(typedArray, xmlPullParser, "duration", 1, 300);
        long b3 = (long) g.b(typedArray, xmlPullParser, "startOffset", 2, 0);
        int b4 = g.b(typedArray, xmlPullParser, "valueType", 7, 4);
        if (g.a(xmlPullParser, "valueFrom") && g.a(xmlPullParser, "valueTo")) {
            if (b4 == 4) {
                b4 = a(typedArray, 5, 6);
            }
            PropertyValuesHolder a2 = a(typedArray, b4, 5, 6, BuildConfig.FLAVOR);
            if (a2 != null) {
                valueAnimator.setValues(a2);
            }
        }
        valueAnimator.setDuration(b2);
        valueAnimator.setStartDelay(b3);
        valueAnimator.setRepeatCount(g.b(typedArray, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(g.b(typedArray, xmlPullParser, "repeatMode", 4, 1));
        if (typedArray2 != null) {
            a(valueAnimator, typedArray2, b4, f, xmlPullParser);
        }
    }

    private static void a(Path path, ObjectAnimator objectAnimator, float f, String str, String str2) {
        PropertyValuesHolder propertyValuesHolder;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        ArrayList arrayList = new ArrayList();
        float f2 = 0.0f;
        arrayList.add(Float.valueOf(0.0f));
        float f3 = 0.0f;
        do {
            f3 += pathMeasure.getLength();
            arrayList.add(Float.valueOf(f3));
        } while (pathMeasure.nextContour());
        PathMeasure pathMeasure2 = new PathMeasure(path, false);
        int min = Math.min(100, ((int) (f3 / f)) + 1);
        float[] fArr = new float[min];
        float[] fArr2 = new float[min];
        float[] fArr3 = new float[2];
        float f4 = f3 / ((float) (min - 1));
        int i = 0;
        int i2 = 0;
        while (true) {
            propertyValuesHolder = null;
            if (i >= min) {
                break;
            }
            pathMeasure2.getPosTan(f2 - ((Float) arrayList.get(i2)).floatValue(), fArr3, null);
            fArr[i] = fArr3[0];
            fArr2[i] = fArr3[1];
            f2 += f4;
            int i3 = i2 + 1;
            if (i3 < arrayList.size() && f2 > ((Float) arrayList.get(i3)).floatValue()) {
                pathMeasure2.nextContour();
                i2 = i3;
            }
            i++;
        }
        PropertyValuesHolder ofFloat = str != null ? PropertyValuesHolder.ofFloat(str, fArr) : null;
        if (str2 != null) {
            propertyValuesHolder = PropertyValuesHolder.ofFloat(str2, fArr2);
        }
        if (ofFloat == null) {
            objectAnimator.setValues(propertyValuesHolder);
        } else if (propertyValuesHolder == null) {
            objectAnimator.setValues(ofFloat);
        } else {
            objectAnimator.setValues(ofFloat, propertyValuesHolder);
        }
    }

    private static void a(Keyframe[] keyframeArr, float f, int i, int i2) {
        float f2 = f / ((float) ((i2 - i) + 2));
        while (i <= i2) {
            keyframeArr[i].setFraction(keyframeArr[i - 1].getFraction() + f2);
            i++;
        }
    }

    private static boolean a(int i) {
        return i >= 28 && i <= 31;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x006c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.animation.PropertyValuesHolder[] a(android.content.Context r17, android.content.res.Resources r18, android.content.res.Resources.Theme r19, org.xmlpull.v1.XmlPullParser r20, android.util.AttributeSet r21) {
        /*
        // Method dump skipped, instructions count: 128
        */
        throw new UnsupportedOperationException("Method not decompiled: a.n.a.a.e.a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet):android.animation.PropertyValuesHolder[]");
    }
}
