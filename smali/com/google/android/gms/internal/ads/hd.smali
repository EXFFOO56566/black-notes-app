.class final Lcom/google/android/gms/internal/ads/hd;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic b:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

.field private final synthetic c:Lcom/google/android/gms/internal/ads/zzaol;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzaol;Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/hd;->c:Lcom/google/android/gms/internal/ads/zzaol;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/hd;->b:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->b()Lcom/google/android/gms/ads/internal/overlay/n;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/hd;->c:Lcom/google/android/gms/internal/ads/zzaol;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzaol;->b(Lcom/google/android/gms/internal/ads/zzaol;)Landroid/app/Activity;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/hd;->b:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/ads/internal/overlay/n;->a(Landroid/content/Context;Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;Z)V

    return-void
.end method
