.class final Lcom/google/android/gms/internal/ads/g52;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/nk1;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/ni1;

.field private final b:Lcom/google/android/gms/internal/ads/aj1;

.field private final c:Lcom/google/android/gms/internal/ads/s52;

.field private final d:Lcom/google/android/gms/internal/ads/j52;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/ni1;Lcom/google/android/gms/internal/ads/aj1;Lcom/google/android/gms/internal/ads/s52;Lcom/google/android/gms/internal/ads/j52;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/g52;->a:Lcom/google/android/gms/internal/ads/ni1;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/g52;->b:Lcom/google/android/gms/internal/ads/aj1;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/g52;->c:Lcom/google/android/gms/internal/ads/s52;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/g52;->d:Lcom/google/android/gms/internal/ads/j52;

    return-void
.end method

.method private final d()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/g52;->a:Lcom/google/android/gms/internal/ads/ni1;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/ni1;->a()Ljava/lang/String;

    move-result-object v1

    const-string v2, "v"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/g52;->a:Lcom/google/android/gms/internal/ads/ni1;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/ni1;->c()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "gms"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/g52;->b:Lcom/google/android/gms/internal/ads/aj1;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aj1;->a()Ljava/lang/String;

    move-result-object v1

    const-string v2, "int"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/g52;->d:Lcom/google/android/gms/internal/ads/j52;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/j52;->a()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "up"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method


# virtual methods
.method public final a()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/g52;->d()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method final a(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/g52;->c:Lcom/google/android/gms/internal/ads/s52;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/s52;->a(Landroid/view/View;)V

    return-void
.end method

.method public final b()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/g52;->d()Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/g52;->c:Lcom/google/android/gms/internal/ads/s52;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/s52;->a()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "lts"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public final c()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/g52;->d()Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/g52;->a:Lcom/google/android/gms/internal/ads/ni1;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/ni1;->b()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "gai"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/g52;->b:Lcom/google/android/gms/internal/ads/aj1;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aj1;->b()Ljava/lang/String;

    move-result-object v1

    const-string v2, "did"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/g52;->b:Lcom/google/android/gms/internal/ads/aj1;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aj1;->d()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "dst"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/g52;->b:Lcom/google/android/gms/internal/ads/aj1;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aj1;->c()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "doo"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method
