.class public final Lcom/google/android/gms/ads/s/j;
.super Lcom/google/android/gms/common/internal/w/a;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/ads/s/j;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Z

.field private final c:Lcom/google/android/gms/internal/ads/no2;

.field private final d:Landroid/os/IBinder;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/ads/s/n;

    invoke-direct {v0}, Lcom/google/android/gms/ads/s/n;-><init>()V

    sput-object v0, Lcom/google/android/gms/ads/s/j;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ZLandroid/os/IBinder;Landroid/os/IBinder;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/w/a;-><init>()V

    iput-boolean p1, p0, Lcom/google/android/gms/ads/s/j;->b:Z

    if-eqz p2, :cond_0

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/mo2;->a(Landroid/os/IBinder;)Lcom/google/android/gms/internal/ads/no2;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Lcom/google/android/gms/ads/s/j;->c:Lcom/google/android/gms/internal/ads/no2;

    iput-object p3, p0, Lcom/google/android/gms/ads/s/j;->d:Landroid/os/IBinder;

    return-void
.end method


# virtual methods
.method public final d()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/ads/s/j;->b:Z

    return v0
.end method

.method public final e()Lcom/google/android/gms/internal/ads/no2;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/s/j;->c:Lcom/google/android/gms/internal/ads/no2;

    return-object v0
.end method

.method public final g()Lcom/google/android/gms/internal/ads/r3;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/s/j;->d:Landroid/os/IBinder;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/u3;->a(Landroid/os/IBinder;)Lcom/google/android/gms/internal/ads/r3;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    invoke-static {p1}, Lcom/google/android/gms/common/internal/w/c;->a(Landroid/os/Parcel;)I

    move-result p2

    invoke-virtual {p0}, Lcom/google/android/gms/ads/s/j;->d()Z

    move-result v0

    const/4 v1, 0x1

    invoke-static {p1, v1, v0}, Lcom/google/android/gms/common/internal/w/c;->a(Landroid/os/Parcel;IZ)V

    iget-object v0, p0, Lcom/google/android/gms/ads/s/j;->c:Lcom/google/android/gms/internal/ads/no2;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    :goto_0
    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p1, v2, v0, v1}, Lcom/google/android/gms/common/internal/w/c;->a(Landroid/os/Parcel;ILandroid/os/IBinder;Z)V

    const/4 v0, 0x3

    iget-object v2, p0, Lcom/google/android/gms/ads/s/j;->d:Landroid/os/IBinder;

    invoke-static {p1, v0, v2, v1}, Lcom/google/android/gms/common/internal/w/c;->a(Landroid/os/Parcel;ILandroid/os/IBinder;Z)V

    invoke-static {p1, p2}, Lcom/google/android/gms/common/internal/w/c;->a(Landroid/os/Parcel;I)V

    return-void
.end method
