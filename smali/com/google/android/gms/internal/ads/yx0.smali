.class public final Lcom/google/android/gms/internal/ads/yx0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/jt0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<AdT:",
        "Ljava/lang/Object;",
        "AdapterT:",
        "Ljava/lang/Object;",
        "ListenerT::Lcom/google/android/gms/internal/ads/e70;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/jt0<",
        "TAdT;>;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/kt0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/kt0<",
            "TAdapterT;T",
            "ListenerT;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lcom/google/android/gms/internal/ads/mt0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/mt0<",
            "TAdT;TAdapterT;T",
            "ListenerT;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lcom/google/android/gms/internal/ads/sh1;

.field private final d:Lcom/google/android/gms/internal/ads/ko1;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/sh1;Lcom/google/android/gms/internal/ads/ko1;Lcom/google/android/gms/internal/ads/kt0;Lcom/google/android/gms/internal/ads/mt0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/sh1;",
            "Lcom/google/android/gms/internal/ads/ko1;",
            "Lcom/google/android/gms/internal/ads/kt0<",
            "TAdapterT;T",
            "ListenerT;",
            ">;",
            "Lcom/google/android/gms/internal/ads/mt0<",
            "TAdT;TAdapterT;T",
            "ListenerT;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/yx0;->c:Lcom/google/android/gms/internal/ads/sh1;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/yx0;->d:Lcom/google/android/gms/internal/ads/ko1;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/yx0;->b:Lcom/google/android/gms/internal/ads/mt0;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/yx0;->a:Lcom/google/android/gms/internal/ads/kt0;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/vd1;Lcom/google/android/gms/internal/ads/id1;)Lcom/google/android/gms/internal/ads/lo1;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/vd1;",
            "Lcom/google/android/gms/internal/ads/id1;",
            ")",
            "Lcom/google/android/gms/internal/ads/lo1<",
            "TAdT;>;"
        }
    .end annotation

    const-class v0, Lcom/google/ads/mediation/admob/AdMobAdapter;

    iget-object v1, p2, Lcom/google/android/gms/internal/ads/id1;->q:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    :try_start_0
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/yx0;->a:Lcom/google/android/gms/internal/ads/kt0;

    iget-object v4, p2, Lcom/google/android/gms/internal/ads/id1;->s:Lorg/json/JSONObject;

    invoke-interface {v3, v2, v4}, Lcom/google/android/gms/internal/ads/kt0;->a(Ljava/lang/String;Lorg/json/JSONObject;)Lcom/google/android/gms/internal/ads/lt0;

    move-result-object v1
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/fe1; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    nop

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_1
    if-nez v1, :cond_1

    new-instance p1, Lcom/google/android/gms/internal/ads/aw0;

    const-string p2, "unable to instantiate mediation adapter class"

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/aw0;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/yn1;->a(Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance v2, Lcom/google/android/gms/internal/ads/ro;

    invoke-direct {v2}, Lcom/google/android/gms/internal/ads/ro;-><init>()V

    new-instance v3, Lcom/google/android/gms/internal/ads/dy0;

    invoke-direct {v3, p0, v2}, Lcom/google/android/gms/internal/ads/dy0;-><init>(Lcom/google/android/gms/internal/ads/yx0;Lcom/google/android/gms/internal/ads/ro;)V

    iget-object v4, v1, Lcom/google/android/gms/internal/ads/lt0;->c:Lcom/google/android/gms/internal/ads/e70;

    invoke-interface {v4, v3}, Lcom/google/android/gms/internal/ads/e70;->a(Lcom/google/android/gms/internal/ads/h70;)V

    iget-boolean v3, p2, Lcom/google/android/gms/internal/ads/id1;->E:Z

    if-eqz v3, :cond_3

    iget-object v3, p1, Lcom/google/android/gms/internal/ads/vd1;->a:Lcom/google/android/gms/internal/ads/pd1;

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/pd1;->a:Lcom/google/android/gms/internal/ads/zd1;

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/zd1;->d:Lcom/google/android/gms/internal/ads/rm2;

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/rm2;->n:Landroid/os/Bundle;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v4

    if-nez v4, :cond_2

    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0, v4}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_2
    const/4 v0, 0x1

    const-string v3, "render_test_ad_label"

    invoke-virtual {v4, v3, v0}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/yx0;->c:Lcom/google/android/gms/internal/ads/sh1;

    sget-object v3, Lcom/google/android/gms/internal/ads/ph1;->p:Lcom/google/android/gms/internal/ads/ph1;

    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/ads/eh1;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/ih1;

    move-result-object v0

    new-instance v3, Lcom/google/android/gms/internal/ads/by0;

    invoke-direct {v3, p0, p1, p2, v1}, Lcom/google/android/gms/internal/ads/by0;-><init>(Lcom/google/android/gms/internal/ads/yx0;Lcom/google/android/gms/internal/ads/vd1;Lcom/google/android/gms/internal/ads/id1;Lcom/google/android/gms/internal/ads/lt0;)V

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/yx0;->d:Lcom/google/android/gms/internal/ads/ko1;

    invoke-virtual {v0, v3, v4}, Lcom/google/android/gms/internal/ads/ih1;->a(Lcom/google/android/gms/internal/ads/ch1;Lcom/google/android/gms/internal/ads/ko1;)Lcom/google/android/gms/internal/ads/kh1;

    move-result-object v0

    sget-object v3, Lcom/google/android/gms/internal/ads/ph1;->q:Lcom/google/android/gms/internal/ads/ph1;

    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/ads/kh1;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/kh1;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/kh1;->a(Lcom/google/android/gms/internal/ads/lo1;)Lcom/google/android/gms/internal/ads/kh1;

    move-result-object v0

    sget-object v2, Lcom/google/android/gms/internal/ads/ph1;->r:Lcom/google/android/gms/internal/ads/ph1;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/kh1;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/kh1;

    move-result-object v0

    new-instance v2, Lcom/google/android/gms/internal/ads/ay0;

    invoke-direct {v2, p0, p1, p2, v1}, Lcom/google/android/gms/internal/ads/ay0;-><init>(Lcom/google/android/gms/internal/ads/yx0;Lcom/google/android/gms/internal/ads/vd1;Lcom/google/android/gms/internal/ads/id1;Lcom/google/android/gms/internal/ads/lt0;)V

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/kh1;->a(Lcom/google/android/gms/internal/ads/zg1;)Lcom/google/android/gms/internal/ads/kh1;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/kh1;->a()Lcom/google/android/gms/internal/ads/bh1;

    move-result-object p1

    return-object p1
