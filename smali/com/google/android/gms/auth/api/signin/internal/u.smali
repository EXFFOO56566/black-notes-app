.class public final Lcom/google/android/gms/auth/api/signin/internal/u;
.super Lb/c/b/a/e/b/d;
.source ""

# interfaces
.implements Lcom/google/android/gms/auth/api/signin/internal/v;


# direct methods
.method constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "com.google.android.gms.auth.api.signin.internal.ISignInService"

    invoke-direct {p0, p1, v0}, Lb/c/b/a/e/b/d;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/auth/api/signin/internal/t;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)V
    .locals 1

    invoke-virtual {p0}, Lb/c/b/a/e/b/d;->r0()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lb/c/b/a/e/b/e;->a(Landroid/os/Parcel;Landroid/os/IInterface;)V

    invoke-static {v0, p2}, Lb/c/b/a/e/b/e;->a(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/16 p1, 0x67

    invoke-virtual {p0, p1, v0}, Lb/c/b/a/e/b/d;->a(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final b(Lcom/google/android/gms/auth/api/signin/internal/t;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)V
    .locals 1

    invoke-virtual {p0}, Lb/c/b/a/e/b/d;->r0()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lb/c/b/a/e/b/e;->a(Landroid/os/Parcel;Landroid/os/IInterface;)V

    invoke-static {v0, p2}, Lb/c/b/a/e/b/e;->a(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/16 p1, 0x66

    invoke-virtual {p0, p1, v0}, Lb/c/b/a/e/b/d;->a(ILandroid/os/Parcel;)V

    return-void
.end method
