.class public final Lcom/google/android/gms/internal/ads/fw0;
.super Lcom/google/android/gms/internal/ads/gw0;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ads/gw0<",
        "Lcom/google/android/gms/internal/ads/n00;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/kv;

.field private final b:Lcom/google/android/gms/internal/ads/g50$a;

.field private final c:Lcom/google/android/gms/internal/ads/ry0;

.field private final d:Lcom/google/android/gms/internal/ads/k90;

.field private final e:Lcom/google/android/gms/internal/ads/vd0;

.field private final f:Lcom/google/android/gms/internal/ads/e80;

.field private final g:Landroid/view/ViewGroup;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/kv;Lcom/google/android/gms/internal/ads/g50$a;Lcom/google/android/gms/internal/ads/ry0;Lcom/google/android/gms/internal/ads/k90;Lcom/google/android/gms/internal/ads/vd0;Lcom/google/android/gms/internal/ads/e80;Landroid/view/ViewGroup;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/gw0;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/fw0;->a:Lcom/google/android/gms/internal/ads/kv;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/fw0;->b:Lcom/google/android/gms/internal/ads/g50$a;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/fw0;->c:Lcom/google/android/gms/internal/ads/ry0;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/fw0;->d:Lcom/google/android/gms/internal/ads/k90;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/fw0;->e:Lcom/google/android/gms/internal/ads/vd0;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/fw0;->f:Lcom/google/android/gms/internal/ads/e80;

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/fw0;->g:Landroid/view/ViewGroup;

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
            "Lcom/google/android/gms/internal/ads/n00;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/fw0;->a:Lcom/google/android/gms/internal/ads/kv;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/kv;->h()Lcom/google/android/gms/internal/ads/j10;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/fw0;->b:Lcom/google/android/gms/internal/ads/g50$a;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/g50$a;->a(Lcom/google/android/gms/internal/ads/zd1;)Lcom/google/android/gms/internal/ads/g50$a;

    invoke-virtual {v1, p2}, Lcom/google/android/gms/internal/ads/g50$a;->a(Landroid/os/Bundle;)Lcom/google/android/gms/internal/ads/g50$a;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/g50$a;->a()Lcom/google/android/gms/internal/ads/g50;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/j10;->d(Lcom/google/android/gms/internal/ads/g50;)Lcom/google/android/gms/internal/ads/j10;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/fw0;->d:Lcom/google/android/gms/internal/ads/k90;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/j10;->b(Lcom/google/android/gms/internal/ads/k90;)Lcom/google/android/gms/internal/ads/j10;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/fw0;->c:Lcom/google/android/gms/internal/ads/ry0;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/j10;->b(Lcom/google/android/gms/internal/ads/ry0;)Lcom/google/android/gms/internal/ads/j10;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/fw0;->e:Lcom/google/android/gms/internal/ads/vd0;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/j10;->a(Lcom/google/android/gms/internal/ads/vd0;)Lcom/google/android/gms/internal/ads/j10;

    new-instance p1, Lcom/google/android/gms/internal/ads/h20;

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/fw0;->f:Lcom/google/android/gms/internal/ads/e80;

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/h20;-><init>(Lcom/google/android/gms/internal/ads/e80;)V

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/j10;->a(Lcom/google/android/gms/internal/ads/h20;)Lcom/google/android/gms/internal/ads/j10;

    new-instance p1, Lcom/google/android/gms/internal/ads/i00;

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/fw0;->g:Landroid/view/ViewGroup;

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/i00;-><init>(Landroid/view/ViewGroup;)V

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/j10;->a(Lcom/google/android/gms/internal/ads/i00;)Lcom/google/android/gms/internal/ads/j10;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/j10;->a()Lcom/google/android/gms/internal/ads/k10;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/k10;->a()Lcom/google/android/gms/internal/ads/l30;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/l30;->b()Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    return-object p1
.end method
