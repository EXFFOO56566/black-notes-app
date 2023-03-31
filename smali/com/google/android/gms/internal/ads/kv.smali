.class public abstract Lcom/google/android/gms/internal/ads/kv;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/jy;


# static fields
.field private static a:Lcom/google/android/gms/internal/ads/kv;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "AppComponent.class"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;I)Lcom/google/android/gms/internal/ads/kv;
    .locals 4
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-class v0, Lcom/google/android/gms/internal/ads/kv;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/google/android/gms/internal/ads/kv;->a:Lcom/google/android/gms/internal/ads/kv;

    if-eqz v1, :cond_0

    sget-object p0, Lcom/google/android/gms/internal/ads/kv;->a:Lcom/google/android/gms/internal/ads/kv;

    monitor-exit v0

    return-object p0

    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    new-instance v0, Lcom/google/android/gms/internal/ads/fo;

    const v1, 0xbfb13e0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v0, v1, p1, v2, v3}, Lcom/google/android/gms/internal/ads/fo;-><init>(IIZZ)V

    new-instance p1, Lcom/google/android/gms/internal/ads/fw;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/fw;-><init>()V

    invoke-static {v0, p0, p1}, Lcom/google/android/gms/internal/ads/kv;->a(Lcom/google/android/gms/internal/ads/fo;Landroid/content/Context;Lcom/google/android/gms/internal/ads/ix$a;)Lcom/google/android/gms/internal/ads/kv;

    move-result-object p0

    return-object p0

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static a(Landroid/content/Context;Lcom/google/android/gms/internal/ads/ra;I)Lcom/google/android/gms/internal/ads/kv;
    .locals 0

    invoke-static {p0, p2}, Lcom/google/android/gms/internal/ads/kv;->a(Landroid/content/Context;I)Lcom/google/android/gms/internal/ads/kv;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/kv;->f()Lcom/google/android/gms/internal/ads/rl0;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/rl0;->a(Lcom/google/android/gms/internal/ads/ra;)V

    return-object p0
.end method

