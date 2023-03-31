.class public final Lb/c/b/a/g/b/j;
.super Lcom/google/android/gms/common/internal/w/a;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lb/c/b/a/g/b/j;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final b:I

.field private final c:Lcom/google/android/gms/common/internal/s;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lb/c/b/a/g/b/i;

    invoke-direct {v0}, Lb/c/b/a/g/b/i;-><init>()V

    sput-object v0, Lb/c/b/a/g/b/j;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILcom/google/android/gms/common/internal/s;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/w/a;-><init>()V

    iput p1, p0, Lb/c/b/a/g/b/j;->b:I

    iput-object p2, p0, Lb/c/b/a/g/b/j;->c:Lcom/google/android/gms/common/internal/s;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/common/internal/s;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0, p1}, Lb/c/b/a/g/b/j;-><init>(ILcom/google/android/gms/common/internal/s;)V

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Lcom/google/android/gms/common/internal/w/c;->a(Landroid/os/Parcel;)I

    move-result v0

    iget v1, p0, Lb/c/b/a/g/b/j;->b:I

    const/4 v2, 0x1

    invoke-static {p1, v2, v1}, Lcom/google/android/gms/common/internal/w/c;->a(Landroid/os/Parcel;II)V

    iget-object v1, p0, Lb/c/b/a/g/b/j;->c:Lcom/google/android/gms/common/internal/s;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, p2, v3}, Lcom/google/android/gms/common/internal/w/c;->a(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/w/c;->a(Landroid/os/Parcel;I)V

    return-void
.end method