.end method

.method final synthetic a(Lcom/google/android/gms/internal/ads/vd1;Lcom/google/android/gms/internal/ads/id1;Lcom/google/android/gms/internal/ads/lt0;Ljava/lang/Void;)Ljava/lang/Object;
    .locals 0

    iget-object p4, p0, Lcom/google/android/gms/internal/ads/yx0;->b:Lcom/google/android/gms/internal/ads/mt0;

    invoke-interface {p4, p1, p2, p3}, Lcom/google/android/gms/internal/ads/mt0;->b(Lcom/google/android/gms/internal/ads/vd1;Lcom/google/android/gms/internal/ads/id1;Lcom/google/android/gms/internal/ads/lt0;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method final synthetic a(Lcom/google/android/gms/internal/ads/vd1;Lcom/google/android/gms/internal/ads/id1;Lcom/google/android/gms/internal/ads/lt0;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/yx0;->b:Lcom/google/android/gms/internal/ads/mt0;

    invoke-interface {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/mt0;->a(Lcom/google/android/gms/internal/ads/vd1;Lcom/google/android/gms/internal/ads/id1;Lcom/google/android/gms/internal/ads/lt0;)V

    return-void
.end method

.method public final b(Lcom/google/android/gms/internal/ads/vd1;Lcom/google/android/gms/internal/ads/id1;)Z
    .locals 0

    iget-object p1, p2, Lcom/google/android/gms/internal/ads/id1;->q:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