.method private static a(Lcom/google/android/gms/internal/ads/fo;Landroid/content/Context;Lcom/google/android/gms/internal/ads/ix$a;)Lcom/google/android/gms/internal/ads/kv;
    .locals 5
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-class v0, Lcom/google/android/gms/internal/ads/kv;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/google/android/gms/internal/ads/kv;->a:Lcom/google/android/gms/internal/ads/kv;

    if-nez v1, :cond_0

    new-instance v1, Lcom/google/android/gms/internal/ads/zw;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/ads/zw;-><init>(Lcom/google/android/gms/internal/ads/hw;)V

    new-instance v3, Lcom/google/android/gms/internal/ads/nv$a;

    invoke-direct {v3}, Lcom/google/android/gms/internal/ads/nv$a;-><init>()V

    invoke-virtual {v3, p0}, Lcom/google/android/gms/internal/ads/nv$a;->a(Lcom/google/android/gms/internal/ads/fo;)Lcom/google/android/gms/internal/ads/nv$a;

    invoke-virtual {v3, p1}, Lcom/google/android/gms/internal/ads/nv$a;->a(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/nv$a;

    new-instance v4, Lcom/google/android/gms/internal/ads/nv;

    invoke-direct {v4, v3, v2}, Lcom/google/android/gms/internal/ads/nv;-><init>(Lcom/google/android/gms/internal/ads/nv$a;Lcom/google/android/gms/internal/ads/mv;)V

    invoke-virtual {v1, v4}, Lcom/google/android/gms/internal/ads/zw;->a(Lcom/google/android/gms/internal/ads/nv;)Lcom/google/android/gms/internal/ads/zw;

    new-instance v2, Lcom/google/android/gms/internal/ads/ix;

    invoke-direct {v2, p2}, Lcom/google/android/gms/internal/ads/ix;-><init>(Lcom/google/android/gms/internal/ads/ix$a;)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zw;->a(Lcom/google/android/gms/internal/ads/ix;)Lcom/google/android/gms/internal/ads/zw;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zw;->a()Lcom/google/android/gms/internal/ads/kv;

    move-result-object p2

    sput-object p2, Lcom/google/android/gms/internal/ads/kv;->a:Lcom/google/android/gms/internal/ads/kv;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zr2;->a(Landroid/content/Context;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->g()Lcom/google/android/gms/internal/ads/ik;

    move-result-object p2

    invoke-virtual {p2, p1, p0}, Lcom/google/android/gms/internal/ads/ik;->a(Landroid/content/Context;Lcom/google/android/gms/internal/ads/fo;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->i()Lcom/google/android/gms/internal/ads/zi2;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/zi2;->a(Landroid/content/Context;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->c()Lcom/google/android/gms/internal/ads/gl;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/gl;->a(Landroid/content/Context;)Z

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->c()Lcom/google/android/gms/internal/ads/gl;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/gl;->b(Landroid/content/Context;)Z

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/uk;->a(Landroid/content/Context;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->f()Lcom/google/android/gms/internal/ads/sh2;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/sh2;->a(Landroid/content/Context;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->x()Lcom/google/android/gms/internal/ads/on;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/on;->a(Landroid/content/Context;)V

    sget-object p2, Lcom/google/android/gms/internal/ads/zr2;->Z2:Lcom/google/android/gms/internal/ads/kr2;

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->e()Lcom/google/android/gms/internal/ads/vr2;

    move-result-object v1

    invoke-virtual {v1, p2}, Lcom/google/android/gms/internal/ads/vr2;->a(Lcom/google/android/gms/internal/ads/kr2;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_0

    new-instance p2, Lcom/google/android/gms/internal/ads/ft0;

    new-instance v1, Lcom/google/android/gms/internal/ads/wj2;

    new-instance v2, Lcom/google/android/gms/internal/ads/ak2;

    invoke-direct {v2, p1}, Lcom/google/android/gms/internal/ads/ak2;-><init>(Landroid/content/Context;)V

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/ads/wj2;-><init>(Lcom/google/android/gms/internal/ads/ak2;)V

    new-instance v2, Lcom/google/android/gms/internal/ads/os0;

    new-instance v3, Lcom/google/android/gms/internal/ads/ms0;

    invoke-direct {v3, p1}, Lcom/google/android/gms/internal/ads/ms0;-><init>(Landroid/content/Context;)V

    sget-object v4, Lcom/google/android/gms/internal/ads/kv;->a:Lcom/google/android/gms/internal/ads/kv;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/kv;->d()Lcom/google/android/gms/internal/ads/ko1;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/google/android/gms/internal/ads/os0;-><init>(Lcom/google/android/gms/internal/ads/ms0;Lcom/google/android/gms/internal/ads/ko1;)V

    invoke-direct {p2, p1, p0, v1, v2}, Lcom/google/android/gms/internal/ads/ft0;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/fo;Lcom/google/android/gms/internal/ads/wj2;Lcom/google/android/gms/internal/ads/os0;)V

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/ft0;->a()V

    :cond_0
    sget-object p0, Lcom/google/android/gms/internal/ads/kv;->a:Lcom/google/android/gms/internal/ads/kv;

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method


# virtual methods
.method protected abstract a(Lcom/google/android/gms/internal/ads/b91;)Lcom/google/android/gms/internal/ads/r71;
.end method

.method public final a(Lcom/google/android/gms/internal/ads/zf;I)Lcom/google/android/gms/internal/ads/r71;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/b91;

    invoke-direct {v0, p1, p2}, Lcom/google/android/gms/internal/ads/b91;-><init>(Lcom/google/android/gms/internal/ads/zf;I)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/kv;->a(Lcom/google/android/gms/internal/ads/b91;)Lcom/google/android/gms/internal/ads/r71;

    move-result-object p1

    return-object p1
.end method

.method public abstract a()Ljava/util/concurrent/Executor;
.end method

.method public abstract b()Ljava/util/concurrent/ScheduledExecutorService;
.end method

.method public abstract c()Ljava/util/concurrent/Executor;
.end method

.method public abstract d()Lcom/google/android/gms/internal/ads/ko1;
.end method

.method public abstract e()Lcom/google/android/gms/internal/ads/e80;
.end method

.method public abstract f()Lcom/google/android/gms/internal/ads/rl0;
.end method

.method public abstract g()Lcom/google/android/gms/internal/ads/ox;
.end method

.method public abstract h()Lcom/google/android/gms/internal/ads/j10;
.end method

.method public abstract i()Lcom/google/android/gms/internal/ads/a00;
.end method

.method public abstract j()Lcom/google/android/gms/internal/ads/fa1;
.end method

.method public abstract k()Lcom/google/android/gms/internal/ads/zc0;
.end method

.method public abstract l()Lcom/google/android/gms/internal/ads/yd0;
.end method

.method public abstract m()Lcom/google/android/gms/internal/ads/ik0;
.end method

.method public abstract n()Lcom/google/android/gms/internal/ads/zc1;
.end method

.method public abstract o()Lcom/google/android/gms/internal/ads/l01;
.end method

.method public abstract p()Lcom/google/android/gms/internal/ads/ke1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/internal/ads/ke1<",
            "Lcom/google/android/gms/internal/ads/jj0;",
            ">;"
        }
    .end annotation
.end method
