.class final Lcom/google/android/gms/internal/ads/kq2;
.super Lcom/google/android/gms/internal/ads/k6;
.source ""


# instance fields
.field private final b:Lcom/google/android/gms/ads/v/c;

.field private final synthetic c:Lcom/google/android/gms/internal/ads/cq2;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ads/cq2;Lcom/google/android/gms/ads/v/c;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/kq2;->c:Lcom/google/android/gms/internal/ads/cq2;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/k6;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/kq2;->b:Lcom/google/android/gms/ads/v/c;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/cq2;Lcom/google/android/gms/ads/v/c;Lcom/google/android/gms/internal/ads/hq2;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/kq2;-><init>(Lcom/google/android/gms/internal/ads/cq2;Lcom/google/android/gms/ads/v/c;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/ads/e6;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/kq2;->b:Lcom/google/android/gms/ads/v/c;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/kq2;->c:Lcom/google/android/gms/internal/ads/cq2;

    invoke-static {v1, p1}, Lcom/google/android/gms/internal/ads/cq2;->a(Lcom/google/android/gms/internal/ads/cq2;Ljava/util/List;)Lcom/google/android/gms/ads/v/b;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/google/android/gms/ads/v/c;->a(Lcom/google/android/gms/ads/v/b;)V

    return-void
.end method
