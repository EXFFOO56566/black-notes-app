.class public final Lcom/google/android/gms/internal/ads/tn2;
.super Lcom/google/android/gms/internal/ads/h72;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/rn2;


# direct methods
.method constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "com.google.android.gms.ads.internal.client.IAdListener"

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/ads/h72;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final B()V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/h72;->r0()Landroid/os/Parcel;

    move-result-object v0

    const/4 v1, 0x5

    invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/internal/ads/h72;->b(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final G()V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/h72;->r0()Landroid/os/Parcel;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/internal/ads/h72;->b(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final K()V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/h72;->r0()Landroid/os/Parcel;

    move-result-object v0

    const/4 v1, 0x7

    invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/internal/ads/h72;->b(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final a(I)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/h72;->r0()Landroid/os/Parcel;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeInt(I)V

    const/4 p1, 0x2

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/ads/h72;->b(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final l()V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/h72;->r0()Landroid/os/Parcel;

    move-result-object v0

    const/4 v1, 0x6

    invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/internal/ads/h72;->b(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final s()V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/h72;->r0()Landroid/os/Parcel;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/internal/ads/h72;->b(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final x()V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/h72;->r0()Landroid/os/Parcel;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/internal/ads/h72;->b(ILandroid/os/Parcel;)V

    return-void
.end method
