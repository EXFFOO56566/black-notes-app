.class public final Lcom/google/android/gms/internal/ads/t7;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/m7;
.implements Lcom/google/android/gms/internal/ads/r7;


# annotations
.annotation runtime Ljavax/annotation/ParametersAreNonnullByDefault;
.end annotation


# instance fields
.field private final b:Lcom/google/android/gms/internal/ads/ws;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/fo;Lcom/google/android/gms/internal/ads/eq1;Lcom/google/android/gms/ads/internal/a;)V
    .locals 13

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->d()Lcom/google/android/gms/internal/ads/et;

    invoke-static {}, Lcom/google/android/gms/internal/ads/lu;->f()Lcom/google/android/gms/internal/ads/lu;

    move-result-object v1

    invoke-static {}, Lcom/google/android/gms/internal/ads/wj2;->a()Lcom/google/android/gms/internal/ads/wj2;

    move-result-object v10

    const-string v2, ""

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v0, p1

    move-object/from16 v5, p3

    move-object v6, p2

    invoke-static/range {v0 .. v12}, Lcom/google/android/gms/internal/ads/et;->a(Landroid/content/Context;Lcom/google/android/gms/internal/ads/lu;Ljava/lang/String;ZZLcom/google/android/gms/internal/ads/eq1;Lcom/google/android/gms/internal/ads/fo;Lcom/google/android/gms/internal/ads/o;Lcom/google/android/gms/ads/internal/i;Lcom/google/android/gms/ads/internal/a;Lcom/google/android/gms/internal/ads/wj2;Lcom/google/android/gms/internal/ads/yi2;Z)Lcom/google/android/gms/internal/ads/ws;

    move-result-object v0

    move-object v1, p0

    iput-object v0, v1, Lcom/google/android/gms/internal/ads/t7;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->getView()Landroid/view/View;

    move-result-object v0

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Landroid/view/View;->setWillNotDraw(Z)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/t7;)Lcom/google/android/gms/internal/ads/ws;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/t7;->b:Lcom/google/android/gms/internal/ads/ws;

    return-object p0
.end method

.method private static a(Ljava/lang/Runnable;)V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->a()Lcom/google/android/gms/internal/ads/sn;

    invoke-static {}, Lcom/google/android/gms/internal/ads/sn;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    return-void

    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/ads/gl;->h:Lcom/google/android/gms/internal/ads/sk1;

    invoke-virtual {v0, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/u7;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/t7;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->P()Lcom/google/android/gms/internal/ads/ju;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/y7;->a(Lcom/google/android/gms/internal/ads/u7;)Lcom/google/android/gms/internal/ads/ku;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/ju;->a(Lcom/google/android/gms/internal/ads/ku;)V

    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/w7;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ads/w7;-><init>(Lcom/google/android/gms/internal/ads/t7;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/t7;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/d5;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/ads/d5<",
            "-",
            "Lcom/google/android/gms/internal/ads/e9;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/t7;->b:Lcom/google/android/gms/internal/ads/ws;

    new-instance v1, Lcom/google/android/gms/internal/ads/v7;

    invoke-direct {v1, p2}, Lcom/google/android/gms/internal/ads/v7;-><init>(Lcom/google/android/gms/internal/ads/d5;)V

    invoke-interface {v0, p1, v1}, Lcom/google/android/gms/internal/ads/ws;->a(Ljava/lang/String;Lcom/google/android/gms/common/util/m;)V

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

.method final synthetic b(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/t7;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/c8;->a(Ljava/lang/String;)V

    return-void
.end method

.method public final b(Ljava/lang/String;Lcom/google/android/gms/internal/ads/d5;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/ads/d5<",
            "-",
            "Lcom/google/android/gms/internal/ads/e9;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/t7;->b:Lcom/google/android/gms/internal/ads/ws;

    new-instance v1, Lcom/google/android/gms/internal/ads/d8;

    invoke-direct {v1, p0, p2}, Lcom/google/android/gms/internal/ads/d8;-><init>(Lcom/google/android/gms/internal/ads/t7;Lcom/google/android/gms/internal/ads/d5;)V

    invoke-interface {v0, p1, v1}, Lcom/google/android/gms/internal/ads/ws;->b(Ljava/lang/String;Lcom/google/android/gms/internal/ads/d5;)V

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

    const-string p1, "<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>"

    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Lcom/google/android/gms/internal/ads/x7;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ads/x7;-><init>(Lcom/google/android/gms/internal/ads/t7;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/t7;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final destroy()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/t7;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->destroy()V

    return-void
.end method

.method public final e(Ljava/lang/String;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/b8;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ads/b8;-><init>(Lcom/google/android/gms/internal/ads/t7;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/t7;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final e()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/t7;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->e()Z

    move-result v0

    return v0
.end method

.method public final f(Ljava/lang/String;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/a8;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ads/a8;-><init>(Lcom/google/android/gms/internal/ads/t7;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/t7;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final z()Lcom/google/android/gms/internal/ads/d9;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/g9;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/g9;-><init>(Lcom/google/android/gms/internal/ads/e9;)V

    return-object v0
.end method
