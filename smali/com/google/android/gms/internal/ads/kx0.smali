.class final Lcom/google/android/gms/internal/ads/kx0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/id0;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcom/google/android/gms/internal/ads/pk0;

.field private final c:Lcom/google/android/gms/internal/ads/zd1;

.field private final d:Lcom/google/android/gms/internal/ads/fo;

.field private final e:Lcom/google/android/gms/internal/ads/id1;

.field private final f:Lcom/google/android/gms/internal/ads/lo1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/lo1<",
            "Lcom/google/android/gms/internal/ads/ek0;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Lcom/google/android/gms/internal/ads/ws;


# direct methods
.method private constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/pk0;Lcom/google/android/gms/internal/ads/zd1;Lcom/google/android/gms/internal/ads/fo;Lcom/google/android/gms/internal/ads/id1;Lcom/google/android/gms/internal/ads/lo1;Lcom/google/android/gms/internal/ads/ws;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/google/android/gms/internal/ads/pk0;",
            "Lcom/google/android/gms/internal/ads/zd1;",
            "Lcom/google/android/gms/internal/ads/fo;",
            "Lcom/google/android/gms/internal/ads/id1;",
            "Lcom/google/android/gms/internal/ads/lo1<",
            "Lcom/google/android/gms/internal/ads/ek0;",
            ">;",
            "Lcom/google/android/gms/internal/ads/ws;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/kx0;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/kx0;->b:Lcom/google/android/gms/internal/ads/pk0;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/kx0;->c:Lcom/google/android/gms/internal/ads/zd1;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/kx0;->d:Lcom/google/android/gms/internal/ads/fo;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/kx0;->e:Lcom/google/android/gms/internal/ads/id1;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/kx0;->f:Lcom/google/android/gms/internal/ads/lo1;

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/kx0;->g:Lcom/google/android/gms/internal/ads/ws;

    return-void
.end method

.method synthetic constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/pk0;Lcom/google/android/gms/internal/ads/zd1;Lcom/google/android/gms/internal/ads/fo;Lcom/google/android/gms/internal/ads/id1;Lcom/google/android/gms/internal/ads/lo1;Lcom/google/android/gms/internal/ads/ws;Lcom/google/android/gms/internal/ads/lx0;)V
    .locals 0

    invoke-direct/range {p0 .. p7}, Lcom/google/android/gms/internal/ads/kx0;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/pk0;Lcom/google/android/gms/internal/ads/zd1;Lcom/google/android/gms/internal/ads/fo;Lcom/google/android/gms/internal/ads/id1;Lcom/google/android/gms/internal/ads/lo1;Lcom/google/android/gms/internal/ads/ws;)V

    return-void
.end method


