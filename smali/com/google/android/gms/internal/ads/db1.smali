.class public final Lcom/google/android/gms/internal/ads/db1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/mb1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<RequestComponentT::",
        "Lcom/google/android/gms/internal/ads/e50<",
        "TAdT;>;AdT:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/mb1<",
        "TRequestComponentT;TAdT;>;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/mb1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/mb1<",
            "TRequestComponentT;TAdT;>;"
        }
    .end annotation
.end field

.field private b:Lcom/google/android/gms/internal/ads/e50;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TRequestComponentT;"
        }
    .end annotation

    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/mb1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/mb1<",
            "TRequestComponentT;TAdT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/db1;->a:Lcom/google/android/gms/internal/ads/mb1;

    return-void
.end method

.method private final declared-synchronized b()Lcom/google/android/gms/internal/ads/e50;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TRequestComponentT;"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/db1;->b:Lcom/google/android/gms/internal/ads/e50;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method


# virtual methods
.method public final declared-synchronized a(Lcom/google/android/gms/internal/ads/nb1;Lcom/google/android/gms/internal/ads/ob1;)Lcom/google/android/gms/internal/ads/lo1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/nb1;",
            "Lcom/google/android/gms/internal/ads/ob1<",
            "TRequestComponentT;>;)",
            "Lcom/google/android/gms/internal/ads/lo1<",
            "TAdT;>;"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/nb1;->a:Lcom/google/android/gms/internal/ads/zf;

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/nb1;->b:Lcom/google/android/gms/internal/ads/lb1;

    invoke-interface {p2, v0}, Lcom/google/android/gms/internal/ads/ob1;->a(Lcom/google/android/gms/internal/ads/lb1;)Lcom/google/android/gms/internal/ads/d50;

    move-result-object p2

    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/d50;->f()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/ads/e50;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/db1;->b:Lcom/google/android/gms/internal/ads/e50;

    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/e50;->a()Lcom/google/android/gms/internal/ads/l30;

    move-result-object p2

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/nb1;->a:Lcom/google/android/gms/internal/ads/zf;

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/l30;->b(Lcom/google/android/gms/internal/ads/zf;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/db1;->a:Lcom/google/android/gms/internal/ads/mb1;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/ads/mb1;->a(Lcom/google/android/gms/internal/ads/nb1;Lcom/google/android/gms/internal/ads/ob1;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/db1;->a:Lcom/google/android/gms/internal/ads/mb1;

    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/mb1;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/ads/e50;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/db1;->b:Lcom/google/android/gms/internal/ads/e50;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final synthetic a()Ljava/lang/Object;
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/db1;->b()Lcom/google/android/gms/internal/ads/e50;

    move-result-object v0

    return-object v0
.end method
