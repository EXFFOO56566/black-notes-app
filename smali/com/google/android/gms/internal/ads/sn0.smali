.class public final Lcom/google/android/gms/internal/ads/sn0;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final synthetic b:Lcom/google/android/gms/internal/ads/tn0;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/tn0;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/sn0;->b:Lcom/google/android/gms/internal/ads/tn0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/sn0;->a:Ljava/util/Map;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/sn0;)Lcom/google/android/gms/internal/ads/sn0;
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/sn0;->c()Lcom/google/android/gms/internal/ads/sn0;

    return-object p0
.end method

.method private final c()Lcom/google/android/gms/internal/ads/sn0;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sn0;->a:Ljava/util/Map;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/sn0;->b:Lcom/google/android/gms/internal/ads/tn0;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/tn0;->a(Lcom/google/android/gms/internal/ads/tn0;)Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    return-object p0
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/id1;)Lcom/google/android/gms/internal/ads/sn0;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sn0;->a:Ljava/util/Map;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/id1;->t:Ljava/lang/String;

    const-string v1, "aai"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public final a(Lcom/google/android/gms/internal/ads/kd1;)Lcom/google/android/gms/internal/ads/sn0;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sn0;->a:Ljava/util/Map;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/kd1;->b:Ljava/lang/String;

    const-string v1, "gqi"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/sn0;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sn0;->a:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public final a()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sn0;->b:Lcom/google/android/gms/internal/ads/tn0;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/tn0;->b(Lcom/google/android/gms/internal/ads/tn0;)Ljava/util/concurrent/Executor;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/wn0;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/wn0;-><init>(Lcom/google/android/gms/internal/ads/sn0;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method final synthetic b()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sn0;->b:Lcom/google/android/gms/internal/ads/tn0;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/tn0;->c(Lcom/google/android/gms/internal/ads/tn0;)Lcom/google/android/gms/internal/ads/zn0;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/sn0;->a:Ljava/util/Map;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zn0;->a(Ljava/util/Map;)V

    return-void
.end method
