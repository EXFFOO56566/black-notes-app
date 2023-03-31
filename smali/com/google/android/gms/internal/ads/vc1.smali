.class final Lcom/google/android/gms/internal/ads/vc1;
.super Lcom/google/android/gms/ads/x/a;
.source ""


# instance fields
.field private final synthetic a:Lcom/google/android/gms/internal/ads/gp2;

.field private final synthetic b:Lcom/google/android/gms/internal/ads/wc1;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/wc1;Lcom/google/android/gms/internal/ads/gp2;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/vc1;->b:Lcom/google/android/gms/internal/ads/wc1;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/vc1;->a:Lcom/google/android/gms/internal/ads/gp2;

    invoke-direct {p0}, Lcom/google/android/gms/ads/x/a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/vc1;->b:Lcom/google/android/gms/internal/ads/wc1;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/wc1;->a(Lcom/google/android/gms/internal/ads/wc1;)Lcom/google/android/gms/internal/ads/ck0;

    move-result-object v0

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/vc1;->a:Lcom/google/android/gms/internal/ads/gp2;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/gp2;->O()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const-string v1, "#007 Could not call remote method."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/co;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method
