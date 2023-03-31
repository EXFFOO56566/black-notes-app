.class final Lcom/google/android/gms/internal/ads/k8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/d5;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/d5<",
        "Lcom/google/android/gms/internal/ads/e9;",
        ">;"
    }
.end annotation


# instance fields
.field private final synthetic a:Lcom/google/android/gms/internal/ads/w8;

.field private final synthetic b:Lcom/google/android/gms/internal/ads/r7;

.field private final synthetic c:Lcom/google/android/gms/internal/ads/f8;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/f8;Lcom/google/android/gms/internal/ads/w8;Lcom/google/android/gms/internal/ads/r7;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/k8;->c:Lcom/google/android/gms/internal/ads/f8;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/k8;->a:Lcom/google/android/gms/internal/ads/w8;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/k8;->b:Lcom/google/android/gms/internal/ads/r7;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;Ljava/util/Map;)V
    .locals 1

    check-cast p1, Lcom/google/android/gms/internal/ads/e9;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/k8;->c:Lcom/google/android/gms/internal/ads/f8;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/f8;->a(Lcom/google/android/gms/internal/ads/f8;)Ljava/lang/Object;

    move-result-object p1

    monitor-enter p1

    :try_start_0
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/k8;->a:Lcom/google/android/gms/internal/ads/w8;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/yo;->a()I

    move-result p2

    const/4 v0, -0x1

    if-eq p2, v0, :cond_1

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/k8;->a:Lcom/google/android/gms/internal/ads/w8;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/yo;->a()I

    move-result p2

    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/k8;->c:Lcom/google/android/gms/internal/ads/f8;

    const/4 v0, 0x0

    invoke-static {p2, v0}, Lcom/google/android/gms/internal/ads/f8;->a(Lcom/google/android/gms/internal/ads/f8;I)I

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/k8;->c:Lcom/google/android/gms/internal/ads/f8;

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/f8;->c(Lcom/google/android/gms/internal/ads/f8;)Lcom/google/android/gms/internal/ads/mm;

    move-result-object p2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/k8;->b:Lcom/google/android/gms/internal/ads/r7;

    invoke-interface {p2, v0}, Lcom/google/android/gms/internal/ads/mm;->a(Ljava/lang/Object;)V

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/k8;->a:Lcom/google/android/gms/internal/ads/w8;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/k8;->b:Lcom/google/android/gms/internal/ads/r7;

    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/ads/yo;->a(Ljava/lang/Object;)V

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/k8;->c:Lcom/google/android/gms/internal/ads/f8;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/k8;->a:Lcom/google/android/gms/internal/ads/w8;

    invoke-static {p2, v0}, Lcom/google/android/gms/internal/ads/f8;->a(Lcom/google/android/gms/internal/ads/f8;Lcom/google/android/gms/internal/ads/w8;)Lcom/google/android/gms/internal/ads/w8;

    const-string p2, "Successfully loaded JS Engine."

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/wk;->e(Ljava/lang/String;)V

    monitor-exit p1

    return-void

    :cond_1
    :goto_0
    monitor-exit p1

    return-void

    :catchall_0
    move-exception p2

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method
