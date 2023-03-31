.class public final Lcom/google/android/gms/internal/ads/i01;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/d01;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/d01<",
        "Lcom/google/android/gms/internal/ads/k20;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/be1;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private final b:Lcom/google/android/gms/internal/ads/kv;

.field private final c:Landroid/content/Context;

.field private final d:Lcom/google/android/gms/internal/ads/b01;

.field private e:Lcom/google/android/gms/internal/ads/y20;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/kv;Landroid/content/Context;Lcom/google/android/gms/internal/ads/b01;Lcom/google/android/gms/internal/ads/be1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/i01;->b:Lcom/google/android/gms/internal/ads/kv;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/i01;->c:Landroid/content/Context;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/i01;->d:Lcom/google/android/gms/internal/ads/b01;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/i01;->a:Lcom/google/android/gms/internal/ads/be1;

    return-void
.end method


# virtual methods
.method final synthetic a()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/i01;->d:Lcom/google/android/gms/internal/ads/b01;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/b01;->d()Lcom/google/android/gms/internal/ads/a60;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/a60;->a(I)V

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/rm2;Ljava/lang/String;Lcom/google/android/gms/internal/ads/c01;Lcom/google/android/gms/internal/ads/f01;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/rm2;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/ads/c01;",
            "Lcom/google/android/gms/internal/ads/f01<",
            "-",
            "Lcom/google/android/gms/internal/ads/k20;",
            ">;)Z"
        }
    .end annotation

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->c()Lcom/google/android/gms/internal/ads/gl;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/i01;->c:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/gl;->p(Landroid/content/Context;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/rm2;->t:Lcom/google/android/gms/internal/ads/lm2;

    if-nez v0, :cond_0

    const-string p1, "Failed to load the ad because app ID is missing."

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/co;->b(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/i01;->b:Lcom/google/android/gms/internal/ads/kv;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/kv;->a()Ljava/util/concurrent/Executor;

    move-result-object p1

    new-instance p2, Lcom/google/android/gms/internal/ads/h01;

    invoke-direct {p2, p0}, Lcom/google/android/gms/internal/ads/h01;-><init>(Lcom/google/android/gms/internal/ads/i01;)V

    :goto_0
    invoke-interface {p1, p2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return v1

    :cond_0
    if-nez p2, :cond_1

    const-string p1, "Ad unit ID should not be null for NativeAdLoader."

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/co;->b(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/i01;->b:Lcom/google/android/gms/internal/ads/kv;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/kv;->a()Ljava/util/concurrent/Executor;

    move-result-object p1

    new-instance p2, Lcom/google/android/gms/internal/ads/k01;

    invoke-direct {p2, p0}, Lcom/google/android/gms/internal/ads/k01;-><init>(Lcom/google/android/gms/internal/ads/i01;)V

    goto :goto_0

    :cond_1
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/i01;->c:Landroid/content/Context;

    iget-boolean v0, p1, Lcom/google/android/gms/internal/ads/rm2;->g:Z

    invoke-static {p2, v0}, Lcom/google/android/gms/internal/ads/ie1;->a(Landroid/content/Context;Z)V

    instance-of p2, p3, Lcom/google/android/gms/internal/ads/e01;

    const/4 v0, 0x1

    if-eqz p2, :cond_2

    check-cast p3, Lcom/google/android/gms/internal/ads/e01;

    iget p2, p3, Lcom/google/android/gms/internal/ads/e01;->a:I

    goto :goto_1

    :cond_2
    const/4 p2, 0x1

    :goto_1
    iget-object p3, p0, Lcom/google/android/gms/internal/ads/i01;->a:Lcom/google/android/gms/internal/ads/be1;

    invoke-virtual {p3, p1}, Lcom/google/android/gms/internal/ads/be1;->a(Lcom/google/android/gms/internal/ads/rm2;)Lcom/google/android/gms/internal/ads/be1;

    invoke-virtual {p3, p2}, Lcom/google/android/gms/internal/ads/be1;->a(I)Lcom/google/android/gms/internal/ads/be1;

    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/be1;->d()Lcom/google/android/gms/internal/ads/zd1;

    move-result-object p1

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/i01;->b:Lcom/google/android/gms/internal/ads/kv;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/kv;->l()Lcom/google/android/gms/internal/ads/yd0;

    move-result-object p2

    new-instance p3, Lcom/google/android/gms/internal/ads/g50$a;

    invoke-direct {p3}, Lcom/google/android/gms/internal/ads/g50$a;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/i01;->c:Landroid/content/Context;

    invoke-virtual {p3, v1}, Lcom/google/android/gms/internal/ads/g50$a;->a(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/g50$a;

    invoke-virtual {p3, p1}, Lcom/google/android/gms/internal/ads/g50$a;->a(Lcom/google/android/gms/internal/ads/zd1;)Lcom/google/android/gms/internal/ads/g50$a;

    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/g50$a;->a()Lcom/google/android/gms/internal/ads/g50;

    move-result-object p3

    invoke-interface {p2, p3}, Lcom/google/android/gms/internal/ads/yd0;->a(Lcom/google/android/gms/internal/ads/g50;)Lcom/google/android/gms/internal/ads/yd0;

    new-instance p3, Lcom/google/android/gms/internal/ads/k90$a;

    invoke-direct {p3}, Lcom/google/android/gms/internal/ads/k90$a;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/i01;->d:Lcom/google/android/gms/internal/ads/b01;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/b01;->c()Lcom/google/android/gms/internal/ads/l70;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/i01;->b:Lcom/google/android/gms/internal/ads/kv;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/kv;->a()Ljava/util/concurrent/Executor;

    move-result-object v2

    invoke-virtual {p3, v1, v2}, Lcom/google/android/gms/internal/ads/k90$a;->a(Lcom/google/android/gms/internal/ads/l70;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/k90$a;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/i01;->d:Lcom/google/android/gms/internal/ads/b01;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/b01;->d()Lcom/google/android/gms/internal/ads/a60;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/i01;->b:Lcom/google/android/gms/internal/ads/kv;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/kv;->a()Ljava/util/concurrent/Executor;

    move-result-object v2

    invoke-virtual {p3, v1, v2}, Lcom/google/android/gms/internal/ads/k90$a;->a(Lcom/google/android/gms/internal/ads/a60;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/k90$a;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/i01;->d:Lcom/google/android/gms/internal/ads/b01;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/b01;->e()Lcom/google/android/gms/internal/ads/n60;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/i01;->b:Lcom/google/android/gms/internal/ads/kv;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/kv;->a()Ljava/util/concurrent/Executor;

    move-result-object v2

    invoke-virtual {p3, v1, v2}, Lcom/google/android/gms/internal/ads/k90$a;->a(Lcom/google/android/gms/internal/ads/n60;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/k90$a;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/i01;->d:Lcom/google/android/gms/internal/ads/b01;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/b01;->f()Lcom/google/android/gms/internal/ads/jm2;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/i01;->b:Lcom/google/android/gms/internal/ads/kv;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/kv;->a()Ljava/util/concurrent/Executor;

    move-result-object v2

    invoke-virtual {p3, v1, v2}, Lcom/google/android/gms/internal/ads/k90$a;->a(Lcom/google/android/gms/internal/ads/jm2;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/k90$a;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/i01;->d:Lcom/google/android/gms/internal/ads/b01;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/b01;->b()Lcom/google/android/gms/internal/ads/u50;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/i01;->b:Lcom/google/android/gms/internal/ads/kv;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/kv;->a()Ljava/util/concurrent/Executor;

    move-result-object v2

    invoke-virtual {p3, v1, v2}, Lcom/google/android/gms/internal/ads/k90$a;->a(Lcom/google/android/gms/internal/ads/u50;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/k90$a;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zd1;->m:Lcom/google/android/gms/internal/ads/no2;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/i01;->b:Lcom/google/android/gms/internal/ads/kv;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/kv;->a()Ljava/util/concurrent/Executor;

    move-result-object v1

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/ads/k90$a;->a(Lcom/google/android/gms/internal/ads/no2;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/k90$a;

    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/k90$a;->a()Lcom/google/android/gms/internal/ads/k90;

    move-result-object p1

    invoke-interface {p2, p1}, Lcom/google/android/gms/internal/ads/yd0;->e(Lcom/google/android/gms/internal/ads/k90;)Lcom/google/android/gms/internal/ads/yd0;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/i01;->d:Lcom/google/android/gms/internal/ads/b01;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/b01;->a()Lcom/google/android/gms/internal/ads/vd0;

    move-result-object p1

    invoke-interface {p2, p1}, Lcom/google/android/gms/internal/ads/yd0;->b(Lcom/google/android/gms/internal/ads/vd0;)Lcom/google/android/gms/internal/ads/yd0;

    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/yd0;->c()Lcom/google/android/gms/internal/ads/zd0;

    move-result-object p1

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/i01;->b:Lcom/google/android/gms/internal/ads/kv;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/kv;->p()Lcom/google/android/gms/internal/ads/ke1;

    move-result-object p2

    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/ads/ke1;->a(I)V

    new-instance p2, Lcom/google/android/gms/internal/ads/y20;

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/i01;->b:Lcom/google/android/gms/internal/ads/kv;

    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/kv;->c()Ljava/util/concurrent/Executor;

    move-result-object p3

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/i01;->b:Lcom/google/android/gms/internal/ads/kv;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/kv;->b()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zd0;->a()Lcom/google/android/gms/internal/ads/l30;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/l30;->b()Lcom/google/android/gms/internal/ads/lo1;

    move-result-object v2

    invoke-direct {p2, p3, v1, v2}, Lcom/google/android/gms/internal/ads/y20;-><init>(Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;Lcom/google/android/gms/internal/ads/lo1;)V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/i01;->e:Lcom/google/android/gms/internal/ads/y20;

    new-instance p3, Lcom/google/android/gms/internal/ads/j01;

    invoke-direct {p3, p0, p4, p1}, Lcom/google/android/gms/internal/ads/j01;-><init>(Lcom/google/android/gms/internal/ads/i01;Lcom/google/android/gms/internal/ads/f01;Lcom/google/android/gms/internal/ads/zd0;)V

    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/ads/y20;->a(Lcom/google/android/gms/internal/ads/zn1;)V

    return v0
.end method

.method final synthetic b()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/i01;->d:Lcom/google/android/gms/internal/ads/b01;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/b01;->d()Lcom/google/android/gms/internal/ads/a60;

    move-result-object v0

    const/16 v1, 0x8

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/a60;->a(I)V

    return-void
.end method

.method public final u()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/i01;->e:Lcom/google/android/gms/internal/ads/y20;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/y20;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
