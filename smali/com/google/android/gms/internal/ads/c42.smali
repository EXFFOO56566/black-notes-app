.class public abstract Lcom/google/android/gms/internal/ads/c42;
.super Lcom/google/android/gms/internal/ads/a42;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/mt;


# instance fields
.field private j:I


# direct methods
.method protected constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/a42;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final b()I
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/a42;->c:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/a42;->a()V

    :cond_0
    iget v0, p0, Lcom/google/android/gms/internal/ads/c42;->j:I

    return v0
.end method

.method protected final b(Ljava/nio/ByteBuffer;)J
    .locals 2

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/mu;->a(B)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/ads/c42;->j:I

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/mu;->b(Ljava/nio/ByteBuffer;)I

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    move-result p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/mu;->a(B)I

    const-wide/16 v0, 0x4

    return-wide v0
.end method
