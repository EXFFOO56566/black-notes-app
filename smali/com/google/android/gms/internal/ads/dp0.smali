.class final synthetic Lcom/google/android/gms/internal/ads/dp0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final b:Lcom/google/android/gms/internal/ads/ro;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/uo0;Lcom/google/android/gms/internal/ads/ro;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/dp0;->b:Lcom/google/android/gms/internal/ads/ro;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dp0;->b:Lcom/google/android/gms/internal/ads/ro;

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->g()Lcom/google/android/gms/internal/ads/ik;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/ik;->i()Lcom/google/android/gms/internal/ads/yk;

    move-result-object v1

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/yk;->i()Lcom/google/android/gms/internal/ads/jk;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/jk;->c()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/ro;->b(Ljava/lang/Object;)Z

    return-void

    :cond_0
    new-instance v1, Ljava/lang/Exception;

    invoke-direct {v1}, Ljava/lang/Exception;-><init>()V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/ro;->a(Ljava/lang/Throwable;)Z

    return-void
.end method
