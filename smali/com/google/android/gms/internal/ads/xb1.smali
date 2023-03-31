.class final synthetic Lcom/google/android/gms/internal/ads/xb1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/bb1;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/ug;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/ug;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/xb1;->a:Lcom/google/android/gms/internal/ads/ug;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/xb1;->a:Lcom/google/android/gms/internal/ads/ug;

    check-cast p1, Lcom/google/android/gms/internal/ads/bi;

    new-instance v1, Lcom/google/android/gms/internal/ads/ki;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ug;->m()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ug;->I()I

    move-result v0

    invoke-direct {v1, v2, v0}, Lcom/google/android/gms/internal/ads/ki;-><init>(Ljava/lang/String;I)V

    invoke-interface {p1, v1}, Lcom/google/android/gms/internal/ads/bi;->a(Lcom/google/android/gms/internal/ads/wh;)V

    return-void
.end method
