.class public Lcom/google/android/gms/internal/ads/k20;
.super Ljava/lang/Object;
.source ""


# instance fields
.field protected final a:Lcom/google/android/gms/internal/ads/vd1;

.field protected final b:Lcom/google/android/gms/internal/ads/id1;

.field private final c:Lcom/google/android/gms/internal/ads/p60;

.field private final d:Lcom/google/android/gms/internal/ads/g70;

.field private final e:Lcom/google/android/gms/internal/ads/jb1;

.field private final f:Lcom/google/android/gms/internal/ads/p50;


# direct methods
.method protected constructor <init>(Lcom/google/android/gms/internal/ads/n20;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/n20;->a(Lcom/google/android/gms/internal/ads/n20;)Lcom/google/android/gms/internal/ads/vd1;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/k20;->a:Lcom/google/android/gms/internal/ads/vd1;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/n20;->b(Lcom/google/android/gms/internal/ads/n20;)Lcom/google/android/gms/internal/ads/id1;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/k20;->b:Lcom/google/android/gms/internal/ads/id1;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/n20;->c(Lcom/google/android/gms/internal/ads/n20;)Lcom/google/android/gms/internal/ads/p60;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/k20;->c:Lcom/google/android/gms/internal/ads/p60;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/n20;->d(Lcom/google/android/gms/internal/ads/n20;)Lcom/google/android/gms/internal/ads/g70;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/k20;->d:Lcom/google/android/gms/internal/ads/g70;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/n20;->e(Lcom/google/android/gms/internal/ads/n20;)Lcom/google/android/gms/internal/ads/jb1;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/k20;->e:Lcom/google/android/gms/internal/ads/jb1;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/n20;->f(Lcom/google/android/gms/internal/ads/n20;)Lcom/google/android/gms/internal/ads/p50;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/k20;->f:Lcom/google/android/gms/internal/ads/p50;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/k20;->c:Lcom/google/android/gms/internal/ads/p60;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/p60;->d(Landroid/content/Context;)V

    return-void
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/k20;->d:Lcom/google/android/gms/internal/ads/g70;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/g70;->s()V

    return-void
.end method

.method public final c()Lcom/google/android/gms/internal/ads/p60;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/k20;->c:Lcom/google/android/gms/internal/ads/p60;

    return-object v0
.end method

.method public final d()Lcom/google/android/gms/internal/ads/p50;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/k20;->f:Lcom/google/android/gms/internal/ads/p50;

    return-object v0
.end method

.method public final e()Lcom/google/android/gms/internal/ads/jb1;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/k20;->e:Lcom/google/android/gms/internal/ads/jb1;

    return-object v0
.end method
