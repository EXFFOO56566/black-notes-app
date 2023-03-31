.class final Lcom/google/android/gms/internal/ads/n8;
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
.field private final synthetic a:Lcom/google/android/gms/internal/ads/eq1;

.field private final synthetic b:Lcom/google/android/gms/internal/ads/r7;

.field private final synthetic c:Lcom/google/android/gms/internal/ads/hn;

.field private final synthetic d:Lcom/google/android/gms/internal/ads/f8;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/f8;Lcom/google/android/gms/internal/ads/eq1;Lcom/google/android/gms/internal/ads/r7;Lcom/google/android/gms/internal/ads/hn;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/n8;->d:Lcom/google/android/gms/internal/ads/f8;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/n8;->a:Lcom/google/android/gms/internal/ads/eq1;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/n8;->b:Lcom/google/android/gms/internal/ads/r7;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/n8;->c:Lcom/google/android/gms/internal/ads/hn;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;Ljava/util/Map;)V
    .locals 2

    check-cast p1, Lcom/google/android/gms/internal/ads/e9;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/n8;->d:Lcom/google/android/gms/internal/ads/f8;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/f8;->a(Lcom/google/android/gms/internal/ads/f8;)Ljava/lang/Object;

    move-result-object p1

    monitor-enter p1

    :try_start_0
    const-string p2, "JS Engine is requesting an update"

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/co;->c(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/n8;->d:Lcom/google/android/gms/internal/ads/f8;

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/f8;->d(Lcom/google/android/gms/internal/ads/f8;)I

    move-result p2

    if-nez p2, :cond_0

    const-string p2, "Starting reload."

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/co;->c(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/n8;->d:Lcom/google/android/gms/internal/ads/f8;

    const/4 v0, 0x2

    invoke-static {p2, v0}, Lcom/google/android/gms/internal/ads/f8;->a(Lcom/google/android/gms/internal/ads/f8;I)I

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/n8;->d:Lcom/google/android/gms/internal/ads/f8;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/n8;->a:Lcom/google/android/gms/internal/ads/eq1;

    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/ads/f8;->a(Lcom/google/android/gms/internal/ads/eq1;)Lcom/google/android/gms/internal/ads/w8;

    :cond_0
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/n8;->b:Lcom/google/android/gms/internal/ads/r7;

    const-string v0, "/requestReload"

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/n8;->c:Lcom/google/android/gms/internal/ads/hn;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/hn;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/d5;

    invoke-interface {p2, v0, v1}, Lcom/google/android/gms/internal/ads/e9;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/d5;)V

    monitor-exit p1

    return-void

    :catchall_0
    move-exception p2

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method
