.class public final Lcom/google/android/gms/ads/i;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/dq2;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/ads/dq2;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ads/dq2;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/google/android/gms/ads/i;->a:Lcom/google/android/gms/internal/ads/dq2;

    const-string v0, "Context cannot be null"

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/i;->a:Lcom/google/android/gms/internal/ads/dq2;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/dq2;->a()Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lcom/google/android/gms/ads/b;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/i;->a:Lcom/google/android/gms/internal/ads/dq2;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/dq2;->a(Lcom/google/android/gms/ads/b;)V

    if-eqz p1, :cond_0

    instance-of v0, p1, Lcom/google/android/gms/internal/ads/jm2;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/i;->a:Lcom/google/android/gms/internal/ads/dq2;

    check-cast p1, Lcom/google/android/gms/internal/ads/jm2;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/dq2;->a(Lcom/google/android/gms/internal/ads/jm2;)V

    return-void

    :cond_0
    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/ads/i;->a:Lcom/google/android/gms/internal/ads/dq2;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/dq2;->a(Lcom/google/android/gms/internal/ads/jm2;)V

    :cond_1
    return-void
.end method

.method public final a(Lcom/google/android/gms/ads/d;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/i;->a:Lcom/google/android/gms/internal/ads/dq2;

    invoke-virtual {p1}, Lcom/google/android/gms/ads/d;->a()Lcom/google/android/gms/internal/ads/zp2;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/dq2;->a(Lcom/google/android/gms/internal/ads/zp2;)V

    return-void
.end method

.method public final a(Lcom/google/android/gms/ads/x/a;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/i;->a:Lcom/google/android/gms/internal/ads/dq2;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/dq2;->a(Lcom/google/android/gms/ads/x/a;)V

    return-void
.end method

.method public final a(Lcom/google/android/gms/ads/x/d;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/i;->a:Lcom/google/android/gms/internal/ads/dq2;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/dq2;->a(Lcom/google/android/gms/ads/x/d;)V

    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/i;->a:Lcom/google/android/gms/internal/ads/dq2;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/dq2;->a(Ljava/lang/String;)V

    return-void
.end method

.method public final a(Z)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/i;->a:Lcom/google/android/gms/internal/ads/dq2;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/dq2;->a(Z)V

    return-void
.end method

.method public final b(Z)V
    .locals 1

    iget-object p1, p0, Lcom/google/android/gms/ads/i;->a:Lcom/google/android/gms/internal/ads/dq2;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/dq2;->b(Z)V

    return-void
.end method

.method public final b()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/i;->a:Lcom/google/android/gms/internal/ads/dq2;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/dq2;->b()Z

    move-result v0

    return v0
.end method

.method public final c()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/i;->a:Lcom/google/android/gms/internal/ads/dq2;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/dq2;->c()V

    return-void
.end method
