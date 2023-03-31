.class public final Lcom/google/android/gms/internal/ads/va1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/mb1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R::",
        "Lcom/google/android/gms/internal/ads/e50<",
        "TAdT;>;AdT:",
        "Lcom/google/android/gms/internal/ads/k20;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/mb1<",
        "TR;",
        "Lcom/google/android/gms/internal/ads/za1<",
        "TAdT;>;>;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/kf1;

.field private final b:Ljava/util/concurrent/Executor;

.field private c:Lcom/google/android/gms/internal/ads/zn1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/zn1<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/kf1;Ljava/util/concurrent/Executor;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/ads/ab1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/ab1;-><init>(Lcom/google/android/gms/internal/ads/va1;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/va1;->c:Lcom/google/android/gms/internal/ads/zn1;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/va1;->a:Lcom/google/android/gms/internal/ads/kf1;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/va1;->b:Ljava/util/concurrent/Executor;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/nb1;Lcom/google/android/gms/internal/ads/ob1;)Lcom/google/android/gms/internal/ads/lo1;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/nb1;",
            "Lcom/google/android/gms/internal/ads/ob1<",
            "TR;>;)",
            "Lcom/google/android/gms/internal/ads/lo1<",
            "Lcom/google/android/gms/internal/ads/za1<",
            "TAdT;>;>;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/ads/gb1;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/va1;->a:Lcom/google/android/gms/internal/ads/kf1;

    iget-object v2, p1, Lcom/google/android/gms/internal/ads/nb1;->b:Lcom/google/android/gms/internal/ads/lb1;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/va1;->b:Ljava/util/concurrent/Executor;

    invoke-direct {v0, v1, v2, p2, v3}, Lcom/google/android/gms/internal/ads/gb1;-><init>(Lcom/google/android/gms/internal/ads/kf1;Lcom/google/android/gms/internal/ads/lb1;Lcom/google/android/gms/internal/ads/ob1;Ljava/util/concurrent/Executor;)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/gb1;->a()Lcom/google/android/gms/internal/ads/lo1;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/tn1;->b(Lcom/google/android/gms/internal/ads/lo1;)Lcom/google/android/gms/internal/ads/tn1;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/ya1;

    invoke-direct {v1, p0, p1, p2}, Lcom/google/android/gms/internal/ads/ya1;-><init>(Lcom/google/android/gms/internal/ads/va1;Lcom/google/android/gms/internal/ads/nb1;Lcom/google/android/gms/internal/ads/ob1;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/va1;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/internal/ads/tn1;->a(Lcom/google/android/gms/internal/ads/ln1;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/tn1;

    move-result-object p1

    const-class p2, Ljava/lang/Exception;

    new-instance v0, Lcom/google/android/gms/internal/ads/xa1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/xa1;-><init>(Lcom/google/android/gms/internal/ads/va1;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/va1;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {p1, p2, v0, v1}, Lcom/google/android/gms/internal/ads/tn1;->a(Ljava/lang/Class;Lcom/google/android/gms/internal/ads/xk1;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/tn1;

    move-result-object p1

    return-object p1
.end method

.method final synthetic a(Lcom/google/android/gms/internal/ads/nb1;Lcom/google/android/gms/internal/ads/ob1;Lcom/google/android/gms/internal/ads/kb1;)Lcom/google/android/gms/internal/ads/lo1;
    .locals 3

    iget-object v0, p3, Lcom/google/android/gms/internal/ads/kb1;->b:Lcom/google/android/gms/internal/ads/uf1;

    iget-object p3, p3, Lcom/google/android/gms/internal/ads/kb1;->a:Lcom/google/android/gms/internal/ads/zf;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/va1;->a:Lcom/google/android/gms/internal/ads/kf1;

    invoke-interface {v2, v0}, Lcom/google/android/gms/internal/ads/kf1;->b(Lcom/google/android/gms/internal/ads/uf1;)Lcom/google/android/gms/internal/ads/rf1;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    if-nez v0, :cond_1

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/yn1;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    return-object p1

    :cond_1
    if-eqz v2, :cond_2

    if-eqz p3, :cond_2

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/nb1;->b:Lcom/google/android/gms/internal/ads/lb1;

    invoke-interface {p2, p1}, Lcom/google/android/gms/internal/ads/ob1;->a(Lcom/google/android/gms/internal/ads/lb1;)Lcom/google/android/gms/internal/ads/d50;

    move-result-object p1

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/d50;->f()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/e50;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/e50;->a()Lcom/google/android/gms/internal/ads/l30;

    move-result-object p1

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/ads/l30;->c(Lcom/google/android/gms/internal/ads/zf;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/va1;->c:Lcom/google/android/gms/internal/ads/zn1;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/va1;->b:Ljava/util/concurrent/Executor;

    invoke-static {p1, p2, v1}, Lcom/google/android/gms/internal/ads/yn1;->a(Lcom/google/android/gms/internal/ads/lo1;Lcom/google/android/gms/internal/ads/zn1;Ljava/util/concurrent/Executor;)V

    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/ads/za1;

    invoke-direct {p1, v0, p3, v2}, Lcom/google/android/gms/internal/ads/za1;-><init>(Lcom/google/android/gms/internal/ads/uf1;Lcom/google/android/gms/internal/ads/zf;Lcom/google/android/gms/internal/ads/rf1;)V

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/yn1;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
