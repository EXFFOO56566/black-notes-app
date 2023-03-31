.class public final Lcom/google/android/gms/internal/ads/jn0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/a60;
.implements Lcom/google/android/gms/internal/ads/l70;
.implements Lcom/google/android/gms/internal/ads/m80;


# instance fields
.field private final b:Lcom/google/android/gms/internal/ads/rn0;

.field private final c:Lcom/google/android/gms/internal/ads/zn0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/rn0;Lcom/google/android/gms/internal/ads/zn0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/jn0;->b:Lcom/google/android/gms/internal/ads/rn0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/jn0;->c:Lcom/google/android/gms/internal/ads/zn0;

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/jn0;->b:Lcom/google/android/gms/internal/ads/rn0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/rn0;->a()Ljava/util/Map;

    move-result-object v0

    const-string v1, "ftl"

    const-string v2, "action"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/jn0;->b:Lcom/google/android/gms/internal/ads/rn0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/rn0;->a()Ljava/util/Map;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/jn0;->c:Lcom/google/android/gms/internal/ads/zn0;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/jn0;->b:Lcom/google/android/gms/internal/ads/rn0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/rn0;->a()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/zn0;->a(Ljava/util/Map;)V

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/vd1;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/jn0;->b:Lcom/google/android/gms/internal/ads/rn0;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/rn0;->a(Lcom/google/android/gms/internal/ads/vd1;)V

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/zf;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/jn0;->b:Lcom/google/android/gms/internal/ads/rn0;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zf;->b:Landroid/os/Bundle;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/rn0;->a(Landroid/os/Bundle;)V

    return-void
.end method

.method public final s()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/jn0;->b:Lcom/google/android/gms/internal/ads/rn0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/rn0;->a()Ljava/util/Map;

    move-result-object v0

    const-string v1, "action"

    const-string v2, "loaded"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/jn0;->c:Lcom/google/android/gms/internal/ads/zn0;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/jn0;->b:Lcom/google/android/gms/internal/ads/rn0;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/rn0;->a()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zn0;->a(Ljava/util/Map;)V

    return-void
.end method
