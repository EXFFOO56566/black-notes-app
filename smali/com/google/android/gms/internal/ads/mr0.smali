.class public final Lcom/google/android/gms/internal/ads/mr0;
.super Lcom/google/android/gms/internal/ads/of;
.source ""


# instance fields
.field private final b:Landroid/content/Context;

.field private final c:Ljava/util/concurrent/Executor;

.field private final d:Lcom/google/android/gms/internal/ads/rg;

.field private final e:Lcom/google/android/gms/internal/ads/ng;

.field private final f:Lcom/google/android/gms/internal/ads/jy;

.field private final g:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/ads/cs0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/concurrent/Executor;Lcom/google/android/gms/internal/ads/rg;Lcom/google/android/gms/internal/ads/jy;Lcom/google/android/gms/internal/ads/ng;Ljava/util/HashMap;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/concurrent/Executor;",
            "Lcom/google/android/gms/internal/ads/rg;",
            "Lcom/google/android/gms/internal/ads/jy;",
            "Lcom/google/android/gms/internal/ads/ng;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/ads/cs0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/of;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zr2;->a(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/mr0;->b:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/mr0;->c:Ljava/util/concurrent/Executor;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/mr0;->d:Lcom/google/android/gms/internal/ads/rg;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/mr0;->e:Lcom/google/android/gms/internal/ads/ng;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/mr0;->f:Lcom/google/android/gms/internal/ads/jy;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/mr0;->g:Ljava/util/HashMap;

    return-void
.end method

.method private static a(Lcom/google/android/gms/internal/ads/lo1;Lcom/google/android/gms/internal/ads/sh1;Lcom/google/android/gms/internal/ads/q9;)Lcom/google/android/gms/internal/ads/lo1;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/lo1<",
            "Lorg/json/JSONObject;",
            ">;",
            "Lcom/google/android/gms/internal/ads/sh1;",
            "Lcom/google/android/gms/internal/ads/q9;",
            ")",
            "Lcom/google/android/gms/internal/ads/lo1<",
            "Lcom/google/android/gms/internal/ads/fg;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/internal/ads/l9;->b:Lcom/google/android/gms/internal/ads/m9;

    sget-object v1, Lcom/google/android/gms/internal/ads/sr0;->a:Lcom/google/android/gms/internal/ads/k9;

    const-string v2, "AFMA_getAdDictionary"

    invoke-virtual {p2, v2, v0, v1}, Lcom/google/android/gms/internal/ads/q9;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/j9;Lcom/google/android/gms/internal/ads/k9;)Lcom/google/android/gms/internal/ads/i9;

    move-result-object p2

    sget-object v0, Lcom/google/android/gms/internal/ads/ph1;->i:Lcom/google/android/gms/internal/ads/ph1;

    invoke-virtual {p1, v0, p0}, Lcom/google/android/gms/internal/ads/eh1;->a(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/lo1;)Lcom/google/android/gms/internal/ads/kh1;

    move-result-object p0

    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/ads/kh1;->a(Lcom/google/android/gms/internal/ads/ln1;)Lcom/google/android/gms/internal/ads/kh1;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/kh1;->a()Lcom/google/android/gms/internal/ads/bh1;

    move-result-object p0

    return-object p0
.end method

.method private static a(Lcom/google/android/gms/internal/ads/zf;Lcom/google/android/gms/internal/ads/sh1;Lcom/google/android/gms/internal/ads/r71;)Lcom/google/android/gms/internal/ads/lo1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/zf;",
            "Lcom/google/android/gms/internal/ads/sh1;",
            "Lcom/google/android/gms/internal/ads/r71;",
            ")",
            "Lcom/google/android/gms/internal/ads/lo1<",
            "Lorg/json/JSONObject;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/ads/qr0;

    invoke-direct {v0, p2}, Lcom/google/android/gms/internal/ads/qr0;-><init>(Lcom/google/android/gms/internal/ads/r71;)V

    sget-object p2, Lcom/google/android/gms/internal/ads/tr0;->a:Lcom/google/android/gms/internal/ads/zg1;

    sget-object v1, Lcom/google/android/gms/internal/ads/ph1;->g:Lcom/google/android/gms/internal/ads/ph1;

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zf;->b:Landroid/os/Bundle;

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/yn1;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p0

    invoke-virtual {p1, v1, p0}, Lcom/google/android/gms/internal/ads/eh1;->a(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/lo1;)Lcom/google/android/gms/internal/ads/kh1;

    move-result-object p0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/kh1;->a(Lcom/google/android/gms/internal/ads/ln1;)Lcom/google/android/gms/internal/ads/kh1;

    move-result-object p0

    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/ads/kh1;->a(Lcom/google/android/gms/internal/ads/zg1;)Lcom/google/android/gms/internal/ads/kh1;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/kh1;->a()Lcom/google/android/gms/internal/ads/bh1;

    move-result-object p0

    return-object p0
