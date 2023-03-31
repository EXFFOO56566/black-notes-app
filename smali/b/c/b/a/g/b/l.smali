.class public final Lb/c/b/a/g/b/l;
.super Lcom/google/android/gms/common/internal/w/a;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lb/c/b/a/g/b/l;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final b:I

.field private final c:Lb/c/b/a/c/b;

.field private final d:Lcom/google/android/gms/common/internal/t;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lb/c/b/a/g/b/k;

    invoke-direct {v0}, Lb/c/b/a/g/b/k;-><init>()V

    sput-object v0, Lb/c/b/a/g/b/l;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    new-instance p1, Lb/c/b/a/c/b;

    const/4 v0, 0x0

    const/16 v1, 0x8

    invoke-direct {p1, v1, v0}, Lb/c/b/a/c/b;-><init>(ILandroid/app/PendingIntent;)V

    invoke-direct {p0, p1, v0}, Lb/c/b/a/g/b/l;-><init>(Lb/c/b/a/c/b;Lcom/google/android/gms/common/internal/t;)V

    return-void
.end method

.method constructor <init>(ILb/c/b/a/c/b;Lcom/google/android/gms/common/internal/t;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/w/a;-><init>()V

    iput p1, p0, Lb/c/b/a/g/b/l;->b:I

    iput-object p2, p0, Lb/c/b/a/g/b/l;->c:Lb/c/b/a/c/b;

    iput-object p3, p0, Lb/c/b/a/g/b/l;->d:Lcom/google/android/gms/common/internal/t;

    return-void
.end method

.method private constructor <init>(Lb/c/b/a/c/b;Lcom/google/android/gms/common/internal/t;)V
    .locals 1

    const/4 p2, 0x1

    const/4 v0, 0x0

    invoke-direct {p0, p2, p1, v0}, Lb/c/b/a/g/b/l;-><init>(ILb/c/b/a/c/b;Lcom/google/android/gms/common/internal/t;)V

    return-void
.end method


# virtual methods
.method public final d()Lb/c/b/a/c/b;
    .locals 1

    iget-object v0, p0, Lb/c/b/a/g/b/l;->c:Lb/c/b/a/c/b;

    return-object v0
.end method

.method public final e()Lcom/google/android/gms/common/internal/t;
    .locals 1

    iget-object v0, p0, Lb/c/b/a/g/b/l;->d:Lcom/google/android/gms/common/internal/t;

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Lcom/google/android/gms/common/internal/w/c;->a(Landroid/os/Parcel;)I

    move-result v0

    iget v1, p0, Lb/c/b/a/g/b/l;->b:I

    const/4 v2, 0x1

    invoke-static {p1, v2, v1}, Lcom/google/android/gms/common/internal/w/c;->a(Landroid/os/Parcel;II)V

    iget-object v1, p0, Lb/c/b/a/g/b/l;->c:Lb/c/b/a/c/b;

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {p1, v3, v1, p2, v2}, Lcom/google/android/gms/common/internal/w/c;->a(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v1, p0, Lb/c/b/a/g/b/l;->d:Lcom/google/android/gms/common/internal/t;

    const/4 v3, 0x3

    invoke-static {p1, v3, v1, p2, v2}, Lcom/google/android/gms/common/internal/w/c;->a(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/w/c;->a(Landroid/os/Parcel;I)V

    return-void
.end method
