.class final Lcom/google/android/gms/internal/ads/ur;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic b:Lcom/google/android/gms/internal/ads/vr;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/vr;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ur;->b:Lcom/google/android/gms/internal/ads/vr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->y()Lcom/google/android/gms/internal/ads/xr;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ur;->b:Lcom/google/android/gms/internal/ads/vr;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/xr;->b(Lcom/google/android/gms/internal/ads/vr;)V

    return-void
.end method
