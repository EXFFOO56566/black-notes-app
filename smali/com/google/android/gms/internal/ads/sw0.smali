.class public final Lcom/google/android/gms/internal/ads/sw0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/ln1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<AdT:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/ln1<",
        "Lcom/google/android/gms/internal/ads/vd1;",
        "TAdT;>;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/sh1;

.field private final b:Lcom/google/android/gms/internal/ads/y50;

.field private final c:Lcom/google/android/gms/internal/ads/ci1;

.field private final d:Ljava/util/concurrent/Executor;

.field private final e:Ljava/util/concurrent/ScheduledExecutorService;

.field private final f:Lcom/google/android/gms/internal/ads/p20;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/p20<",
            "TAdT;>;"
        }
    .end annotation
.end field

.field private final g:Lcom/google/android/gms/internal/ads/lw0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/sh1;Lcom/google/android/gms/internal/ads/lw0;Lcom/google/android/gms/internal/ads/y50;Lcom/google/android/gms/internal/ads/ci1;Lcom/google/android/gms/internal/ads/p20;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/sh1;",
            "Lcom/google/android/gms/internal/ads/lw0;",
            "Lcom/google/android/gms/internal/ads/y50;",
            "Lcom/google/android/gms/internal/ads/ci1;",
            "Lcom/google/android/gms/internal/ads/p20<",
            "TAdT;>;",
            "Ljava/util/concurrent/Executor;",
            "Ljava/util/concurrent/ScheduledExecutorService;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/sw0;->a:Lcom/google/android/gms/internal/ads/sh1;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/sw0;->g:Lcom/google/android/gms/internal/ads/lw0;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/sw0;->b:Lcom/google/android/gms/internal/ads/y50;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/sw0;->c:Lcom/google/android/gms/internal/ads/ci1;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/sw0;->f:Lcom/google/android/gms/internal/ads/p20;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/sw0;->d:Ljava/util/concurrent/Executor;

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/sw0;->e:Ljava/util/concurrent/ScheduledExecutorService;

    return-void
.end method


# virtual methods
.method final synthetic a(Lcom/google/android/gms/internal/ads/vd1;Lcom/google/android/gms/internal/ads/id1;Lcom/google/android/gms/internal/ads/jt0;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/lo1;
    .locals 4

    iget-object p4, p0, Lcom/google/android/gms/internal/ads/sw0;->g:Lcom/google/android/gms/internal/ads/lw0;

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/vd1;->b:Lcom/google/android/gms/internal/ads/sd1;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/sd1;->b:Lcom/google/android/gms/internal/ads/kd1;

    invoke-interface {p3, p1, p2}, Lcom/google/android/gms/internal/ads/jt0;->a(Lcom/google/android/gms/internal/ads/vd1;Lcom/google/android/gms/internal/ads/id1;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    iget p3, p2, Lcom/google/android/gms/internal/ads/id1;->I:I

    int-to-long v1, p3

    sget-object p3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/sw0;->e:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-static {p1, v1, v2, p3, v3}, Lcom/google/android/gms/internal/ads/yn1;->a(Lcom/google/android/gms/internal/ads/lo1;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    invoke-virtual {p4, v0, p2, p1}, Lcom/google/android/gms/internal/ads/lw0;->a(Lcom/google/android/gms/internal/ads/kd1;Lcom/google/android/gms/internal/ads/id1;Lcom/google/android/gms/internal/ads/lo1;)Lcom/google/android/gms/internal/ads/lo1;

    return-object p1
.end method

.method public final synthetic a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/lo1;
    .locals 8

    check-cast p1, Lcom/google/android/gms/internal/ads/vd1;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sw0;->a:Lcom/google/android/gms/internal/ads/sh1;

    sget-object v1, Lcom/google/android/gms/internal/ads/ph1;->n:Lcom/google/android/gms/internal/ads/ph1;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/eh1;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/ih1;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/pw0;

    const-string v2, "No ad configs"

    const/4 v3, 0x3

    invoke-direct {v1, v2, v3}, Lcom/google/android/gms/internal/ads/pw0;-><init>(Ljava/lang/String;I)V

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/yn1;->a(Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/ih1;->a(Lcom/google/android/gms/internal/ads/lo1;)Lcom/google/android/gms/internal/ads/kh1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/kh1;->a()Lcom/google/android/gms/internal/ads/bh1;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/sw0;->b:Lcom/google/android/gms/internal/ads/y50;

    new-instance v2, Lcom/google/android/gms/internal/ads/uy;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/sw0;->c:Lcom/google/android/gms/internal/ads/ci1;

    invoke-direct {v2, p1, v3}, Lcom/google/android/gms/internal/ads/uy;-><init>(Lcom/google/android/gms/internal/ads/vd1;Lcom/google/android/gms/internal/ads/ci1;)V

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/sw0;->d:Ljava/util/concurrent/Executor;

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/ads/j90;->a(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    iget-object v1, p1, Lcom/google/android/gms/internal/ads/vd1;->b:Lcom/google/android/gms/internal/ads/sd1;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/sd1;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/ads/id1;

    iget-object v4, v3, Lcom/google/android/gms/internal/ads/id1;->a:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/sw0;->f:Lcom/google/android/gms/internal/ads/p20;

    iget v7, v3, Lcom/google/android/gms/internal/ads/id1;->b:I

    invoke-interface {v6, v7, v5}, Lcom/google/android/gms/internal/ads/p20;->a(ILjava/lang/String;)Lcom/google/android/gms/internal/ads/jt0;

    move-result-object v6

    if-eqz v6, :cond_0

    invoke-interface {v6, p1, v3}, Lcom/google/android/gms/internal/ads/jt0;->b(Lcom/google/android/gms/internal/ads/vd1;Lcom/google/android/gms/internal/ads/id1;)Z

    move-result v7

    if-eqz v7, :cond_0

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/sw0;->a:Lcom/google/android/gms/internal/ads/sh1;

    sget-object v7, Lcom/google/android/gms/internal/ads/ph1;->o:Lcom/google/android/gms/internal/ads/ph1;

    invoke-virtual {v4, v7, v0}, Lcom/google/android/gms/internal/ads/eh1;->a(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/lo1;)Lcom/google/android/gms/internal/ads/kh1;

    move-result-object v0

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, 0x1a

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v4, "render-config-"

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, "-"

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/ads/kh1;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/kh1;

    move-result-object v0

    const-class v4, Ljava/lang/Throwable;

    new-instance v5, Lcom/google/android/gms/internal/ads/rw0;

    invoke-direct {v5, p0, p1, v3, v6}, Lcom/google/android/gms/internal/ads/rw0;-><init>(Lcom/google/android/gms/internal/ads/sw0;Lcom/google/android/gms/internal/ads/vd1;Lcom/google/android/gms/internal/ads/id1;Lcom/google/android/gms/internal/ads/jt0;)V

    invoke-virtual {v0, v4, v5}, Lcom/google/android/gms/internal/ads/kh1;->a(Ljava/lang/Class;Lcom/google/android/gms/internal/ads/ln1;)Lcom/google/android/gms/internal/ads/kh1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/kh1;->a()Lcom/google/android/gms/internal/ads/bh1;

    move-result-object v0

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-object v0
.end method
