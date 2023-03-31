.class public final Lcom/google/android/gms/internal/ads/p2;
.super Lcom/google/android/gms/ads/s/g;
.source ""


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/k2;

.field private final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/android/gms/ads/s/c$b;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lcom/google/android/gms/internal/ads/a2;

.field private final d:Lcom/google/android/gms/ads/p;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/k2;)V
    .locals 5

    const-string v0, ""

    invoke-direct {p0}, Lcom/google/android/gms/ads/s/g;-><init>()V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/p2;->b:Ljava/util/List;

    new-instance v1, Lcom/google/android/gms/ads/p;

    invoke-direct {v1}, Lcom/google/android/gms/ads/p;-><init>()V

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/p2;->d:Lcom/google/android/gms/ads/p;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/p2;->a:Lcom/google/android/gms/internal/ads/k2;

    const/4 v1, 0x0

    :try_start_0
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/k2;->h()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Landroid/os/IBinder;

    if-eqz v3, :cond_2

    check-cast v2, Landroid/os/IBinder;

    if-eqz v2, :cond_2

    const-string v3, "com.google.android.gms.ads.internal.formats.client.INativeAdImage"

    invoke-interface {v2, v3}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v3

    instance-of v4, v3, Lcom/google/android/gms/internal/ads/v1;

    if-eqz v4, :cond_1

    check-cast v3, Lcom/google/android/gms/internal/ads/v1;

    goto :goto_1

    :cond_1
    new-instance v3, Lcom/google/android/gms/internal/ads/x1;

    invoke-direct {v3, v2}, Lcom/google/android/gms/internal/ads/x1;-><init>(Landroid/os/IBinder;)V

    goto :goto_1

    :cond_2
    move-object v3, v1

    :goto_1
    if-eqz v3, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/p2;->b:Ljava/util/List;

    new-instance v4, Lcom/google/android/gms/internal/ads/a2;

    invoke-direct {v4, v3}, Lcom/google/android/gms/internal/ads/a2;-><init>(Lcom/google/android/gms/internal/ads/v1;)V

    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/co;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    :try_start_1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/p2;->a:Lcom/google/android/gms/internal/ads/k2;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/k2;->t()Lcom/google/android/gms/internal/ads/v1;

    move-result-object p1

    if-eqz p1, :cond_4

    new-instance v2, Lcom/google/android/gms/internal/ads/a2;

    invoke-direct {v2, p1}, Lcom/google/android/gms/internal/ads/a2;-><init>(Lcom/google/android/gms/internal/ads/v1;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    move-object v1, v2

    goto :goto_2

    :catch_1
    move-exception p1

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/co;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    :goto_2
    iput-object v1, p0, Lcom/google/android/gms/internal/ads/p2;->c:Lcom/google/android/gms/internal/ads/a2;

    :try_start_2
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/p2;->a:Lcom/google/android/gms/internal/ads/k2;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/k2;->e()Lcom/google/android/gms/internal/ads/o1;

    move-result-object p1

    if-eqz p1, :cond_5

    new-instance p1, Lcom/google/android/gms/internal/ads/s1;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/p2;->a:Lcom/google/android/gms/internal/ads/k2;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/k2;->e()Lcom/google/android/gms/internal/ads/o1;

    move-result-object v1

    invoke-direct {p1, v1}, Lcom/google/android/gms/internal/ads/s1;-><init>(Lcom/google/android/gms/internal/ads/o1;)V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_3

    :catch_2
    move-exception p1

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/co;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_5
    :goto_3
    return-void
.end method

.method private final k()Lb/c/b/a/d/a;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/p2;->a:Lcom/google/android/gms/internal/ads/k2;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/k2;->n()Lb/c/b/a/d/a;

    move-result-object v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    const-string v1, ""

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/co;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    return-object v0
.end method


# virtual methods
.method protected final synthetic a()Ljava/lang/Object;
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/p2;->k()Lb/c/b/a/d/a;

    move-result-object v0

    return-object v0
.end method

.method public final b()Ljava/lang/CharSequence;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/p2;->a:Lcom/google/android/gms/internal/ads/k2;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/k2;->d()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    const-string v1, ""

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/co;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final c()Ljava/lang/CharSequence;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/p2;->a:Lcom/google/android/gms/internal/ads/k2;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/k2;->f()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    const-string v1, ""

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/co;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final d()Ljava/lang/CharSequence;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/p2;->a:Lcom/google/android/gms/internal/ads/k2;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/k2;->b()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    const-string v1, ""

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/co;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final e()Lcom/google/android/gms/ads/s/c$b;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/p2;->c:Lcom/google/android/gms/internal/ads/a2;

    return-object v0
.end method

.method public final f()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/android/gms/ads/s/c$b;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/p2;->b:Ljava/util/List;

    return-object v0
.end method

.method public final g()Ljava/lang/CharSequence;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/p2;->a:Lcom/google/android/gms/internal/ads/k2;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/k2;->o()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    const-string v1, ""

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/co;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final h()Ljava/lang/Double;
    .locals 6

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/p2;->a:Lcom/google/android/gms/internal/ads/k2;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/k2;->k()D

    move-result-wide v1

    const-wide/high16 v3, -0x4010000000000000L    # -1.0

    cmpl-double v5, v1, v3

    if-nez v5, :cond_0

    return-object v0

    :cond_0
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v1

    const-string v2, ""

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/ads/co;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public final i()Ljava/lang/CharSequence;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/p2;->a:Lcom/google/android/gms/internal/ads/k2;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/k2;->r()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    const-string v1, ""

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/co;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final j()Lcom/google/android/gms/ads/p;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/p2;->a:Lcom/google/android/gms/internal/ads/k2;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/k2;->getVideoController()Lcom/google/android/gms/internal/ads/rp2;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/p2;->d:Lcom/google/android/gms/ads/p;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/p2;->a:Lcom/google/android/gms/internal/ads/k2;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/k2;->getVideoController()Lcom/google/android/gms/internal/ads/rp2;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/p;->a(Lcom/google/android/gms/internal/ads/rp2;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Exception occurred while getting video controller"

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/co;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/p2;->d:Lcom/google/android/gms/ads/p;

    return-object v0
.end method
