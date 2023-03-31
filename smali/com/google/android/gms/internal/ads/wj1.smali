.class public final Lcom/google/android/gms/internal/ads/wj1;
.super Lcom/google/android/gms/common/internal/w/a;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/internal/ads/wj1;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final b:I

.field private c:Lcom/google/android/gms/internal/ads/ba0;

.field private d:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/vj1;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/vj1;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/wj1;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(I[B)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/w/a;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/ads/wj1;->b:I

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/wj1;->c:Lcom/google/android/gms/internal/ads/ba0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/wj1;->d:[B

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/wj1;->e()V

    return-void
.end method

.method private final e()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wj1;->c:Lcom/google/android/gms/internal/ads/ba0;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wj1;->d:[B

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wj1;->c:Lcom/google/android/gms/internal/ads/ba0;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wj1;->d:[B

    if-nez v0, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wj1;->c:Lcom/google/android/gms/internal/ads/ba0;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wj1;->d:[B

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Invalid internal representation - full"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wj1;->c:Lcom/google/android/gms/internal/ads/ba0;

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wj1;->d:[B

    if-nez v0, :cond_4

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Invalid internal representation - empty"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Impossible"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final d()Lcom/google/android/gms/internal/ads/ba0;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wj1;->c:Lcom/google/android/gms/internal/ads/ba0;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wj1;->d:[B

    invoke-static {}, Lcom/google/android/gms/internal/ads/dz1;->b()Lcom/google/android/gms/internal/ads/dz1;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/ba0;->a([BLcom/google/android/gms/internal/ads/dz1;)Lcom/google/android/gms/internal/ads/ba0;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/wj1;->c:Lcom/google/android/gms/internal/ads/ba0;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/wj1;->d:[B
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/b02; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :cond_1
    :goto_1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/wj1;->e()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wj1;->c:Lcom/google/android/gms/internal/ads/ba0;

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    invoke-static {p1}, Lcom/google/android/gms/common/internal/w/c;->a(Landroid/os/Parcel;)I

    move-result p2

    iget v0, p0, Lcom/google/android/gms/internal/ads/wj1;->b:I

    const/4 v1, 0x1

    invoke-static {p1, v1, v0}, Lcom/google/android/gms/common/internal/w/c;->a(Landroid/os/Parcel;II)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wj1;->d:[B

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wj1;->c:Lcom/google/android/gms/internal/ads/ba0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/tx1;->f()[B

    move-result-object v0

    :goto_0
    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p1, v2, v0, v1}, Lcom/google/android/gms/common/internal/w/c;->a(Landroid/os/Parcel;I[BZ)V

    invoke-static {p1, p2}, Lcom/google/android/gms/common/internal/w/c;->a(Landroid/os/Parcel;I)V

    return-void
.end method
