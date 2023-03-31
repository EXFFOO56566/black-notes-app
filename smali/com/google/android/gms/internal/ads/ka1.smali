.class public final Lcom/google/android/gms/internal/ads/ka1;
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
        "Lcom/google/android/gms/internal/ads/rf1<",
        "TAdT;>;>;"
    }
.end annotation


# instance fields
.field private a:Lcom/google/android/gms/internal/ads/e50;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TR;"
        }
    .end annotation
.end field

.field private final b:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lcom/google/android/gms/internal/ads/no1;->a()Ljava/util/concurrent/Executor;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/ka1;->b:Ljava/util/concurrent/Executor;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/nb1;Lcom/google/android/gms/internal/ads/ob1;)Lcom/google/android/gms/internal/ads/lo1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/nb1;",
            "Lcom/google/android/gms/internal/ads/ob1<",
            "TR;>;)",
            "Lcom/google/android/gms/internal/ads/lo1<",
            "Lcom/google/android/gms/internal/ads/rf1<",
            "TAdT;>;>;"
        }
    .end annotation

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/nb1;->b:Lcom/google/android/gms/internal/ads/lb1;

    invoke-interface {p2, v0}, Lcom/google/android/gms/internal/ads/ob1;->a(Lcom/google/android/gms/internal/ads/lb1;)Lcom/google/android/gms/internal/ads/d50;

    move-result-object p2

    new-instance v0, Lcom/google/android/gms/internal/ads/tb1;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/tb1;-><init>(Z)V

    invoke-interface {p2, v0}, Lcom/google/android/gms/internal/ads/d50;->a(Lcom/google/android/gms/internal/ads/tb1;)Lcom/google/android/gms/internal/ads/d50;

    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/d50;->f()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/ads/e50;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/ka1;->a:Lcom/google/android/gms/internal/ads/e50;

    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/e50;->a()Lcom/google/android/gms/internal/ads/l30;

    move-result-object p2

    new-instance v0, Lcom/google/android/gms/internal/ads/rf1;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/rf1;-><init>()V

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/nb1;->a:Lcom/google/android/gms/internal/ads/zf;

    if-eqz p1, :cond_0

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/l30;->a(Lcom/google/android/gms/internal/ads/zf;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/l30;->a()Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    :goto_0
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/tn1;->b(Lcom/google/android/gms/internal/ads/lo1;)Lcom/google/android/gms/internal/ads/tn1;

    move-result-object p1

    new-instance v1, Lcom/google/android/gms/internal/ads/na1;

    invoke-direct {v1, p0, v0, p2}, Lcom/google/android/gms/internal/ads/na1;-><init>(Lcom/google/android/gms/internal/ads/ka1;Lcom/google/android/gms/internal/ads/rf1;Lcom/google/android/gms/internal/ads/l30;)V

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/ka1;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {p1, v1, p2}, Lcom/google/android/gms/internal/ads/tn1;->a(Lcom/google/android/gms/internal/ads/ln1;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/tn1;

    move-result-object p1

    new-instance p2, Lcom/google/android/gms/internal/ads/ma1;

    invoke-direct {p2, v0}, Lcom/google/android/gms/internal/ads/ma1;-><init>(Lcom/google/android/gms/internal/ads/rf1;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ka1;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {p1, p2, v0}, Lcom/google/android/gms/internal/ads/tn1;->a(Lcom/google/android/gms/internal/ads/xk1;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/tn1;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic a()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ka1;->a:Lcom/google/android/gms/internal/ads/e50;

    return-object v0
.end method
