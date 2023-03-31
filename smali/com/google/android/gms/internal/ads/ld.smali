.class public final Lcom/google/android/gms/internal/ads/ld;
.super Lcom/google/android/gms/internal/ads/wd;
.source ""


# instance fields
.field private c:Ljava/lang/String;

.field private d:Z

.field private e:I

.field private f:I

.field private g:I

.field private h:I

.field private i:I

.field private j:I

.field private final k:Ljava/lang/Object;

.field private final l:Lcom/google/android/gms/internal/ads/ws;

.field private final m:Landroid/app/Activity;

.field private n:Lcom/google/android/gms/internal/ads/lu;

.field private o:Landroid/widget/ImageView;

.field private p:Landroid/widget/LinearLayout;

.field private q:Lcom/google/android/gms/internal/ads/vd;

.field private r:Landroid/widget/PopupWindow;

.field private s:Landroid/widget/RelativeLayout;

.field private t:Landroid/view/ViewGroup;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    const-string v0, "top-left"

    const-string v1, "top-right"

    const-string v2, "top-center"

    const-string v3, "center"

    const-string v4, "bottom-left"

    const-string v5, "bottom-right"

    const-string v6, "bottom-center"

    filled-new-array/range {v0 .. v6}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/common/util/e;->a([Ljava/lang/Object;)Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/ads/ws;Lcom/google/android/gms/internal/ads/vd;)V
    .locals 2

    const-string v0, "resize"

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/ads/wd;-><init>(Lcom/google/android/gms/internal/ads/ws;Ljava/lang/String;)V

    const-string v0, "top-right"

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/ld;->c:Ljava/lang/String;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/ld;->d:Z

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/ads/ld;->e:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/ld;->f:I

    const/4 v1, -0x1

    iput v1, p0, Lcom/google/android/gms/internal/ads/ld;->g:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/ld;->h:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/ld;->i:I

    iput v1, p0, Lcom/google/android/gms/internal/ads/ld;->j:I

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/ld;->k:Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ld;->l:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/ws;->a()Landroid/app/Activity;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ld;->m:Landroid/app/Activity;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/ld;->q:Lcom/google/android/gms/internal/ads/vd;

    return-void
.end method


# virtual methods
.method public final a(II)V
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/ld;->e:I

    iput p2, p0, Lcom/google/android/gms/internal/ads/ld;->f:I

    return-void
.end method

