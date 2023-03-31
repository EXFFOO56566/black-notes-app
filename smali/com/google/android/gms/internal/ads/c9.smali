.class final Lcom/google/android/gms/internal/ads/c9;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/vo;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/vo<",
        "Lcom/google/android/gms/internal/ads/r7;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/ads/w8;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/w8;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/c9;->a:Lcom/google/android/gms/internal/ads/w8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 2

    check-cast p1, Lcom/google/android/gms/internal/ads/r7;

    sget-object v0, Lcom/google/android/gms/internal/ads/jo;->e:Lcom/google/android/gms/internal/ads/ko1;

    new-instance v1, Lcom/google/android/gms/internal/ads/b9;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/ads/b9;-><init>(Lcom/google/android/gms/internal/ads/c9;Lcom/google/android/gms/internal/ads/r7;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