.end method

.method private final a(Lcom/google/android/gms/internal/ads/lo1;Lcom/google/android/gms/internal/ads/tf;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/lo1<",
            "Ljava/io/InputStream;",
            ">;",
            "Lcom/google/android/gms/internal/ads/tf;",
            ")V"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/ads/wr0;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/wr0;-><init>(Lcom/google/android/gms/internal/ads/mr0;)V

    sget-object v1, Lcom/google/android/gms/internal/ads/jo;->a:Lcom/google/android/gms/internal/ads/ko1;

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/ads/yn1;->a(Lcom/google/android/gms/internal/ads/lo1;Lcom/google/android/gms/internal/ads/ln1;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    new-instance v0, Lcom/google/android/gms/internal/ads/zr0;

    invoke-direct {v0, p0, p2}, Lcom/google/android/gms/internal/ads/zr0;-><init>(Lcom/google/android/gms/internal/ads/mr0;Lcom/google/android/gms/internal/ads/tf;)V

    sget-object p2, Lcom/google/android/gms/internal/ads/jo;->f:Lcom/google/android/gms/internal/ads/ko1;

    invoke-static {p1, v0, p2}, Lcom/google/android/gms/internal/ads/yn1;->a(Lcom/google/android/gms/internal/ads/lo1;Lcom/google/android/gms/internal/ads/zn1;Ljava/util/concurrent/Executor;)V

    return-void
.end method


# virtual methods
.method public final A(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/lo1;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/internal/ads/lo1<",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/internal/ads/r0;->a:Lcom/google/android/gms/internal/ads/b0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/b0;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance p1, Ljava/lang/Exception;

    const-string v0, "Split request is disabled."

    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/yn1;->a(Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/ads/as0;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/as0;-><init>(Lcom/google/android/gms/internal/ads/mr0;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/mr0;->g:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/cs0;

    if-nez v1, :cond_2

    new-instance v0, Ljava/lang/Exception;

    const-string v1, "URL to be removed not found for cache key: "

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/String;

    invoke-direct {p1, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :goto_0
    invoke-direct {v0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/yn1;->a(Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/yn1;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    return-object p1
.end method

.method public final a(Lcom/google/android/gms/internal/ads/jf;)Lcom/google/android/gms/internal/ads/lf;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public final a(Lcom/google/android/gms/internal/ads/zf;I)Lcom/google/android/gms/internal/ads/lo1;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/zf;",
            "I)",
            "Lcom/google/android/gms/internal/ads/lo1<",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->p()Lcom/google/android/gms/internal/ads/h9;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/mr0;->b:Landroid/content/Context;

    invoke-static {}, Lcom/google/android/gms/internal/ads/fo;->d()Lcom/google/android/gms/internal/ads/fo;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/h9;->a(Landroid/content/Context;Lcom/google/android/gms/internal/ads/fo;)Lcom/google/android/gms/internal/ads/q9;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/mr0;->f:Lcom/google/android/gms/internal/ads/jy;

    invoke-interface {v1, p1, p2}, Lcom/google/android/gms/internal/ads/jy;->a(Lcom/google/android/gms/internal/ads/zf;I)Lcom/google/android/gms/internal/ads/r71;

    move-result-object p2

    sget-object v1, Lcom/google/android/gms/internal/ads/bs0;->d:Lcom/google/android/gms/internal/ads/j9;

    sget-object v2, Lcom/google/android/gms/internal/ads/l9;->c:Lcom/google/android/gms/internal/ads/k9;

    const-string v3, "google.afma.response.normalize"

    invoke-virtual {v0, v3, v1, v2}, Lcom/google/android/gms/internal/ads/q9;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/j9;Lcom/google/android/gms/internal/ads/k9;)Lcom/google/android/gms/internal/ads/i9;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/ads/gs0;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/mr0;->b:Landroid/content/Context;

    iget-object v4, p1, Lcom/google/android/gms/internal/ads/zf;->c:Lcom/google/android/gms/internal/ads/fo;

    iget-object v4, v4, Lcom/google/android/gms/internal/ads/fo;->b:Ljava/lang/String;

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/mr0;->d:Lcom/google/android/gms/internal/ads/rg;

    iget-object v6, p1, Lcom/google/android/gms/internal/ads/zf;->h:Ljava/lang/String;

    invoke-direct {v2, v3, v4, v5, v6}, Lcom/google/android/gms/internal/ads/gs0;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/ads/rg;Ljava/lang/String;)V

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/r71;->c()Lcom/google/android/gms/internal/ads/sh1;

    move-result-object v3

    sget-object v4, Lcom/google/android/gms/internal/ads/r0;->a:Lcom/google/android/gms/internal/ads/b0;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/b0;->a()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    const/4 v5, 0x0

    if-nez v4, :cond_0

    iget-object v4, p1, Lcom/google/android/gms/internal/ads/zf;->l:Ljava/lang/String;

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_1

    const-string v4, "Request contained a PoolKey but split request is disabled."

    :goto_0
    invoke-static {v4}, Lcom/google/android/gms/internal/ads/wk;->e(Ljava/lang/String;)V

    goto :goto_1

    :cond_0
    iget-object v4, p1, Lcom/google/android/gms/internal/ads/zf;->l:Ljava/lang/String;

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_1

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/mr0;->g:Ljava/util/HashMap;

    iget-object v5, p1, Lcom/google/android/gms/internal/ads/zf;->l:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lcom/google/android/gms/internal/ads/cs0;

    if-nez v5, :cond_1

    const-string v4, "Request contained a PoolKey but no matching parameters were found."

    goto :goto_0

    :cond_1
    :goto_1
    const/4 v4, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x2

    if-nez v5, :cond_2

    invoke-static {p1, v3, p2}, Lcom/google/android/gms/internal/ads/mr0;->a(Lcom/google/android/gms/internal/ads/zf;Lcom/google/android/gms/internal/ads/sh1;Lcom/google/android/gms/internal/ads/r71;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    invoke-static {p1, v3, v0}, Lcom/google/android/gms/internal/ads/mr0;->a(Lcom/google/android/gms/internal/ads/lo1;Lcom/google/android/gms/internal/ads/sh1;Lcom/google/android/gms/internal/ads/q9;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p2

    sget-object v0, Lcom/google/android/gms/internal/ads/ph1;->j:Lcom/google/android/gms/internal/ads/ph1;

    new-array v5, v7, [Lcom/google/android/gms/internal/ads/lo1;

    aput-object p2, v5, v6

    aput-object p1, v5, v4

    invoke-virtual {v3, v0, v5}, Lcom/google/android/gms/internal/ads/eh1;->a(Ljava/lang/Object;[Lcom/google/android/gms/internal/ads/lo1;)Lcom/google/android/gms/internal/ads/gh1;

    move-result-object v0

    new-instance v5, Lcom/google/android/gms/internal/ads/pr0;

    invoke-direct {v5, p1, p2}, Lcom/google/android/gms/internal/ads/pr0;-><init>(Lcom/google/android/gms/internal/ads/lo1;Lcom/google/android/gms/internal/ads/lo1;)V

    invoke-virtual {v0, v5}, Lcom/google/android/gms/internal/ads/gh1;->a(Ljava/util/concurrent/Callable;)Lcom/google/android/gms/internal/ads/kh1;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/kh1;->a(Lcom/google/android/gms/internal/ads/zg1;)Lcom/google/android/gms/internal/ads/kh1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/kh1;->a()Lcom/google/android/gms/internal/ads/bh1;

    move-result-object v0

    sget-object v2, Lcom/google/android/gms/internal/ads/ph1;->k:Lcom/google/android/gms/internal/ads/ph1;

    const/4 v5, 0x3

    new-array v5, v5, [Lcom/google/android/gms/internal/ads/lo1;

    aput-object p1, v5, v6

    aput-object p2, v5, v4

    aput-object v0, v5, v7

    invoke-virtual {v3, v2, v5}, Lcom/google/android/gms/internal/ads/eh1;->a(Ljava/lang/Object;[Lcom/google/android/gms/internal/ads/lo1;)Lcom/google/android/gms/internal/ads/gh1;

    move-result-object v2

    new-instance v3, Lcom/google/android/gms/internal/ads/or0;

    invoke-direct {v3, v0, p1, p2}, Lcom/google/android/gms/internal/ads/or0;-><init>(Lcom/google/android/gms/internal/ads/lo1;Lcom/google/android/gms/internal/ads/lo1;Lcom/google/android/gms/internal/ads/lo1;)V

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/gh1;->a(Ljava/util/concurrent/Callable;)Lcom/google/android/gms/internal/ads/kh1;

    move-result-object p1

    :goto_2
    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/ads/kh1;->a(Lcom/google/android/gms/internal/ads/ln1;)Lcom/google/android/gms/internal/ads/kh1;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/kh1;->a()Lcom/google/android/gms/internal/ads/bh1;

    move-result-object p1

    return-object p1

    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/ads/fs0;

    iget-object p2, v5, Lcom/google/android/gms/internal/ads/cs0;->b:Lorg/json/JSONObject;

    iget-object v0, v5, Lcom/google/android/gms/internal/ads/cs0;->a:Lcom/google/android/gms/internal/ads/fg;

    invoke-direct {p1, p2, v0}, Lcom/google/android/gms/internal/ads/fs0;-><init>(Lorg/json/JSONObject;Lcom/google/android/gms/internal/ads/fg;)V

    sget-object p2, Lcom/google/android/gms/internal/ads/ph1;->j:Lcom/google/android/gms/internal/ads/ph1;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/yn1;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    invoke-virtual {v3, p2, p1}, Lcom/google/android/gms/internal/ads/eh1;->a(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/lo1;)Lcom/google/android/gms/internal/ads/kh1;

    move-result-object p1

    invoke-virtual {p1, v2}, Lcom/google/android/gms/internal/ads/kh1;->a(Lcom/google/android/gms/internal/ads/zg1;)Lcom/google/android/gms/internal/ads/kh1;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/kh1;->a()Lcom/google/android/gms/internal/ads/bh1;

    move-result-object p1

    invoke-static {v5}, Lcom/google/android/gms/internal/ads/yn1;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p2

    sget-object v0, Lcom/google/android/gms/internal/ads/ph1;->k:Lcom/google/android/gms/internal/ads/ph1;

    new-array v2, v7, [Lcom/google/android/gms/internal/ads/lo1;

    aput-object p1, v2, v6

    aput-object p2, v2, v4

    invoke-virtual {v3, v0, v2}, Lcom/google/android/gms/internal/ads/eh1;->a(Ljava/lang/Object;[Lcom/google/android/gms/internal/ads/lo1;)Lcom/google/android/gms/internal/ads/gh1;

    move-result-object v0

    new-instance v2, Lcom/google/android/gms/internal/ads/rr0;

    invoke-direct {v2, p1, p2}, Lcom/google/android/gms/internal/ads/rr0;-><init>(Lcom/google/android/gms/internal/ads/lo1;Lcom/google/android/gms/internal/ads/lo1;)V

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/gh1;->a(Ljava/util/concurrent/Callable;)Lcom/google/android/gms/internal/ads/kh1;

    move-result-object p1

    goto :goto_2
.end method

.method final synthetic a(Lcom/google/android/gms/internal/ads/lo1;Lcom/google/android/gms/internal/ads/lo1;)Ljava/io/InputStream;
    .locals 3

    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/fg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/fg;->h()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lorg/json/JSONObject;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/mr0;->g:Ljava/util/HashMap;

    new-instance v2, Lcom/google/android/gms/internal/ads/cs0;

    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/fg;

    invoke-direct {v2, p1, p2}, Lcom/google/android/gms/internal/ads/cs0;-><init>(Lcom/google/android/gms/internal/ads/fg;Lorg/json/JSONObject;)V

    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p1, Ljava/io/ByteArrayInputStream;

    sget-object p2, Lcom/google/android/gms/internal/ads/vk1;->a:Ljava/nio/charset/Charset;

    invoke-virtual {v0, p2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    return-object p1
.end method

.method public final a(Lcom/google/android/gms/internal/ads/jf;Lcom/google/android/gms/internal/ads/rf;)V
    .locals 0

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/zf;Lcom/google/android/gms/internal/ads/tf;)V
    .locals 1

    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v0

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/ads/mr0;->a(Lcom/google/android/gms/internal/ads/zf;I)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/mr0;->a(Lcom/google/android/gms/internal/ads/lo1;Lcom/google/android/gms/internal/ads/tf;)V

    new-instance p2, Lcom/google/android/gms/internal/ads/vr0;

    invoke-direct {p2, p0}, Lcom/google/android/gms/internal/ads/vr0;-><init>(Lcom/google/android/gms/internal/ads/mr0;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/mr0;->c:Ljava/util/concurrent/Executor;

    invoke-interface {p1, p2, v0}, Lcom/google/android/gms/internal/ads/lo1;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public final a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/tf;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/mr0;->A(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/mr0;->a(Lcom/google/android/gms/internal/ads/lo1;Lcom/google/android/gms/internal/ads/tf;)V

    return-void
.end method

.method public final b(Lcom/google/android/gms/internal/ads/zf;I)Lcom/google/android/gms/internal/ads/lo1;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/zf;",
            "I)",
            "Lcom/google/android/gms/internal/ads/lo1<",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/internal/ads/r0;->a:Lcom/google/android/gms/internal/ads/b0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/b0;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance p1, Ljava/lang/Exception;

    const-string p2, "Split request is disabled."

    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/yn1;->a(Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zf;->k:Lcom/google/android/gms/internal/ads/nf1;

    if-nez v0, :cond_1

    new-instance p1, Ljava/lang/Exception;

    const-string p2, "Pool configuration missing from request."

    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/yn1;->a(Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    return-object p1

    :cond_1
    iget v1, v0, Lcom/google/android/gms/internal/ads/nf1;->h:I

    if-eqz v1, :cond_3

    iget v0, v0, Lcom/google/android/gms/internal/ads/nf1;->i:I

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->p()Lcom/google/android/gms/internal/ads/h9;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/mr0;->b:Landroid/content/Context;

    invoke-static {}, Lcom/google/android/gms/internal/ads/fo;->d()Lcom/google/android/gms/internal/ads/fo;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/h9;->a(Landroid/content/Context;Lcom/google/android/gms/internal/ads/fo;)Lcom/google/android/gms/internal/ads/q9;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/mr0;->f:Lcom/google/android/gms/internal/ads/jy;

    invoke-interface {v1, p1, p2}, Lcom/google/android/gms/internal/ads/jy;->a(Lcom/google/android/gms/internal/ads/zf;I)Lcom/google/android/gms/internal/ads/r71;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/r71;->c()Lcom/google/android/gms/internal/ads/sh1;

    move-result-object v1

    invoke-static {p1, v1, p2}, Lcom/google/android/gms/internal/ads/mr0;->a(Lcom/google/android/gms/internal/ads/zf;Lcom/google/android/gms/internal/ads/sh1;Lcom/google/android/gms/internal/ads/r71;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    invoke-static {p1, v1, v0}, Lcom/google/android/gms/internal/ads/mr0;->a(Lcom/google/android/gms/internal/ads/lo1;Lcom/google/android/gms/internal/ads/sh1;Lcom/google/android/gms/internal/ads/q9;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p2

    sget-object v0, Lcom/google/android/gms/internal/ads/ph1;->y:Lcom/google/android/gms/internal/ads/ph1;

    const/4 v2, 0x2

    new-array v2, v2, [Lcom/google/android/gms/internal/ads/lo1;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const/4 v3, 0x1

    aput-object p2, v2, v3

    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/internal/ads/eh1;->a(Ljava/lang/Object;[Lcom/google/android/gms/internal/ads/lo1;)Lcom/google/android/gms/internal/ads/gh1;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/ur0;

    invoke-direct {v1, p0, p2, p1}, Lcom/google/android/gms/internal/ads/ur0;-><init>(Lcom/google/android/gms/internal/ads/mr0;Lcom/google/android/gms/internal/ads/lo1;Lcom/google/android/gms/internal/ads/lo1;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/gh1;->a(Ljava/util/concurrent/Callable;)Lcom/google/android/gms/internal/ads/kh1;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/kh1;->a()Lcom/google/android/gms/internal/ads/bh1;

    move-result-object p1

    return-object p1

    :cond_3
    :goto_0
    new-instance p1, Ljava/lang/Exception;

    const-string p2, "Caching is disabled."

    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/yn1;->a(Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lcom/google/android/gms/internal/ads/zf;Lcom/google/android/gms/internal/ads/tf;)V
    .locals 1

    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v0

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/ads/mr0;->b(Lcom/google/android/gms/internal/ads/zf;I)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/mr0;->a(Lcom/google/android/gms/internal/ads/lo1;Lcom/google/android/gms/internal/ads/tf;)V

    return-void
.end method

.method final synthetic b2()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/mr0;->e:Lcom/google/android/gms/internal/ads/ng;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ng;->a()Lcom/google/android/gms/internal/ads/lo1;

    move-result-object v0

    const-string v1, "persistFlags"

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/no;->a(Lcom/google/android/gms/internal/ads/lo1;Ljava/lang/String;)V

    return-void
.end method

.method public final c(Lcom/google/android/gms/internal/ads/zf;Lcom/google/android/gms/internal/ads/tf;)V
    .locals 6

    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v0

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->p()Lcom/google/android/gms/internal/ads/h9;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/mr0;->b:Landroid/content/Context;

    invoke-static {}, Lcom/google/android/gms/internal/ads/fo;->d()Lcom/google/android/gms/internal/ads/fo;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/ads/h9;->a(Landroid/content/Context;Lcom/google/android/gms/internal/ads/fo;)Lcom/google/android/gms/internal/ads/q9;

    move-result-object v1

    sget-object v2, Lcom/google/android/gms/internal/ads/x0;->a:Lcom/google/android/gms/internal/ads/b0;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/b0;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_0

    new-instance p1, Ljava/lang/Exception;

    const-string v0, "Signal collection disabled."

    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/yn1;->a(Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/mr0;->f:Lcom/google/android/gms/internal/ads/jy;

    invoke-interface {v2, p1, v0}, Lcom/google/android/gms/internal/ads/jy;->a(Lcom/google/android/gms/internal/ads/zf;I)Lcom/google/android/gms/internal/ads/r71;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/r71;->b()Lcom/google/android/gms/internal/ads/x61;

    move-result-object v2

    sget-object v3, Lcom/google/android/gms/internal/ads/l9;->b:Lcom/google/android/gms/internal/ads/m9;

    sget-object v4, Lcom/google/android/gms/internal/ads/l9;->c:Lcom/google/android/gms/internal/ads/k9;

    const-string v5, "google.afma.request.getSignals"

    invoke-virtual {v1, v5, v3, v4}, Lcom/google/android/gms/internal/ads/q9;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/j9;Lcom/google/android/gms/internal/ads/k9;)Lcom/google/android/gms/internal/ads/i9;

    move-result-object v1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/r71;->c()Lcom/google/android/gms/internal/ads/sh1;

    move-result-object v0

    sget-object v3, Lcom/google/android/gms/internal/ads/ph1;->l:Lcom/google/android/gms/internal/ads/ph1;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zf;->b:Landroid/os/Bundle;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/yn1;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    invoke-virtual {v0, v3, p1}, Lcom/google/android/gms/internal/ads/eh1;->a(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/lo1;)Lcom/google/android/gms/internal/ads/kh1;

    move-result-object p1

    new-instance v0, Lcom/google/android/gms/internal/ads/xr0;

    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/ads/xr0;-><init>(Lcom/google/android/gms/internal/ads/x61;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/kh1;->a(Lcom/google/android/gms/internal/ads/ln1;)Lcom/google/android/gms/internal/ads/kh1;

    move-result-object p1

    sget-object v0, Lcom/google/android/gms/internal/ads/ph1;->m:Lcom/google/android/gms/internal/ads/ph1;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/kh1;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/kh1;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/ads/kh1;->a(Lcom/google/android/gms/internal/ads/ln1;)Lcom/google/android/gms/internal/ads/kh1;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/kh1;->a()Lcom/google/android/gms/internal/ads/bh1;

    move-result-object p1

    :goto_0
    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/mr0;->a(Lcom/google/android/gms/internal/ads/lo1;Lcom/google/android/gms/internal/ads/tf;)V

    return-void
.end method
