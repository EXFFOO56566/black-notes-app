.class public final Lcom/google/android/gms/internal/ads/if0;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private a:I

.field private b:Lcom/google/android/gms/internal/ads/rp2;

.field private c:Lcom/google/android/gms/internal/ads/o1;

.field private d:Landroid/view/View;

.field private e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "*>;"
        }
    .end annotation
.end field

.field private f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/ads/lq2;",
            ">;"
        }
    .end annotation
.end field

.field private g:Lcom/google/android/gms/internal/ads/lq2;

.field private h:Landroid/os/Bundle;

.field private i:Lcom/google/android/gms/internal/ads/ws;

.field private j:Lcom/google/android/gms/internal/ads/ws;

.field private k:Lb/c/b/a/d/a;

.field private l:Landroid/view/View;

.field private m:Lb/c/b/a/d/a;

.field private n:D

.field private o:Lcom/google/android/gms/internal/ads/v1;

.field private p:Lcom/google/android/gms/internal/ads/v1;

.field private q:Ljava/lang/String;

.field private r:La/e/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La/e/g<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/ads/i1;",
            ">;"
        }
    .end annotation
.end field

.field private s:La/e/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La/e/g<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private t:F

.field private u:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, La/e/g;

    invoke-direct {v0}, La/e/g;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/if0;->r:La/e/g;

    new-instance v0, La/e/g;

    invoke-direct {v0}, La/e/g;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/if0;->s:La/e/g;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/if0;->f:Ljava/util/List;

    return-void
.end method

.method private static a(Lcom/google/android/gms/internal/ads/rp2;Lcom/google/android/gms/internal/ads/hb;)Lcom/google/android/gms/internal/ads/ff0;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/ads/ff0;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ads/ff0;-><init>(Lcom/google/android/gms/internal/ads/rp2;Lcom/google/android/gms/internal/ads/hb;)V

    return-object v0
.end method

