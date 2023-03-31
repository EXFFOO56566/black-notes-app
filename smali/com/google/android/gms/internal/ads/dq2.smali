.class public final Lcom/google/android/gms/internal/ads/dq2;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/oa;

.field private final b:Landroid/content/Context;

.field private c:Lcom/google/android/gms/ads/b;

.field private d:Lcom/google/android/gms/internal/ads/jm2;

.field private e:Lcom/google/android/gms/internal/ads/eo2;

.field private f:Ljava/lang/String;

.field private g:Lcom/google/android/gms/ads/x/a;

.field private h:Lcom/google/android/gms/ads/r/a;

.field private i:Lcom/google/android/gms/ads/r/c;

.field private j:Lcom/google/android/gms/ads/x/d;

.field private k:Z

.field private l:Z

.field private m:Lcom/google/android/gms/ads/l;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/ads/sm2;->a:Lcom/google/android/gms/internal/ads/sm2;

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lcom/google/android/gms/internal/ads/dq2;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/sm2;Lcom/google/android/gms/ads/r/e;)V

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/sm2;Lcom/google/android/gms/ads/r/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p2, Lcom/google/android/gms/internal/ads/oa;

    invoke-direct {p2}, Lcom/google/android/gms/internal/ads/oa;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/dq2;->a:Lcom/google/android/gms/internal/ads/oa;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/dq2;->b:Landroid/content/Context;

    return-void
.end method

