.class public final Lcom/google/android/gms/internal/ads/c52;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/ads/e52<",
            "TT;>;>;"
        }
    .end annotation
.end field

.field private final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/ads/e52<",
            "Ljava/util/Collection<",
            "TT;>;>;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/q42;->a(I)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/c52;->a:Ljava/util/List;

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/q42;->a(I)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/c52;->b:Ljava/util/List;

    return-void
.end method

.method synthetic constructor <init>(IILcom/google/android/gms/internal/ads/z42;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/c52;-><init>(II)V

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/ads/a52;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/internal/ads/a52<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/ads/a52;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/c52;->a:Ljava/util/List;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/c52;->b:Ljava/util/List;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/a52;-><init>(Ljava/util/List;Ljava/util/List;Lcom/google/android/gms/internal/ads/z42;)V

    return-object v0
.end method

.method public final a(Lcom/google/android/gms/internal/ads/e52;)Lcom/google/android/gms/internal/ads/c52;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/e52<",
            "+TT;>;)",
            "Lcom/google/android/gms/internal/ads/c52<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/c52;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public final b(Lcom/google/android/gms/internal/ads/e52;)Lcom/google/android/gms/internal/ads/c52;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/e52<",
            "+",
            "Ljava/util/Collection<",
            "+TT;>;>;)",
            "Lcom/google/android/gms/internal/ads/c52<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/c52;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method
