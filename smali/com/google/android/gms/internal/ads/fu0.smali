.class final synthetic Lcom/google/android/gms/internal/ads/fu0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/l20;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/lt0;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/lt0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/fu0;->a:Lcom/google/android/gms/internal/ads/lt0;

    return-void
.end method


# virtual methods
.method public final getVideoController()Lcom/google/android/gms/internal/ads/rp2;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/fu0;->a:Lcom/google/android/gms/internal/ads/lt0;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/gu0;->a(Lcom/google/android/gms/internal/ads/lt0;)Lcom/google/android/gms/internal/ads/rp2;

    move-result-object v0

    return-object v0
.end method
