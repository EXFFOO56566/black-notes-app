.class final Lcom/google/android/gms/internal/ads/f22;
.super Lcom/google/android/gms/internal/ads/l22;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ads/l22;"
    }
.end annotation


# instance fields
.field private final synthetic c:Lcom/google/android/gms/internal/ads/a22;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ads/a22;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/f22;->c:Lcom/google/android/gms/internal/ads/a22;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/ads/l22;-><init>(Lcom/google/android/gms/internal/ads/a22;Lcom/google/android/gms/internal/ads/d22;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/a22;Lcom/google/android/gms/internal/ads/d22;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/f22;-><init>(Lcom/google/android/gms/internal/ads/a22;)V

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/ads/c22;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/f22;->c:Lcom/google/android/gms/internal/ads/a22;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/ads/c22;-><init>(Lcom/google/android/gms/internal/ads/a22;Lcom/google/android/gms/internal/ads/d22;)V

    return-object v0
.end method
