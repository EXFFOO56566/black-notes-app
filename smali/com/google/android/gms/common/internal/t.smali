.class public Lcom/google/android/gms/common/internal/t;
.super Lcom/google/android/gms/common/internal/w/a;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/common/internal/t;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final b:I

.field private c:Landroid/os/IBinder;

.field private d:Lb/c/b/a/c/b;

.field private e:Z

.field private f:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/common/internal/e0;

    invoke-direct {v0}, Lcom/google/android/gms/common/internal/e0;-><init>()V

    sput-object v0, Lcom/google/android/gms/common/internal/t;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILandroid/os/IBinder;Lb/c/b/a/c/b;ZZ)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/w/a;-><init>()V

    iput p1, p0, Lcom/google/android/gms/common/internal/t;->b:I

    iput-object p2, p0, Lcom/google/android/gms/common/internal/t;->c:Landroid/os/IBinder;

    iput-object p3, p0, Lcom/google/android/gms/common/internal/t;->d:Lb/c/b/a/c/b;

    iput-boolean p4, p0, Lcom/google/android/gms/common/internal/t;->e:Z

    iput-boolean p5, p0, Lcom/google/android/gms/common/internal/t;->f:Z

    return-void
.end method


# virtual methods
.method public d()Lcom/google/android/gms/common/internal/l;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/internal/t;->c:Landroid/os/IBinder;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/l$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/common/internal/l;

    move-result-object v0

    return-object v0
.end method

.method public e()Lb/c/b/a/c/b;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/internal/t;->d:Lb/c/b/a/c/b;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/google/android/gms/common/internal/t;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/google/android/gms/common/internal/t;

    iget-object v1, p0, Lcom/google/android/gms/common/internal/t;->d:Lb/c/b/a/c/b;

    iget-object v3, p1, Lcom/google/android/gms/common/internal/t;->d:Lb/c/b/a/c/b;

    invoke-virtual {v1, v3}, Lb/c/b/a/c/b;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Lcom/google/android/gms/common/internal/t;->d()Lcom/google/android/gms/common/internal/l;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/t;->d()Lcom/google/android/gms/common/internal/l;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public g()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/common/internal/t;->e:Z

    return v0
.end method

.method public i()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/common/internal/t;->f:Z

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Lcom/google/android/gms/common/internal/w/c;->a(Landroid/os/Parcel;)I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/common/internal/t;->b:I

    const/4 v2, 0x1

    invoke-static {p1, v2, v1}, Lcom/google/android/gms/common/internal/w/c;->a(Landroid/os/Parcel;II)V

    iget-object v1, p0, Lcom/google/android/gms/common/internal/t;->c:Landroid/os/IBinder;

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {p1, v3, v1, v2}, Lcom/google/android/gms/common/internal/w/c;->a(Landroid/os/Parcel;ILandroid/os/IBinder;Z)V

    invoke-virtual {p0}, Lcom/google/android/gms/common/internal/t;->e()Lb/c/b/a/c/b;

    move-result-object v1

    const/4 v3, 0x3

    invoke-static {p1, v3, v1, p2, v2}, Lcom/google/android/gms/common/internal/w/c;->a(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-virtual {p0}, Lcom/google/android/gms/common/internal/t;->g()Z

    move-result p2

    const/4 v1, 0x4

    invoke-static {p1, v1, p2}, Lcom/google/android/gms/common/internal/w/c;->a(Landroid/os/Parcel;IZ)V

    invoke-virtual {p0}, Lcom/google/android/gms/common/internal/t;->i()Z

    move-result p2

    const/4 v1, 0x5

    invoke-static {p1, v1, p2}, Lcom/google/android/gms/common/internal/w/c;->a(Landroid/os/Parcel;IZ)V

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/w/c;->a(Landroid/os/Parcel;I)V

    return-void
.end method
