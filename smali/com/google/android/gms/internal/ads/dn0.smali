.class public final Lcom/google/android/gms/internal/ads/dn0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/zh1;


# instance fields
.field private b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/google/android/gms/internal/ads/ph1;",
            "Lcom/google/android/gms/internal/ads/fn0;",
            ">;"
        }
    .end annotation
.end field

.field private c:Lcom/google/android/gms/internal/ads/wj2;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/wj2;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/wj2;",
            "Ljava/util/Map<",
            "Lcom/google/android/gms/internal/ads/ph1;",
            "Lcom/google/android/gms/internal/ads/fn0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/dn0;->b:Ljava/util/Map;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/dn0;->c:Lcom/google/android/gms/internal/ads/wj2;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/ph1;Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/ph1;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/dn0;->b:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/dn0;->c:Lcom/google/android/gms/internal/ads/wj2;

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/dn0;->b:Ljava/util/Map;

    invoke-interface {p3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/fn0;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/fn0;->c:Lcom/google/android/gms/internal/ads/yj2;

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/wj2;->a(Lcom/google/android/gms/internal/ads/yj2;)V

    :cond_0
    return-void
.end method

.method public final b(Lcom/google/android/gms/internal/ads/ph1;Ljava/lang/String;)V
    .locals 1

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/dn0;->b:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/dn0;->c:Lcom/google/android/gms/internal/ads/wj2;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dn0;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/fn0;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/fn0;->a:Lcom/google/android/gms/internal/ads/yj2;

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/wj2;->a(Lcom/google/android/gms/internal/ads/yj2;)V

    :cond_0
    return-void
.end method

.method public final c(Lcom/google/android/gms/internal/ads/ph1;Ljava/lang/String;)V
    .locals 1

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/dn0;->b:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/dn0;->c:Lcom/google/android/gms/internal/ads/wj2;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dn0;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/fn0;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/fn0;->b:Lcom/google/android/gms/internal/ads/yj2;

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/wj2;->a(Lcom/google/android/gms/internal/ads/yj2;)V

    :cond_0
    return-void
.end method
