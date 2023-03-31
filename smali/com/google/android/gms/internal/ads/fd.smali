.class final Lcom/google/android/gms/internal/ads/fd;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/ads/internal/overlay/o;


# instance fields
.field private final synthetic b:Lcom/google/android/gms/internal/ads/zzaol;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzaol;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/fd;->b:Lcom/google/android/gms/internal/ads/zzaol;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final I()V
    .locals 2

    const-string v0, "AdMobCustomTabsAdapter overlay is closed."

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/co;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/fd;->b:Lcom/google/android/gms/internal/ads/zzaol;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzaol;->a(Lcom/google/android/gms/internal/ads/zzaol;)Lcom/google/android/gms/ads/mediation/l;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/fd;->b:Lcom/google/android/gms/internal/ads/zzaol;

    invoke-interface {v0, v1}, Lcom/google/android/gms/ads/mediation/l;->c(Lcom/google/android/gms/ads/mediation/MediationInterstitialAdapter;)V

    return-void
.end method

.method public final onPause()V
    .locals 1

    const-string v0, "AdMobCustomTabsAdapter overlay is paused."

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/co;->a(Ljava/lang/String;)V

    return-void
.end method

.method public final onResume()V
    .locals 1

    const-string v0, "AdMobCustomTabsAdapter overlay is resumed."

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/co;->a(Ljava/lang/String;)V

    return-void
.end method

.method public final p()V
    .locals 2

    const-string v0, "Opening AdMobCustomTabsAdapter overlay."

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/co;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/fd;->b:Lcom/google/android/gms/internal/ads/zzaol;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzaol;->a(Lcom/google/android/gms/internal/ads/zzaol;)Lcom/google/android/gms/ads/mediation/l;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/fd;->b:Lcom/google/android/gms/internal/ads/zzaol;

    invoke-interface {v0, v1}, Lcom/google/android/gms/ads/mediation/l;->e(Lcom/google/android/gms/ads/mediation/MediationInterstitialAdapter;)V

    return-void
.end method
