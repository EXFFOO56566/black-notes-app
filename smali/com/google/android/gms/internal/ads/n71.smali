.class public final Lcom/google/android/gms/internal/ads/n71;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/r42;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/r42<",
        "Lcom/google/android/gms/internal/ads/m71;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/e52;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/e52<",
            "Lcom/google/android/gms/internal/ads/dk;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lcom/google/android/gms/internal/ads/e52;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/e52<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lcom/google/android/gms/internal/ads/e52;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/e52<",
            "Ljava/util/concurrent/ScheduledExecutorService;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lcom/google/android/gms/internal/ads/e52;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/e52<",
            "Ljava/util/concurrent/Executor;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/e52;Lcom/google/android/gms/internal/ads/e52;Lcom/google/android/gms/internal/ads/e52;Lcom/google/android/gms/internal/ads/e52;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/e52<",
            "Lcom/google/android/gms/internal/ads/dk;",
            ">;",
            "Lcom/google/android/gms/internal/ads/e52<",
            "Landroid/content/Context;",
            ">;",
            "Lcom/google/android/gms/internal/ads/e52<",
            "Ljava/util/concurrent/ScheduledExecutorService;",
            ">;",
            "Lcom/google/android/gms/internal/ads/e52<",
            "Ljava/util/concurrent/Executor;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/n71;->a:Lcom/google/android/gms/internal/ads/e52;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/n71;->b:Lcom/google/android/gms/internal/ads/e52;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/n71;->c:Lcom/google/android/gms/internal/ads/e52;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/n71;->d:Lcom/google/android/gms/internal/ads/e52;

    return-void
.end method


# virtual methods
.method public final synthetic get()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/n71;->a:Lcom/google/android/gms/internal/ads/e52;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/e52;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/dk;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/n71;->b:Lcom/google/android/gms/internal/ads/e52;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/e52;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/n71;->c:Lcom/google/android/gms/internal/ads/e52;

    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/e52;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/concurrent/ScheduledExecutorService;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/n71;->d:Lcom/google/android/gms/internal/ads/e52;

    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/e52;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/concurrent/Executor;

    new-instance v4, Lcom/google/android/gms/internal/ads/m71;

    invoke-direct {v4, v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/m71;-><init>(Lcom/google/android/gms/internal/ads/dk;Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;Ljava/util/concurrent/Executor;)V

    return-object v4
.end method
