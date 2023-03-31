.class final Lcom/google/ads/mediation/AbstractAdViewAdapter$c;
.super Lcom/google/android/gms/ads/b;
.source ""

# interfaces
.implements Lcom/google/android/gms/ads/r/a;
.implements Lcom/google/android/gms/internal/ads/jm2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/ads/mediation/AbstractAdViewAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "c"
.end annotation


# instance fields
.field private final b:Lcom/google/ads/mediation/AbstractAdViewAdapter;

.field private final c:Lcom/google/android/gms/ads/mediation/h;


# direct methods
.method public constructor <init>(Lcom/google/ads/mediation/AbstractAdViewAdapter;Lcom/google/android/gms/ads/mediation/h;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/ads/b;-><init>()V

    iput-object p1, p0, Lcom/google/ads/mediation/AbstractAdViewAdapter$c;->b:Lcom/google/ads/mediation/AbstractAdViewAdapter;

    iput-object p2, p0, Lcom/google/ads/mediation/AbstractAdViewAdapter$c;->c:Lcom/google/android/gms/ads/mediation/h;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lcom/google/ads/mediation/AbstractAdViewAdapter$c;->c:Lcom/google/android/gms/ads/mediation/h;

    iget-object v1, p0, Lcom/google/ads/mediation/AbstractAdViewAdapter$c;->b:Lcom/google/ads/mediation/AbstractAdViewAdapter;

    invoke-interface {v0, v1}, Lcom/google/android/gms/ads/mediation/h;->a(Lcom/google/android/gms/ads/mediation/MediationBannerAdapter;)V

    return-void
.end method

.method public final a(I)V
    .locals 2

    iget-object v0, p0, Lcom/google/ads/mediation/AbstractAdViewAdapter$c;->c:Lcom/google/android/gms/ads/mediation/h;

    iget-object v1, p0, Lcom/google/ads/mediation/AbstractAdViewAdapter$c;->b:Lcom/google/ads/mediation/AbstractAdViewAdapter;

    invoke-interface {v0, v1, p1}, Lcom/google/android/gms/ads/mediation/h;->a(Lcom/google/android/gms/ads/mediation/MediationBannerAdapter;I)V

    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/google/ads/mediation/AbstractAdViewAdapter$c;->c:Lcom/google/android/gms/ads/mediation/h;

    iget-object v1, p0, Lcom/google/ads/mediation/AbstractAdViewAdapter$c;->b:Lcom/google/ads/mediation/AbstractAdViewAdapter;

    invoke-interface {v0, v1, p1, p2}, Lcom/google/android/gms/ads/mediation/h;->a(Lcom/google/android/gms/ads/mediation/MediationBannerAdapter;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final c()V
    .locals 2

    iget-object v0, p0, Lcom/google/ads/mediation/AbstractAdViewAdapter$c;->c:Lcom/google/android/gms/ads/mediation/h;

    iget-object v1, p0, Lcom/google/ads/mediation/AbstractAdViewAdapter$c;->b:Lcom/google/ads/mediation/AbstractAdViewAdapter;

    invoke-interface {v0, v1}, Lcom/google/android/gms/ads/mediation/h;->d(Lcom/google/android/gms/ads/mediation/MediationBannerAdapter;)V

    return-void
.end method

.method public final d()V
    .locals 2

    iget-object v0, p0, Lcom/google/ads/mediation/AbstractAdViewAdapter$c;->c:Lcom/google/android/gms/ads/mediation/h;

    iget-object v1, p0, Lcom/google/ads/mediation/AbstractAdViewAdapter$c;->b:Lcom/google/ads/mediation/AbstractAdViewAdapter;

    invoke-interface {v0, v1}, Lcom/google/android/gms/ads/mediation/h;->c(Lcom/google/android/gms/ads/mediation/MediationBannerAdapter;)V

    return-void
.end method

.method public final e()V
    .locals 2

    iget-object v0, p0, Lcom/google/ads/mediation/AbstractAdViewAdapter$c;->c:Lcom/google/android/gms/ads/mediation/h;

    iget-object v1, p0, Lcom/google/ads/mediation/AbstractAdViewAdapter$c;->b:Lcom/google/ads/mediation/AbstractAdViewAdapter;

    invoke-interface {v0, v1}, Lcom/google/android/gms/ads/mediation/h;->e(Lcom/google/android/gms/ads/mediation/MediationBannerAdapter;)V

    return-void
.end method

.method public final l()V
    .locals 2

    iget-object v0, p0, Lcom/google/ads/mediation/AbstractAdViewAdapter$c;->c:Lcom/google/android/gms/ads/mediation/h;

    iget-object v1, p0, Lcom/google/ads/mediation/AbstractAdViewAdapter$c;->b:Lcom/google/ads/mediation/AbstractAdViewAdapter;

    invoke-interface {v0, v1}, Lcom/google/android/gms/ads/mediation/h;->b(Lcom/google/android/gms/ads/mediation/MediationBannerAdapter;)V

    return-void
.end method
