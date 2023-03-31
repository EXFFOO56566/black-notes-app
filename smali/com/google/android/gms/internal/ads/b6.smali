.class final Lcom/google/android/gms/internal/ads/b6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/common/internal/c$a;


# instance fields
.field private final synthetic a:Lcom/google/android/gms/internal/ads/ro;

.field private final synthetic b:Lcom/google/android/gms/internal/ads/x5;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/x5;Lcom/google/android/gms/internal/ads/ro;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/b6;->b:Lcom/google/android/gms/internal/ads/x5;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/b6;->a:Lcom/google/android/gms/internal/ads/ro;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(I)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/b6;->a:Lcom/google/android/gms/internal/ads/ro;

    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    const/16 v3, 0x22

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "onConnectionSuspended: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/ro;->a(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public final e(Landroid/os/Bundle;)V
    .locals 1

    :try_start_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/b6;->a:Lcom/google/android/gms/internal/ads/ro;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/b6;->b:Lcom/google/android/gms/internal/ads/x5;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/x5;->b(Lcom/google/android/gms/internal/ads/x5;)Lcom/google/android/gms/internal/ads/q5;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/q5;->A()Lcom/google/android/gms/internal/ads/v5;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/ro;->b(Ljava/lang/Object;)Z
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/b6;->a:Lcom/google/android/gms/internal/ads/ro;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/ro;->a(Ljava/lang/Throwable;)Z

    return-void
.end method
