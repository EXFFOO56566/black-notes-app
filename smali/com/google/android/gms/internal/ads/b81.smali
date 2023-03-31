.class public final Lcom/google/android/gms/internal/ads/b81;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/y61;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/y61<",
        "Lcom/google/android/gms/internal/ads/y71;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/dk;

.field private final b:I

.field private final c:Landroid/content/Context;

.field private final d:Lcom/google/android/gms/internal/ads/ik;

.field private final e:Ljava/util/concurrent/ScheduledExecutorService;

.field private final f:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/dk;ILandroid/content/Context;Lcom/google/android/gms/internal/ads/ik;Ljava/util/concurrent/ScheduledExecutorService;Ljava/util/concurrent/Executor;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/b81;->a:Lcom/google/android/gms/internal/ads/dk;

    iput p2, p0, Lcom/google/android/gms/internal/ads/b81;->b:I

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/b81;->c:Landroid/content/Context;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/b81;->d:Lcom/google/android/gms/internal/ads/ik;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/b81;->e:Ljava/util/concurrent/ScheduledExecutorService;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/b81;->f:Ljava/util/concurrent/Executor;

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/ads/lo1;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/internal/ads/lo1<",
            "Lcom/google/android/gms/internal/ads/y71;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/internal/ads/zr2;->M2:Lcom/google/android/gms/internal/ads/kr2;

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->e()Lcom/google/android/gms/internal/ads/vr2;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/vr2;->a(Lcom/google/android/gms/internal/ads/kr2;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/yn1;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/ads/a81;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/a81;-><init>(Lcom/google/android/gms/internal/ads/b81;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/b81;->f:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/yn1;->a(Lcom/google/android/gms/internal/ads/jn1;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/tn1;->b(Lcom/google/android/gms/internal/ads/lo1;)Lcom/google/android/gms/internal/ads/tn1;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/ads/d81;->a:Lcom/google/android/gms/internal/ads/xk1;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/b81;->f:Ljava/util/concurrent/Executor;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/tn1;->a(Lcom/google/android/gms/internal/ads/xk1;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/tn1;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/ads/zr2;->r0:Lcom/google/android/gms/internal/ads/kr2;

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->e()Lcom/google/android/gms/internal/ads/vr2;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/vr2;->a(Lcom/google/android/gms/internal/ads/kr2;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/b81;->e:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/google/android/gms/internal/ads/tn1;->a(JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Lcom/google/android/gms/internal/ads/tn1;

    move-result-object v0

    const-class v1, Ljava/lang/Exception;

    new-instance v2, Lcom/google/android/gms/internal/ads/c81;

    invoke-direct {v2, p0}, Lcom/google/android/gms/internal/ads/c81;-><init>(Lcom/google/android/gms/internal/ads/b81;)V

    invoke-static {}, Lcom/google/android/gms/internal/ads/no1;->a()Ljava/util/concurrent/Executor;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/tn1;->a(Ljava/lang/Class;Lcom/google/android/gms/internal/ads/xk1;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/tn1;

    move-result-object v0

    return-object v0
.end method

.method final synthetic a(Ljava/lang/Exception;)Lcom/google/android/gms/internal/ads/y71;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/b81;->d:Lcom/google/android/gms/internal/ads/ik;

    const-string v1, "ATTESTATION_TOKEN_FETCH"

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/ads/ik;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method final synthetic b()Lcom/google/android/gms/internal/ads/lo1;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/b81;->a:Lcom/google/android/gms/internal/ads/dk;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/b81;->c:Landroid/content/Context;

    iget v2, p0, Lcom/google/android/gms/internal/ads/b81;->b:I

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/ads/dk;->a(Landroid/content/Context;I)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object v0

    return-object v0
.end method
