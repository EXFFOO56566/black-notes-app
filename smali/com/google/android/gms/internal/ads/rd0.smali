.class public final Lcom/google/android/gms/internal/ads/rd0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/u50;
.implements Lcom/google/android/gms/internal/ads/pa0;


# instance fields
.field private final b:Lcom/google/android/gms/internal/ads/zi;

.field private final c:Landroid/content/Context;

.field private final d:Lcom/google/android/gms/internal/ads/cj;

.field private final e:Landroid/view/View;

.field private f:Ljava/lang/String;

.field private final g:Lcom/google/android/gms/internal/ads/ik2$a;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zi;Landroid/content/Context;Lcom/google/android/gms/internal/ads/cj;Landroid/view/View;Lcom/google/android/gms/internal/ads/ik2$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/rd0;->b:Lcom/google/android/gms/internal/ads/zi;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/rd0;->c:Landroid/content/Context;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/rd0;->d:Lcom/google/android/gms/internal/ads/cj;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/rd0;->e:Landroid/view/View;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/rd0;->g:Lcom/google/android/gms/internal/ads/ik2$a;

    return-void
.end method


# virtual methods
.method public final A()V
    .locals 0

    return-void
.end method

.method public final B()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/rd0;->e:Landroid/view/View;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/rd0;->f:Ljava/lang/String;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/rd0;->d:Lcom/google/android/gms/internal/ads/cj;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/rd0;->f:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/internal/ads/cj;->c(Landroid/content/Context;Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/rd0;->b:Lcom/google/android/gms/internal/ads/zi;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zi;->a(Z)V

    return-void
.end method

.method public final G()V
    .locals 0

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/ug;Ljava/lang/String;Ljava/lang/String;)V
    .locals 6
    .annotation runtime Ljavax/annotation/ParametersAreNonnullByDefault;
    .end annotation

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/rd0;->d:Lcom/google/android/gms/internal/ads/cj;

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/rd0;->c:Landroid/content/Context;

    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/ads/cj;->a(Landroid/content/Context;)Z

    move-result p2

    if-eqz p2, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/rd0;->d:Lcom/google/android/gms/internal/ads/cj;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/rd0;->c:Landroid/content/Context;

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/rd0;->d:Lcom/google/android/gms/internal/ads/cj;

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/rd0;->c:Landroid/content/Context;

    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/ads/cj;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/rd0;->b:Lcom/google/android/gms/internal/ads/zi;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zi;->j()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/ug;->m()Ljava/lang/String;

    move-result-object v4

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/ug;->I()I

    move-result v5

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/cj;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string p2, "Remote Exception to get reward item."

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/ads/co;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public final w()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/rd0;->d:Lcom/google/android/gms/internal/ads/cj;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/rd0;->c:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/cj;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/rd0;->f:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/rd0;->g:Lcom/google/android/gms/internal/ads/ik2$a;

    sget-object v2, Lcom/google/android/gms/internal/ads/ik2$a;->j:Lcom/google/android/gms/internal/ads/ik2$a;

    if-ne v1, v2, :cond_0

    const-string v1, "/Rewarded"

    goto :goto_0

    :cond_0
    const-string v1, "/Interstitial"

    :goto_0
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_1
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v0}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    move-object v0, v1

    :goto_1
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/rd0;->f:Ljava/lang/String;

    return-void
.end method

.method public final x()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/rd0;->b:Lcom/google/android/gms/internal/ads/zi;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zi;->a(Z)V

    return-void
.end method

.method public final y()V
    .locals 0

    return-void
.end method
