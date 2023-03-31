.class public final Lcom/google/android/gms/internal/ads/oq;
.super Lcom/google/android/gms/internal/ads/rp;
.source ""

# interfaces
.implements Landroid/view/TextureView$SurfaceTextureListener;
.implements Lcom/google/android/gms/internal/ads/nr;


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x10
.end annotation


# instance fields
.field private final d:Lcom/google/android/gms/internal/ads/gq;

.field private final e:Lcom/google/android/gms/internal/ads/kq;

.field private final f:Z

.field private final g:Lcom/google/android/gms/internal/ads/hq;

.field private h:Lcom/google/android/gms/internal/ads/op;

.field private i:Landroid/view/Surface;

.field private j:Lcom/google/android/gms/internal/ads/er;

.field private k:Ljava/lang/String;

.field private l:[Ljava/lang/String;

.field private m:Z

.field private n:I

.field private o:Lcom/google/android/gms/internal/ads/eq;

.field private final p:Z

.field private q:Z

.field private r:Z

.field private s:I

.field private t:I

.field private u:I

.field private v:I

.field private w:F


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/kq;Lcom/google/android/gms/internal/ads/gq;ZZLcom/google/android/gms/internal/ads/hq;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/rp;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x1

    iput p1, p0, Lcom/google/android/gms/internal/ads/oq;->n:I

    iput-boolean p5, p0, Lcom/google/android/gms/internal/ads/oq;->f:Z

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/oq;->d:Lcom/google/android/gms/internal/ads/gq;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/oq;->e:Lcom/google/android/gms/internal/ads/kq;

    iput-boolean p4, p0, Lcom/google/android/gms/internal/ads/oq;->p:Z

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/oq;->g:Lcom/google/android/gms/internal/ads/hq;

    invoke-virtual {p0, p0}, Landroid/view/TextureView;->setSurfaceTextureListener(Landroid/view/TextureView$SurfaceTextureListener;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/oq;->e:Lcom/google/android/gms/internal/ads/kq;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/ads/kq;->a(Lcom/google/android/gms/internal/ads/rp;)V

    return-void
.end method

.method private final a(FZ)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/oq;->j:Lcom/google/android/gms/internal/ads/er;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/er;->a(FZ)V

    return-void

    :cond_0
    const-string p1, "Trying to set volume before player is initalized."

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/co;->d(Ljava/lang/String;)V

    return-void
.end method

.method private final a(Landroid/view/Surface;Z)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/oq;->j:Lcom/google/android/gms/internal/ads/er;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/er;->a(Landroid/view/Surface;Z)V

    return-void

    :cond_0
    const-string p1, "Trying to set surface before player is initalized."

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/co;->d(Ljava/lang/String;)V

    return-void
.end method

.method private final c(II)V
    .locals 0

    if-lez p2, :cond_0

    int-to-float p1, p1

    int-to-float p2, p2

    div-float/2addr p1, p2

    goto :goto_0

    :cond_0
    const/high16 p1, 0x3f800000    # 1.0f

    :goto_0
    iget p2, p0, Lcom/google/android/gms/internal/ads/oq;->w:F

    cmpl-float p2, p2, p1

    if-eqz p2, :cond_1

    iput p1, p0, Lcom/google/android/gms/internal/ads/oq;->w:F

    invoke-virtual {p0}, Landroid/view/TextureView;->requestLayout()V

    :cond_1
    return-void
.end method

.method private final l()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/oq;->j:Lcom/google/android/gms/internal/ads/er;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/er;->b(Z)V

    :cond_0
    return-void
.end method

.method private final m()Lcom/google/android/gms/internal/ads/er;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/ads/er;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/oq;->d:Lcom/google/android/gms/internal/ads/gq;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/gq;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/oq;->g:Lcom/google/android/gms/internal/ads/hq;

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/ads/er;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/hq;)V

    return-object v0
.end method

.method private final n()Ljava/lang/String;
    .locals 3

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->c()Lcom/google/android/gms/internal/ads/gl;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/oq;->d:Lcom/google/android/gms/internal/ads/gq;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/gq;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/oq;->d:Lcom/google/android/gms/internal/ads/gq;

    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/gq;->b()Lcom/google/android/gms/internal/ads/fo;

    move-result-object v2

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/fo;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/gl;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private final o()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/oq;->j:Lcom/google/android/gms/internal/ads/er;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/oq;->m:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private final p()Z
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/oq;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/google/android/gms/internal/ads/oq;->n:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private final q()V
    .locals 7

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/oq;->j:Lcom/google/android/gms/internal/ads/er;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/oq;->k:Ljava/lang/String;

    if-eqz v0, :cond_9

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/oq;->i:Landroid/view/Surface;

    if-nez v1, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v1, "cache:"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/oq;->d:Lcom/google/android/gms/internal/ads/gq;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/oq;->k:Ljava/lang/String;

    invoke-interface {v0, v2}, Lcom/google/android/gms/internal/ads/gq;->d(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/wr;

    move-result-object v0

    instance-of v2, v0, Lcom/google/android/gms/internal/ads/ms;

    if-eqz v2, :cond_2

    check-cast v0, Lcom/google/android/gms/internal/ads/ms;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ms;->c()Lcom/google/android/gms/internal/ads/er;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/oq;->j:Lcom/google/android/gms/internal/ads/er;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/er;->d()Lcom/google/android/gms/internal/ads/r72;

    move-result-object v0

    if-nez v0, :cond_8

    const-string v0, "Precached video player has been released."

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/co;->d(Ljava/lang/String;)V

    return-void

    :cond_2
    instance-of v2, v0, Lcom/google/android/gms/internal/ads/is;

    if-eqz v2, :cond_4

    check-cast v0, Lcom/google/android/gms/internal/ads/is;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/oq;->n()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/is;->c()Ljava/nio/ByteBuffer;

    move-result-object v3

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/is;->e()Z

    move-result v4

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/is;->d()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_3

    const-string v0, "Stream cache URL is null."

    goto :goto_0

    :cond_3
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/oq;->m()Lcom/google/android/gms/internal/ads/er;

    move-result-object v5

    iput-object v5, p0, Lcom/google/android/gms/internal/ads/oq;->j:Lcom/google/android/gms/internal/ads/er;

    const/4 v6, 0x1

    new-array v6, v6, [Landroid/net/Uri;

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    aput-object v0, v6, v1

    invoke-virtual {v5, v6, v2, v3, v4}, Lcom/google/android/gms/internal/ads/er;->a([Landroid/net/Uri;Ljava/lang/String;Ljava/nio/ByteBuffer;Z)V

    goto :goto_3

    :cond_4
    const-string v0, "Stream cache miss: "

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/oq;->k:Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_5

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_5
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v0}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    move-object v0, v1

    :goto_1
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/co;->d(Ljava/lang/String;)V

    return-void

    :cond_6
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/oq;->m()Lcom/google/android/gms/internal/ads/er;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/oq;->j:Lcom/google/android/gms/internal/ads/er;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/oq;->n()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/oq;->l:[Ljava/lang/String;

    array-length v2, v2

    new-array v2, v2, [Landroid/net/Uri;

    const/4 v3, 0x0

    :goto_2
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/oq;->l:[Ljava/lang/String;

    array-length v5, v4

    if-ge v3, v5, :cond_7

    aget-object v4, v4, v3

    invoke-static {v4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v4

    aput-object v4, v2, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_7
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/oq;->j:Lcom/google/android/gms/internal/ads/er;

    invoke-virtual {v3, v2, v0}, Lcom/google/android/gms/internal/ads/er;->a([Landroid/net/Uri;Ljava/lang/String;)V

    :cond_8
    :goto_3
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/oq;->j:Lcom/google/android/gms/internal/ads/er;

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/ads/er;->a(Lcom/google/android/gms/internal/ads/nr;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/oq;->i:Landroid/view/Surface;

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/internal/ads/oq;->a(Landroid/view/Surface;Z)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/oq;->j:Lcom/google/android/gms/internal/ads/er;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/er;->d()Lcom/google/android/gms/internal/ads/r72;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/r72;->T()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/ads/oq;->n:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_9

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/oq;->r()V

    :cond_9
    :goto_4
    return-void
.end method

.method private final r()V
    .locals 2

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/oq;->q:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/oq;->q:Z

    sget-object v0, Lcom/google/android/gms/internal/ads/gl;->h:Lcom/google/android/gms/internal/ads/sk1;

    new-instance v1, Lcom/google/android/gms/internal/ads/nq;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/nq;-><init>(Lcom/google/android/gms/internal/ads/oq;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/oq;->a()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/oq;->e:Lcom/google/android/gms/internal/ads/kq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/kq;->b()V

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/oq;->r:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/oq;->c()V

    :cond_1
    return-void
.end method

.method private final s()V
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/ads/oq;->s:I

    iget v1, p0, Lcom/google/android/gms/internal/ads/oq;->t:I

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/internal/ads/oq;->c(II)V

    return-void
.end method

.method private final t()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/oq;->j:Lcom/google/android/gms/internal/ads/er;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/er;->b(Z)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/rp;->c:Lcom/google/android/gms/internal/ads/mq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/mq;->a()F

    move-result v0

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/internal/ads/oq;->a(FZ)V

    return-void
.end method

.method public final a(FF)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/oq;->o:Lcom/google/android/gms/internal/ads/eq;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/eq;->a(FF)V

    :cond_0
    return-void
.end method

.method public final a(I)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/oq;->n:I

    if-eq v0, p1, :cond_3

    iput p1, p0, Lcom/google/android/gms/internal/ads/oq;->n:I

    const/4 v0, 0x3

    if-eq p1, v0, :cond_2

    const/4 v0, 0x4

    if-eq p1, v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/oq;->g:Lcom/google/android/gms/internal/ads/hq;

    iget-boolean p1, p1, Lcom/google/android/gms/internal/ads/hq;->a:Z

    if-eqz p1, :cond_1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/oq;->l()V

    :cond_1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/oq;->e:Lcom/google/android/gms/internal/ads/kq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/kq;->d()V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/rp;->c:Lcom/google/android/gms/internal/ads/mq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/mq;->c()V

    sget-object p1, Lcom/google/android/gms/internal/ads/gl;->h:Lcom/google/android/gms/internal/ads/sk1;

    new-instance v0, Lcom/google/android/gms/internal/ads/qq;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/qq;-><init>(Lcom/google/android/gms/internal/ads/oq;)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_2
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/oq;->r()V

    :cond_3
    :goto_0
    return-void
.end method

.method public final a(II)V
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/oq;->s:I

    iput p2, p0, Lcom/google/android/gms/internal/ads/oq;->t:I

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/oq;->s()V

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/op;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/oq;->h:Lcom/google/android/gms/internal/ads/op;

    return-void
.end method

.method final synthetic a(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/oq;->h:Lcom/google/android/gms/internal/ads/op;

    if-eqz v0, :cond_0

    const-string v1, "ExoPlayerAdapter error"

    invoke-interface {v0, v1, p1}, Lcom/google/android/gms/internal/ads/op;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 3

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, 0x2

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/2addr v1, v2

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/2addr v1, v2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "/"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ":"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    const-string v1, "ExoPlayerAdapter error: "

    if-eqz v0, :cond_0

    invoke-virtual {v1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_0
    new-instance p2, Ljava/lang/String;

    invoke-direct {p2, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :goto_0
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/co;->d(Ljava/lang/String;)V

    const/4 p2, 0x1

    iput-boolean p2, p0, Lcom/google/android/gms/internal/ads/oq;->m:Z

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/oq;->g:Lcom/google/android/gms/internal/ads/hq;

    iget-boolean p2, p2, Lcom/google/android/gms/internal/ads/hq;->a:Z

    if-eqz p2, :cond_1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/oq;->l()V

    :cond_1
    sget-object p2, Lcom/google/android/gms/internal/ads/gl;->h:Lcom/google/android/gms/internal/ads/sk1;

    new-instance v0, Lcom/google/android/gms/internal/ads/pq;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ads/pq;-><init>(Lcom/google/android/gms/internal/ads/oq;Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final a(Ljava/lang/String;[Ljava/lang/String;)V
    .locals 0

    if-eqz p1, :cond_1

    if-nez p2, :cond_0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/oq;->setVideoPath(Ljava/lang/String;)V

    :cond_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/oq;->k:Ljava/lang/String;

    array-length p1, p2

    invoke-static {p2, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/oq;->l:[Ljava/lang/String;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/oq;->q()V

    :cond_1
    return-void
.end method

.method public final a(ZJ)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/oq;->d:Lcom/google/android/gms/internal/ads/gq;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/ads/jo;->e:Lcom/google/android/gms/internal/ads/ko1;

    new-instance v1, Lcom/google/android/gms/internal/ads/yq;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/yq;-><init>(Lcom/google/android/gms/internal/ads/oq;ZJ)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public final b()V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/oq;->p()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/oq;->g:Lcom/google/android/gms/internal/ads/hq;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ads/hq;->a:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/oq;->l()V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/oq;->j:Lcom/google/android/gms/internal/ads/er;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/er;->d()Lcom/google/android/gms/internal/ads/r72;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/r72;->a(Z)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/oq;->e:Lcom/google/android/gms/internal/ads/kq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/kq;->d()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/rp;->c:Lcom/google/android/gms/internal/ads/mq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/mq;->c()V

    sget-object v0, Lcom/google/android/gms/internal/ads/gl;->h:Lcom/google/android/gms/internal/ads/sk1;

    new-instance v1, Lcom/google/android/gms/internal/ads/rq;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/rq;-><init>(Lcom/google/android/gms/internal/ads/oq;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_1
    return-void
.end method

.method public final b(I)V
    .locals 3

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/oq;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/oq;->j:Lcom/google/android/gms/internal/ads/er;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/er;->d()Lcom/google/android/gms/internal/ads/r72;

    move-result-object v0

    int-to-long v1, p1

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/ads/r72;->a(J)V

    :cond_0
    return-void
.end method

.method final synthetic b(II)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/oq;->h:Lcom/google/android/gms/internal/ads/op;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/ads/op;->a(II)V

    :cond_0
    return-void
.end method

.method final synthetic b(ZJ)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/oq;->d:Lcom/google/android/gms/internal/ads/gq;

    invoke-interface {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/gq;->a(ZJ)V

    return-void
.end method

.method public final c()V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/oq;->p()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/oq;->g:Lcom/google/android/gms/internal/ads/hq;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ads/hq;->a:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/oq;->t()V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/oq;->j:Lcom/google/android/gms/internal/ads/er;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/er;->d()Lcom/google/android/gms/internal/ads/r72;

    move-result-object v0

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/r72;->a(Z)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/oq;->e:Lcom/google/android/gms/internal/ads/kq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/kq;->c()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/rp;->c:Lcom/google/android/gms/internal/ads/mq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/mq;->b()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/rp;->b:Lcom/google/android/gms/internal/ads/bq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/bq;->a()V

    sget-object v0, Lcom/google/android/gms/internal/ads/gl;->h:Lcom/google/android/gms/internal/ads/sk1;

    new-instance v1, Lcom/google/android/gms/internal/ads/sq;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/sq;-><init>(Lcom/google/android/gms/internal/ads/oq;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :cond_1
    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/oq;->r:Z

    return-void
.end method

.method public final c(I)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/oq;->j:Lcom/google/android/gms/internal/ads/er;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/er;->e()Lcom/google/android/gms/internal/ads/br;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/br;->c(I)V

    :cond_0
    return-void
.end method

.method public final d()V
    .locals 3

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/oq;->o()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/oq;->j:Lcom/google/android/gms/internal/ads/er;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/er;->d()Lcom/google/android/gms/internal/ads/r72;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/r72;->stop()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/oq;->j:Lcom/google/android/gms/internal/ads/er;

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-direct {p0, v1, v0}, Lcom/google/android/gms/internal/ads/oq;->a(Landroid/view/Surface;Z)V

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/oq;->j:Lcom/google/android/gms/internal/ads/er;

    if-eqz v2, :cond_0

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/er;->a(Lcom/google/android/gms/internal/ads/nr;)V

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/oq;->j:Lcom/google/android/gms/internal/ads/er;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/er;->c()V

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/oq;->j:Lcom/google/android/gms/internal/ads/er;

    :cond_0
    iput v0, p0, Lcom/google/android/gms/internal/ads/oq;->n:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/oq;->m:Z

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/oq;->q:Z

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/oq;->r:Z

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/oq;->e:Lcom/google/android/gms/internal/ads/kq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/kq;->d()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/rp;->c:Lcom/google/android/gms/internal/ads/mq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/mq;->c()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/oq;->e:Lcom/google/android/gms/internal/ads/kq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/kq;->a()V

    return-void
.end method

.method public final d(I)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/oq;->j:Lcom/google/android/gms/internal/ads/er;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/er;->e()Lcom/google/android/gms/internal/ads/br;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/br;->d(I)V

    :cond_0
    return-void
.end method

.method public final e()Ljava/lang/String;
    .locals 3

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/oq;->p:Z

    if-eqz v0, :cond_0

    const-string v0, " spherical"

    goto :goto_0

    :cond_0
    const-string v0, ""

    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const-string v2, "ExoPlayer/3"

    if-eqz v1, :cond_1

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public final e(I)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/oq;->j:Lcom/google/android/gms/internal/ads/er;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/er;->e()Lcom/google/android/gms/internal/ads/br;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/br;->a(I)V

    :cond_0
    return-void
.end method

.method final synthetic f()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/oq;->h:Lcom/google/android/gms/internal/ads/op;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/op;->b()V

    :cond_0
    return-void
.end method

.method public final f(I)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/oq;->j:Lcom/google/android/gms/internal/ads/er;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/er;->e()Lcom/google/android/gms/internal/ads/br;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/br;->b(I)V

    :cond_0
    return-void
.end method

.method final synthetic g()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/oq;->h:Lcom/google/android/gms/internal/ads/op;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/op;->g()V

    :cond_0
    return-void
.end method

.method public final g(I)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/oq;->j:Lcom/google/android/gms/internal/ads/er;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/er;->a(I)V

    :cond_0
    return-void
.end method

.method public final getCurrentPosition()I
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/oq;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/oq;->j:Lcom/google/android/gms/internal/ads/er;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/er;->d()Lcom/google/android/gms/internal/ads/r72;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/r72;->X()J

    move-result-wide v0

    long-to-int v1, v0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final getDuration()I
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/oq;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/oq;->j:Lcom/google/android/gms/internal/ads/er;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/er;->d()Lcom/google/android/gms/internal/ads/r72;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/r72;->H()J

    move-result-wide v0

    long-to-int v1, v0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final getVideoHeight()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/oq;->t:I

    return v0
.end method

.method public final getVideoWidth()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/oq;->s:I

    return v0
.end method

.method final synthetic h()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/oq;->h:Lcom/google/android/gms/internal/ads/op;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/op;->d()V

    :cond_0
    return-void
.end method

.method final synthetic h(I)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/oq;->h:Lcom/google/android/gms/internal/ads/op;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/op;->onWindowVisibilityChanged(I)V

    :cond_0
    return-void
.end method

.method final synthetic i()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/oq;->h:Lcom/google/android/gms/internal/ads/op;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/op;->e()V

    :cond_0
    return-void
.end method

.method final synthetic j()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/oq;->h:Lcom/google/android/gms/internal/ads/op;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/op;->c()V

    :cond_0
    return-void
.end method

.method final synthetic k()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/oq;->h:Lcom/google/android/gms/internal/ads/op;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/op;->a()V

    :cond_0
    return-void
.end method

.method protected final onMeasure(II)V
    .locals 10

    invoke-super {p0, p1, p2}, Landroid/view/TextureView;->onMeasure(II)V

    invoke-virtual {p0}, Landroid/view/TextureView;->getMeasuredWidth()I

    move-result p1

    invoke-virtual {p0}, Landroid/view/TextureView;->getMeasuredHeight()I

    move-result p2

    iget v0, p0, Lcom/google/android/gms/internal/ads/oq;->w:F

    const/4 v1, 0x0

    cmpl-float v2, v0, v1

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/oq;->o:Lcom/google/android/gms/internal/ads/eq;

    if-nez v2, :cond_1

    int-to-float v2, p1

    int-to-float v3, p2

    div-float v3, v2, v3

    cmpl-float v4, v0, v3

    if-lez v4, :cond_0

    div-float/2addr v2, v0

    float-to-int p2, v2

    :cond_0
    iget v0, p0, Lcom/google/android/gms/internal/ads/oq;->w:F

    cmpg-float v2, v0, v3

    if-gez v2, :cond_1

    int-to-float p1, p2

    mul-float p1, p1, v0

    float-to-int p1, p1

    :cond_1
    invoke-virtual {p0, p1, p2}, Landroid/view/TextureView;->setMeasuredDimension(II)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/oq;->o:Lcom/google/android/gms/internal/ads/eq;

    if-eqz v0, :cond_2

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/eq;->a(II)V

    :cond_2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x10

    if-ne v0, v2, :cond_9

    iget v0, p0, Lcom/google/android/gms/internal/ads/oq;->u:I

    if-lez v0, :cond_3

    if-ne v0, p1, :cond_4

    :cond_3
    iget v0, p0, Lcom/google/android/gms/internal/ads/oq;->v:I

    if-lez v0, :cond_8

    if-eq v0, p2, :cond_8

    :cond_4
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/oq;->f:Z

    if-eqz v0, :cond_8

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/oq;->o()Z

    move-result v0

    if-eqz v0, :cond_8

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/oq;->j:Lcom/google/android/gms/internal/ads/er;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/er;->d()Lcom/google/android/gms/internal/ads/r72;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/r72;->X()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-lez v6, :cond_8

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/r72;->V()Z

    move-result v2

    if-eqz v2, :cond_5

    goto :goto_0

    :cond_5
    const/4 v2, 0x1

    invoke-direct {p0, v1, v2}, Lcom/google/android/gms/internal/ads/oq;->a(FZ)V

    invoke-interface {v0, v2}, Lcom/google/android/gms/internal/ads/r72;->a(Z)V

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/r72;->X()J

    move-result-wide v1

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->j()Lcom/google/android/gms/common/util/d;

    move-result-object v3

    invoke-interface {v3}, Lcom/google/android/gms/common/util/d;->a()J

    move-result-wide v3

    :cond_6
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/oq;->o()Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/r72;->X()J

    move-result-wide v5

    cmp-long v7, v5, v1

    if-nez v7, :cond_7

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->j()Lcom/google/android/gms/common/util/d;

    move-result-object v5

    invoke-interface {v5}, Lcom/google/android/gms/common/util/d;->a()J

    move-result-wide v5

    sub-long/2addr v5, v3

    const-wide/16 v7, 0xfa

    cmp-long v9, v5, v7

    if-lez v9, :cond_6

    :cond_7
    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/r72;->a(Z)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/oq;->a()V

    :cond_8
    :goto_0
    iput p1, p0, Lcom/google/android/gms/internal/ads/oq;->u:I

    iput p2, p0, Lcom/google/android/gms/internal/ads/oq;->v:I

    :cond_9
    return-void
.end method

.method public final onSurfaceTextureAvailable(Landroid/graphics/SurfaceTexture;II)V
    .locals 2

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/oq;->p:Z

    if-eqz v0, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/ads/eq;

    invoke-virtual {p0}, Landroid/view/TextureView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/eq;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/oq;->o:Lcom/google/android/gms/internal/ads/eq;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/eq;->a(Landroid/graphics/SurfaceTexture;II)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/oq;->o:Lcom/google/android/gms/internal/ads/eq;

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/oq;->o:Lcom/google/android/gms/internal/ads/eq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/eq;->c()Landroid/graphics/SurfaceTexture;

    move-result-object v0

    if-eqz v0, :cond_0

    move-object p1, v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/oq;->o:Lcom/google/android/gms/internal/ads/eq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/eq;->b()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/oq;->o:Lcom/google/android/gms/internal/ads/eq;

    :cond_1
    :goto_0
    new-instance v0, Landroid/view/Surface;

    invoke-direct {v0, p1}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/oq;->i:Landroid/view/Surface;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/oq;->j:Lcom/google/android/gms/internal/ads/er;

    if-nez p1, :cond_2

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/oq;->q()V

    goto :goto_1

    :cond_2
    const/4 p1, 0x1

    invoke-direct {p0, v0, p1}, Lcom/google/android/gms/internal/ads/oq;->a(Landroid/view/Surface;Z)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/oq;->g:Lcom/google/android/gms/internal/ads/hq;

    iget-boolean p1, p1, Lcom/google/android/gms/internal/ads/hq;->a:Z

    if-nez p1, :cond_3

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/oq;->t()V

    :cond_3
    :goto_1
    iget p1, p0, Lcom/google/android/gms/internal/ads/oq;->s:I

    if-eqz p1, :cond_5

    iget p1, p0, Lcom/google/android/gms/internal/ads/oq;->t:I

    if-nez p1, :cond_4

    goto :goto_2

    :cond_4
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/oq;->s()V

    goto :goto_3

    :cond_5
    :goto_2
    invoke-direct {p0, p2, p3}, Lcom/google/android/gms/internal/ads/oq;->c(II)V

    :goto_3
    sget-object p1, Lcom/google/android/gms/internal/ads/gl;->h:Lcom/google/android/gms/internal/ads/sk1;

    new-instance p2, Lcom/google/android/gms/internal/ads/uq;

    invoke-direct {p2, p0}, Lcom/google/android/gms/internal/ads/uq;-><init>(Lcom/google/android/gms/internal/ads/oq;)V

    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final onSurfaceTextureDestroyed(Landroid/graphics/SurfaceTexture;)Z
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/oq;->b()V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/oq;->o:Lcom/google/android/gms/internal/ads/eq;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/eq;->b()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/oq;->o:Lcom/google/android/gms/internal/ads/eq;

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/oq;->j:Lcom/google/android/gms/internal/ads/er;

    const/4 v1, 0x1

    if-eqz p1, :cond_2

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/oq;->l()V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/oq;->i:Landroid/view/Surface;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/view/Surface;->release()V

    :cond_1
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/oq;->i:Landroid/view/Surface;

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/internal/ads/oq;->a(Landroid/view/Surface;Z)V

    :cond_2
    sget-object p1, Lcom/google/android/gms/internal/ads/gl;->h:Lcom/google/android/gms/internal/ads/sk1;

    new-instance v0, Lcom/google/android/gms/internal/ads/wq;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/wq;-><init>(Lcom/google/android/gms/internal/ads/oq;)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return v1
.end method

.method public final onSurfaceTextureSizeChanged(Landroid/graphics/SurfaceTexture;II)V
    .locals 1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/oq;->o:Lcom/google/android/gms/internal/ads/eq;

    if-eqz p1, :cond_0

    invoke-virtual {p1, p2, p3}, Lcom/google/android/gms/internal/ads/eq;->a(II)V

    :cond_0
    sget-object p1, Lcom/google/android/gms/internal/ads/gl;->h:Lcom/google/android/gms/internal/ads/sk1;

    new-instance v0, Lcom/google/android/gms/internal/ads/tq;

    invoke-direct {v0, p0, p2, p3}, Lcom/google/android/gms/internal/ads/tq;-><init>(Lcom/google/android/gms/internal/ads/oq;II)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final onSurfaceTextureUpdated(Landroid/graphics/SurfaceTexture;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/oq;->e:Lcom/google/android/gms/internal/ads/kq;

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/ads/kq;->b(Lcom/google/android/gms/internal/ads/rp;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/rp;->b:Lcom/google/android/gms/internal/ads/bq;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/oq;->h:Lcom/google/android/gms/internal/ads/op;

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/ads/bq;->a(Landroid/graphics/SurfaceTexture;Lcom/google/android/gms/internal/ads/op;)V

    return-void
.end method

.method protected final onWindowVisibilityChanged(I)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x39

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "AdExoPlayerView3 window visibility changed to "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/wk;->e(Ljava/lang/String;)V

    sget-object v0, Lcom/google/android/gms/internal/ads/gl;->h:Lcom/google/android/gms/internal/ads/sk1;

    new-instance v1, Lcom/google/android/gms/internal/ads/vq;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/ads/vq;-><init>(Lcom/google/android/gms/internal/ads/oq;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    invoke-super {p0, p1}, Landroid/view/TextureView;->onWindowVisibilityChanged(I)V

    return-void
.end method

.method public final setVideoPath(Ljava/lang/String;)V
    .locals 2

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/oq;->k:Ljava/lang/String;

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/oq;->l:[Ljava/lang/String;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/oq;->q()V

    :cond_0
    return-void
.end method