.method public static a(Lcom/google/android/gms/internal/ads/ab;)Lcom/google/android/gms/internal/ads/if0;
    .locals 16

    const/4 v1, 0x0

    :try_start_0
    invoke-interface/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/ab;->getVideoController()Lcom/google/android/gms/internal/ads/rp2;

    move-result-object v0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/if0;->a(Lcom/google/android/gms/internal/ads/rp2;Lcom/google/android/gms/internal/ads/hb;)Lcom/google/android/gms/internal/ads/ff0;

    move-result-object v0

    invoke-interface/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/ab;->e()Lcom/google/android/gms/internal/ads/o1;

    move-result-object v2

    invoke-interface/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/ab;->C()Lb/c/b/a/d/a;

    move-result-object v3

    invoke-static {v3}, Lcom/google/android/gms/internal/ads/if0;->b(Lb/c/b/a/d/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    invoke-interface/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/ab;->b()Ljava/lang/String;

    move-result-object v4

    invoke-interface/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/ab;->h()Ljava/util/List;

    move-result-object v5

    invoke-interface/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/ab;->d()Ljava/lang/String;

    move-result-object v6

    invoke-interface/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/ab;->g()Landroid/os/Bundle;

    move-result-object v7

    invoke-interface/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/ab;->f()Ljava/lang/String;

    move-result-object v8

    invoke-interface/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/ab;->w()Lb/c/b/a/d/a;

    move-result-object v9

    invoke-static {v9}, Lcom/google/android/gms/internal/ads/if0;->b(Lb/c/b/a/d/a;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroid/view/View;

    invoke-interface/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/ab;->c()Lb/c/b/a/d/a;

    move-result-object v10

    invoke-interface/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/ab;->r()Ljava/lang/String;

    move-result-object v11

    invoke-interface/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/ab;->o()Ljava/lang/String;

    move-result-object v12

    invoke-interface/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/ab;->k()D

    move-result-wide v13

    invoke-interface/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/ab;->t()Lcom/google/android/gms/internal/ads/v1;

    move-result-object v15

    new-instance v1, Lcom/google/android/gms/internal/ads/if0;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/if0;-><init>()V

    move-object/from16 p0, v15

    const/4 v15, 0x2

    iput v15, v1, Lcom/google/android/gms/internal/ads/if0;->a:I

    iput-object v0, v1, Lcom/google/android/gms/internal/ads/if0;->b:Lcom/google/android/gms/internal/ads/rp2;

    iput-object v2, v1, Lcom/google/android/gms/internal/ads/if0;->c:Lcom/google/android/gms/internal/ads/o1;

    iput-object v3, v1, Lcom/google/android/gms/internal/ads/if0;->d:Landroid/view/View;

    const-string v0, "headline"

    invoke-virtual {v1, v0, v4}, Lcom/google/android/gms/internal/ads/if0;->a(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v5, v1, Lcom/google/android/gms/internal/ads/if0;->e:Ljava/util/List;

    const-string v0, "body"

    invoke-virtual {v1, v0, v6}, Lcom/google/android/gms/internal/ads/if0;->a(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v7, v1, Lcom/google/android/gms/internal/ads/if0;->h:Landroid/os/Bundle;

    const-string v0, "call_to_action"

    invoke-virtual {v1, v0, v8}, Lcom/google/android/gms/internal/ads/if0;->a(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v9, v1, Lcom/google/android/gms/internal/ads/if0;->l:Landroid/view/View;

    iput-object v10, v1, Lcom/google/android/gms/internal/ads/if0;->m:Lb/c/b/a/d/a;

    const-string v0, "store"

    invoke-virtual {v1, v0, v11}, Lcom/google/android/gms/internal/ads/if0;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "price"

    invoke-virtual {v1, v0, v12}, Lcom/google/android/gms/internal/ads/if0;->a(Ljava/lang/String;Ljava/lang/String;)V

    iput-wide v13, v1, Lcom/google/android/gms/internal/ads/if0;->n:D

    move-object/from16 v0, p0

    iput-object v0, v1, Lcom/google/android/gms/internal/ads/if0;->o:Lcom/google/android/gms/internal/ads/v1;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    move-exception v0

    const-string v1, "Failed to get native ad from app install ad mapper"

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/co;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v1, 0x0

    return-object v1
.end method

.method public static a(Lcom/google/android/gms/internal/ads/gb;)Lcom/google/android/gms/internal/ads/if0;
    .locals 14

    const/4 v0, 0x0

    :try_start_0
    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/gb;->getVideoController()Lcom/google/android/gms/internal/ads/rp2;

    move-result-object v1

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/if0;->a(Lcom/google/android/gms/internal/ads/rp2;Lcom/google/android/gms/internal/ads/hb;)Lcom/google/android/gms/internal/ads/ff0;

    move-result-object v1

    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/gb;->e()Lcom/google/android/gms/internal/ads/o1;

    move-result-object v2

    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/gb;->C()Lb/c/b/a/d/a;

    move-result-object v3

    invoke-static {v3}, Lcom/google/android/gms/internal/ads/if0;->b(Lb/c/b/a/d/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/gb;->b()Ljava/lang/String;

    move-result-object v4

    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/gb;->h()Ljava/util/List;

    move-result-object v5

    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/gb;->d()Ljava/lang/String;

    move-result-object v6

    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/gb;->g()Landroid/os/Bundle;

    move-result-object v7

    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/gb;->f()Ljava/lang/String;

    move-result-object v8

    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/gb;->w()Lb/c/b/a/d/a;

    move-result-object v9

    invoke-static {v9}, Lcom/google/android/gms/internal/ads/if0;->b(Lb/c/b/a/d/a;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroid/view/View;

    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/gb;->c()Lb/c/b/a/d/a;

    move-result-object v10

    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/gb;->q()Ljava/lang/String;

    move-result-object v11

    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/gb;->d0()Lcom/google/android/gms/internal/ads/v1;

    move-result-object p0

    new-instance v12, Lcom/google/android/gms/internal/ads/if0;

    invoke-direct {v12}, Lcom/google/android/gms/internal/ads/if0;-><init>()V

    const/4 v13, 0x1

    iput v13, v12, Lcom/google/android/gms/internal/ads/if0;->a:I

    iput-object v1, v12, Lcom/google/android/gms/internal/ads/if0;->b:Lcom/google/android/gms/internal/ads/rp2;

    iput-object v2, v12, Lcom/google/android/gms/internal/ads/if0;->c:Lcom/google/android/gms/internal/ads/o1;

    iput-object v3, v12, Lcom/google/android/gms/internal/ads/if0;->d:Landroid/view/View;

    const-string v1, "headline"

    invoke-virtual {v12, v1, v4}, Lcom/google/android/gms/internal/ads/if0;->a(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v5, v12, Lcom/google/android/gms/internal/ads/if0;->e:Ljava/util/List;

    const-string v1, "body"

    invoke-virtual {v12, v1, v6}, Lcom/google/android/gms/internal/ads/if0;->a(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v7, v12, Lcom/google/android/gms/internal/ads/if0;->h:Landroid/os/Bundle;

    const-string v1, "call_to_action"

    invoke-virtual {v12, v1, v8}, Lcom/google/android/gms/internal/ads/if0;->a(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v9, v12, Lcom/google/android/gms/internal/ads/if0;->l:Landroid/view/View;

    iput-object v10, v12, Lcom/google/android/gms/internal/ads/if0;->m:Lb/c/b/a/d/a;

    const-string v1, "advertiser"

    invoke-virtual {v12, v1, v11}, Lcom/google/android/gms/internal/ads/if0;->a(Ljava/lang/String;Ljava/lang/String;)V

    iput-object p0, v12, Lcom/google/android/gms/internal/ads/if0;->p:Lcom/google/android/gms/internal/ads/v1;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v12

    :catch_0
    move-exception p0

    const-string v1, "Failed to get native ad from content ad mapper"

    invoke-static {v1, p0}, Lcom/google/android/gms/internal/ads/co;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public static a(Lcom/google/android/gms/internal/ads/hb;)Lcom/google/android/gms/internal/ads/if0;
    .locals 18

    :try_start_0
    invoke-interface/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/hb;->getVideoController()Lcom/google/android/gms/internal/ads/rp2;

    move-result-object v0

    move-object/from16 v1, p0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/if0;->a(Lcom/google/android/gms/internal/ads/rp2;Lcom/google/android/gms/internal/ads/hb;)Lcom/google/android/gms/internal/ads/ff0;

    move-result-object v0

    invoke-interface/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/hb;->e()Lcom/google/android/gms/internal/ads/o1;

    move-result-object v2

    invoke-interface/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/hb;->C()Lb/c/b/a/d/a;

    move-result-object v3

    invoke-static {v3}, Lcom/google/android/gms/internal/ads/if0;->b(Lb/c/b/a/d/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    invoke-interface/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/hb;->b()Ljava/lang/String;

    move-result-object v4

    invoke-interface/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/hb;->h()Ljava/util/List;

    move-result-object v5

    invoke-interface/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/hb;->d()Ljava/lang/String;

    move-result-object v6

    invoke-interface/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/hb;->g()Landroid/os/Bundle;

    move-result-object v7

    invoke-interface/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/hb;->f()Ljava/lang/String;

    move-result-object v8

    invoke-interface/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/hb;->w()Lb/c/b/a/d/a;

    move-result-object v9

    invoke-static {v9}, Lcom/google/android/gms/internal/ads/if0;->b(Lb/c/b/a/d/a;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroid/view/View;

    invoke-interface/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/hb;->c()Lb/c/b/a/d/a;

    move-result-object v10

    invoke-interface/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/hb;->r()Ljava/lang/String;

    move-result-object v11

    invoke-interface/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/hb;->o()Ljava/lang/String;

    move-result-object v12

    invoke-interface/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/hb;->k()D

    move-result-wide v13

    invoke-interface/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/hb;->t()Lcom/google/android/gms/internal/ads/v1;

    move-result-object v15

    invoke-interface/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/hb;->q()Ljava/lang/String;

    move-result-object v16

    invoke-interface/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/hb;->L0()F

    move-result v17

    move-object v1, v0

    invoke-static/range {v1 .. v17}, Lcom/google/android/gms/internal/ads/if0;->a(Lcom/google/android/gms/internal/ads/rp2;Lcom/google/android/gms/internal/ads/o1;Landroid/view/View;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Landroid/view/View;Lb/c/b/a/d/a;Ljava/lang/String;Ljava/lang/String;DLcom/google/android/gms/internal/ads/v1;Ljava/lang/String;F)Lcom/google/android/gms/internal/ads/if0;

    move-result-object v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    const-string v1, "Failed to get native ad assets from unified ad mapper"

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/co;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method private static a(Lcom/google/android/gms/internal/ads/rp2;Lcom/google/android/gms/internal/ads/o1;Landroid/view/View;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Landroid/view/View;Lb/c/b/a/d/a;Ljava/lang/String;Ljava/lang/String;DLcom/google/android/gms/internal/ads/v1;Ljava/lang/String;F)Lcom/google/android/gms/internal/ads/if0;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/ads/if0;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/if0;-><init>()V

    const/4 v1, 0x6

    iput v1, v0, Lcom/google/android/gms/internal/ads/if0;->a:I

    move-object v1, p0

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/if0;->b:Lcom/google/android/gms/internal/ads/rp2;

    move-object v1, p1

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/if0;->c:Lcom/google/android/gms/internal/ads/o1;

    move-object v1, p2

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/if0;->d:Landroid/view/View;

    const-string v1, "headline"

    move-object v2, p3

    invoke-virtual {v0, v1, p3}, Lcom/google/android/gms/internal/ads/if0;->a(Ljava/lang/String;Ljava/lang/String;)V

    move-object v1, p4

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/if0;->e:Ljava/util/List;

    const-string v1, "body"

    move-object v2, p5

    invoke-virtual {v0, v1, p5}, Lcom/google/android/gms/internal/ads/if0;->a(Ljava/lang/String;Ljava/lang/String;)V

    move-object v1, p6

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/if0;->h:Landroid/os/Bundle;

    const-string v1, "call_to_action"

    move-object v2, p7

    invoke-virtual {v0, v1, p7}, Lcom/google/android/gms/internal/ads/if0;->a(Ljava/lang/String;Ljava/lang/String;)V

    move-object v1, p8

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/if0;->l:Landroid/view/View;

    move-object v1, p9

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/if0;->m:Lb/c/b/a/d/a;

    const-string v1, "store"

    move-object v2, p10

    invoke-virtual {v0, v1, p10}, Lcom/google/android/gms/internal/ads/if0;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "price"

    move-object v2, p11

    invoke-virtual {v0, v1, p11}, Lcom/google/android/gms/internal/ads/if0;->a(Ljava/lang/String;Ljava/lang/String;)V

    move-wide v1, p12

    iput-wide v1, v0, Lcom/google/android/gms/internal/ads/if0;->n:D

    move-object/from16 v1, p14

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/if0;->o:Lcom/google/android/gms/internal/ads/v1;

    const-string v1, "advertiser"

    move-object/from16 v2, p15

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/if0;->a(Ljava/lang/String;Ljava/lang/String;)V

    move/from16 v1, p16

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/if0;->a(F)V

    return-object v0
.end method

.method private final declared-synchronized a(F)V
    .locals 0

    monitor-enter p0

    :try_start_0
    iput p1, p0, Lcom/google/android/gms/internal/ads/if0;->t:F
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public static b(Lcom/google/android/gms/internal/ads/ab;)Lcom/google/android/gms/internal/ads/if0;
    .locals 19

    const/4 v1, 0x0

    :try_start_0
    invoke-interface/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/ab;->getVideoController()Lcom/google/android/gms/internal/ads/rp2;

    move-result-object v0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/if0;->a(Lcom/google/android/gms/internal/ads/rp2;Lcom/google/android/gms/internal/ads/hb;)Lcom/google/android/gms/internal/ads/ff0;

    move-result-object v2

    invoke-interface/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/ab;->e()Lcom/google/android/gms/internal/ads/o1;

    move-result-object v3

    invoke-interface/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/ab;->C()Lb/c/b/a/d/a;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/if0;->b(Lb/c/b/a/d/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/view/View;

    invoke-interface/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/ab;->b()Ljava/lang/String;

    move-result-object v5

    invoke-interface/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/ab;->h()Ljava/util/List;

    move-result-object v6

    invoke-interface/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/ab;->d()Ljava/lang/String;

    move-result-object v7

    invoke-interface/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/ab;->g()Landroid/os/Bundle;

    move-result-object v8

    invoke-interface/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/ab;->f()Ljava/lang/String;

    move-result-object v9

    invoke-interface/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/ab;->w()Lb/c/b/a/d/a;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/if0;->b(Lb/c/b/a/d/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Landroid/view/View;

    invoke-interface/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/ab;->c()Lb/c/b/a/d/a;

    move-result-object v11

    invoke-interface/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/ab;->r()Ljava/lang/String;

    move-result-object v12

    invoke-interface/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/ab;->o()Ljava/lang/String;

    move-result-object v13

    invoke-interface/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/ab;->k()D

    move-result-wide v14

    invoke-interface/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/ab;->t()Lcom/google/android/gms/internal/ads/v1;

    move-result-object v16

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v2 .. v18}, Lcom/google/android/gms/internal/ads/if0;->a(Lcom/google/android/gms/internal/ads/rp2;Lcom/google/android/gms/internal/ads/o1;Landroid/view/View;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Landroid/view/View;Lb/c/b/a/d/a;Ljava/lang/String;Ljava/lang/String;DLcom/google/android/gms/internal/ads/v1;Ljava/lang/String;F)Lcom/google/android/gms/internal/ads/if0;

    move-result-object v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    const-string v2, "Failed to get native ad assets from app install ad mapper"

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/ads/co;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v1
.end method

.method public static b(Lcom/google/android/gms/internal/ads/gb;)Lcom/google/android/gms/internal/ads/if0;
    .locals 19

    const/4 v1, 0x0

    :try_start_0
    invoke-interface/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/gb;->getVideoController()Lcom/google/android/gms/internal/ads/rp2;

    move-result-object v0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/if0;->a(Lcom/google/android/gms/internal/ads/rp2;Lcom/google/android/gms/internal/ads/hb;)Lcom/google/android/gms/internal/ads/ff0;

    move-result-object v2

    invoke-interface/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/gb;->e()Lcom/google/android/gms/internal/ads/o1;

    move-result-object v3

    invoke-interface/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/gb;->C()Lb/c/b/a/d/a;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/if0;->b(Lb/c/b/a/d/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/view/View;

    invoke-interface/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/gb;->b()Ljava/lang/String;

    move-result-object v5

    invoke-interface/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/gb;->h()Ljava/util/List;

    move-result-object v6

    invoke-interface/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/gb;->d()Ljava/lang/String;

    move-result-object v7

    invoke-interface/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/gb;->g()Landroid/os/Bundle;

    move-result-object v8

    invoke-interface/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/gb;->f()Ljava/lang/String;

    move-result-object v9

    invoke-interface/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/gb;->w()Lb/c/b/a/d/a;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/if0;->b(Lb/c/b/a/d/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Landroid/view/View;

    invoke-interface/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/gb;->c()Lb/c/b/a/d/a;

    move-result-object v11

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/high16 v14, -0x4010000000000000L    # -1.0

    invoke-interface/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/gb;->d0()Lcom/google/android/gms/internal/ads/v1;

    move-result-object v16

    invoke-interface/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/gb;->q()Ljava/lang/String;

    move-result-object v17

    const/16 v18, 0x0

    invoke-static/range {v2 .. v18}, Lcom/google/android/gms/internal/ads/if0;->a(Lcom/google/android/gms/internal/ads/rp2;Lcom/google/android/gms/internal/ads/o1;Landroid/view/View;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Landroid/view/View;Lb/c/b/a/d/a;Ljava/lang/String;Ljava/lang/String;DLcom/google/android/gms/internal/ads/v1;Ljava/lang/String;F)Lcom/google/android/gms/internal/ads/if0;

    move-result-object v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    const-string v2, "Failed to get native ad assets from content ad mapper"

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/ads/co;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v1
.end method

.method private static b(Lb/c/b/a/d/a;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lb/c/b/a/d/a;",
            ")TT;"
        }
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-static {p0}, Lb/c/b/a/d/b;->Q(Lb/c/b/a/d/a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final declared-synchronized c(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/if0;->s:La/e/g;

    invoke-virtual {v0, p1}, La/e/g;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method


# virtual methods
.method public final declared-synchronized A()Lcom/google/android/gms/internal/ads/o1;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/if0;->c:Lcom/google/android/gms/internal/ads/o1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized B()Lb/c/b/a/d/a;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/if0;->m:Lb/c/b/a/d/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized C()Lcom/google/android/gms/internal/ads/v1;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/if0;->p:Lcom/google/android/gms/internal/ads/v1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized a()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/if0;->i:Lcom/google/android/gms/internal/ads/ws;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/if0;->i:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->destroy()V

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/if0;->i:Lcom/google/android/gms/internal/ads/ws;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/if0;->j:Lcom/google/android/gms/internal/ads/ws;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/if0;->j:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->destroy()V

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/if0;->j:Lcom/google/android/gms/internal/ads/ws;

    :cond_1
    iput-object v1, p0, Lcom/google/android/gms/internal/ads/if0;->k:Lb/c/b/a/d/a;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/if0;->r:La/e/g;

    invoke-virtual {v0}, La/e/g;->clear()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/if0;->s:La/e/g;

    invoke-virtual {v0}, La/e/g;->clear()V

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/if0;->b:Lcom/google/android/gms/internal/ads/rp2;

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/if0;->c:Lcom/google/android/gms/internal/ads/o1;

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/if0;->d:Landroid/view/View;

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/if0;->e:Ljava/util/List;

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/if0;->h:Landroid/os/Bundle;

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/if0;->l:Landroid/view/View;

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/if0;->m:Lb/c/b/a/d/a;

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/if0;->o:Lcom/google/android/gms/internal/ads/v1;

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/if0;->p:Lcom/google/android/gms/internal/ads/v1;

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/if0;->q:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized a(D)V
    .locals 0

    monitor-enter p0

    :try_start_0
    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/if0;->n:D
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized a(I)V
    .locals 0

    monitor-enter p0

    :try_start_0
    iput p1, p0, Lcom/google/android/gms/internal/ads/if0;->a:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized a(Landroid/view/View;)V
    .locals 0

    monitor-enter p0

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/if0;->l:Landroid/view/View;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized a(Lb/c/b/a/d/a;)V
    .locals 0

    monitor-enter p0

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/if0;->k:Lb/c/b/a/d/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized a(Lcom/google/android/gms/internal/ads/lq2;)V
    .locals 0

    monitor-enter p0

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/if0;->g:Lcom/google/android/gms/internal/ads/lq2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized a(Lcom/google/android/gms/internal/ads/o1;)V
    .locals 0

    monitor-enter p0

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/if0;->c:Lcom/google/android/gms/internal/ads/o1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized a(Lcom/google/android/gms/internal/ads/rp2;)V
    .locals 0

    monitor-enter p0

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/if0;->b:Lcom/google/android/gms/internal/ads/rp2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized a(Lcom/google/android/gms/internal/ads/v1;)V
    .locals 0

    monitor-enter p0

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/if0;->o:Lcom/google/android/gms/internal/ads/v1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized a(Lcom/google/android/gms/internal/ads/ws;)V
    .locals 0

    monitor-enter p0

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/if0;->i:Lcom/google/android/gms/internal/ads/ws;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized a(Ljava/lang/String;)V
    .locals 0

    monitor-enter p0

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/if0;->q:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/i1;)V
    .locals 1

    monitor-enter p0

    if-nez p2, :cond_0

    :try_start_0
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/if0;->r:La/e/g;

    invoke-virtual {p2, p1}, La/e/g;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/if0;->r:La/e/g;

    invoke-virtual {v0, p1, p2}, La/e/g;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    monitor-enter p0

    if-nez p2, :cond_0

    :try_start_0
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/if0;->s:La/e/g;

    invoke-virtual {p2, p1}, La/e/g;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/if0;->s:La/e/g;

    invoke-virtual {v0, p1, p2}, La/e/g;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized a(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/ads/i1;",
            ">;)V"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/if0;->e:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized b()Ljava/lang/String;
    .locals 1

    monitor-enter p0

    :try_start_0
    const-string v0, "advertiser"

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/if0;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized b(Lcom/google/android/gms/internal/ads/v1;)V
    .locals 0

    monitor-enter p0

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/if0;->p:Lcom/google/android/gms/internal/ads/v1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized b(Lcom/google/android/gms/internal/ads/ws;)V
    .locals 0

    monitor-enter p0

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/if0;->j:Lcom/google/android/gms/internal/ads/ws;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized b(Ljava/lang/String;)V
    .locals 0

    monitor-enter p0

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/if0;->u:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized b(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/ads/lq2;",
            ">;)V"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/if0;->f:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized c()Ljava/lang/String;
    .locals 1

    monitor-enter p0

    :try_start_0
    const-string v0, "body"

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/if0;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized d()Ljava/lang/String;
    .locals 1

    monitor-enter p0

    :try_start_0
    const-string v0, "call_to_action"

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/if0;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized e()Ljava/lang/String;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/if0;->q:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized f()Landroid/os/Bundle;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/if0;->h:Landroid/os/Bundle;

    if-nez v0, :cond_0

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/if0;->h:Landroid/os/Bundle;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/if0;->h:Landroid/os/Bundle;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized g()Ljava/lang/String;
    .locals 1

    monitor-enter p0

    :try_start_0
    const-string v0, "headline"

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/if0;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized h()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "*>;"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/if0;->e:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized i()F
    .locals 1

    monitor-enter p0

    :try_start_0
    iget v0, p0, Lcom/google/android/gms/internal/ads/if0;->t:F
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized j()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/ads/lq2;",
            ">;"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/if0;->f:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized k()Ljava/lang/String;
    .locals 1

    monitor-enter p0

    :try_start_0
    const-string v0, "price"

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/if0;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized l()D
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/if0;->n:D
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-wide v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized m()Ljava/lang/String;
    .locals 1

    monitor-enter p0

    :try_start_0
    const-string v0, "store"

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/if0;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized n()Lcom/google/android/gms/internal/ads/rp2;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/if0;->b:Lcom/google/android/gms/internal/ads/rp2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized o()I
    .locals 1

    monitor-enter p0

    :try_start_0
    iget v0, p0, Lcom/google/android/gms/internal/ads/if0;->a:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized p()Landroid/view/View;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/if0;->d:Landroid/view/View;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final q()Lcom/google/android/gms/internal/ads/v1;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/if0;->e:Ljava/util/List;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/if0;->e:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    instance-of v2, v0, Landroid/os/IBinder;

    if-eqz v2, :cond_1

    check-cast v0, Landroid/os/IBinder;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/y1;->a(Landroid/os/IBinder;)Lcom/google/android/gms/internal/ads/v1;

    move-result-object v0

    return-object v0

    :cond_1
    :goto_0
    return-object v1
.end method

.method public final declared-synchronized r()Lcom/google/android/gms/internal/ads/lq2;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/if0;->g:Lcom/google/android/gms/internal/ads/lq2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized s()Landroid/view/View;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/if0;->l:Landroid/view/View;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized t()Lcom/google/android/gms/internal/ads/ws;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/if0;->i:Lcom/google/android/gms/internal/ads/ws;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized u()Lcom/google/android/gms/internal/ads/ws;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/if0;->j:Lcom/google/android/gms/internal/ads/ws;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized v()Lb/c/b/a/d/a;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/if0;->k:Lb/c/b/a/d/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized w()La/e/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "La/e/g<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/ads/i1;",
            ">;"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/if0;->r:La/e/g;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized x()Ljava/lang/String;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/if0;->u:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized y()La/e/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "La/e/g<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/if0;->s:La/e/g;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized z()Lcom/google/android/gms/internal/ads/v1;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/if0;->o:Lcom/google/android/gms/internal/ads/v1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
