package com.google.android.gms.ads.mediation.rtb;

import com.google.android.gms.ads.mediation.a;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public abstract class RtbAdapter extends a {
    public abstract void collectSignals(a aVar, b bVar);
}
