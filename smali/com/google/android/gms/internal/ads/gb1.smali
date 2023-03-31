.class final Lcom/google/android/gms/internal/ads/gb1;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R::",
        "Lcom/google/android/gms/internal/ads/e50<",
        "+",
        "Lcom/google/android/gms/internal/ads/k20;",
        ">;>",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/kf1;

.field private final b:Lcom/google/android/gms/internal/ads/lb1;

.field private final c:Lcom/google/android/gms/internal/ads/ob1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/ob1<",
            "TR;>;"
        }
    .end annotation
.end field

.field private final d:Ljava/util/concurrent/Executor;

.field private e:Lcom/google/android/gms/internal/ads/kb1;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/kf1;Lcom/google/android/gms/internal/ads/lb1;Lcom/google/android/gms/internal/ads/ob1;Ljava/util/concurrent/Executor;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/kf1;",
            "Lcom/google/android/gms/internal/ads/lb1;",
            "Lcom/google/android/gms/internal/ads/ob1<",
            "TR;>;",
            "Ljava/util/concurrent/Executor;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/gb1;->a:Lcom/google/android/gms/internal/ads/kf1;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/gb1;->b:Lcom/google/android/gms/internal/ads/lb1;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/gb1;->c:Lcom/google/android/gms/internal/ads/ob1;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/gb1;->d:Ljava/util/concurrent/Executor;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/gb1;Lcom/google/android/gms/internal/ads/kb1;)Lcom/google/android/gms/internal/ads/kb1;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/gb1;->e:Lcom/google/android/gms/internal/ads/kb1;

    return-object p1
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/gb1;)Lcom/google/android/gms/internal/ads/uf1;
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/gb1;->b()Lcom/google/android/gms/internal/ads/uf1;

    move-result-object p0

    return-object p0
.end method

.method static synthetic b(Lcom/google/android/gms/internal/ads/gb1;)Lcom/google/android/gms/internal/ads/kb1;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/gb1;->e:Lcom/google/android/gms/internal/ads/kb1;

    return-object p0
.end method

.method private final b()Lcom/google/android/gms/internal/ads/uf1;
    .locals 4
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/gb1;->c:Lcom/google/android/gms/internal/ads/ob1;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/gb1;->b:Lcom/google/android/gms/internal/ads/lb1;

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/ob1;->a(Lcom/google/android/gms/internal/ads/lb1;)Lcom/google/android/gms/internal/ads/d50;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/d50;->f()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/e50;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/e50;->b()Lcom/google/android/gms/internal/ads/zd1;

    move-result-object v0

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zd1;->d:Lcom/google/android/gms/internal/ads/rm2;

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zd1;->f:Ljava/lang/String;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zd1;->j:Lcom/google/android/gms/internal/ads/bn2;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/gb1;->a:Lcom/google/android/gms/internal/ads/kf1;

    invoke-interface {v3, v1, v2, v0}, Lcom/google/android/gms/internal/ads/kf1;->a(Lcom/google/android/gms/internal/ads/rm2;Ljava/lang/String;Lcom/google/android/gms/internal/ads/bn2;)Lcom/google/android/gms/internal/ads/uf1;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/ads/lo1;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/internal/ads/lo1<",
            "Lcom/google/android/gms/internal/ads/kb1;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/gb1;->e:Lcom/google/android/gms/internal/ads/kb1;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/yn1;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object v0

    return-object v0

    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/ads/r0;->a:Lcom/google/android/gms/internal/ads/b0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/b0;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/ads/kb1;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/gb1;->b()Lcom/google/android/gms/internal/ads/uf1;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1, v2}, Lcom/google/android/gms/internal/ads/kb1;-><init>(Lcom/google/android/gms/internal/ads/zf;Lcom/google/android/gms/internal/ads/uf1;Lcom/google/android/gms/internal/ads/ib1;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/gb1;->e:Lcom/google/android/gms/internal/ads/kb1;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/yn1;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object v0

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/gb1;->c:Lcom/google/android/gms/internal/ads/ob1;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/gb1;->b:Lcom/google/android/gms/internal/ads/lb1;

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/ob1;->a(Lcom/google/android/gms/internal/ads/lb1;)Lcom/google/android/gms/internal/ads/d50;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/wa1;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/gb1;->a:Lcom/google/android/gms/internal/ads/kf1;

    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/kf1;->a()Lcom/google/android/gms/internal/ads/nf1;

    move-result-object v2

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/nf1;->k:Ljava/lang/String;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/ads/wa1;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/d50;->a(Lcom/google/android/gms/internal/ads/wa1;)Lcom/google/android/gms/internal/ads/d50;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/d50;->f()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/e50;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/e50;->a()Lcom/google/android/gms/internal/ads/l30;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/gb1;->a:Lcom/google/android/gms/internal/ads/kf1;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/kf1;->a()Lcom/google/android/gms/internal/ads/nf1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/l30;->a(Lcom/google/android/gms/internal/ads/nf1;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/tn1;->b(Lcom/google/android/gms/internal/ads/lo1;)Lcom/google/android/gms/internal/ads/tn1;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/hb1;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/hb1;-><init>(Lcom/google/android/gms/internal/ads/gb1;)V

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/gb1;->d:Ljava/util/concurrent/Executor;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/tn1;->a(Lcom/google/android/gms/internal/ads/xk1;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/tn1;

    move-result-object v0

    const-class v1, Lcom/google/android/gms/internal/ads/ar0;

    new-instance v2, Lcom/google/android/gms/internal/ads/ib1;

    invoke-direct {v2, p0}, Lcom/google/android/gms/internal/ads/ib1;-><init>(Lcom/google/android/gms/internal/ads/gb1;)V

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/gb1;->d:Ljava/util/concurrent/Executor;

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/tn1;->a(Ljava/lang/Class;Lcom/google/android/gms/internal/ads/xk1;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/tn1;

    move-result-object v0

    :goto_0
    sget-object v1, Lcom/google/android/gms/internal/ads/fb1;->a:Lcom/google/android/gms/internal/ads/xk1;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/gb1;->d:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/yn1;->a(Lcom/google/android/gms/internal/ads/lo1;Lcom/google/android/gms/internal/ads/xk1;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object v0

    return-object v0
.end method
