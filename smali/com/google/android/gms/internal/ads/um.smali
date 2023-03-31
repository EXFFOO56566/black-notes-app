.class final Lcom/google/android/gms/internal/ads/um;
.super Lcom/google/android/gms/internal/ads/fl;
.source ""


# instance fields
.field private final synthetic q:[B

.field private final synthetic r:Ljava/util/Map;

.field private final synthetic s:Lcom/google/android/gms/internal/ads/wn;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/tm;ILjava/lang/String;Lcom/google/android/gms/internal/ads/c0;Lcom/google/android/gms/internal/ads/gq2;[BLjava/util/Map;Lcom/google/android/gms/internal/ads/wn;)V
    .locals 0

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/um;->q:[B

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/um;->r:Ljava/util/Map;

    iput-object p8, p0, Lcom/google/android/gms/internal/ads/um;->s:Lcom/google/android/gms/internal/ads/wn;

    invoke-direct {p0, p2, p3, p4, p5}, Lcom/google/android/gms/internal/ads/fl;-><init>(ILjava/lang/String;Lcom/google/android/gms/internal/ads/c0;Lcom/google/android/gms/internal/ads/gq2;)V

    return-void
.end method


# virtual methods
.method protected final synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/um;->c(Ljava/lang/String;)V

    return-void
.end method

.method public final b()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/um;->r:Ljava/util/Map;

    if-nez v0, :cond_0

    invoke-super {p0}, Lcom/google/android/gms/internal/ads/gh2;->b()Ljava/util/Map;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method protected final c(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/um;->s:Lcom/google/android/gms/internal/ads/wn;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/wn;->a(Ljava/lang/String;)V

    invoke-super {p0, p1}, Lcom/google/android/gms/internal/ads/fl;->c(Ljava/lang/String;)V

    return-void
.end method

.method public final m()[B
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/um;->q:[B

    if-nez v0, :cond_0

    invoke-super {p0}, Lcom/google/android/gms/internal/ads/gh2;->m()[B

    move-result-object v0

    :cond_0
    return-object v0
.end method
