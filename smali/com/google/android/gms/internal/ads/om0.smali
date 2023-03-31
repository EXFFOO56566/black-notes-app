.class final synthetic Lcom/google/android/gms/internal/ads/om0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/zj2;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/vd1;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/vd1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/om0;->a:Lcom/google/android/gms/internal/ads/vd1;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/vk2$a;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/om0;->a:Lcom/google/android/gms/internal/ads/vd1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/vk2$a;->o()Lcom/google/android/gms/internal/ads/ik2;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/rz1;->k()Lcom/google/android/gms/internal/ads/rz1$a;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/ik2$b;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/vk2$a;->o()Lcom/google/android/gms/internal/ads/ik2;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/ik2;->p()Lcom/google/android/gms/internal/ads/rk2;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/rz1;->k()Lcom/google/android/gms/internal/ads/rz1$a;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/ads/rk2$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/vd1;->b:Lcom/google/android/gms/internal/ads/sd1;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/sd1;->b:Lcom/google/android/gms/internal/ads/kd1;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/kd1;->b:Ljava/lang/String;

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/rk2$a;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/rk2$a;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/ik2$b;->a(Lcom/google/android/gms/internal/ads/rk2$a;)Lcom/google/android/gms/internal/ads/ik2$b;

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/ads/vk2$a;->a(Lcom/google/android/gms/internal/ads/ik2$b;)Lcom/google/android/gms/internal/ads/vk2$a;

    return-void
.end method