# virtual methods
.method public final a(ZLandroid/content/Context;)V
    .locals 21

    move-object/from16 v1, p0

    iget-object v0, v1, Lcom/google/android/gms/internal/ads/kx0;->f:Lcom/google/android/gms/internal/ads/lo1;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/yn1;->b(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/ek0;

    :try_start_0
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/kx0;->e:Lcom/google/android/gms/internal/ads/id1;

    iget-object v3, v1, Lcom/google/android/gms/internal/ads/kx0;->g:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/ws;->y()Z

    move-result v3

    const/4 v4, 0x1

    if-nez v3, :cond_0

    :goto_0
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/kx0;->g:Lcom/google/android/gms/internal/ads/ws;

    move-object v11, v2

    goto :goto_1

    :cond_0
    sget-object v3, Lcom/google/android/gms/internal/ads/zr2;->j0:Lcom/google/android/gms/internal/ads/kr2;

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->e()Lcom/google/android/gms/internal/ads/vr2;

    move-result-object v5

    invoke-virtual {v5, v3}, Lcom/google/android/gms/internal/ads/vr2;->a(Lcom/google/android/gms/internal/ads/kr2;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_0

    :cond_1
    iget-object v3, v1, Lcom/google/android/gms/internal/ads/kx0;->b:Lcom/google/android/gms/internal/ads/pk0;

    iget-object v5, v1, Lcom/google/android/gms/internal/ads/kx0;->c:Lcom/google/android/gms/internal/ads/zd1;

    iget-object v5, v5, Lcom/google/android/gms/internal/ads/zd1;->e:Lcom/google/android/gms/internal/ads/um2;

    invoke-virtual {v3, v5}, Lcom/google/android/gms/internal/ads/pk0;->a(Lcom/google/android/gms/internal/ads/um2;)Lcom/google/android/gms/internal/ads/ws;

    move-result-object v3

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ek0;->l()Lcom/google/android/gms/internal/ads/lb0;

    move-result-object v5

    invoke-static {v3, v5}, Lcom/google/android/gms/internal/ads/o5;->a(Lcom/google/android/gms/internal/ads/ws;Lcom/google/android/gms/internal/ads/n5;)V

    new-instance v5, Lcom/google/android/gms/internal/ads/gl0;

    invoke-direct {v5}, Lcom/google/android/gms/internal/ads/gl0;-><init>()V

    iget-object v6, v1, Lcom/google/android/gms/internal/ads/kx0;->a:Landroid/content/Context;

    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/ws;->getView()Landroid/view/View;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, Lcom/google/android/gms/internal/ads/gl0;->a(Landroid/content/Context;Landroid/view/View;)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ek0;->h()Lcom/google/android/gms/internal/ads/sk0;

    move-result-object v6

    invoke-virtual {v6, v3, v4}, Lcom/google/android/gms/internal/ads/sk0;->a(Lcom/google/android/gms/internal/ads/ws;Z)V

    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/ws;->P()Lcom/google/android/gms/internal/ads/ju;

    move-result-object v6

    new-instance v7, Lcom/google/android/gms/internal/ads/nx0;

    invoke-direct {v7, v5, v3}, Lcom/google/android/gms/internal/ads/nx0;-><init>(Lcom/google/android/gms/internal/ads/gl0;Lcom/google/android/gms/internal/ads/ws;)V

    invoke-interface {v6, v7}, Lcom/google/android/gms/internal/ads/ju;->a(Lcom/google/android/gms/internal/ads/iu;)V

    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/ws;->P()Lcom/google/android/gms/internal/ads/ju;

    move-result-object v5

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3}, Lcom/google/android/gms/internal/ads/mx0;->a(Lcom/google/android/gms/internal/ads/ws;)Lcom/google/android/gms/internal/ads/ku;

    move-result-object v6

    invoke-interface {v5, v6}, Lcom/google/android/gms/internal/ads/ju;->a(Lcom/google/android/gms/internal/ads/ku;)V

    iget-object v5, v2, Lcom/google/android/gms/internal/ads/id1;->p:Lcom/google/android/gms/internal/ads/md1;

    iget-object v5, v5, Lcom/google/android/gms/internal/ads/md1;->b:Ljava/lang/String;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/id1;->p:Lcom/google/android/gms/internal/ads/md1;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/md1;->a:Ljava/lang/String;

    const/4 v6, 0x0

    invoke-interface {v3, v5, v2, v6}, Lcom/google/android/gms/internal/ads/ws;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/it; {:try_start_0 .. :try_end_0} :catch_0

    move-object v11, v3

    :goto_1
    invoke-interface {v11, v4}, Lcom/google/android/gms/internal/ads/ws;->g(Z)V

    new-instance v2, Lcom/google/android/gms/ads/internal/g;

    const/4 v13, 0x0

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->c()Lcom/google/android/gms/internal/ads/gl;

    iget-object v3, v1, Lcom/google/android/gms/internal/ads/kx0;->a:Landroid/content/Context;

    invoke-static {v3}, Lcom/google/android/gms/internal/ads/gl;->n(Landroid/content/Context;)Z

    move-result v14

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, -0x1

    iget-object v3, v1, Lcom/google/android/gms/internal/ads/kx0;->e:Lcom/google/android/gms/internal/ads/id1;

    iget-boolean v5, v3, Lcom/google/android/gms/internal/ads/id1;->F:Z

    iget-boolean v3, v3, Lcom/google/android/gms/internal/ads/id1;->G:Z

    move-object v12, v2

    move/from16 v18, p1

    move/from16 v19, v5

    move/from16 v20, v3

    invoke-direct/range {v12 .. v20}, Lcom/google/android/gms/ads/internal/g;-><init>(ZZZFIZZZ)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->b()Lcom/google/android/gms/ads/internal/overlay/n;

    new-instance v3, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    const/4 v8, 0x0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ek0;->j()Lcom/google/android/gms/internal/ads/yc0;

    move-result-object v9

    const/4 v10, 0x0

    iget-object v0, v1, Lcom/google/android/gms/internal/ads/kx0;->e:Lcom/google/android/gms/internal/ads/id1;

    iget v12, v0, Lcom/google/android/gms/internal/ads/id1;->H:I

    iget-object v13, v1, Lcom/google/android/gms/internal/ads/kx0;->d:Lcom/google/android/gms/internal/ads/fo;

    iget-object v14, v0, Lcom/google/android/gms/internal/ads/id1;->y:Ljava/lang/String;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/id1;->p:Lcom/google/android/gms/internal/ads/md1;

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/md1;->b:Ljava/lang/String;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/md1;->a:Ljava/lang/String;

    move-object v7, v3

    move-object v15, v2

    move-object/from16 v16, v5

    move-object/from16 v17, v0

    invoke-direct/range {v7 .. v17}, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;-><init>(Lcom/google/android/gms/internal/ads/jm2;Lcom/google/android/gms/ads/internal/overlay/o;Lcom/google/android/gms/ads/internal/overlay/t;Lcom/google/android/gms/internal/ads/ws;ILcom/google/android/gms/internal/ads/fo;Ljava/lang/String;Lcom/google/android/gms/ads/internal/g;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v0, p2

    invoke-static {v0, v3, v4}, Lcom/google/android/gms/ads/internal/overlay/n;->a(Landroid/content/Context;Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;Z)V

    return-void

    :catch_0
    move-exception v0

    const-string v2, ""

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/ads/co;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
