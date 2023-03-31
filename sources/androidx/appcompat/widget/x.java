package androidx.appcompat.widget;

import a.g.k.h;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* access modifiers changed from: package-private */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    private TextView f720a;

    /* renamed from: b  reason: collision with root package name */
    private TextClassifier f721b;

    x(TextView textView) {
        h.a(textView);
        this.f720a = textView;
    }

    public TextClassifier a() {
        TextClassifier textClassifier = this.f721b;
        if (textClassifier != null) {
            return textClassifier;
        }
        TextClassificationManager textClassificationManager = (TextClassificationManager) this.f720a.getContext().getSystemService(TextClassificationManager.class);
        return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
    }

    public void a(TextClassifier textClassifier) {
        this.f721b = textClassifier;
    }
}
