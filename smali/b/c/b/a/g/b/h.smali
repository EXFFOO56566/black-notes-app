.class public final Lb/c/b/a/g/b/h;
.super Lb/c/b/a/e/d/b;
.source ""

# interfaces
.implements Lb/c/b/a/g/b/f;


# direct methods
.method constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "com.google.android.gms.signin.internal.ISignInService"

    invoke-direct {p0, p1, v0}, Lb/c/b/a/e/d/b;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a(Lb/c/b/a/g/b/j;Lb/c/b/a/g/b/d;)V
    .locals 1

    invoke-virtual {p0}, Lb/c/b/a/e/d/b;->r0()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lb/c/b/a/e/d/c;->a(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {v0, p2}, Lb/c/b/a/e/d/c;->a(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/16 p1, 0xc

    invoke-virtual {p0, p1, v0}, Lb/c/b/a/e/d/b;->a(ILandroid/os/Parcel;)V

    return-void
.end method
