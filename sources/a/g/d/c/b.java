package a.g.d.c;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParserException;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final Shader f102a;

    /* renamed from: b  reason: collision with root package name */
    private final ColorStateList f103b;

    /* renamed from: c  reason: collision with root package name */
    private int f104c;

    private b(Shader shader, ColorStateList colorStateList, int i) {
        this.f102a = shader;
        this.f103b = colorStateList;
        this.f104c = i;
    }

    static b a(ColorStateList colorStateList) {
        return new b(null, colorStateList, colorStateList.getDefaultColor());
    }

    private static b a(Resources resources, int i, Resources.Theme theme) {
        int next;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            String name = xml.getName();
            char c2 = 65535;
            int hashCode = name.hashCode();
            if (hashCode != 89650992) {
                if (hashCode == 1191572447 && name.equals("selector")) {
                    c2 = 0;
                }
            } else if (name.equals("gradient")) {
                c2 = 1;
            }
            if (c2 == 0) {
                return a(a.a(resources, xml, asAttributeSet, theme));
            }
            if (c2 == 1) {
                return a(d.a(resources, xml, asAttributeSet, theme));
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        throw new XmlPullParserException("No start tag found");
    }

    static b a(Shader shader) {
        return new b(shader, null, 0);
    }

    static b b(int i) {
        return new b(null, null, i);
    }

    public static b b(Resources resources, int i, Resources.Theme theme) {
        try {
            return a(resources, i, theme);
        } catch (Exception e) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
            return null;
        }
    }

    public int a() {
        return this.f104c;
    }

    public void a(int i) {
        this.f104c = i;
    }

    public boolean a(int[] iArr) {
        if (d()) {
            ColorStateList colorStateList = this.f103b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f104c) {
                this.f104c = colorForState;
                return true;
            }
        }
        return false;
    }

    public Shader b() {
        return this.f102a;
    }

    public boolean c() {
        return this.f102a != null;
    }

    public boolean d() {
        ColorStateList colorStateList;
        return this.f102a == null && (colorStateList = this.f103b) != null && colorStateList.isStateful();
    }

    public boolean e() {
        return c() || this.f104c != 0;
    }
}
