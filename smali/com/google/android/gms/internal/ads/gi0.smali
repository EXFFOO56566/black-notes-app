.class public final Lcom/google/android/gms/internal/ads/gi0;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/zd1;

.field private final b:Ljava/util/concurrent/Executor;

.field private final c:Lcom/google/android/gms/internal/ads/pk0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zd1;Ljava/util/concurrent/Executor;Lcom/google/android/gms/internal/ads/pk0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/gi0;->a:Lcom/google/android/gms/internal/ads/zd1;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/gi0;->b:Ljava/util/concurrent/Executor;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/gi0;->c:Lcom/google/android/gms/internal/ads/pk0;

    return-void
.end method

.method private final a(Lcom/google/android/gms/internal/ads/ws;)V
    .locals 3

    sget-object v0, Lcom/google/android/gms/internal/ads/p4;->l:Lcom/google/android/gms/internal/ads/d5;

    const-string v1, "/video"

    invoke-interface {p1, v1, v0}, Lcom/google/android/gms/internal/ads/ws;->b(Ljava/lang/String;Lcom/google/android/gms/internal/ads/d5;)V

    sget-object v0, Lcom/google/android/gms/internal/ads/p4;->m:Lcom/google/android/gms/internal/ads/d5;

    const-string v1, "/videoMeta"

    invoke-interface {p1, v1, v0}, Lcom/google/android/gms/internal/ads/ws;->b(Ljava/lang/String;Lcom/google/android/gms/internal/ads/d5;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/fs;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/fs;-><init>()V

    const-string v1, "/precache"

    invoke-interface {p1, v1, v0}, Lcom/google/android/gms/internal/ads/ws;->b(Ljava/lang/String;Lcom/google/android/gms/internal/ads/d5;)V

    sget-object v0, Lcom/google/android/gms/internal/ads/p4;->p:Lcom/google/android/gms/internal/ads/d5;

    const-string v1, "/delayPageLoaded"

    invoke-interface {p1, v1, v0}, Lcom/google/android/gms/internal/ads/ws;->b(Ljava/lang/String;Lcom/google/android/gms/internal/ads/d5;)V

    sget-object v0, Lcom/google/android/gms/internal/ads/p4;->n:Lcom/google/android/gms/internal/ads/d5;

    const-string v1, "/instrument"

    invoke-interface {p1, v1, v0}, Lcom/google/android/gms/internal/ads/ws;->b(Ljava/lang/String;Lcom/google/android/gms/internal/ads/d5;)V

    sget-object v0, Lcom/google/android/gms/internal/ads/p4;->g:Lcom/google/android/gms/internal/ads/d5;

    const-string v1, "/log"

    invoke-interface {p1, v1, v0}, Lcom/google/android/gms/internal/ads/ws;->b(Ljava/lang/String;Lcom/google/android/gms/internal/ads/d5;)V

    sget-object v0, Lcom/google/android/gms/internal/ads/p4;->h:Lcom/google/android/gms/internal/ads/d5;

    const-string v1, "/videoClicked"

    invoke-interface {p1, v1, v0}, Lcom/google/android/gms/internal/ads/ws;->b(Ljava/lang/String;Lcom/google/android/gms/internal/ads/d5;)V

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/ws;->P()Lcom/google/android/gms/internal/ads/ju;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/ju;->a(Z)V

    sget-object v0, Lcom/google/android/gms/internal/ads/p4;->c:Lcom/google/android/gms/internal/ads/d5;

    const-string v2, "/click"

    invoke-interface {p1, v2, v0}, Lcom/google/android/gms/internal/ads/ws;->b(Ljava/lang/String;Lcom/google/android/gms/internal/ads/d5;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/gi0;->a:Lcom/google/android/gms/internal/ads/zd1;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zd1;->c:Lcom/google/android/gms/internal/ads/q6;

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/ws;->P()Lcom/google/android/gms/internal/ads/ju;

    move-result-object v0

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/ju;->b(Z)V

    new-instance v0, Lcom/google/android/gms/internal/ads/h5;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, Lcom/google/android/gms/internal/ads/h5;-><init>(Lcom/google/android/gms/ads/internal/c;Lcom/google/android/gms/internal/ads/ld;)V

    const-string v1, "/open"

    invoke-interface {p1, v1, v0}, Lcom/google/android/gms/internal/ads/ws;->b(Ljava/lang/String;Lcom/google/android/gms/internal/ads/d5;)V

    return-void

    :cond_0
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/ws;->P()Lcom/google/android/gms/internal/ads/ju;

    move-result-object p1

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/ads/ju;->b(Z)V

    return-void
.end method


# virtual methods
.method final synthetic a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/lo1;
    .locals 3

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/gi0;->c:Lcom/google/android/gms/internal/ads/pk0;

    invoke-static {}, Lcom/google/android/gms/internal/ads/um2;->e()Lcom/google/android/gms/internal/ads/um2;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/ads/pk0;->a(Lcom/google/android/gms/internal/ads/um2;Z)Lcom/google/android/gms/internal/ads/ws;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/so;->c(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/so;

    move-result-object v0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/gi0;->a(Lcom/google/android/gms/internal/ads/ws;)V

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/ws;->P()Lcom/google/android/gms/internal/ads/ju;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/ads/ki0;

    invoke-direct {v2, v0}, Lcom/google/android/gms/internal/ads/ki0;-><init>(Lcom/google/android/gms/internal/ads/so;)V

    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/ads/ju;->a(Lcom/google/android/gms/internal/ads/ku;)V

    sget-object v1, Lcom/google/android/gms/internal/ads/zr2;->t1:Lcom/google/android/gms/internal/ads/kr2;

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->e()Lcom/google/android/gms/internal/ads/vr2;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/vr2;->a(Lcom/google/android/gms/internal/ads/kr2;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {p1, v1}, Lcom/google/android/gms/internal/ads/ws;->loadUrl(Ljava/lang/String;)V

    return-object v0
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/lo1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/internal/ads/lo1<",
            "Lcom/google/android/gms/internal/ads/ws;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/yn1;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/ii0;

    invoke-direct {v1, p0, p1, p2}, Lcom/google/android/gms/internal/ads/ii0;-><init>(Lcom/google/android/gms/internal/ads/gi0;Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/gi0;->b:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, p1}, Lcom/google/android/gms/internal/ads/yn1;->a(Lcom/google/android/gms/internal/ads/lo1;Lcom/google/android/gms/internal/ads/ln1;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    return-object p1
.end method

.method final synthetic a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/lo1;
    .locals 3

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/gi0;->c:Lcom/google/android/gms/internal/ads/pk0;

    invoke-static {}, Lcom/google/android/gms/internal/ads/um2;->e()Lcom/google/android/gms/internal/ads/um2;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p3, v0, v1}, Lcom/google/android/gms/internal/ads/pk0;->a(Lcom/google/android/gms/internal/ads/um2;Z)Lcom/google/android/gms/internal/ads/ws;

    move-result-object p3

    invoke-static {p3}, Lcom/google/android/gms/internal/ads/so;->c(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/so;

    move-result-object v0

    invoke-direct {p0, p3}, Lcom/google/android/gms/internal/ads/gi0;->a(Lcom/google/android/gms/internal/ads/ws;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/gi0;->a:Lcom/google/android/gms/internal/ads/zd1;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/zd1;->c:Lcom/google/android/gms/internal/ads/q6;

    if-eqz v1, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/ads/lu;->h()Lcom/google/android/gms/internal/ads/lu;

    move-result-object v1

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/ads/lu;->g()Lcom/google/android/gms/internal/ads/lu;

    move-result-object v1

    :goto_0
    invoke-interface {p3, v1}, Lcom/google/android/gms/internal/ads/ws;->a(Lcom/google/android/gms/internal/ads/lu;)V

    invoke-interface {p3}, Lcom/google/android/gms/internal/ads/ws;->P()Lcom/google/android/gms/internal/ads/ju;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/ads/ji0;

    invoke-direct {v2, p0, p3, v0}, Lcom/google/android/gms/internal/ads/ji0;-><init>(Lcom/google/android/gms/internal/ads/gi0;Lcom/google/android/gms/internal/ads/ws;Lcom/google/android/gms/internal/ads/so;)V

    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/ads/ju;->a(Lcom/google/android/gms/internal/ads/iu;)V

    const/4 v1, 0x0

    invoke-interface {p3, p1, p2, v1}, Lcom/google/android/gms/internal/ads/ws;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public final a(Lorg/json/JSONObject;)Lcom/google/android/gms/internal/ads/lo1;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/internal/ads/lo1<",
            "Lcom/google/android/gms/internal/ads/ws;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/yn1;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/hi0;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/hi0;-><init>(Lcom/google/android/gms/internal/ads/gi0;)V

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/gi0;->b:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/yn1;->a(Lcom/google/android/gms/internal/ads/lo1;Lcom/google/android/gms/internal/ads/ln1;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/fi0;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/ads/fi0;-><init>(Lcom/google/android/gms/internal/ads/gi0;Lorg/json/JSONObject;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/gi0;->b:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, p1}, Lcom/google/android/gms/internal/ads/yn1;->a(Lcom/google/android/gms/internal/ads/lo1;Lcom/google/android/gms/internal/ads/ln1;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    return-object p1
.end method

.method final synthetic a(Lorg/json/JSONObject;Lcom/google/android/gms/internal/ads/ws;)Lcom/google/android/gms/internal/ads/lo1;
    .locals 3

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/so;->c(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/so;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/gi0;->a:Lcom/google/android/gms/internal/ads/zd1;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/zd1;->c:Lcom/google/android/gms/internal/ads/q6;

    if-eqz v1, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/ads/lu;->h()Lcom/google/android/gms/internal/ads/lu;

    move-result-object v1

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/ads/lu;->g()Lcom/google/android/gms/internal/ads/lu;

    move-result-object v1

    :goto_0
    invoke-interface {p2, v1}, Lcom/google/android/gms/internal/ads/ws;->a(Lcom/google/android/gms/internal/ads/lu;)V

    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/ws;->P()Lcom/google/android/gms/internal/ads/ju;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/ads/mi0;

    invoke-direct {v2, p0, p2, v0}, Lcom/google/android/gms/internal/ads/mi0;-><init>(Lcom/google/android/gms/internal/ads/gi0;Lcom/google/android/gms/internal/ads/ws;Lcom/google/android/gms/internal/ads/so;)V

    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/ads/ju;->a(Lcom/google/android/gms/internal/ads/iu;)V

    const-string v1, "google.afma.nativeAds.renderVideo"

    invoke-interface {p2, v1, p1}, Lcom/google/android/gms/internal/ads/c8;->b(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-object v0
.end method

.method final synthetic a(Lcom/google/android/gms/internal/ads/ws;Lcom/google/android/gms/internal/ads/so;Z)V
    .locals 1

    if-eqz p3, :cond_1

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/gi0;->a:Lcom/google/android/gms/internal/ads/zd1;

    iget-object p3, p3, Lcom/google/android/gms/internal/ads/zd1;->b:Lcom/google/android/gms/internal/ads/er2;

    if-eqz p3, :cond_0

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/ws;->i()Lcom/google/android/gms/internal/ads/rt;

    move-result-object p3

    if-eqz p3, :cond_0

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/ws;->i()Lcom/google/android/gms/internal/ads/rt;

    move-result-object p1

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/gi0;->a:Lcom/google/android/gms/internal/ads/zd1;

    iget-object p3, p3, Lcom/google/android/gms/internal/ads/zd1;->b:Lcom/google/android/gms/internal/ads/er2;

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/ads/rt;->b(Lcom/google/android/gms/internal/ads/er2;)V

    :cond_0
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/so;->a()V

    return-void

    :cond_1
    new-instance p1, Lcom/google/android/gms/internal/ads/pw0;

    const/4 p3, 0x0

    const-string v0, "Instream video Web View failed to load."

    invoke-direct {p1, v0, p3}, Lcom/google/android/gms/internal/ads/pw0;-><init>(Ljava/lang/String;I)V

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/ro;->a(Ljava/lang/Throwable;)Z

    return-void
.end method

.method final synthetic b(Lcom/google/android/gms/internal/ads/ws;Lcom/google/android/gms/internal/ads/so;Z)V
    .locals 0

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/gi0;->a:Lcom/google/android/gms/internal/ads/zd1;

    iget-object p3, p3, Lcom/google/android/gms/internal/ads/zd1;->b:Lcom/google/android/gms/internal/ads/er2;

    if-eqz p3, :cond_0

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/ws;->i()Lcom/google/android/gms/internal/ads/rt;

    move-result-object p3

    if-eqz p3, :cond_0

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/ws;->i()Lcom/google/android/gms/internal/ads/rt;

    move-result-object p1

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/gi0;->a:Lcom/google/android/gms/internal/ads/zd1;

    iget-object p3, p3, Lcom/google/android/gms/internal/ads/zd1;->b:Lcom/google/android/gms/internal/ads/er2;

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/ads/rt;->b(Lcom/google/android/gms/internal/ads/er2;)V

    :cond_0
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/so;->a()V

    return-void
.end method
