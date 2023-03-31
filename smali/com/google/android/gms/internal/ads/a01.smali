.class final synthetic Lcom/google/android/gms/internal/ads/a01;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/a60;


# instance fields
.field private final b:Lcom/google/android/gms/internal/ads/vz0;

.field private final c:Lcom/google/android/gms/internal/ads/x6;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/vz0;Lcom/google/android/gms/internal/ads/x6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/a01;->b:Lcom/google/android/gms/internal/ads/vz0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/a01;->c:Lcom/google/android/gms/internal/ads/x6;

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/a01;->b:Lcom/google/android/gms/internal/ads/vz0;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/a01;->c:Lcom/google/android/gms/internal/ads/x6;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/vz0;->a(I)V

    if-eqz v1, :cond_0

    :try_start_0
    invoke-interface {v1, p1}, Lcom/google/android/gms/internal/ads/x6;->i(I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v0, "#007 Could not call remote method."

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/co;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method
