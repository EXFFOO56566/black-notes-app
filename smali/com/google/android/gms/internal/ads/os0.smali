.class public final Lcom/google/android/gms/internal/ads/os0;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/ms0;

.field private final b:Lcom/google/android/gms/internal/ads/ko1;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/ms0;Lcom/google/android/gms/internal/ads/ko1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/os0;->a:Lcom/google/android/gms/internal/ads/ms0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/os0;->b:Lcom/google/android/gms/internal/ads/ko1;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/zg1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/zg1<",
            "Landroid/database/sqlite/SQLiteDatabase;",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/os0;->b:Lcom/google/android/gms/internal/ads/ko1;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/os0;->a:Lcom/google/android/gms/internal/ads/ms0;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/ns0;->a(Lcom/google/android/gms/internal/ads/ms0;)Ljava/util/concurrent/Callable;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/ko1;->a(Ljava/util/concurrent/Callable;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/qs0;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/ads/qs0;-><init>(Lcom/google/android/gms/internal/ads/os0;Lcom/google/android/gms/internal/ads/zg1;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/os0;->b:Lcom/google/android/gms/internal/ads/ko1;

    invoke-static {v0, v1, p1}, Lcom/google/android/gms/internal/ads/yn1;->a(Lcom/google/android/gms/internal/ads/lo1;Lcom/google/android/gms/internal/ads/zn1;Ljava/util/concurrent/Executor;)V

    return-void
.end method
