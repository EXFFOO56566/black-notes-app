.class public abstract Lcom/google/android/gms/internal/ads/ai;
.super Lcom/google/android/gms/internal/ads/j72;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/xh;


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd"

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/j72;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public static a(Landroid/os/IBinder;)Lcom/google/android/gms/internal/ads/xh;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, Lcom/google/android/gms/internal/ads/xh;

    if-eqz v1, :cond_1

    check-cast v0, Lcom/google/android/gms/internal/ads/xh;

    return-object v0

    :cond_1
    new-instance v0, Lcom/google/android/gms/internal/ads/zh;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/zh;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method


# virtual methods
.method protected final a(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 1

    const-string p4, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback"

    const/4 v0, 0x0

    packed-switch p1, :pswitch_data_0

    const/4 p1, 0x0

    return p1

    :pswitch_0
    sget-object p1, Lcom/google/android/gms/internal/ads/rm2;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/ads/i72;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/rm2;

    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p2, p4}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object p4

    instance-of v0, p4, Lcom/google/android/gms/internal/ads/di;

    if-eqz v0, :cond_1

    move-object v0, p4

    check-cast v0, Lcom/google/android/gms/internal/ads/di;

    goto :goto_0

    :cond_1
    new-instance v0, Lcom/google/android/gms/internal/ads/ei;

    invoke-direct {v0, p2}, Lcom/google/android/gms/internal/ads/ei;-><init>(Landroid/os/IBinder;)V

    :goto_0
    invoke-interface {p0, p1, v0}, Lcom/google/android/gms/internal/ads/xh;->b(Lcom/google/android/gms/internal/ads/rm2;Lcom/google/android/gms/internal/ads/di;)V

    goto/16 :goto_3

    :pswitch_1
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/kp2;->a(Landroid/os/IBinder;)Lcom/google/android/gms/internal/ads/lp2;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/ads/xh;->a(Lcom/google/android/gms/internal/ads/lp2;)V

    goto/16 :goto_3

    :pswitch_2
    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/xh;->j()Lcom/google/android/gms/internal/ads/mp2;

    move-result-object p1

    goto :goto_1

    :pswitch_3
    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/xh;->I0()Lcom/google/android/gms/internal/ads/wh;

    move-result-object p1

    :goto_1
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-static {p3, p1}, Lcom/google/android/gms/internal/ads/i72;->a(Landroid/os/Parcel;Landroid/os/IInterface;)V

    goto/16 :goto_6

    :pswitch_4
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    invoke-static {p1}, Lb/c/b/a/d/a$a;->a(Landroid/os/IBinder;)Lb/c/b/a/d/a;

    move-result-object p1

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/i72;->a(Landroid/os/Parcel;)Z

    move-result p2

    invoke-interface {p0, p1, p2}, Lcom/google/android/gms/internal/ads/xh;->a(Lb/c/b/a/d/a;Z)V

    goto :goto_3

    :pswitch_5
    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/xh;->v()Landroid/os/Bundle;

    move-result-object p1

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-static {p3, p1}, Lcom/google/android/gms/internal/ads/i72;->b(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    goto/16 :goto_6

    :pswitch_6
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/jp2;->a(Landroid/os/IBinder;)Lcom/google/android/gms/internal/ads/gp2;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/ads/xh;->a(Lcom/google/android/gms/internal/ads/gp2;)V

    goto :goto_3

    :pswitch_7
    sget-object p1, Lcom/google/android/gms/internal/ads/ji;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/ads/i72;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/ji;

    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/ads/xh;->a(Lcom/google/android/gms/internal/ads/ji;)V

    goto :goto_3

    :pswitch_8
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    if-nez p1, :cond_2

    goto :goto_2

    :cond_2
    const-string p2, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener"

    invoke-interface {p1, p2}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object p2

    instance-of p4, p2, Lcom/google/android/gms/internal/ads/gi;

    if-eqz p4, :cond_3

    move-object v0, p2

    check-cast v0, Lcom/google/android/gms/internal/ads/gi;

    goto :goto_2

    :cond_3
    new-instance v0, Lcom/google/android/gms/internal/ads/fi;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ads/fi;-><init>(Landroid/os/IBinder;)V

    :goto_2
    invoke-interface {p0, v0}, Lcom/google/android/gms/internal/ads/xh;->a(Lcom/google/android/gms/internal/ads/gi;)V

    goto :goto_3

    :pswitch_9
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    invoke-static {p1}, Lb/c/b/a/d/a$a;->a(Landroid/os/IBinder;)Lb/c/b/a/d/a;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/ads/xh;->x(Lb/c/b/a/d/a;)V

    :goto_3
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    goto :goto_6

    :pswitch_a
    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/xh;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    goto :goto_6

    :pswitch_b
    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/xh;->M()Z

    move-result p1

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-static {p3, p1}, Lcom/google/android/gms/internal/ads/i72;->a(Landroid/os/Parcel;Z)V

    goto :goto_6

    :pswitch_c
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    if-nez p1, :cond_4

    goto :goto_4

    :cond_4
    const-string p2, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback"

    invoke-interface {p1, p2}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object p2

    instance-of p4, p2, Lcom/google/android/gms/internal/ads/bi;

    if-eqz p4, :cond_5

    move-object v0, p2

    check-cast v0, Lcom/google/android/gms/internal/ads/bi;

    goto :goto_4

    :cond_5
    new-instance v0, Lcom/google/android/gms/internal/ads/ci;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ads/ci;-><init>(Landroid/os/IBinder;)V

    :goto_4
    invoke-interface {p0, v0}, Lcom/google/android/gms/internal/ads/xh;->a(Lcom/google/android/gms/internal/ads/bi;)V

    goto :goto_3

    :pswitch_d
    sget-object p1, Lcom/google/android/gms/internal/ads/rm2;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/ads/i72;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/rm2;

    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p2

    if-nez p2, :cond_6

    goto :goto_5

    :cond_6
    invoke-interface {p2, p4}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object p4

    instance-of v0, p4, Lcom/google/android/gms/internal/ads/di;

    if-eqz v0, :cond_7

    move-object v0, p4

    check-cast v0, Lcom/google/android/gms/internal/ads/di;

    goto :goto_5

    :cond_7
    new-instance v0, Lcom/google/android/gms/internal/ads/ei;

    invoke-direct {v0, p2}, Lcom/google/android/gms/internal/ads/ei;-><init>(Landroid/os/IBinder;)V

    :goto_5
    invoke-interface {p0, p1, v0}, Lcom/google/android/gms/internal/ads/xh;->a(Lcom/google/android/gms/internal/ads/rm2;Lcom/google/android/gms/internal/ads/di;)V

    goto :goto_3

    :goto_6
    const/4 p1, 0x1

    return p1

    :pswitch_data_0
    .packed-switch 0x1
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
        :pswitch_0
    .end packed-switch
.end method
