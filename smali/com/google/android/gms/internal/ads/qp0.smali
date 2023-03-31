.class public final Lcom/google/android/gms/internal/ads/qp0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/r42;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/r42<",
        "Lcom/google/android/gms/internal/ads/lo1<",
        "Ljava/lang/String;",
        ">;>;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/e52;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/e52<",
            "Lcom/google/android/gms/internal/ads/sh1;",
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


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ads/e52;Lcom/google/android/gms/internal/ads/e52;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/e52<",
            "Lcom/google/android/gms/internal/ads/sh1;",
            ">;",
            "Lcom/google/android/gms/internal/ads/e52<",
            "Landroid/content/Context;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/qp0;->a:Lcom/google/android/gms/internal/ads/e52;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/qp0;->b:Lcom/google/android/gms/internal/ads/e52;

    return-void
.end method

.method public static a(Lcom/google/android/gms/internal/ads/e52;Lcom/google/android/gms/internal/ads/e52;)Lcom/google/android/gms/internal/ads/qp0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/e52<",
            "Lcom/google/android/gms/internal/ads/sh1;",
            ">;",
            "Lcom/google/android/gms/internal/ads/e52<",
            "Landroid/content/Context;",
            ">;)",
            "Lcom/google/android/gms/internal/ads/qp0;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/ads/qp0;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ads/qp0;-><init>(Lcom/google/android/gms/internal/ads/e52;Lcom/google/android/gms/internal/ads/e52;)V

    return-object v0
.end method


# virtual methods
.method public final synthetic get()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/qp0;->a:Lcom/google/android/gms/internal/ads/e52;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/e52;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/sh1;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/qp0;->b:Lcom/google/android/gms/internal/ads/e52;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/e52;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    sget-object v2, Lcom/google/android/gms/internal/ads/ph1;->u:Lcom/google/android/gms/internal/ads/ph1;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/eh1;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/ih1;

    move-result-object v0

    new-instance v2, Lcom/google/android/gms/internal/ads/mp0;

    invoke-direct {v2, v1}, Lcom/google/android/gms/internal/ads/mp0;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/ih1;->a(Ljava/util/concurrent/Callable;)Lcom/google/android/gms/internal/ads/kh1;

    move-result-object v0

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x1

    invoke-virtual {v0, v2, v3, v1}, Lcom/google/android/gms/internal/ads/kh1;->a(JLjava/util/concurrent/TimeUnit;)Lcom/google/android/gms/internal/ads/kh1;

    move-result-object v0

    const-class v1, Ljava/lang/Exception;

    sget-object v2, Lcom/google/android/gms/internal/ads/pp0;->a:Lcom/google/android/gms/internal/ads/zg1;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/kh1;->a(Ljava/lang/Class;Lcom/google/android/gms/internal/ads/zg1;)Lcom/google/android/gms/internal/ads/kh1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/kh1;->a()Lcom/google/android/gms/internal/ads/bh1;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable @Provides method"

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/y42;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/internal/ads/lo1;

    return-object v0
.end method
