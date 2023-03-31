.class public final Lcom/google/android/gms/dynamite/i;
.super Lb/c/b/a/e/e/b;
.source ""

# interfaces
.implements Lcom/google/android/gms/dynamite/j;


# direct methods
.method constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "com.google.android.gms.dynamite.IDynamiteLoader"

    invoke-direct {p0, p1, v0}, Lb/c/b/a/e/e/b;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final I1()I
    .locals 2

    invoke-virtual {p0}, Lb/c/b/a/e/e/b;->r0()Landroid/os/Parcel;

    move-result-object v0

    const/4 v1, 0x6

    invoke-virtual {p0, v1, v0}, Lb/c/b/a/e/e/b;->a(ILandroid/os/Parcel;)Landroid/os/Parcel;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v1

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return v1
.end method

.method public final a(Lb/c/b/a/d/a;Ljava/lang/String;Z)I
    .locals 1

    invoke-virtual {p0}, Lb/c/b/a/e/e/b;->r0()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lb/c/b/a/e/e/c;->a(Landroid/os/Parcel;Landroid/os/IInterface;)V

    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    invoke-static {v0, p3}, Lb/c/b/a/e/e/c;->a(Landroid/os/Parcel;Z)V

    const/4 p1, 0x5

    invoke-virtual {p0, p1, v0}, Lb/c/b/a/e/e/b;->a(ILandroid/os/Parcel;)Landroid/os/Parcel;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p2

    invoke-virtual {p1}, Landroid/os/Parcel;->recycle()V

    return p2
.end method

.method public final a(Lb/c/b/a/d/a;Ljava/lang/String;I)Lb/c/b/a/d/a;
    .locals 1

    invoke-virtual {p0}, Lb/c/b/a/e/e/b;->r0()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lb/c/b/a/e/e/c;->a(Landroid/os/Parcel;Landroid/os/IInterface;)V

    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    invoke-virtual {v0, p3}, Landroid/os/Parcel;->writeInt(I)V

    const/4 p1, 0x4

    invoke-virtual {p0, p1, v0}, Lb/c/b/a/e/e/b;->a(ILandroid/os/Parcel;)Landroid/os/Parcel;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p2

    invoke-static {p2}, Lb/c/b/a/d/a$a;->a(Landroid/os/IBinder;)Lb/c/b/a/d/a;

    move-result-object p2

    invoke-virtual {p1}, Landroid/os/Parcel;->recycle()V

    return-object p2
.end method

.method public final b(Lb/c/b/a/d/a;Ljava/lang/String;Z)I
    .locals 1

    invoke-virtual {p0}, Lb/c/b/a/e/e/b;->r0()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lb/c/b/a/e/e/c;->a(Landroid/os/Parcel;Landroid/os/IInterface;)V

    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    invoke-static {v0, p3}, Lb/c/b/a/e/e/c;->a(Landroid/os/Parcel;Z)V

    const/4 p1, 0x3

    invoke-virtual {p0, p1, v0}, Lb/c/b/a/e/e/b;->a(ILandroid/os/Parcel;)Landroid/os/Parcel;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p2

    invoke-virtual {p1}, Landroid/os/Parcel;->recycle()V

    return p2
.end method

.method public final b(Lb/c/b/a/d/a;Ljava/lang/String;I)Lb/c/b/a/d/a;
    .locals 1

    invoke-virtual {p0}, Lb/c/b/a/e/e/b;->r0()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lb/c/b/a/e/e/c;->a(Landroid/os/Parcel;Landroid/os/IInterface;)V

    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    invoke-virtual {v0, p3}, Landroid/os/Parcel;->writeInt(I)V

    const/4 p1, 0x2

    invoke-virtual {p0, p1, v0}, Lb/c/b/a/e/e/b;->a(ILandroid/os/Parcel;)Landroid/os/Parcel;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p2

    invoke-static {p2}, Lb/c/b/a/d/a$a;->a(Landroid/os/IBinder;)Lb/c/b/a/d/a;

    move-result-object p2

    invoke-virtual {p1}, Landroid/os/Parcel;->recycle()V

    return-object p2
.end method
