.class public final Lcom/google/android/gms/internal/ads/ju0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/jt0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/jt0<",
        "Lcom/google/android/gms/internal/ads/ac0;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcom/google/android/gms/internal/ads/ad0;

.field private final c:Ljava/util/concurrent/Executor;

.field private final d:Lcom/google/android/gms/internal/ads/gd1;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/concurrent/Executor;Lcom/google/android/gms/internal/ads/ad0;Lcom/google/android/gms/internal/ads/gd1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ju0;->a:Landroid/content/Context;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/ju0;->b:Lcom/google/android/gms/internal/ads/ad0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/ju0;->c:Ljava/util/concurrent/Executor;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/ju0;->d:Lcom/google/android/gms/internal/ads/gd1;

    return-void
.end method

.method private static a(Lcom/google/android/gms/internal/ads/id1;)Ljava/lang/String;
    .locals 1

    :try_start_0
    iget-object p0, p0, Lcom/google/android/gms/internal/ads/id1;->s:Lorg/json/JSONObject;

    const-string v0, "tab_url"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method final synthetic a(Landroid/net/Uri;Lcom/google/android/gms/internal/ads/vd1;Lcom/google/android/gms/internal/ads/id1;Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/lo1;
    .locals 7

    :try_start_0
    new-instance p4, La/c/b/a$a;

    invoke-direct {p4}, La/c/b/a$a;-><init>()V

    invoke-virtual {p4}, La/c/b/a$a;->a()La/c/b/a;

    move-result-object p4

    iget-object v0, p4, La/c/b/a;->a:Landroid/content/Intent;

    invoke-virtual {v0, p1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    new-instance v2, Lcom/google/android/gms/ads/internal/overlay/d;

    iget-object p1, p4, La/c/b/a;->a:Landroid/content/Intent;

    invoke-direct {v2, p1}, Lcom/google/android/gms/ads/internal/overlay/d;-><init>(Landroid/content/Intent;)V

    new-instance p1, Lcom/google/android/gms/internal/ads/ro;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/ro;-><init>()V

    iget-object p4, p0, Lcom/google/android/gms/internal/ads/ju0;->b:Lcom/google/android/gms/internal/ads/ad0;

    new-instance v0, Lcom/google/android/gms/internal/ads/d30;

    const/4 v1, 0x0

    invoke-direct {v0, p2, p3, v1}, Lcom/google/android/gms/internal/ads/d30;-><init>(Lcom/google/android/gms/internal/ads/vd1;Lcom/google/android/gms/internal/ads/id1;Ljava/lang/String;)V

    new-instance p2, Lcom/google/android/gms/internal/ads/fc0;

    new-instance p3, Lcom/google/android/gms/internal/ads/lu0;

    invoke-direct {p3, p1}, Lcom/google/android/gms/internal/ads/lu0;-><init>(Lcom/google/android/gms/internal/ads/ro;)V

    invoke-direct {p2, p3}, Lcom/google/android/gms/internal/ads/fc0;-><init>(Lcom/google/android/gms/internal/ads/id0;)V

    invoke-virtual {p4, v0, p2}, Lcom/google/android/gms/internal/ads/ad0;->a(Lcom/google/android/gms/internal/ads/d30;Lcom/google/android/gms/internal/ads/fc0;)Lcom/google/android/gms/internal/ads/cc0;

    move-result-object p2

    new-instance p3, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    const/4 v3, 0x0

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/cc0;->j()Lcom/google/android/gms/internal/ads/t70;

    move-result-object v4

    const/4 v5, 0x0

    new-instance v6, Lcom/google/android/gms/internal/ads/fo;

    const/4 p4, 0x0

    invoke-direct {v6, p4, p4, p4}, Lcom/google/android/gms/internal/ads/fo;-><init>(IIZ)V

    move-object v1, p3

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;-><init>(Lcom/google/android/gms/ads/internal/overlay/d;Lcom/google/android/gms/internal/ads/jm2;Lcom/google/android/gms/ads/internal/overlay/o;Lcom/google/android/gms/ads/internal/overlay/t;Lcom/google/android/gms/internal/ads/fo;)V

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/ads/ro;->b(Ljava/lang/Object;)Z

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/ju0;->d:Lcom/google/android/gms/internal/ads/gd1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/gd1;->c()V

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/cc0;->i()Lcom/google/android/gms/internal/ads/ac0;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/yn1;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p1

    :catchall_0
    move-exception p1

    const-string p2, "Error in CustomTabsAdRenderer"

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/ads/co;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1
.end method

.method public final a(Lcom/google/android/gms/internal/ads/vd1;Lcom/google/android/gms/internal/ads/id1;)Lcom/google/android/gms/internal/ads/lo1;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/vd1;",
            "Lcom/google/android/gms/internal/ads/id1;",
            ")",
            "Lcom/google/android/gms/internal/ads/lo1<",
            "Lcom/google/android/gms/internal/ads/ac0;",
            ">;"
        }
    .end annotation

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/ju0;->a(Lcom/google/android/gms/internal/ads/id1;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/yn1;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/ads/mu0;

    invoke-direct {v2, p0, v0, p1, p2}, Lcom/google/android/gms/internal/ads/mu0;-><init>(Lcom/google/android/gms/internal/ads/ju0;Landroid/net/Uri;Lcom/google/android/gms/internal/ads/vd1;Lcom/google/android/gms/internal/ads/id1;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/ju0;->c:Ljava/util/concurrent/Executor;

    invoke-static {v1, v2, p1}, Lcom/google/android/gms/internal/ads/yn1;->a(Lcom/google/android/gms/internal/ads/lo1;Lcom/google/android/gms/internal/ads/ln1;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lcom/google/android/gms/internal/ads/vd1;Lcom/google/android/gms/internal/ads/id1;)Z
    .locals 0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/ju0;->a:Landroid/content/Context;

    instance-of p1, p1, Landroid/app/Activity;

    if-eqz p1, :cond_0

    invoke-static {}, Lcom/google/android/gms/common/util/l;->b()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/ju0;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/y;->a(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/ju0;->a(Lcom/google/android/gms/internal/ads/id1;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
