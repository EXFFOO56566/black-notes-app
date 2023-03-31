.class public abstract Lcom/google/android/gms/internal/ads/do2;
.super Lcom/google/android/gms/internal/ads/j72;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/eo2;


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "com.google.android.gms.ads.internal.client.IAdManager"

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/j72;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method protected final a(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 0

    const/4 p4, 0x0

    packed-switch p1, :pswitch_data_0

    :pswitch_0
    const/4 p1, 0x0

    return p1

    :pswitch_1
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const-string p2, "com.google.android.gms.ads.internal.client.IOnPaidEventListener"

    invoke-interface {p1, p2}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object p2

    instance-of p4, p2, Lcom/google/android/gms/internal/ads/lp2;

    if-eqz p4, :cond_1

    move-object p4, p2

    check-cast p4, Lcom/google/android/gms/internal/ads/lp2;

    goto :goto_0

    :cond_1
    new-instance p4, Lcom/google/android/gms/internal/ads/np2;

    invoke-direct {p4, p1}, Lcom/google/android/gms/internal/ads/np2;-><init>(Landroid/os/IBinder;)V

    :goto_0
    invoke-interface {p0, p4}, Lcom/google/android/gms/internal/ads/eo2;->a(Lcom/google/android/gms/internal/ads/lp2;)V

    goto/16 :goto_9

    :pswitch_2
    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/eo2;->j()Lcom/google/android/gms/internal/ads/mp2;

    move-result-object p1

    goto/16 :goto_a

    :pswitch_3
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/vi2;->a(Landroid/os/IBinder;)Lcom/google/android/gms/internal/ads/ti2;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/ads/eo2;->a(Lcom/google/android/gms/internal/ads/ti2;)V

    goto/16 :goto_9

    :pswitch_4
    sget-object p1, Lcom/google/android/gms/internal/ads/bn2;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/ads/i72;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/bn2;

    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/ads/eo2;->a(Lcom/google/android/gms/internal/ads/bn2;)V

    goto/16 :goto_9

    :pswitch_5
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/ads/eo2;->s(Ljava/lang/String;)V

    goto/16 :goto_9

    :pswitch_6
    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/eo2;->v()Landroid/os/Bundle;

    move-result-object p1

    goto/16 :goto_5

    :pswitch_7
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    const-string p2, "com.google.android.gms.ads.internal.client.IAdMetadataListener"

    invoke-interface {p1, p2}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object p2

    instance-of p4, p2, Lcom/google/android/gms/internal/ads/io2;

    if-eqz p4, :cond_3

    move-object p4, p2

    check-cast p4, Lcom/google/android/gms/internal/ads/io2;

    goto :goto_1

    :cond_3
    new-instance p4, Lcom/google/android/gms/internal/ads/ko2;

    invoke-direct {p4, p1}, Lcom/google/android/gms/internal/ads/ko2;-><init>(Landroid/os/IBinder;)V

    :goto_1
    invoke-interface {p0, p4}, Lcom/google/android/gms/internal/ads/eo2;->a(Lcom/google/android/gms/internal/ads/io2;)V

    goto/16 :goto_9

    :pswitch_8
    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/eo2;->V()Ljava/lang/String;

    move-result-object p1

    goto/16 :goto_4

    :pswitch_9
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/i72;->a(Landroid/os/Parcel;)Z

    move-result p1

    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/ads/eo2;->a(Z)V

    goto/16 :goto_9

    :pswitch_a
    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/eo2;->t1()Lcom/google/android/gms/internal/ads/rn2;

    move-result-object p1

    goto/16 :goto_a

    :pswitch_b
    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/eo2;->S0()Lcom/google/android/gms/internal/ads/no2;

    move-result-object p1

    goto/16 :goto_a

    :pswitch_c
    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/eo2;->D1()Ljava/lang/String;

    move-result-object p1

    goto/16 :goto_4

    :pswitch_d
    sget-object p1, Lcom/google/android/gms/internal/ads/xp2;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/ads/i72;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/xp2;

    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/ads/eo2;->a(Lcom/google/android/gms/internal/ads/xp2;)V

    goto/16 :goto_9

    :pswitch_e
    sget-object p1, Lcom/google/android/gms/internal/ads/er2;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/ads/i72;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/er2;

    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/ads/eo2;->a(Lcom/google/android/gms/internal/ads/er2;)V

    goto/16 :goto_9

    :pswitch_f
    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/eo2;->getVideoController()Lcom/google/android/gms/internal/ads/rp2;

    move-result-object p1

    goto/16 :goto_a

    :pswitch_10
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/ads/eo2;->c(Ljava/lang/String;)V

    goto/16 :goto_9

    :pswitch_11
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/hh;->a(Landroid/os/IBinder;)Lcom/google/android/gms/internal/ads/eh;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/ads/eo2;->a(Lcom/google/android/gms/internal/ads/eh;)V

    goto/16 :goto_9

    :pswitch_12
    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/eo2;->u()Z

    move-result p1

    goto/16 :goto_8

    :pswitch_13
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/i72;->a(Landroid/os/Parcel;)Z

    move-result p1

    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/ads/eo2;->c(Z)V

    goto/16 :goto_9

    :pswitch_14
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    if-nez p1, :cond_4

    goto :goto_2

    :cond_4
    const-string p2, "com.google.android.gms.ads.internal.client.ICorrelationIdProvider"

    invoke-interface {p1, p2}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object p2

    instance-of p4, p2, Lcom/google/android/gms/internal/ads/to2;

    if-eqz p4, :cond_5

    move-object p4, p2

    check-cast p4, Lcom/google/android/gms/internal/ads/to2;

    goto :goto_2

    :cond_5
    new-instance p4, Lcom/google/android/gms/internal/ads/so2;

    invoke-direct {p4, p1}, Lcom/google/android/gms/internal/ads/so2;-><init>(Landroid/os/IBinder;)V

    :goto_2
    invoke-interface {p0, p4}, Lcom/google/android/gms/internal/ads/eo2;->b(Lcom/google/android/gms/internal/ads/to2;)V

    goto/16 :goto_9

    :pswitch_15
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    if-nez p1, :cond_6

    goto :goto_3

    :cond_6
    const-string p2, "com.google.android.gms.ads.internal.client.IAdClickListener"

    invoke-interface {p1, p2}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object p2

    instance-of p4, p2, Lcom/google/android/gms/internal/ads/qn2;

    if-eqz p4, :cond_7

    move-object p4, p2

    check-cast p4, Lcom/google/android/gms/internal/ads/qn2;

    goto :goto_3

    :cond_7
    new-instance p4, Lcom/google/android/gms/internal/ads/sn2;

    invoke-direct {p4, p1}, Lcom/google/android/gms/internal/ads/sn2;-><init>(Landroid/os/IBinder;)V

    :goto_3
    invoke-interface {p0, p4}, Lcom/google/android/gms/internal/ads/eo2;->a(Lcom/google/android/gms/internal/ads/qn2;)V

    goto/16 :goto_9

    :pswitch_16
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/x;->a(Landroid/os/IBinder;)Lcom/google/android/gms/internal/ads/u;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/ads/eo2;->a(Lcom/google/android/gms/internal/ads/u;)V

    goto/16 :goto_9

    :pswitch_17
    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/eo2;->a()Ljava/lang/String;

    move-result-object p1

    :goto_4
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    goto/16 :goto_b

    :pswitch_18
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/qe;->a(Landroid/os/IBinder;)Lcom/google/android/gms/internal/ads/re;

    move-result-object p1

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p0, p1, p2}, Lcom/google/android/gms/internal/ads/eo2;->a(Lcom/google/android/gms/internal/ads/re;Ljava/lang/String;)V

    goto/16 :goto_9

    :pswitch_19
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/ke;->a(Landroid/os/IBinder;)Lcom/google/android/gms/internal/ads/le;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/ads/eo2;->a(Lcom/google/android/gms/internal/ads/le;)V

    goto/16 :goto_9

    :pswitch_1a
    sget-object p1, Lcom/google/android/gms/internal/ads/um2;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/ads/i72;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/um2;

    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/ads/eo2;->a(Lcom/google/android/gms/internal/ads/um2;)V

    goto/16 :goto_9

    :pswitch_1b
    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/eo2;->Z1()Lcom/google/android/gms/internal/ads/um2;

    move-result-object p1

    :goto_5
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-static {p3, p1}, Lcom/google/android/gms/internal/ads/i72;->b(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    goto/16 :goto_b

    :pswitch_1c
    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/eo2;->E1()V

    goto/16 :goto_9

    :pswitch_1d
    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/eo2;->x0()V

    goto/16 :goto_9

    :pswitch_1e
    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/eo2;->showInterstitial()V

    goto :goto_9

    :pswitch_1f
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    if-nez p1, :cond_8

    goto :goto_6

    :cond_8
    const-string p2, "com.google.android.gms.ads.internal.client.IAppEventListener"

    invoke-interface {p1, p2}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object p2

    instance-of p4, p2, Lcom/google/android/gms/internal/ads/no2;

    if-eqz p4, :cond_9

    move-object p4, p2

    check-cast p4, Lcom/google/android/gms/internal/ads/no2;

    goto :goto_6

    :cond_9
    new-instance p4, Lcom/google/android/gms/internal/ads/po2;

    invoke-direct {p4, p1}, Lcom/google/android/gms/internal/ads/po2;-><init>(Landroid/os/IBinder;)V

    :goto_6
    invoke-interface {p0, p4}, Lcom/google/android/gms/internal/ads/eo2;->a(Lcom/google/android/gms/internal/ads/no2;)V

    goto :goto_9

    :pswitch_20
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    if-nez p1, :cond_a

    goto :goto_7

    :cond_a
    const-string p2, "com.google.android.gms.ads.internal.client.IAdListener"

    invoke-interface {p1, p2}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object p2

    instance-of p4, p2, Lcom/google/android/gms/internal/ads/rn2;

    if-eqz p4, :cond_b

    move-object p4, p2

    check-cast p4, Lcom/google/android/gms/internal/ads/rn2;

    goto :goto_7

    :cond_b
    new-instance p4, Lcom/google/android/gms/internal/ads/tn2;

    invoke-direct {p4, p1}, Lcom/google/android/gms/internal/ads/tn2;-><init>(Landroid/os/IBinder;)V

    :goto_7
    invoke-interface {p0, p4}, Lcom/google/android/gms/internal/ads/eo2;->a(Lcom/google/android/gms/internal/ads/rn2;)V

    goto :goto_9

    :pswitch_21
    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/eo2;->z()V

    goto :goto_9

    :pswitch_22
    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/eo2;->p()V

    goto :goto_9

    :pswitch_23
    sget-object p1, Lcom/google/android/gms/internal/ads/rm2;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/ads/i72;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/rm2;

    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/ads/eo2;->a(Lcom/google/android/gms/internal/ads/rm2;)Z

    move-result p1

    goto :goto_8

    :pswitch_24
    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/eo2;->D()Z

    move-result p1

    :goto_8
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-static {p3, p1}, Lcom/google/android/gms/internal/ads/i72;->a(Landroid/os/Parcel;Z)V

    goto :goto_b

    :pswitch_25
    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/eo2;->destroy()V

    :goto_9
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    goto :goto_b

    :pswitch_26
    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/eo2;->m1()Lb/c/b/a/d/a;

    move-result-object p1

    :goto_a
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-static {p3, p1}, Lcom/google/android/gms/internal/ads/i72;->a(Landroid/os/Parcel;Landroid/os/IInterface;)V

    :goto_b
    const/4 p1, 0x1

    return p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_0
        :pswitch_0
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_0
        :pswitch_0
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
