.class public final Lcom/google/android/gms/internal/ads/d7;
.super Lcom/google/android/gms/internal/ads/q7;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/m7;
.implements Lcom/google/android/gms/internal/ads/r7;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ads/q7<",
        "Lcom/google/android/gms/internal/ads/e9;",
        ">;",
        "Lcom/google/android/gms/internal/ads/m7;",
        "Lcom/google/android/gms/internal/ads/r7;"
    }
.end annotation

.annotation runtime Ljavax/annotation/ParametersAreNonnullByDefault;
.end annotation


# instance fields
.field private final d:Lcom/google/android/gms/internal/ads/av;

.field private e:Lcom/google/android/gms/internal/ads/u7;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/fo;)V
    .locals 3

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/q7;-><init>()V

    :try_start_0
    new-instance v0, Lcom/google/android/gms/internal/ads/av;

    new-instance v1, Lcom/google/android/gms/internal/ads/j7;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/google/android/gms/internal/ads/j7;-><init>(Lcom/google/android/gms/internal/ads/d7;Lcom/google/android/gms/internal/ads/h7;)V

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/internal/ads/av;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/yu;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/d7;->d:Lcom/google/android/gms/internal/ads/av;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWillNotDraw(Z)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/d7;->d:Lcom/google/android/gms/internal/ads/av;

    new-instance v1, Lcom/google/android/gms/internal/ads/k7;

    invoke-direct {v1, p0, v2}, Lcom/google/android/gms/internal/ads/k7;-><init>(Lcom/google/android/gms/internal/ads/n7;Lcom/google/android/gms/internal/ads/h7;)V

    const-string v2, "GoogleJsInterface"

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/av;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->c()Lcom/google/android/gms/internal/ads/gl;

    move-result-object v0

    iget-object p2, p2, Lcom/google/android/gms/internal/ads/fo;->b:Ljava/lang/String;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/d7;->d:Lcom/google/android/gms/internal/ads/av;

    invoke-virtual {v1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v1

    invoke-virtual {v0, p1, p2, v1}, Lcom/google/android/gms/internal/ads/gl;->a(Landroid/content/Context;Ljava/lang/String;Landroid/webkit/WebSettings;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-super {p0, p0}, Lcom/google/android/gms/internal/ads/q7;->a(Ljava/lang/Object;)V

    return-void

    :catchall_0
    move-exception p1

    new-instance p2, Lcom/google/android/gms/internal/ads/it;

    const-string v0, "Init failed."

    invoke-direct {p2, v0, p1}, Lcom/google/android/gms/internal/ads/it;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/d7;)Lcom/google/android/gms/internal/ads/u7;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/d7;->e:Lcom/google/android/gms/internal/ads/u7;

    return-object p0
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/u7;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/d7;->e:Lcom/google/android/gms/internal/ads/u7;

    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/ads/jo;->e:Lcom/google/android/gms/internal/ads/ko1;

    new-instance v1, Lcom/google/android/gms/internal/ads/i7;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/ads/i7;-><init>(Lcom/google/android/gms/internal/ads/d7;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/ads/l7;->a(Lcom/google/android/gms/internal/ads/m7;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/util/Map;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/ads/l7;->a(Lcom/google/android/gms/internal/ads/m7;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public final a(Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/ads/l7;->b(Lcom/google/android/gms/internal/ads/m7;Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method

.method public final b(Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/ads/l7;->a(Lcom/google/android/gms/internal/ads/m7;Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method

.method public final c(Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const-string p1, "<!DOCTYPE html><html><head><script src=\"%s\"></script></head></html>"

    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/d7;->e(Ljava/lang/String;)V

    return-void
.end method

.method public final destroy()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/d7;->d:Lcom/google/android/gms/internal/ads/av;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/av;->destroy()V

    return-void
.end method

.method public final e(Ljava/lang/String;)V
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/ads/jo;->e:Lcom/google/android/gms/internal/ads/ko1;

    new-instance v1, Lcom/google/android/gms/internal/ads/g7;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/ads/g7;-><init>(Lcom/google/android/gms/internal/ads/d7;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final e()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/d7;->d:Lcom/google/android/gms/internal/ads/av;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/av;->e()Z

    move-result v0

    return v0
.end method

.method public final f(Ljava/lang/String;)V
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/ads/jo;->e:Lcom/google/android/gms/internal/ads/ko1;

    new-instance v1, Lcom/google/android/gms/internal/ads/f7;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/ads/f7;-><init>(Lcom/google/android/gms/internal/ads/d7;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method final synthetic g(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/d7;->d:Lcom/google/android/gms/internal/ads/av;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/av;->a(Ljava/lang/String;)V

    return-void
.end method

.method final synthetic h(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/d7;->d:Lcom/google/android/gms/internal/ads/av;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/av;->loadUrl(Ljava/lang/String;)V

    return-void
.end method

.method final synthetic i(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/d7;->d:Lcom/google/android/gms/internal/ads/av;

    const-string v1, "text/html"

    const-string v2, "UTF-8"

    invoke-virtual {v0, p1, v1, v2}, Lcom/google/android/gms/internal/ads/av;->loadData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final z()Lcom/google/android/gms/internal/ads/d9;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/g9;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/g9;-><init>(Lcom/google/android/gms/internal/ads/e9;)V

    return-object v0
.end method
