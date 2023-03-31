.class public Lcom/google/android/gms/internal/ads/z32;
.super Lcom/google/android/gms/internal/ads/b42;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/mt;


# instance fields
.field private i:Ljava/lang/String;

.field private j:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/b42;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/z32;->i:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/d42;JLcom/google/android/gms/internal/ads/ls;)V
    .locals 5

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/b42;->c:Lcom/google/android/gms/internal/ads/d42;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/d42;->position()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/b42;->e:J

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/z32;->j:Z

    if-nez v0, :cond_0

    const-wide/16 v0, 0x8

    add-long/2addr v0, p2

    const-wide v2, 0x100000000L

    cmp-long v4, v0, v2

    :cond_0
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/d42;->position()J

    move-result-wide v0

    add-long/2addr v0, p2

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/internal/ads/d42;->b(J)V

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/d42;->position()J

    move-result-wide p1

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/b42;->f:J

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/b42;->b:Lcom/google/android/gms/internal/ads/ls;

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/d42;Ljava/nio/ByteBuffer;JLcom/google/android/gms/internal/ads/ls;)V
    .locals 1

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/d42;->position()J

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->remaining()I

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->remaining()I

    move-result p2

    const/16 v0, 0x10

    if-ne p2, v0, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    iput-boolean p2, p0, Lcom/google/android/gms/internal/ads/z32;->j:Z

    invoke-virtual {p0, p1, p3, p4, p5}, Lcom/google/android/gms/internal/ads/z32;->a(Lcom/google/android/gms/internal/ads/d42;JLcom/google/android/gms/internal/ads/ls;)V

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/mw;)V
    .locals 0

    return-void
.end method

.method public final m()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/z32;->i:Ljava/lang/String;

    return-object v0
.end method