.method public final a(IIZ)V
    .locals 0

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/ld;->k:Ljava/lang/Object;

    monitor-enter p3

    :try_start_0
    iput p1, p0, Lcom/google/android/gms/internal/ads/ld;->e:I

    iput p2, p0, Lcom/google/android/gms/internal/ads/ld;->f:I

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/ld;->r:Landroid/widget/PopupWindow;

    monitor-exit p3

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final a(Ljava/util/Map;)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/ld;->k:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    iget-object v3, v1, Lcom/google/android/gms/internal/ads/ld;->m:Landroid/app/Activity;

    if-nez v3, :cond_0

    const-string v0, "Not an activity context. Cannot resize."

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/wd;->a(Ljava/lang/String;)V

    monitor-exit v2

    return-void

    :cond_0
    iget-object v3, v1, Lcom/google/android/gms/internal/ads/ld;->l:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/ws;->f()Lcom/google/android/gms/internal/ads/lu;

    move-result-object v3

    if-nez v3, :cond_1

    const-string v0, "Webview is not yet available, size is not set."

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/wd;->a(Ljava/lang/String;)V

    monitor-exit v2

    return-void

    :cond_1
    iget-object v3, v1, Lcom/google/android/gms/internal/ads/ld;->l:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/ws;->f()Lcom/google/android/gms/internal/ads/lu;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/lu;->b()Z

    move-result v3

    if-eqz v3, :cond_2

    const-string v0, "Is interstitial. Cannot resize an interstitial."

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/wd;->a(Ljava/lang/String;)V

    monitor-exit v2

    return-void

    :cond_2
    iget-object v3, v1, Lcom/google/android/gms/internal/ads/ld;->l:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/ws;->h()Z

    move-result v3

    if-eqz v3, :cond_3

    const-string v0, "Cannot resize an expanded banner."

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/wd;->a(Ljava/lang/String;)V

    monitor-exit v2

    return-void

    :cond_3
    const-string v3, "width"

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_4

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->c()Lcom/google/android/gms/internal/ads/gl;

    const-string v3, "width"

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Lcom/google/android/gms/internal/ads/gl;->c(Ljava/lang/String;)I

    move-result v3

    iput v3, v1, Lcom/google/android/gms/internal/ads/ld;->j:I

    :cond_4
    const-string v3, "height"

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_5

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->c()Lcom/google/android/gms/internal/ads/gl;

    const-string v3, "height"

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Lcom/google/android/gms/internal/ads/gl;->c(Ljava/lang/String;)I

    move-result v3

    iput v3, v1, Lcom/google/android/gms/internal/ads/ld;->g:I

    :cond_5
    const-string v3, "offsetX"

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_6

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->c()Lcom/google/android/gms/internal/ads/gl;

    const-string v3, "offsetX"

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Lcom/google/android/gms/internal/ads/gl;->c(Ljava/lang/String;)I

    move-result v3

    iput v3, v1, Lcom/google/android/gms/internal/ads/ld;->h:I

    :cond_6
    const-string v3, "offsetY"

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_7

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->c()Lcom/google/android/gms/internal/ads/gl;

    const-string v3, "offsetY"

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Lcom/google/android/gms/internal/ads/gl;->c(Ljava/lang/String;)I

    move-result v3

    iput v3, v1, Lcom/google/android/gms/internal/ads/ld;->i:I

    :cond_7
    const-string v3, "allowOffscreen"

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_8

    const-string v3, "allowOffscreen"

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v3

    iput-boolean v3, v1, Lcom/google/android/gms/internal/ads/ld;->d:Z

    :cond_8
    const-string v3, "customClosePosition"

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_9

    iput-object v0, v1, Lcom/google/android/gms/internal/ads/ld;->c:Ljava/lang/String;

    :cond_9
    iget v0, v1, Lcom/google/android/gms/internal/ads/ld;->j:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-ltz v0, :cond_a

    iget v0, v1, Lcom/google/android/gms/internal/ads/ld;->g:I

    if-ltz v0, :cond_a

    const/4 v0, 0x1

    goto :goto_0

    :cond_a
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_b

    const-string v0, "Invalid width and height options. Cannot resize."

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/wd;->a(Ljava/lang/String;)V

    monitor-exit v2

    return-void

    :cond_b
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/ld;->m:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_2f

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v5

    if-nez v5, :cond_c

    goto/16 :goto_17

    :cond_c
    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->c()Lcom/google/android/gms/internal/ads/gl;

    move-result-object v5

    iget-object v6, v1, Lcom/google/android/gms/internal/ads/ld;->m:Landroid/app/Activity;

    invoke-virtual {v5, v6}, Lcom/google/android/gms/internal/ads/gl;->a(Landroid/app/Activity;)[I

    move-result-object v5

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->c()Lcom/google/android/gms/internal/ads/gl;

    move-result-object v6

    iget-object v7, v1, Lcom/google/android/gms/internal/ads/ld;->m:Landroid/app/Activity;

    invoke-virtual {v6, v7}, Lcom/google/android/gms/internal/ads/gl;->b(Landroid/app/Activity;)[I

    move-result-object v6

    aget v7, v5, v4

    aget v5, v5, v3

    iget v8, v1, Lcom/google/android/gms/internal/ads/ld;->j:I

    const/4 v9, 0x5

    const/4 v10, 0x4

    const/4 v11, 0x3

    const/4 v12, -0x1

    const/4 v13, 0x2

    const/16 v14, 0x32

    if-lt v8, v14, :cond_19

    iget v8, v1, Lcom/google/android/gms/internal/ads/ld;->j:I

    if-le v8, v7, :cond_d

    goto/16 :goto_9

    :cond_d
    iget v8, v1, Lcom/google/android/gms/internal/ads/ld;->g:I

    if-lt v8, v14, :cond_18

    iget v8, v1, Lcom/google/android/gms/internal/ads/ld;->g:I

    if-le v8, v5, :cond_e

    goto/16 :goto_8

    :cond_e
    iget v8, v1, Lcom/google/android/gms/internal/ads/ld;->g:I

    if-ne v8, v5, :cond_f

    iget v5, v1, Lcom/google/android/gms/internal/ads/ld;->j:I

    if-ne v5, v7, :cond_f

    const-string v5, "Cannot resize to a full-screen ad."

    goto/16 :goto_a

    :cond_f
    iget-boolean v5, v1, Lcom/google/android/gms/internal/ads/ld;->d:Z

    if-eqz v5, :cond_17

    iget-object v5, v1, Lcom/google/android/gms/internal/ads/ld;->c:Ljava/lang/String;

    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    move-result v8

    sparse-switch v8, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    const-string v8, "top-center"

    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_10

    const/4 v5, 0x1

    goto :goto_2

    :sswitch_1
    const-string v8, "bottom-center"

    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_10

    const/4 v5, 0x4

    goto :goto_2

    :sswitch_2
    const-string v8, "bottom-right"

    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_10

    const/4 v5, 0x5

    goto :goto_2

    :sswitch_3
    const-string v8, "bottom-left"

    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_10

    const/4 v5, 0x3

    goto :goto_2

    :sswitch_4
    const-string v8, "top-left"

    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_10

    const/4 v5, 0x0

    goto :goto_2

    :sswitch_5
    const-string v8, "center"

    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_10

    const/4 v5, 0x2

    goto :goto_2

    :cond_10
    :goto_1
    const/4 v5, -0x1

    :goto_2
    if-eqz v5, :cond_16

    if-eq v5, v3, :cond_15

    if-eq v5, v13, :cond_14

    if-eq v5, v11, :cond_13

    if-eq v5, v10, :cond_12

    if-eq v5, v9, :cond_11

    iget v5, v1, Lcom/google/android/gms/internal/ads/ld;->e:I

    iget v8, v1, Lcom/google/android/gms/internal/ads/ld;->h:I

    add-int/2addr v5, v8

    iget v8, v1, Lcom/google/android/gms/internal/ads/ld;->j:I

    add-int/2addr v5, v8

    sub-int/2addr v5, v14

    iget v8, v1, Lcom/google/android/gms/internal/ads/ld;->f:I

    goto :goto_5

    :cond_11
    iget v5, v1, Lcom/google/android/gms/internal/ads/ld;->e:I

    iget v8, v1, Lcom/google/android/gms/internal/ads/ld;->h:I

    add-int/2addr v5, v8

    iget v8, v1, Lcom/google/android/gms/internal/ads/ld;->j:I

    add-int/2addr v5, v8

    sub-int/2addr v5, v14

    iget v8, v1, Lcom/google/android/gms/internal/ads/ld;->f:I

    iget v15, v1, Lcom/google/android/gms/internal/ads/ld;->i:I

    goto :goto_3

    :cond_12
    iget v5, v1, Lcom/google/android/gms/internal/ads/ld;->e:I

    iget v8, v1, Lcom/google/android/gms/internal/ads/ld;->h:I

    add-int/2addr v5, v8

    iget v8, v1, Lcom/google/android/gms/internal/ads/ld;->j:I

    div-int/2addr v8, v13

    add-int/2addr v5, v8

    add-int/lit8 v5, v5, -0x19

    iget v8, v1, Lcom/google/android/gms/internal/ads/ld;->f:I

    iget v15, v1, Lcom/google/android/gms/internal/ads/ld;->i:I

    :goto_3
    add-int/2addr v8, v15

    iget v15, v1, Lcom/google/android/gms/internal/ads/ld;->g:I

    goto :goto_4

    :cond_13
    iget v5, v1, Lcom/google/android/gms/internal/ads/ld;->e:I

    iget v8, v1, Lcom/google/android/gms/internal/ads/ld;->h:I

    add-int/2addr v5, v8

    iget v8, v1, Lcom/google/android/gms/internal/ads/ld;->f:I

    iget v15, v1, Lcom/google/android/gms/internal/ads/ld;->i:I

    goto :goto_3

    :goto_4
    add-int/2addr v8, v15

    sub-int/2addr v8, v14

    goto :goto_7

    :cond_14
    iget v5, v1, Lcom/google/android/gms/internal/ads/ld;->e:I

    iget v8, v1, Lcom/google/android/gms/internal/ads/ld;->h:I

    add-int/2addr v5, v8

    iget v8, v1, Lcom/google/android/gms/internal/ads/ld;->j:I

    div-int/2addr v8, v13

    add-int/2addr v5, v8

    add-int/lit8 v5, v5, -0x19

    iget v8, v1, Lcom/google/android/gms/internal/ads/ld;->f:I

    iget v15, v1, Lcom/google/android/gms/internal/ads/ld;->i:I

    add-int/2addr v8, v15

    iget v15, v1, Lcom/google/android/gms/internal/ads/ld;->g:I

    div-int/2addr v15, v13

    add-int/2addr v8, v15

    add-int/lit8 v8, v8, -0x19

    goto :goto_7

    :cond_15
    iget v5, v1, Lcom/google/android/gms/internal/ads/ld;->e:I

    iget v8, v1, Lcom/google/android/gms/internal/ads/ld;->h:I

    add-int/2addr v5, v8

    iget v8, v1, Lcom/google/android/gms/internal/ads/ld;->j:I

    div-int/2addr v8, v13

    add-int/2addr v5, v8

    add-int/lit8 v5, v5, -0x19

    iget v8, v1, Lcom/google/android/gms/internal/ads/ld;->f:I

    :goto_5
    iget v15, v1, Lcom/google/android/gms/internal/ads/ld;->i:I

    goto :goto_6

    :cond_16
    iget v5, v1, Lcom/google/android/gms/internal/ads/ld;->e:I

    iget v8, v1, Lcom/google/android/gms/internal/ads/ld;->h:I

    add-int/2addr v5, v8

    iget v8, v1, Lcom/google/android/gms/internal/ads/ld;->f:I

    goto :goto_5

    :goto_6
    add-int/2addr v8, v15

    :goto_7
    if-ltz v5, :cond_1a

    add-int/2addr v5, v14

    if-gt v5, v7, :cond_1a

    aget v5, v6, v4

    if-lt v8, v5, :cond_1a

    add-int/2addr v8, v14

    aget v5, v6, v3

    if-le v8, v5, :cond_17

    goto :goto_b

    :cond_17
    const/4 v5, 0x1

    goto :goto_c

    :cond_18
    :goto_8
    const-string v5, "Height is too small or too large."

    goto :goto_a

    :cond_19
    :goto_9
    const-string v5, "Width is too small or too large."

    :goto_a
    invoke-static {v5}, Lcom/google/android/gms/internal/ads/co;->d(Ljava/lang/String;)V

    :cond_1a
    :goto_b
    const/4 v5, 0x0

    :goto_c
    if-nez v5, :cond_1b

    const/4 v5, 0x0

    goto :goto_f

    :cond_1b
    iget-boolean v5, v1, Lcom/google/android/gms/internal/ads/ld;->d:Z

    if-eqz v5, :cond_1c

    new-array v5, v13, [I

    iget v6, v1, Lcom/google/android/gms/internal/ads/ld;->e:I

    iget v7, v1, Lcom/google/android/gms/internal/ads/ld;->h:I

    add-int/2addr v6, v7

    aput v6, v5, v4

    iget v6, v1, Lcom/google/android/gms/internal/ads/ld;->f:I

    iget v7, v1, Lcom/google/android/gms/internal/ads/ld;->i:I

    add-int/2addr v6, v7

    aput v6, v5, v3

    goto :goto_f

    :cond_1c
    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->c()Lcom/google/android/gms/internal/ads/gl;

    move-result-object v5

    iget-object v6, v1, Lcom/google/android/gms/internal/ads/ld;->m:Landroid/app/Activity;

    invoke-virtual {v5, v6}, Lcom/google/android/gms/internal/ads/gl;->a(Landroid/app/Activity;)[I

    move-result-object v5

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->c()Lcom/google/android/gms/internal/ads/gl;

    move-result-object v6

    iget-object v7, v1, Lcom/google/android/gms/internal/ads/ld;->m:Landroid/app/Activity;

    invoke-virtual {v6, v7}, Lcom/google/android/gms/internal/ads/gl;->b(Landroid/app/Activity;)[I

    move-result-object v6

    aget v5, v5, v4

    iget v7, v1, Lcom/google/android/gms/internal/ads/ld;->e:I

    iget v8, v1, Lcom/google/android/gms/internal/ads/ld;->h:I

    add-int/2addr v7, v8

    iget v8, v1, Lcom/google/android/gms/internal/ads/ld;->f:I

    iget v15, v1, Lcom/google/android/gms/internal/ads/ld;->i:I

    add-int/2addr v8, v15

    if-gez v7, :cond_1d

    const/4 v7, 0x0

    goto :goto_d

    :cond_1d
    iget v15, v1, Lcom/google/android/gms/internal/ads/ld;->j:I

    add-int/2addr v15, v7

    if-le v15, v5, :cond_1e

    iget v7, v1, Lcom/google/android/gms/internal/ads/ld;->j:I

    sub-int v7, v5, v7

    :cond_1e
    :goto_d
    aget v5, v6, v4

    if-ge v8, v5, :cond_1f

    aget v8, v6, v4

    goto :goto_e

    :cond_1f
    iget v5, v1, Lcom/google/android/gms/internal/ads/ld;->g:I

    add-int/2addr v5, v8

    aget v15, v6, v3

    if-le v5, v15, :cond_20

    aget v5, v6, v3

    iget v6, v1, Lcom/google/android/gms/internal/ads/ld;->g:I

    sub-int v8, v5, v6

    :cond_20
    :goto_e
    new-array v5, v13, [I

    aput v7, v5, v4

    aput v8, v5, v3

    :goto_f
    if-nez v5, :cond_21

    const-string v0, "Resize location out of screen or close button is not visible."

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/wd;->a(Ljava/lang/String;)V

    monitor-exit v2

    return-void

    :cond_21
    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->a()Lcom/google/android/gms/internal/ads/sn;

    iget-object v6, v1, Lcom/google/android/gms/internal/ads/ld;->m:Landroid/app/Activity;

    iget v7, v1, Lcom/google/android/gms/internal/ads/ld;->j:I

    invoke-static {v6, v7}, Lcom/google/android/gms/internal/ads/sn;->b(Landroid/content/Context;I)I

    move-result v6

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->a()Lcom/google/android/gms/internal/ads/sn;

    iget-object v7, v1, Lcom/google/android/gms/internal/ads/ld;->m:Landroid/app/Activity;

    iget v8, v1, Lcom/google/android/gms/internal/ads/ld;->g:I

    invoke-static {v7, v8}, Lcom/google/android/gms/internal/ads/sn;->b(Landroid/content/Context;I)I

    move-result v7

    iget-object v8, v1, Lcom/google/android/gms/internal/ads/ld;->l:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v8}, Lcom/google/android/gms/internal/ads/ws;->getView()Landroid/view/View;

    move-result-object v8

    invoke-virtual {v8}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v8

    if-eqz v8, :cond_2e

    instance-of v15, v8, Landroid/view/ViewGroup;

    if-eqz v15, :cond_2e

    move-object v15, v8

    check-cast v15, Landroid/view/ViewGroup;

    iget-object v9, v1, Lcom/google/android/gms/internal/ads/ld;->l:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v9}, Lcom/google/android/gms/internal/ads/ws;->getView()Landroid/view/View;

    move-result-object v9

    invoke-virtual {v15, v9}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    iget-object v9, v1, Lcom/google/android/gms/internal/ads/ld;->r:Landroid/widget/PopupWindow;

    if-nez v9, :cond_22

    check-cast v8, Landroid/view/ViewGroup;

    iput-object v8, v1, Lcom/google/android/gms/internal/ads/ld;->t:Landroid/view/ViewGroup;

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->c()Lcom/google/android/gms/internal/ads/gl;

    iget-object v8, v1, Lcom/google/android/gms/internal/ads/ld;->l:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v8}, Lcom/google/android/gms/internal/ads/ws;->getView()Landroid/view/View;

    move-result-object v8

    invoke-static {v8}, Lcom/google/android/gms/internal/ads/gl;->a(Landroid/view/View;)Landroid/graphics/Bitmap;

    move-result-object v8

    new-instance v9, Landroid/widget/ImageView;

    iget-object v15, v1, Lcom/google/android/gms/internal/ads/ld;->m:Landroid/app/Activity;

    invoke-direct {v9, v15}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    iput-object v9, v1, Lcom/google/android/gms/internal/ads/ld;->o:Landroid/widget/ImageView;

    invoke-virtual {v9, v8}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    iget-object v8, v1, Lcom/google/android/gms/internal/ads/ld;->l:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v8}, Lcom/google/android/gms/internal/ads/ws;->f()Lcom/google/android/gms/internal/ads/lu;

    move-result-object v8

    iput-object v8, v1, Lcom/google/android/gms/internal/ads/ld;->n:Lcom/google/android/gms/internal/ads/lu;

    iget-object v8, v1, Lcom/google/android/gms/internal/ads/ld;->t:Landroid/view/ViewGroup;

    iget-object v9, v1, Lcom/google/android/gms/internal/ads/ld;->o:Landroid/widget/ImageView;

    invoke-virtual {v8, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    goto :goto_10

    :cond_22
    iget-object v8, v1, Lcom/google/android/gms/internal/ads/ld;->r:Landroid/widget/PopupWindow;

    invoke-virtual {v8}, Landroid/widget/PopupWindow;->dismiss()V

    :goto_10
    new-instance v8, Landroid/widget/RelativeLayout;

    iget-object v9, v1, Lcom/google/android/gms/internal/ads/ld;->m:Landroid/app/Activity;

    invoke-direct {v8, v9}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    iput-object v8, v1, Lcom/google/android/gms/internal/ads/ld;->s:Landroid/widget/RelativeLayout;

    invoke-virtual {v8, v4}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V

    iget-object v8, v1, Lcom/google/android/gms/internal/ads/ld;->s:Landroid/widget/RelativeLayout;

    new-instance v9, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v9, v6, v7}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v8, v9}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->c()Lcom/google/android/gms/internal/ads/gl;

    iget-object v8, v1, Lcom/google/android/gms/internal/ads/ld;->s:Landroid/widget/RelativeLayout;

    invoke-static {v8, v6, v7, v4}, Lcom/google/android/gms/internal/ads/gl;->a(Landroid/view/View;IIZ)Landroid/widget/PopupWindow;

    move-result-object v8

    iput-object v8, v1, Lcom/google/android/gms/internal/ads/ld;->r:Landroid/widget/PopupWindow;

    invoke-virtual {v8, v3}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    iget-object v8, v1, Lcom/google/android/gms/internal/ads/ld;->r:Landroid/widget/PopupWindow;

    invoke-virtual {v8, v3}, Landroid/widget/PopupWindow;->setTouchable(Z)V

    iget-object v8, v1, Lcom/google/android/gms/internal/ads/ld;->r:Landroid/widget/PopupWindow;

    iget-boolean v9, v1, Lcom/google/android/gms/internal/ads/ld;->d:Z

    if-nez v9, :cond_23

    const/4 v9, 0x1

    goto :goto_11

    :cond_23
    const/4 v9, 0x0

    :goto_11
    invoke-virtual {v8, v9}, Landroid/widget/PopupWindow;->setClippingEnabled(Z)V

    iget-object v8, v1, Lcom/google/android/gms/internal/ads/ld;->s:Landroid/widget/RelativeLayout;

    iget-object v9, v1, Lcom/google/android/gms/internal/ads/ld;->l:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v9}, Lcom/google/android/gms/internal/ads/ws;->getView()Landroid/view/View;

    move-result-object v9

    invoke-virtual {v8, v9, v12, v12}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;II)V

    new-instance v8, Landroid/widget/LinearLayout;

    iget-object v9, v1, Lcom/google/android/gms/internal/ads/ld;->m:Landroid/app/Activity;

    invoke-direct {v8, v9}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    iput-object v8, v1, Lcom/google/android/gms/internal/ads/ld;->p:Landroid/widget/LinearLayout;

    new-instance v8, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->a()Lcom/google/android/gms/internal/ads/sn;

    iget-object v9, v1, Lcom/google/android/gms/internal/ads/ld;->m:Landroid/app/Activity;

    invoke-static {v9, v14}, Lcom/google/android/gms/internal/ads/sn;->b(Landroid/content/Context;I)I

    move-result v9

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->a()Lcom/google/android/gms/internal/ads/sn;

    iget-object v15, v1, Lcom/google/android/gms/internal/ads/ld;->m:Landroid/app/Activity;

    invoke-static {v15, v14}, Lcom/google/android/gms/internal/ads/sn;->b(Landroid/content/Context;I)I

    move-result v14

    invoke-direct {v8, v9, v14}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    iget-object v9, v1, Lcom/google/android/gms/internal/ads/ld;->c:Ljava/lang/String;

    invoke-virtual {v9}, Ljava/lang/String;->hashCode()I

    move-result v14

    sparse-switch v14, :sswitch_data_1

    goto :goto_12

    :sswitch_6
    const-string v14, "top-center"

    invoke-virtual {v9, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_24

    const/4 v12, 0x1

    goto :goto_12

    :sswitch_7
    const-string v14, "bottom-center"

    invoke-virtual {v9, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_24

    const/4 v12, 0x4

    goto :goto_12

    :sswitch_8
    const-string v14, "bottom-right"

    invoke-virtual {v9, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_24

    const/4 v12, 0x5

    goto :goto_12

    :sswitch_9
    const-string v14, "bottom-left"

    invoke-virtual {v9, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_24

    const/4 v12, 0x3

    goto :goto_12

    :sswitch_a
    const-string v14, "top-left"

    invoke-virtual {v9, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_24

    const/4 v12, 0x0

    goto :goto_12

    :sswitch_b
    const-string v14, "center"

    invoke-virtual {v9, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_24

    const/4 v12, 0x2

    :cond_24
    :goto_12
    const/16 v9, 0x9

    const/16 v14, 0xa

    if-eqz v12, :cond_2a

    const/16 v15, 0xe

    if-eq v12, v3, :cond_29

    if-eq v12, v13, :cond_28

    const/16 v13, 0xc

    if-eq v12, v11, :cond_27

    if-eq v12, v10, :cond_26

    const/16 v9, 0xb

    const/4 v10, 0x5

    if-eq v12, v10, :cond_25

    invoke-virtual {v8, v14}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    :goto_13
    invoke-virtual {v8, v9}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    goto :goto_15

    :cond_25
    invoke-virtual {v8, v13}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    goto :goto_13

    :cond_26
    invoke-virtual {v8, v13}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    :goto_14
    invoke-virtual {v8, v15}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    goto :goto_15

    :cond_27
    invoke-virtual {v8, v13}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    goto :goto_13

    :cond_28
    const/16 v9, 0xd

    invoke-virtual {v8, v9}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    goto :goto_15

    :cond_29
    invoke-virtual {v8, v14}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    goto :goto_14

    :cond_2a
    invoke-virtual {v8, v14}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    goto :goto_13

    :goto_15
    iget-object v9, v1, Lcom/google/android/gms/internal/ads/ld;->p:Landroid/widget/LinearLayout;

    new-instance v10, Lcom/google/android/gms/internal/ads/kd;

    invoke-direct {v10, v1}, Lcom/google/android/gms/internal/ads/kd;-><init>(Lcom/google/android/gms/internal/ads/ld;)V

    invoke-virtual {v9, v10}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v9, v1, Lcom/google/android/gms/internal/ads/ld;->p:Landroid/widget/LinearLayout;

    const-string v10, "Close button"

    invoke-virtual {v9, v10}, Landroid/widget/LinearLayout;->setContentDescription(Ljava/lang/CharSequence;)V

    iget-object v9, v1, Lcom/google/android/gms/internal/ads/ld;->s:Landroid/widget/RelativeLayout;

    iget-object v10, v1, Lcom/google/android/gms/internal/ads/ld;->p:Landroid/widget/LinearLayout;

    invoke-virtual {v9, v10, v8}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v8, v1, Lcom/google/android/gms/internal/ads/ld;->r:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->a()Lcom/google/android/gms/internal/ads/sn;

    iget-object v9, v1, Lcom/google/android/gms/internal/ads/ld;->m:Landroid/app/Activity;

    aget v10, v5, v4

    invoke-static {v9, v10}, Lcom/google/android/gms/internal/ads/sn;->b(Landroid/content/Context;I)I

    move-result v9

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->a()Lcom/google/android/gms/internal/ads/sn;

    iget-object v10, v1, Lcom/google/android/gms/internal/ads/ld;->m:Landroid/app/Activity;

    aget v11, v5, v3

    invoke-static {v10, v11}, Lcom/google/android/gms/internal/ads/sn;->b(Landroid/content/Context;I)I

    move-result v10

    invoke-virtual {v8, v0, v4, v9, v10}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    aget v0, v5, v4

    aget v8, v5, v3

    iget-object v9, v1, Lcom/google/android/gms/internal/ads/ld;->q:Lcom/google/android/gms/internal/ads/vd;

    if-eqz v9, :cond_2b

    iget-object v9, v1, Lcom/google/android/gms/internal/ads/ld;->q:Lcom/google/android/gms/internal/ads/vd;

    iget v10, v1, Lcom/google/android/gms/internal/ads/ld;->j:I

    iget v11, v1, Lcom/google/android/gms/internal/ads/ld;->g:I

    invoke-interface {v9, v0, v8, v10, v11}, Lcom/google/android/gms/internal/ads/vd;->a(IIII)V

    :cond_2b
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/ld;->l:Lcom/google/android/gms/internal/ads/ws;

    invoke-static {v6, v7}, Lcom/google/android/gms/internal/ads/lu;->a(II)Lcom/google/android/gms/internal/ads/lu;

    move-result-object v6

    invoke-interface {v0, v6}, Lcom/google/android/gms/internal/ads/ws;->a(Lcom/google/android/gms/internal/ads/lu;)V

    aget v0, v5, v4

    aget v3, v5, v3

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->c()Lcom/google/android/gms/internal/ads/gl;

    move-result-object v5

    iget-object v6, v1, Lcom/google/android/gms/internal/ads/ld;->m:Landroid/app/Activity;

    invoke-virtual {v5, v6}, Lcom/google/android/gms/internal/ads/gl;->b(Landroid/app/Activity;)[I

    move-result-object v5

    aget v4, v5, v4

    sub-int/2addr v3, v4

    iget v4, v1, Lcom/google/android/gms/internal/ads/ld;->j:I

    iget v5, v1, Lcom/google/android/gms/internal/ads/ld;->g:I

    invoke-virtual {v1, v0, v3, v4, v5}, Lcom/google/android/gms/internal/ads/wd;->a(IIII)V

    const-string v0, "resized"

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/wd;->c(Ljava/lang/String;)V

    monitor-exit v2

    return-void

    :catch_0
    move-exception v0

    const-string v3, "Cannot show popup window: "

    invoke-virtual {v0}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    if-eqz v4, :cond_2c

    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_16

    :cond_2c
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v3}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :goto_16
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/wd;->a(Ljava/lang/String;)V

    iget-object v0, v1, Lcom/google/android/gms/internal/ads/ld;->s:Landroid/widget/RelativeLayout;

    iget-object v3, v1, Lcom/google/android/gms/internal/ads/ld;->l:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/ws;->getView()Landroid/view/View;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/widget/RelativeLayout;->removeView(Landroid/view/View;)V

    iget-object v0, v1, Lcom/google/android/gms/internal/ads/ld;->t:Landroid/view/ViewGroup;

    if-eqz v0, :cond_2d

    iget-object v0, v1, Lcom/google/android/gms/internal/ads/ld;->t:Landroid/view/ViewGroup;

    iget-object v3, v1, Lcom/google/android/gms/internal/ads/ld;->o:Landroid/widget/ImageView;

    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    iget-object v0, v1, Lcom/google/android/gms/internal/ads/ld;->t:Landroid/view/ViewGroup;

    iget-object v3, v1, Lcom/google/android/gms/internal/ads/ld;->l:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/ws;->getView()Landroid/view/View;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object v0, v1, Lcom/google/android/gms/internal/ads/ld;->l:Lcom/google/android/gms/internal/ads/ws;

    iget-object v3, v1, Lcom/google/android/gms/internal/ads/ld;->n:Lcom/google/android/gms/internal/ads/lu;

    invoke-interface {v0, v3}, Lcom/google/android/gms/internal/ads/ws;->a(Lcom/google/android/gms/internal/ads/lu;)V

    :cond_2d
    monitor-exit v2

    return-void

    :cond_2e
    const-string v0, "Webview is detached, probably in the middle of a resize or expand."

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/wd;->a(Ljava/lang/String;)V

    monitor-exit v2

    return-void

    :cond_2f
    :goto_17
    const-string v0, "Activity context is not ready, cannot get window or decor view."

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/wd;->a(Ljava/lang/String;)V

    monitor-exit v2

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x514d33ab -> :sswitch_5
        -0x3c587281 -> :sswitch_4
        -0x27103597 -> :sswitch_3
        0x455fe3fa -> :sswitch_2
        0x4ccee637 -> :sswitch_1
        0x68a23bcd -> :sswitch_0
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        -0x514d33ab -> :sswitch_b
        -0x3c587281 -> :sswitch_a
        -0x27103597 -> :sswitch_9
        0x455fe3fa -> :sswitch_8
        0x4ccee637 -> :sswitch_7
        0x68a23bcd -> :sswitch_6
    .end sparse-switch
.end method

.method public final a(Z)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ld;->k:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ld;->r:Landroid/widget/PopupWindow;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ld;->r:Landroid/widget/PopupWindow;

    invoke-virtual {v1}, Landroid/widget/PopupWindow;->dismiss()V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ld;->s:Landroid/widget/RelativeLayout;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/ld;->l:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/ws;->getView()Landroid/view/View;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->removeView(Landroid/view/View;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ld;->t:Landroid/view/ViewGroup;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ld;->t:Landroid/view/ViewGroup;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/ld;->o:Landroid/widget/ImageView;

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ld;->t:Landroid/view/ViewGroup;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/ld;->l:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/ws;->getView()Landroid/view/View;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ld;->l:Lcom/google/android/gms/internal/ads/ws;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/ld;->n:Lcom/google/android/gms/internal/ads/lu;

    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/ads/ws;->a(Lcom/google/android/gms/internal/ads/lu;)V

    :cond_0
    if-eqz p1, :cond_1

    const-string p1, "default"

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/wd;->c(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/ld;->q:Lcom/google/android/gms/internal/ads/vd;

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/ld;->q:Lcom/google/android/gms/internal/ads/vd;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/vd;->b()V

    :cond_1
    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ld;->r:Landroid/widget/PopupWindow;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ld;->s:Landroid/widget/RelativeLayout;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ld;->t:Landroid/view/ViewGroup;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ld;->p:Landroid/widget/LinearLayout;

    :cond_2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final a()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ld;->k:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ld;->r:Landroid/widget/PopupWindow;

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
