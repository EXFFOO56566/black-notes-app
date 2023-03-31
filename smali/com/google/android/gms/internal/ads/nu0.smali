.class public final Lcom/google/android/gms/internal/ads/nu0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/jt0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/jt0<",
        "Lcom/google/android/gms/internal/ads/n00;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/k10;

.field private final b:Lcom/google/android/gms/internal/ads/st0;

.field private final c:Lcom/google/android/gms/internal/ads/ko1;

.field private final d:Lcom/google/android/gms/internal/ads/y50;

.field private final e:Ljava/util/concurrent/ScheduledExecutorService;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/k10;Lcom/google/android/gms/internal/ads/st0;Lcom/google/android/gms/internal/ads/y50;Ljava/util/concurrent/ScheduledExecutorService;Lcom/google/android/gms/internal/ads/ko1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/nu0;->a:Lcom/google/android/gms/internal/ads/k10;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/nu0;->b:Lcom/google/android/gms/internal/ads/st0;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/nu0;->d:Lcom/google/android/gms/internal/ads/y50;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/nu0;->e:Ljava/util/concurrent/ScheduledExecutorService;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/nu0;->c:Lcom/google/android/gms/internal/ads/ko1;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/nu0;)Lcom/google/android/gms/internal/ads/y50;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/nu0;->d:Lcom/google/android/gms/internal/ads/y50;

    return-object p0
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/vd1;Lcom/google/android/gms/internal/ads/id1;)Lcom/google/android/gms/internal/ads/lo1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/vd1;",
            "Lcom/google/android/gms/internal/ads/id1;",
            ")",
            "Lcom/google/android/gms/internal/ads/lo1<",
            "Lcom/google/android/gms/internal/ads/n00;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/nu0;->c:Lcom/google/android/gms/internal/ads/ko1;

    new-instance v1, Lcom/google/android/gms/internal/ads/qu0;

    invoke-direct {v1, p0, p1, p2}, Lcom/google/android/gms/internal/ads/qu0;-><init>(Lcom/google/android/gms/internal/ads/nu0;Lcom/google/android/gms/internal/ads/vd1;Lcom/google/android/gms/internal/ads/id1;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/ko1;->a(Ljava/util/concurrent/Callable;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lcom/google/android/gms/internal/ads/vd1;Lcom/google/android/gms/internal/ads/id1;)Z
    .locals 1

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/vd1;->a:Lcom/google/android/gms/internal/ads/pd1;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/pd1;->a:Lcom/google/android/gms/internal/ads/zd1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zd1;->a()Lcom/google/android/gms/internal/ads/r3;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/nu0;->b:Lcom/google/android/gms/internal/ads/st0;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/st0;->b(Lcom/google/android/gms/internal/ads/vd1;Lcom/google/android/gms/internal/ads/id1;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method final synthetic c(Lcom/google/android/gms/internal/ads/vd1;Lcom/google/android/gms/internal/ads/id1;)Lcom/google/android/gms/internal/ads/n00;
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/nu0;->a:Lcom/google/android/gms/internal/ads/k10;

    new-instance v1, Lcom/google/android/gms/internal/ads/d30;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p2, v2}, Lcom/google/android/gms/internal/ads/d30;-><init>(Lcom/google/android/gms/internal/ads/vd1;Lcom/google/android/gms/internal/ads/id1;Ljava/lang/String;)V

    new-instance v2, Lcom/google/android/gms/internal/ads/z10;

    iget-object v3, p1, Lcom/google/android/gms/internal/ads/vd1;->a:Lcom/google/android/gms/internal/ads/pd1;

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/pd1;->a:Lcom/google/android/gms/internal/ads/zd1;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zd1;->a()Lcom/google/android/gms/internal/ads/r3;

    move-result-object v3

    new-instance v4, Lcom/google/android/gms/internal/ads/pu0;

    invoke-direct {v4, p0, p1, p2}, Lcom/google/android/gms/internal/ads/pu0;-><init>(Lcom/google/android/gms/internal/ads/nu0;Lcom/google/android/gms/internal/ads/vd1;Lcom/google/android/gms/internal/ads/id1;)V

    invoke-direct {v2, v3, v4}, Lcom/google/android/gms/internal/ads/z10;-><init>(Lcom/google/android/gms/internal/ads/r3;Ljava/lang/Runnable;)V

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/k10;->a(Lcom/google/android/gms/internal/ads/d30;Lcom/google/android/gms/internal/ads/z10;)Lcom/google/android/gms/internal/ads/w10;

    move-result-object p1

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/w10;->a()Lcom/google/android/gms/internal/ads/n00;

    move-result-object p1

    return-object p1
.end method

.method final synthetic d(Lcom/google/android/gms/internal/ads/vd1;Lcom/google/android/gms/internal/ads/id1;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/nu0;->b:Lcom/google/android/gms/internal/ads/st0;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/st0;->a(Lcom/google/android/gms/internal/ads/vd1;Lcom/google/android/gms/internal/ads/id1;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    iget p2, p2, Lcom/google/android/gms/internal/ads/id1;->I:I

    int-to-long v0, p2

    sget-object p2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/nu0;->e:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-static {p1, v0, v1, p2, v2}, Lcom/google/android/gms/internal/ads/yn1;->a(Lcom/google/android/gms/internal/ads/lo1;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    new-instance p2, Lcom/google/android/gms/internal/ads/su0;

    invoke-direct {p2, p0}, Lcom/google/android/gms/internal/ads/su0;-><init>(Lcom/google/android/gms/internal/ads/nu0;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/nu0;->c:Lcom/google/android/gms/internal/ads/ko1;

    invoke-static {p1, p2, v0}, Lcom/google/android/gms/internal/ads/yn1;->a(Lcom/google/android/gms/internal/ads/lo1;Lcom/google/android/gms/internal/ads/zn1;Ljava/util/concurrent/Executor;)V

    return-void
.end method
