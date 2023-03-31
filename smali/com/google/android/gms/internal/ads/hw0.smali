.class public final Lcom/google/android/gms/internal/ads/hw0;
.super Lcom/google/android/gms/internal/ads/gw0;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ads/gw0<",
        "Lcom/google/android/gms/internal/ads/ac0;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/kv;

.field private final b:Lcom/google/android/gms/internal/ads/g50$a;

.field private final c:Lcom/google/android/gms/internal/ads/ry0;

.field private final d:Lcom/google/android/gms/internal/ads/k90;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/kv;Lcom/google/android/gms/internal/ads/g50$a;Lcom/google/android/gms/internal/ads/ry0;Lcom/google/android/gms/internal/ads/k90;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/gw0;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/hw0;->a:Lcom/google/android/gms/internal/ads/kv;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/hw0;->b:Lcom/google/android/gms/internal/ads/g50$a;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/hw0;->c:Lcom/google/android/gms/internal/ads/ry0;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/hw0;->d:Lcom/google/android/gms/internal/ads/k90;

    return-void
.end method


# virtual methods
.method protected final a(Lcom/google/android/gms/internal/ads/zd1;Landroid/os/Bundle;)Lcom/google/android/gms/internal/ads/lo1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/zd1;",
            "Landroid/os/Bundle;",
            ")",
            "Lcom/google/android/gms/internal/ads/lo1<",
            "Lcom/google/android/gms/internal/ads/ac0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/hw0;->a:Lcom/google/android/gms/internal/ads/kv;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/kv;->k()Lcom/google/android/gms/internal/ads/zc0;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/hw0;->b:Lcom/google/android/gms/internal/ads/g50$a;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/g50$a;->a(Lcom/google/android/gms/internal/ads/zd1;)Lcom/google/android/gms/internal/ads/g50$a;

    invoke-virtual {v1, p2}, Lcom/google/android/gms/internal/ads/g50$a;->a(Landroid/os/Bundle;)Lcom/google/android/gms/internal/ads/g50$a;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/g50$a;->a()Lcom/google/android/gms/internal/ads/g50;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/zc0;->c(Lcom/google/android/gms/internal/ads/g50;)Lcom/google/android/gms/internal/ads/zc0;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/hw0;->d:Lcom/google/android/gms/internal/ads/k90;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/zc0;->c(Lcom/google/android/gms/internal/ads/k90;)Lcom/google/android/gms/internal/ads/zc0;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/hw0;->c:Lcom/google/android/gms/internal/ads/ry0;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/zc0;->a(Lcom/google/android/gms/internal/ads/ry0;)Lcom/google/android/gms/internal/ads/zc0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zc0;->e()Lcom/google/android/gms/internal/ads/ad0;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ad0;->a()Lcom/google/android/gms/internal/ads/l30;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/l30;->b()Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    return-object p1
.end method
