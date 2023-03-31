.class final synthetic Lcom/google/android/gms/internal/ads/na1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/ln1;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/ka1;

.field private final b:Lcom/google/android/gms/internal/ads/rf1;

.field private final c:Lcom/google/android/gms/internal/ads/l30;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/ka1;Lcom/google/android/gms/internal/ads/rf1;Lcom/google/android/gms/internal/ads/l30;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/na1;->a:Lcom/google/android/gms/internal/ads/ka1;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/na1;->b:Lcom/google/android/gms/internal/ads/rf1;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/na1;->c:Lcom/google/android/gms/internal/ads/l30;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/lo1;
    .locals 7

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/na1;->b:Lcom/google/android/gms/internal/ads/rf1;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/na1;->c:Lcom/google/android/gms/internal/ads/l30;

    check-cast p1, Lcom/google/android/gms/internal/ads/vd1;

    iput-object p1, v0, Lcom/google/android/gms/internal/ads/rf1;->b:Lcom/google/android/gms/internal/ads/vd1;

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/vd1;->b:Lcom/google/android/gms/internal/ads/sd1;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/sd1;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/ads/id1;

    iget-object v4, v4, Lcom/google/android/gms/internal/ads/id1;->a:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const/4 v5, 0x1

    const-string v6, "FirstPartyRenderer"

    invoke-virtual {v3, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    const/4 v3, 0x1

    goto :goto_0

    :cond_2
    move v2, v3

    :goto_1
    if-nez v2, :cond_3

    const/4 p1, 0x0

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/yn1;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    return-object p1

    :cond_3
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/yn1;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/l30;->a(Lcom/google/android/gms/internal/ads/lo1;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    return-object p1
.end method
