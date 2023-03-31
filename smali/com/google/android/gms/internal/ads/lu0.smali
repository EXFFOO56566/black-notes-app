.class final synthetic Lcom/google/android/gms/internal/ads/lu0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/id0;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/ro;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/ro;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/lu0;->a:Lcom/google/android/gms/internal/ads/ro;

    return-void
.end method


# virtual methods
.method public final a(ZLandroid/content/Context;)V
    .locals 1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/lu0;->a:Lcom/google/android/gms/internal/ads/ro;

    :try_start_0
    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->b()Lcom/google/android/gms/ads/internal/overlay/n;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ro;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    const/4 v0, 0x1

    invoke-static {p2, p1, v0}, Lcom/google/android/gms/ads/internal/overlay/n;->a(Landroid/content/Context;Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method
