.class final synthetic Lcom/google/android/gms/internal/ads/am0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/zj2;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/ik2$a;

.field private final b:Ljava/lang/String;

.field private final c:Lcom/google/android/gms/internal/ads/hl2;

.field private final d:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/ik2$a;Ljava/lang/String;Lcom/google/android/gms/internal/ads/hl2;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/am0;->a:Lcom/google/android/gms/internal/ads/ik2$a;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/am0;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/am0;->c:Lcom/google/android/gms/internal/ads/hl2;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/am0;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/vk2$a;)V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/am0;->a:Lcom/google/android/gms/internal/ads/ik2$a;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/am0;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/am0;->c:Lcom/google/android/gms/internal/ads/hl2;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/am0;->d:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/vk2$a;->o()Lcom/google/android/gms/internal/ads/ik2;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/rz1;->k()Lcom/google/android/gms/internal/ads/rz1$a;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/ads/ik2$b;

    invoke-virtual {v4, v0}, Lcom/google/android/gms/internal/ads/ik2$b;->a(Lcom/google/android/gms/internal/ads/ik2$a;)Lcom/google/android/gms/internal/ads/ik2$b;

    invoke-virtual {p1, v4}, Lcom/google/android/gms/internal/ads/vk2$a;->a(Lcom/google/android/gms/internal/ads/ik2$b;)Lcom/google/android/gms/internal/ads/vk2$a;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/vk2$a;->n()Lcom/google/android/gms/internal/ads/tk2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/rz1;->k()Lcom/google/android/gms/internal/ads/rz1$a;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/tk2$a;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/tk2$a;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/tk2$a;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/tk2$a;->a(Lcom/google/android/gms/internal/ads/hl2;)Lcom/google/android/gms/internal/ads/tk2$a;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/vk2$a;->a(Lcom/google/android/gms/internal/ads/tk2$a;)Lcom/google/android/gms/internal/ads/vk2$a;

    invoke-virtual {p1, v3}, Lcom/google/android/gms/internal/ads/vk2$a;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/vk2$a;

    return-void
.end method
