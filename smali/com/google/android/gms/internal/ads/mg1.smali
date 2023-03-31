.class public final Lcom/google/android/gms/internal/ads/mg1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/r42;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/r42<",
        "Lcom/google/android/gms/internal/ads/ko1;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lcom/google/android/gms/internal/ads/mg1;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/ads/pg1;->a()Lcom/google/android/gms/internal/ads/mg1;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final synthetic get()Ljava/lang/Object;
    .locals 2

    invoke-static {}, Lcom/google/android/gms/internal/ads/pk1;->a()Lcom/google/android/gms/internal/ads/mk1;

    move-result-object v0

    sget v1, Lcom/google/android/gms/internal/ads/qk1;->a:I

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/mk1;->b(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/no1;->a(Ljava/util/concurrent/ExecutorService;)Lcom/google/android/gms/internal/ads/ko1;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable @Provides method"

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/y42;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/internal/ads/ko1;

    return-object v0
.end method
