.class final synthetic Lcom/google/android/gms/internal/ads/gt0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/zj2;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/hl2;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/hl2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/gt0;->a:Lcom/google/android/gms/internal/ads/hl2;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/vk2$a;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/gt0;->a:Lcom/google/android/gms/internal/ads/hl2;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/vk2$a;->n()Lcom/google/android/gms/internal/ads/tk2;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/rz1;->k()Lcom/google/android/gms/internal/ads/rz1$a;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/tk2$a;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/tk2$a;->a(Lcom/google/android/gms/internal/ads/hl2;)Lcom/google/android/gms/internal/ads/tk2$a;

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/ads/vk2$a;->a(Lcom/google/android/gms/internal/ads/tk2$a;)Lcom/google/android/gms/internal/ads/vk2$a;

    return-void
.end method
