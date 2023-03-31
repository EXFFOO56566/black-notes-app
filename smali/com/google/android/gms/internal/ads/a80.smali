.class public final Lcom/google/android/gms/internal/ads/a80;
.super Lcom/google/android/gms/internal/ads/j90;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/n60;
.implements Lcom/google/android/gms/internal/ads/q70;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ads/j90<",
        "Lcom/google/android/gms/internal/ads/b80;",
        ">;",
        "Lcom/google/android/gms/internal/ads/n60;",
        "Lcom/google/android/gms/internal/ads/q70;"
    }
.end annotation


# instance fields
.field private final c:Lcom/google/android/gms/internal/ads/id1;

.field private d:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public constructor <init>(Ljava/util/Set;Lcom/google/android/gms/internal/ads/id1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lcom/google/android/gms/internal/ads/ab0<",
            "Lcom/google/android/gms/internal/ads/b80;",
            ">;>;",
            "Lcom/google/android/gms/internal/ads/id1;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/j90;-><init>(Ljava/util/Set;)V

    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/a80;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/a80;->c:Lcom/google/android/gms/internal/ads/id1;

    return-void
.end method

.method private final R()V
    .locals 3

    sget-object v0, Lcom/google/android/gms/internal/ads/zr2;->H3:Lcom/google/android/gms/internal/ads/kr2;

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->e()Lcom/google/android/gms/internal/ads/vr2;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/vr2;->a(Lcom/google/android/gms/internal/ads/kr2;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/a80;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/a80;->c:Lcom/google/android/gms/internal/ads/id1;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/id1;->W:Lcom/google/android/gms/internal/ads/wm2;

    if-eqz v0, :cond_0

    iget v0, v0, Lcom/google/android/gms/internal/ads/wm2;->b:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/ads/y70;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/y70;-><init>(Lcom/google/android/gms/internal/ads/a80;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/j90;->a(Lcom/google/android/gms/internal/ads/l90;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final K()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/a80;->c:Lcom/google/android/gms/internal/ads/id1;

    iget v0, v0, Lcom/google/android/gms/internal/ads/id1;->b:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    const/4 v1, 0x5

    if-eq v0, v1, :cond_0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_1

    :cond_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/a80;->R()V

    :cond_1
    return-void
.end method

.method public final M0()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/a80;->c:Lcom/google/android/gms/internal/ads/id1;

    iget v0, v0, Lcom/google/android/gms/internal/ads/id1;->b:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/a80;->R()V

    :cond_0
    return-void
.end method

.method final synthetic a(Lcom/google/android/gms/internal/ads/b80;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/a80;->c:Lcom/google/android/gms/internal/ads/id1;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/id1;->W:Lcom/google/android/gms/internal/ads/wm2;

    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/ads/b80;->a(Lcom/google/android/gms/internal/ads/wm2;)V

    return-void
.end method
