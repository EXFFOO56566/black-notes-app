.class public final Lcom/google/android/gms/internal/ads/yj0;
.super Lcom/google/android/gms/ads/p$a;
.source ""


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/if0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/if0;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/ads/p$a;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/yj0;->a:Lcom/google/android/gms/internal/ads/if0;

    return-void
.end method

.method private static a(Lcom/google/android/gms/internal/ads/if0;)Lcom/google/android/gms/internal/ads/sp2;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/if0;->n()Lcom/google/android/gms/internal/ads/rp2;

    move-result-object p0

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    :try_start_0
    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/rp2;->B0()Lcom/google/android/gms/internal/ads/sp2;

    move-result-object p0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    return-object v0
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/yj0;->a:Lcom/google/android/gms/internal/ads/if0;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/yj0;->a(Lcom/google/android/gms/internal/ads/if0;)Lcom/google/android/gms/internal/ads/sp2;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/sp2;->o0()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const-string v1, "Unable to call onVideoEnd()"

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/co;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final b()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/yj0;->a:Lcom/google/android/gms/internal/ads/if0;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/yj0;->a(Lcom/google/android/gms/internal/ads/if0;)Lcom/google/android/gms/internal/ads/sp2;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/sp2;->W()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const-string v1, "Unable to call onVideoEnd()"

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/co;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final d()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/yj0;->a:Lcom/google/android/gms/internal/ads/if0;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/yj0;->a(Lcom/google/android/gms/internal/ads/if0;)Lcom/google/android/gms/internal/ads/sp2;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/sp2;->O0()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const-string v1, "Unable to call onVideoEnd()"

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/co;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
