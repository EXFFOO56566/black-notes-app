.class final Lcom/google/android/gms/internal/ads/gy1;
.super Lcom/google/android/gms/internal/ads/iy1;
.source ""


# instance fields
.field private b:I

.field private final c:I

.field private final synthetic d:Lcom/google/android/gms/internal/ads/dy1;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/dy1;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/gy1;->d:Lcom/google/android/gms/internal/ads/dy1;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/iy1;-><init>()V

    const/4 p1, 0x0

    iput p1, p0, Lcom/google/android/gms/internal/ads/gy1;->b:I

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/gy1;->d:Lcom/google/android/gms/internal/ads/dy1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/dy1;->size()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/ads/gy1;->c:I

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/ads/gy1;->b:I

    iget v1, p0, Lcom/google/android/gms/internal/ads/gy1;->c:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final nextByte()B
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/ads/gy1;->b:I

    iget v1, p0, Lcom/google/android/gms/internal/ads/gy1;->c:I

    if-ge v0, v1, :cond_0

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/google/android/gms/internal/ads/gy1;->b:I

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/gy1;->d:Lcom/google/android/gms/internal/ads/dy1;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/dy1;->g(I)B

    move-result v0

    return v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method
