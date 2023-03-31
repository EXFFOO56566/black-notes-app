.class final Lcom/google/android/gms/internal/ads/v12;
.super Lcom/google/android/gms/internal/ads/iy1;
.source ""


# instance fields
.field private final b:Lcom/google/android/gms/internal/ads/x12;

.field private c:Lcom/google/android/gms/internal/ads/my1;

.field private final synthetic d:Lcom/google/android/gms/internal/ads/s12;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/s12;)V
    .locals 2

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/v12;->d:Lcom/google/android/gms/internal/ads/s12;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/iy1;-><init>()V

    new-instance p1, Lcom/google/android/gms/internal/ads/x12;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/v12;->d:Lcom/google/android/gms/internal/ads/s12;

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, Lcom/google/android/gms/internal/ads/x12;-><init>(Lcom/google/android/gms/internal/ads/dy1;Lcom/google/android/gms/internal/ads/v12;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/v12;->b:Lcom/google/android/gms/internal/ads/x12;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/v12;->a()Lcom/google/android/gms/internal/ads/my1;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/v12;->c:Lcom/google/android/gms/internal/ads/my1;

    return-void
.end method

.method private final a()Lcom/google/android/gms/internal/ads/my1;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/v12;->b:Lcom/google/android/gms/internal/ads/x12;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/x12;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/v12;->b:Lcom/google/android/gms/internal/ads/x12;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/x12;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/py1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/dy1;->iterator()Ljava/util/Iterator;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/my1;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/v12;->c:Lcom/google/android/gms/internal/ads/my1;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final nextByte()B
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/v12;->c:Lcom/google/android/gms/internal/ads/my1;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/my1;->nextByte()B

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/v12;->c:Lcom/google/android/gms/internal/ads/my1;

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/v12;->a()Lcom/google/android/gms/internal/ads/my1;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/v12;->c:Lcom/google/android/gms/internal/ads/my1;

    :cond_0
    return v0

    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method
