.class public final Lcom/google/android/gms/internal/ads/ga;
.super Lcom/google/android/gms/internal/ads/hv;
.source ""


# instance fields
.field private final b:Lb/c/b/a/f/a/a;


# direct methods
.method constructor <init>(Lb/c/b/a/f/a/a;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/hv;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ga;->b:Lb/c/b/a/f/a/a;

    return-void
.end method


# virtual methods
.method public final A0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ga;->b:Lb/c/b/a/f/a/a;

    invoke-virtual {v0}, Lb/c/b/a/f/a/a;->f()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final T0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ga;->b:Lb/c/b/a/f/a/a;

    invoke-virtual {v0}, Lb/c/b/a/f/a/a;->d()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;Z)Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ga;->b:Lb/c/b/a/f/a/a;

    invoke-virtual {v0, p1, p2, p3}, Lb/c/b/a/f/a/a;->a(Ljava/lang/String;Ljava/lang/String;Z)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method public final a(Lb/c/b/a/d/a;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ga;->b:Lb/c/b/a/f/a/a;

    if-eqz p1, :cond_0

    invoke-static {p1}, Lb/c/b/a/d/b;->Q(Lb/c/b/a/d/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/Activity;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {v0, p1, p2, p3}, Lb/c/b/a/f/a/a;->a(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ga;->b:Lb/c/b/a/f/a/a;

    invoke-virtual {v0, p1, p2, p3}, Lb/c/b/a/f/a/a;->a(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;Lb/c/b/a/d/a;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ga;->b:Lb/c/b/a/f/a/a;

    if-eqz p3, :cond_0

    invoke-static {p3}, Lb/c/b/a/d/b;->Q(Lb/c/b/a/d/a;)Ljava/lang/Object;

    move-result-object p3

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    :goto_0
    invoke-virtual {v0, p1, p2, p3}, Lb/c/b/a/f/a/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public final b(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ga;->b:Lb/c/b/a/f/a/a;

    invoke-virtual {v0, p1, p2}, Lb/c/b/a/f/a/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final c(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ga;->b:Lb/c/b/a/f/a/a;

    invoke-virtual {v0, p1, p2, p3}, Lb/c/b/a/f/a/a;->b(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public final f(Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ga;->b:Lb/c/b/a/f/a/a;

    invoke-virtual {v0, p1}, Lb/c/b/a/f/a/a;->a(Landroid/os/Bundle;)V

    return-void
.end method

.method public final g(Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ga;->b:Lb/c/b/a/f/a/a;

    invoke-virtual {v0, p1}, Lb/c/b/a/f/a/a;->c(Landroid/os/Bundle;)V

    return-void
.end method

.method public final i(Landroid/os/Bundle;)Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ga;->b:Lb/c/b/a/f/a/a;

    invoke-virtual {v0, p1}, Lb/c/b/a/f/a/a;->b(Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object p1

    return-object p1
.end method

.method public final o(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ga;->b:Lb/c/b/a/f/a/a;

    invoke-virtual {v0, p1}, Lb/c/b/a/f/a/a;->a(Ljava/lang/String;)V

    return-void
.end method

.method public final q1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ga;->b:Lb/c/b/a/f/a/a;

    invoke-virtual {v0}, Lb/c/b/a/f/a/a;->c()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final w1()J
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ga;->b:Lb/c/b/a/f/a/a;

    invoke-virtual {v0}, Lb/c/b/a/f/a/a;->a()J

    move-result-wide v0

    return-wide v0
.end method

.method public final y(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ga;->b:Lb/c/b/a/f/a/a;

    invoke-virtual {v0, p1}, Lb/c/b/a/f/a/a;->b(Ljava/lang/String;)V

    return-void
.end method

.method public final y0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ga;->b:Lb/c/b/a/f/a/a;

    invoke-virtual {v0}, Lb/c/b/a/f/a/a;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final y1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ga;->b:Lb/c/b/a/f/a/a;

    invoke-virtual {v0}, Lb/c/b/a/f/a/a;->e()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final z(Ljava/lang/String;)I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ga;->b:Lb/c/b/a/f/a/a;

    invoke-virtual {v0, p1}, Lb/c/b/a/f/a/a;->c(Ljava/lang/String;)I

    move-result p1

    return p1
.end method
