.class public abstract Lcom/google/android/gms/internal/ads/ep2;
.super Lcom/google/android/gms/internal/ads/j72;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/cp2;


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "com.google.android.gms.ads.internal.client.IMuteThisAdReason"

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/j72;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public static a(Landroid/os/IBinder;)Lcom/google/android/gms/internal/ads/cp2;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "com.google.android.gms.ads.internal.client.IMuteThisAdReason"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, Lcom/google/android/gms/internal/ads/cp2;

    if-eqz v1, :cond_1

    check-cast v0, Lcom/google/android/gms/internal/ads/cp2;

    return-object v0

    :cond_1
    new-instance v0, Lcom/google/android/gms/internal/ads/dp2;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/dp2;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method


# virtual methods
.method protected final a(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 0

    const/4 p2, 0x1

    if-eq p1, p2, :cond_1

    const/4 p4, 0x2

    if-eq p1, p4, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/cp2;->B1()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_1
    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/cp2;->U0()Ljava/lang/String;

    move-result-object p1

    :goto_0
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return p2
.end method
