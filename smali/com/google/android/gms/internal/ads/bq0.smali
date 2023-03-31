.class public abstract Lcom/google/android/gms/internal/ads/bq0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/ln1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/ln1<",
        "Lcom/google/android/gms/internal/ads/zf;",
        "Lcom/google/android/gms/internal/ads/vd1;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/h80;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/h80;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/bq0;->a:Lcom/google/android/gms/internal/ads/h80;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/bq0;)Lcom/google/android/gms/internal/ads/h80;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/bq0;->a:Lcom/google/android/gms/internal/ads/h80;

    return-object p0
.end method


# virtual methods
.method protected abstract a(Lcom/google/android/gms/internal/ads/zf;)Lcom/google/android/gms/internal/ads/lo1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/zf;",
            ")",
            "Lcom/google/android/gms/internal/ads/lo1<",
            "Lcom/google/android/gms/internal/ads/vd1;",
            ">;"
        }
    .end annotation
.end method

.method public final synthetic a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/lo1;
    .locals 2

    check-cast p1, Lcom/google/android/gms/internal/ads/zf;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bq0;->a:Lcom/google/android/gms/internal/ads/h80;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/h80;->a(Lcom/google/android/gms/internal/ads/zf;)V

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/bq0;->a(Lcom/google/android/gms/internal/ads/zf;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    new-instance v0, Lcom/google/android/gms/internal/ads/eq0;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/eq0;-><init>(Lcom/google/android/gms/internal/ads/bq0;)V

    sget-object v1, Lcom/google/android/gms/internal/ads/jo;->f:Lcom/google/android/gms/internal/ads/ko1;

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/ads/yn1;->a(Lcom/google/android/gms/internal/ads/lo1;Lcom/google/android/gms/internal/ads/zn1;Ljava/util/concurrent/Executor;)V

    return-object p1
.end method
