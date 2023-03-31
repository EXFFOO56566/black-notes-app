.class final Lcom/google/android/gms/internal/ads/yc;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/ads/mediation/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/ads/mediation/d<",
        "Lcom/google/android/gms/ads/mediation/j;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field private final synthetic a:Lcom/google/android/gms/internal/ads/fc;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/wc;Lcom/google/android/gms/internal/ads/fc;Lcom/google/android/gms/internal/ads/xa;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/yc;->a:Lcom/google/android/gms/internal/ads/fc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/String;)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/yc;->a:Lcom/google/android/gms/internal/ads/fc;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/fc;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v0, ""

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/co;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
