.class public final Lcom/google/android/gms/internal/ads/ca2;
.super Lcom/google/android/gms/internal/ads/u92;
.source ""


# instance fields
.field public final b:Lcom/google/android/gms/internal/ads/x92;

.field public c:Ljava/nio/ByteBuffer;

.field public d:J


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/u92;-><init>()V

    new-instance p1, Lcom/google/android/gms/internal/ads/x92;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/x92;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ca2;->b:Lcom/google/android/gms/internal/ads/x92;

    return-void
.end method

.method private final e(I)Ljava/nio/ByteBuffer;
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ca2;->c:Ljava/nio/ByteBuffer;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v0

    :goto_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const/16 v2, 0x2c

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Buffer too small ("

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " < "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ")"

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method


# virtual methods
.method public final a()V
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/internal/ads/u92;->a()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ca2;->c:Ljava/nio/ByteBuffer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    :cond_0
    return-void
.end method

.method public final d(I)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ca2;->c:Ljava/nio/ByteBuffer;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v0

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/ca2;->c:Ljava/nio/ByteBuffer;

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->position()I

    move-result v2

    add-int/2addr v2, p1

    if-lt v0, v2, :cond_0

    return-void

    :cond_0
    invoke-direct {p0, v2}, Lcom/google/android/gms/internal/ads/ca2;->e(I)Ljava/nio/ByteBuffer;

    throw v1

    :cond_1
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/ca2;->e(I)Ljava/nio/ByteBuffer;

    throw v1
.end method

.method public final e()Z
    .locals 1

    const/high16 v0, 0x40000000    # 2.0f

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/u92;->c(I)Z

    move-result v0

    return v0
.end method