.method private final b(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dq2;->e:Lcom/google/android/gms/internal/ads/eo2;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, 0x3f

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "The ad unit ID must be set on InterstitialAd before "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " is called."

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final a()Landroid/os/Bundle;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dq2;->e:Lcom/google/android/gms/internal/ads/eo2;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dq2;->e:Lcom/google/android/gms/internal/ads/eo2;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/eo2;->v()Landroid/os/Bundle;

    move-result-object v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    const-string v1, "#008 Must be called on the main UI thread."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/co;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    return-object v0
.end method

.method public final a(Lcom/google/android/gms/ads/b;)V
    .locals 2

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/dq2;->c:Lcom/google/android/gms/ads/b;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dq2;->e:Lcom/google/android/gms/internal/ads/eo2;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dq2;->e:Lcom/google/android/gms/internal/ads/eo2;

    if-eqz p1, :cond_0

    new-instance v1, Lcom/google/android/gms/internal/ads/nm2;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/ads/nm2;-><init>(Lcom/google/android/gms/ads/b;)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/eo2;->a(Lcom/google/android/gms/internal/ads/rn2;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    return-void

    :catch_0
    move-exception p1

    const-string v0, "#008 Must be called on the main UI thread."

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/co;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final a(Lcom/google/android/gms/ads/x/a;)V
    .locals 2

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/dq2;->g:Lcom/google/android/gms/ads/x/a;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dq2;->e:Lcom/google/android/gms/internal/ads/eo2;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dq2;->e:Lcom/google/android/gms/internal/ads/eo2;

    if-eqz p1, :cond_0

    new-instance v1, Lcom/google/android/gms/internal/ads/om2;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/ads/om2;-><init>(Lcom/google/android/gms/ads/x/a;)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/eo2;->a(Lcom/google/android/gms/internal/ads/io2;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    return-void

    :catch_0
    move-exception p1

    const-string v0, "#008 Must be called on the main UI thread."

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/co;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final a(Lcom/google/android/gms/ads/x/d;)V
    .locals 2

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/dq2;->j:Lcom/google/android/gms/ads/x/d;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dq2;->e:Lcom/google/android/gms/internal/ads/eo2;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dq2;->e:Lcom/google/android/gms/internal/ads/eo2;

    if-eqz p1, :cond_0

    new-instance v1, Lcom/google/android/gms/internal/ads/lh;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/ads/lh;-><init>(Lcom/google/android/gms/ads/x/d;)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/eo2;->a(Lcom/google/android/gms/internal/ads/eh;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    return-void

    :catch_0
    move-exception p1

    const-string v0, "#008 Must be called on the main UI thread."

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/co;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/jm2;)V
    .locals 2

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/dq2;->d:Lcom/google/android/gms/internal/ads/jm2;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dq2;->e:Lcom/google/android/gms/internal/ads/eo2;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dq2;->e:Lcom/google/android/gms/internal/ads/eo2;

    if-eqz p1, :cond_0

    new-instance v1, Lcom/google/android/gms/internal/ads/im2;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/ads/im2;-><init>(Lcom/google/android/gms/internal/ads/jm2;)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/eo2;->a(Lcom/google/android/gms/internal/ads/qn2;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    return-void

    :catch_0
    move-exception p1

    const-string v0, "#008 Must be called on the main UI thread."

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/co;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/zp2;)V
    .locals 8

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dq2;->e:Lcom/google/android/gms/internal/ads/eo2;

    if-nez v0, :cond_8

    const-string v0, "loadAd"

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/dq2;->f:Ljava/lang/String;

    if-nez v1, :cond_0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/dq2;->b(Ljava/lang/String;)V

    :cond_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/dq2;->k:Z

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/google/android/gms/internal/ads/um2;->g()Lcom/google/android/gms/internal/ads/um2;

    move-result-object v0

    goto :goto_0

    :cond_1
    new-instance v0, Lcom/google/android/gms/internal/ads/um2;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/um2;-><init>()V

    :goto_0
    move-object v4, v0

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->b()Lcom/google/android/gms/internal/ads/cn2;

    move-result-object v2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dq2;->b:Landroid/content/Context;

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/dq2;->f:Ljava/lang/String;

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/dq2;->a:Lcom/google/android/gms/internal/ads/oa;

    new-instance v7, Lcom/google/android/gms/internal/ads/hn2;

    move-object v1, v7

    move-object v3, v0

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/hn2;-><init>(Lcom/google/android/gms/internal/ads/cn2;Landroid/content/Context;Lcom/google/android/gms/internal/ads/um2;Ljava/lang/String;Lcom/google/android/gms/internal/ads/ra;)V

    const/4 v1, 0x0

    invoke-virtual {v7, v0, v1}, Lcom/google/android/gms/internal/ads/ln2;->a(Landroid/content/Context;Z)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/eo2;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/dq2;->e:Lcom/google/android/gms/internal/ads/eo2;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/dq2;->c:Lcom/google/android/gms/ads/b;

    if-eqz v1, :cond_2

    new-instance v1, Lcom/google/android/gms/internal/ads/nm2;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/dq2;->c:Lcom/google/android/gms/ads/b;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/ads/nm2;-><init>(Lcom/google/android/gms/ads/b;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/eo2;->a(Lcom/google/android/gms/internal/ads/rn2;)V

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dq2;->d:Lcom/google/android/gms/internal/ads/jm2;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dq2;->e:Lcom/google/android/gms/internal/ads/eo2;

    new-instance v1, Lcom/google/android/gms/internal/ads/im2;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/dq2;->d:Lcom/google/android/gms/internal/ads/jm2;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/ads/im2;-><init>(Lcom/google/android/gms/internal/ads/jm2;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/eo2;->a(Lcom/google/android/gms/internal/ads/qn2;)V

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dq2;->g:Lcom/google/android/gms/ads/x/a;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dq2;->e:Lcom/google/android/gms/internal/ads/eo2;

    new-instance v1, Lcom/google/android/gms/internal/ads/om2;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/dq2;->g:Lcom/google/android/gms/ads/x/a;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/ads/om2;-><init>(Lcom/google/android/gms/ads/x/a;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/eo2;->a(Lcom/google/android/gms/internal/ads/io2;)V

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dq2;->h:Lcom/google/android/gms/ads/r/a;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dq2;->e:Lcom/google/android/gms/internal/ads/eo2;

    new-instance v1, Lcom/google/android/gms/internal/ads/ym2;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/dq2;->h:Lcom/google/android/gms/ads/r/a;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/ads/ym2;-><init>(Lcom/google/android/gms/ads/r/a;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/eo2;->a(Lcom/google/android/gms/internal/ads/no2;)V

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dq2;->i:Lcom/google/android/gms/ads/r/c;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dq2;->e:Lcom/google/android/gms/internal/ads/eo2;

    new-instance v1, Lcom/google/android/gms/internal/ads/z;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/dq2;->i:Lcom/google/android/gms/ads/r/c;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/ads/z;-><init>(Lcom/google/android/gms/ads/r/c;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/eo2;->a(Lcom/google/android/gms/internal/ads/u;)V

    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dq2;->j:Lcom/google/android/gms/ads/x/d;

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dq2;->e:Lcom/google/android/gms/internal/ads/eo2;

    new-instance v1, Lcom/google/android/gms/internal/ads/lh;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/dq2;->j:Lcom/google/android/gms/ads/x/d;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/ads/lh;-><init>(Lcom/google/android/gms/ads/x/d;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/eo2;->a(Lcom/google/android/gms/internal/ads/eh;)V

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dq2;->e:Lcom/google/android/gms/internal/ads/eo2;

    new-instance v1, Lcom/google/android/gms/internal/ads/zq2;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/dq2;->m:Lcom/google/android/gms/ads/l;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/ads/zq2;-><init>(Lcom/google/android/gms/ads/l;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/eo2;->a(Lcom/google/android/gms/internal/ads/lp2;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dq2;->e:Lcom/google/android/gms/internal/ads/eo2;

    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/dq2;->l:Z

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/eo2;->a(Z)V

    :cond_8
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dq2;->e:Lcom/google/android/gms/internal/ads/eo2;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/dq2;->b:Landroid/content/Context;

    invoke-static {v1, p1}, Lcom/google/android/gms/internal/ads/sm2;->a(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zp2;)Lcom/google/android/gms/internal/ads/rm2;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/eo2;->a(Lcom/google/android/gms/internal/ads/rm2;)Z

    move-result v0

    if-eqz v0, :cond_9

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dq2;->a:Lcom/google/android/gms/internal/ads/oa;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zp2;->n()Ljava/util/Map;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/oa;->a(Ljava/util/Map;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_9
    return-void

    :catch_0
    move-exception p1

    const-string v0, "#008 Must be called on the main UI thread."

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/co;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dq2;->f:Ljava/lang/String;

    if-nez v0, :cond_0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/dq2;->f:Ljava/lang/String;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "The ad unit ID can only be set once on InterstitialAd."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final a(Z)V
    .locals 1

    :try_start_0
    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/dq2;->l:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dq2;->e:Lcom/google/android/gms/internal/ads/eo2;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dq2;->e:Lcom/google/android/gms/internal/ads/eo2;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/eo2;->a(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-void

    :catch_0
    move-exception p1

    const-string v0, "#008 Must be called on the main UI thread."

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/co;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final b(Z)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/dq2;->k:Z

    return-void
.end method

.method public final b()Z
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/dq2;->e:Lcom/google/android/gms/internal/ads/eo2;

    if-nez v1, :cond_0

    return v0

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/dq2;->e:Lcom/google/android/gms/internal/ads/eo2;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/eo2;->D()Z

    move-result v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v1

    const-string v2, "#008 Must be called on the main UI thread."

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/ads/co;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    return v0
.end method

.method public final c()V
    .locals 2

    :try_start_0
    const-string v0, "show"

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/dq2;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dq2;->e:Lcom/google/android/gms/internal/ads/eo2;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/eo2;->showInterstitial()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const-string v1, "#008 Must be called on the main UI thread."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/co;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
