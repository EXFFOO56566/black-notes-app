package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.ads.internal.q;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class gn {
    private static int a(Context context, int i) {
        return on2.a().a(context, i);
    }

    public static Point a(MotionEvent motionEvent, View view) {
        int[] b2 = b(view);
        return new Point(((int) motionEvent.getRawX()) - b2[0], ((int) motionEvent.getRawY()) - b2[1]);
    }

    private static JSONObject a(Context context, Point point, Point point2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", a(context, point2.x));
            jSONObject.put("y", a(context, point2.y));
            jSONObject.put("start_x", a(context, point.x));
            jSONObject.put("start_y", a(context, point.y));
            return jSONObject;
        } catch (JSONException e) {
            co.b("Error occurred while putting signals into JSON object.", e);
            return null;
        }
    }

    private static JSONObject a(Context context, Rect rect) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", a(context, rect.right - rect.left));
        jSONObject.put("height", a(context, rect.bottom - rect.top));
        jSONObject.put("x", a(context, rect.left));
        jSONObject.put("y", a(context, rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ce A[Catch:{ JSONException -> 0x00fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00de A[Catch:{ JSONException -> 0x00fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.json.JSONObject a(android.content.Context r12, android.view.View r13) {
        /*
        // Method dump skipped, instructions count: 257
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.gn.a(android.content.Context, android.view.View):org.json.JSONObject");
    }

    public static JSONObject a(Context context, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, View view) {
        String str;
        String str2;
        JSONObject jSONObject;
        String str3 = "ad_view";
        String str4 = "relative_to";
        JSONObject jSONObject2 = new JSONObject();
        if (!(map == null || view == null)) {
            int[] b2 = b(view);
            Iterator<Map.Entry<String, WeakReference<View>>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, WeakReference<View>> next = it.next();
                View view2 = next.getValue().get();
                if (view2 != null) {
                    int[] b3 = b(view2);
                    JSONObject jSONObject3 = new JSONObject();
                    JSONObject jSONObject4 = new JSONObject();
                    try {
                        jSONObject4.put("width", a(context, view2.getMeasuredWidth()));
                        jSONObject4.put("height", a(context, view2.getMeasuredHeight()));
                        jSONObject4.put("x", a(context, b3[0] - b2[0]));
                        jSONObject4.put("y", a(context, b3[1] - b2[1]));
                        jSONObject4.put(str4, str3);
                        jSONObject3.put("frame", jSONObject4);
                        Rect rect = new Rect();
                        if (view2.getLocalVisibleRect(rect)) {
                            jSONObject = a(context, rect);
                        } else {
                            jSONObject = new JSONObject();
                            jSONObject.put("width", 0);
                            jSONObject.put("height", 0);
                            jSONObject.put("x", a(context, b3[0] - b2[0]));
                            jSONObject.put("y", a(context, b3[1] - b2[1]));
                            jSONObject.put(str4, str3);
                        }
                        jSONObject3.put("visible_bounds", jSONObject);
                        if (view2 instanceof TextView) {
                            TextView textView = (TextView) view2;
                            jSONObject3.put("text_color", textView.getCurrentTextColor());
                            str2 = str3;
                            str = str4;
                            try {
                                jSONObject3.put("font_size", (double) textView.getTextSize());
                                jSONObject3.put("text", textView.getText());
                            } catch (JSONException unused) {
                                co.d("Unable to get asset views information");
                                it = it;
                                str3 = str2;
                                str4 = str;
                            }
                        } else {
                            str2 = str3;
                            str = str4;
                        }
                        jSONObject3.put("is_clickable", map2 != null && map2.containsKey(next.getKey()) && view2.isClickable());
                        jSONObject2.put(next.getKey(), jSONObject3);
                    } catch (JSONException unused2) {
                        str2 = str3;
                        str = str4;
                        co.d("Unable to get asset views information");
                        it = it;
                        str3 = str2;
                        str4 = str;
                    }
                    it = it;
                    str3 = str2;
                    str4 = str;
                }
            }
        }
        return jSONObject2;
    }

    public static JSONObject a(View view) {
        JSONObject jSONObject = new JSONObject();
        if (view == null) {
            return jSONObject;
        }
        try {
            q.c();
            jSONObject.put("contained_in_scroll_view", gl.f(view) != -1);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static JSONObject a(String str, Context context, Point point, Point point2) {
        Exception e;
        JSONObject jSONObject = null;
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("click_point", a(context, point, point2));
                jSONObject2.put("asset_id", str);
                return jSONObject2;
            } catch (Exception e2) {
                e = e2;
                jSONObject = jSONObject2;
            }
        } catch (Exception e3) {
            e = e3;
            co.b("Error occurred while grabbing click signals.", e);
            return jSONObject;
        }
    }

    public static boolean a(int i) {
        if (!((Boolean) on2.e().a(zr2.n1)).booleanValue()) {
            return true;
        }
        return ((Boolean) on2.e().a(zr2.o1)).booleanValue() || i <= 15299999;
    }

    public static JSONObject b(Context context, View view) {
        JSONObject jSONObject = new JSONObject();
        if (view == null) {
            return jSONObject;
        }
        try {
            q.c();
            jSONObject.put("can_show_on_lock_screen", gl.e(view));
            q.c();
            jSONObject.put("is_keyguard_locked", gl.j(context));
        } catch (JSONException unused) {
            co.d("Unable to get lock screen information");
        }
        return jSONObject;
    }

    private static int[] b(View view) {
        int[] iArr = new int[2];
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        return iArr;
    }
}
