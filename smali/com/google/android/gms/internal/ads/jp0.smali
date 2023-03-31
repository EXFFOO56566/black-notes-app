.class public final Lcom/google/android/gms/internal/ads/jp0;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/ko1;

.field private final b:Lcom/google/android/gms/internal/ads/ko1;

.field private final c:Lcom/google/android/gms/internal/ads/oq0;

.field private final d:Lcom/google/android/gms/internal/ads/l42;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/l42<",
            "Lcom/google/android/gms/internal/ads/mr0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/ko1;Lcom/google/android/gms/internal/ads/ko1;Lcom/google/android/gms/internal/ads/oq0;Lcom/google/android/gms/internal/ads/l42;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/ko1;",
            "Lcom/google/android/gms/internal/ads/ko1;",
            "Lcom/google/android/gms/internal/ads/oq0;",
            "Lcom/google/android/gms/internal/ads/l42<",
            "Lcom/google/android/gms/internal/ads/mr0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/jp0;->a:Lcom/google/android/gms/internal/ads/ko1;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/jp0;->b:Lcom/google/android/gms/internal/ads/ko1;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/jp0;->c:Lcom/google/android/gms/internal/ads/oq0;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/jp0;->d:Lcom/google/android/gms/internal/ads/l42;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/zf;)Lcom/google/android/gms/internal/ads/lo1;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/zf;",
            ")",
            "Lcom/google/android/gms/internal/ads/lo1<",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zf;->e:Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->c()Lcom/google/android/gms/internal/ads/gl;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/gl;->e(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/ads/ar0;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/ar0;-><init>(I)V

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/yn1;->a(Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/jp0;->a:Lcom/google/android/gms/internal/ads/ko1;

    new-instance v1, Lcom/google/android/gms/internal/ads/ip0;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/ads/ip0;-><init>(Lcom/google/android/gms/internal/ads/jp0;Lcom/google/android/gms/internal/ads/zf;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/ko1;->a(Ljava/util/concurrent/Callable;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object v0

    const-class v1, Ljava/util/concurrent/ExecutionException;

    sget-object v2, Lcom/google/android/gms/internal/ads/lp0;->a:Lcom/google/android/gms/internal/ads/ln1;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/jp0;->b:Lcom/google/android/gms/internal/ads/ko1;

    invoke-static {v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/yn1;->a(Lcom/google/android/gms/internal/ads/lo1;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/ln1;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object v0

    :goto_0
    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v1

    const-class v2, Lcom/google/android/gms/internal/ads/ar0;

    new-instance v3, Lcom/google/android/gms/internal/ads/kp0;

    invoke-direct {v3, p0, p1, v1}, Lcom/google/android/gms/internal/ads/kp0;-><init>(Lcom/google/android/gms/internal/ads/jp0;Lcom/google/android/gms/internal/ads/zf;I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/jp0;->b:Lcom/google/android/gms/internal/ads/ko1;

    invoke-static {v0, v2, v3, p1}, Lcom/google/android/gms/internal/ads/yn1;->a(Lcom/google/android/gms/internal/ads/lo1;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/ln1;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    return-object p1
.end method

.method final synthetic a(Lcom/google/android/gms/internal/ads/zf;ILcom/google/android/gms/internal/ads/ar0;)Lcom/google/android/gms/internal/ads/lo1;
    .locals 0

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/jp0;->d:Lcom/google/android/gms/internal/ads/l42;

    invoke-interface {p3}, Lcom/google/android/gms/internal/ads/l42;->get()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/google/android/gms/internal/ads/mr0;

    invoke-virtual {p3, p1, p2}, Lcom/google/android/gms/internal/ads/mr0;->a(Lcom/google/android/gms/internal/ads/zf;I)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    return-object p1
.end method

.method final synthetic b(Lcom/google/android/gms/internal/ads/zf;)Ljava/io/InputStream;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/jp0;->c:Lcom/google/android/gms/internal/ads/oq0;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/oq0;->a(Lcom/google/android/gms/internal/ads/zf;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    sget-object v0, Lcom/google/android/gms/internal/ads/zr2;->w2:Lcom/google/android/gms/internal/ads/kr2;

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->e()Lcom/google/android/gms/internal/ads/vr2;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/vr2;->a(Lcom/google/android/gms/internal/ads/kr2;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v0, v0

    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {p1, v0, v1, v2}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/io/InputStream;

    return-object p1
.end method
