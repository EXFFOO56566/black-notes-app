.class public final Lcom/google/android/gms/internal/ads/vf;
.super Lcom/google/android/gms/internal/ads/h72;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/tf;


# direct methods
.method constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener"

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/ads/h72;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/os/ParcelFileDescriptor;)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/h72;->r0()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/i72;->a(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/4 p1, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/ads/h72;->b(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/lm;)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/h72;->r0()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/i72;->a(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/4 p1, 0x2

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/ads/h72;->b(ILandroid/os/Parcel;)V

    return-void
.end method
