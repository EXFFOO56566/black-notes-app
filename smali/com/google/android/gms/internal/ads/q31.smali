.class public final Lcom/google/android/gms/internal/ads/q31;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/y61;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<S::",
        "Lcom/google/android/gms/internal/ads/v61<",
        "*>;>",
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/y61<",
        "TS;>;"
    }
.end annotation


# instance fields
.field private final a:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lcom/google/android/gms/internal/ads/p31<",
            "TS;>;>;"
        }
    .end annotation
.end field

.field private final b:Lcom/google/android/gms/common/util/d;

.field private final c:Lcom/google/android/gms/internal/ads/y61;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/y61<",
            "TS;>;"
        }
    .end annotation
.end field

.field private final d:J


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/y61;JLcom/google/android/gms/common/util/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/y61<",
            "TS;>;J",
            "Lcom/google/android/gms/common/util/d;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/q31;->a:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/q31;->b:Lcom/google/android/gms/common/util/d;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/q31;->c:Lcom/google/android/gms/internal/ads/y61;

    iput-wide p2, p0, Lcom/google/android/gms/internal/ads/q31;->d:J

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/ads/lo1;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/internal/ads/lo1<",
            "TS;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/q31;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/p31;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/p31;->a()Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/ads/p31;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/q31;->c:Lcom/google/android/gms/internal/ads/y61;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/y61;->a()Lcom/google/android/gms/internal/ads/lo1;

    move-result-object v1

    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/q31;->d:J

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/q31;->b:Lcom/google/android/gms/common/util/d;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/gms/internal/ads/p31;-><init>(Lcom/google/android/gms/internal/ads/lo1;JLcom/google/android/gms/common/util/d;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/q31;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    :cond_1
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/p31;->a:Lcom/google/android/gms/internal/ads/lo1;

    return-object v0
.end method
