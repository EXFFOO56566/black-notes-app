.class public Lcom/google/android/gms/internal/ads/fc0;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/id0;

.field private final b:Lcom/google/android/gms/internal/ads/ws;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/id0;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/ads/fc0;-><init>(Lcom/google/android/gms/internal/ads/id0;Lcom/google/android/gms/internal/ads/ws;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/ads/id0;Lcom/google/android/gms/internal/ads/ws;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/fc0;->a:Lcom/google/android/gms/internal/ads/id0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/fc0;->b:Lcom/google/android/gms/internal/ads/ws;

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/ab0;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            ")",
            "Lcom/google/android/gms/internal/ads/ab0<",
            "Lcom/google/android/gms/internal/ads/q80;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/fc0;->b:Lcom/google/android/gms/internal/ads/ws;

    new-instance v1, Lcom/google/android/gms/internal/ads/ab0;

    new-instance v2, Lcom/google/android/gms/internal/ads/hc0;

    invoke-direct {v2, v0}, Lcom/google/android/gms/internal/ads/hc0;-><init>(Lcom/google/android/gms/internal/ads/ws;)V

    invoke-direct {v1, v2, p1}, Lcom/google/android/gms/internal/ads/ab0;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    return-object v1
.end method

.method public final a()Lcom/google/android/gms/internal/ads/ws;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/fc0;->b:Lcom/google/android/gms/internal/ads/ws;

    return-object v0
.end method

.method public a(Lcom/google/android/gms/internal/ads/nd0;)Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/nd0;",
            ")",
            "Ljava/util/Set<",
            "Lcom/google/android/gms/internal/ads/ab0<",
            "Lcom/google/android/gms/internal/ads/u50;",
            ">;>;"
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/internal/ads/jo;->f:Lcom/google/android/gms/internal/ads/ko1;

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/ab0;->a(Ljava/lang/Object;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/ab0;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method

.method public final b()Lcom/google/android/gms/internal/ads/id0;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/fc0;->a:Lcom/google/android/gms/internal/ads/id0;

    return-object v0
.end method

.method public final c()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/fc0;->b:Lcom/google/android/gms/internal/ads/ws;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->getWebView()Landroid/webkit/WebView;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final d()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/fc0;->b:Lcom/google/android/gms/internal/ads/ws;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->getWebView()Landroid/webkit/WebView;

    move-result-object v0

    return-object v0
.end method
