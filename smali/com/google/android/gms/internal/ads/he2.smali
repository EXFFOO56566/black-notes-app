.class public final Lcom/google/android/gms/internal/ads/he2;
.super Lcom/google/android/gms/internal/ads/me2;
.source ""


# instance fields
.field private final d:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lcom/google/android/gms/internal/ads/ke2;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/he2;-><init>(Lcom/google/android/gms/internal/ads/qe2;)V

    return-void
.end method

.method private constructor <init>(Lcom/google/android/gms/internal/ads/qe2;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/me2;-><init>()V

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v0, Lcom/google/android/gms/internal/ads/ke2;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/ke2;-><init>()V

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/he2;->d:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method

.method private static a(II)I
    .locals 1

    const/4 v0, -0x1

    if-ne p0, v0, :cond_1

    if-ne p1, v0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    return v0

    :cond_1
    if-ne p1, v0, :cond_2

    const/4 p0, 0x1

    return p0

    :cond_2
    sub-int/2addr p0, p1

    return p0
.end method

.method private static a(Lcom/google/android/gms/internal/ads/e82;Ljava/lang/String;)Z
    .locals 0

    if-eqz p1, :cond_0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/e82;->z:Ljava/lang/String;

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/ag2;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p1, p0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private static b(IZ)Z
    .locals 1

    const/4 v0, 0x3

    and-int/2addr p0, v0

    if-eq p0, v0, :cond_1

    if-eqz p1, :cond_0

    const/4 p1, 0x2

    if-ne p0, p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method protected final a([Lcom/google/android/gms/internal/ads/m82;[Lcom/google/android/gms/internal/ads/ee2;[[[I)[Lcom/google/android/gms/internal/ads/ne2;
    .locals 35

    move-object/from16 v0, p1

    array-length v1, v0

    new-array v2, v1, [Lcom/google/android/gms/internal/ads/ne2;

    move-object/from16 v3, p0

    iget-object v4, v3, Lcom/google/android/gms/internal/ads/he2;->d:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/ads/ke2;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    :goto_0
    const/4 v9, 0x2

    if-ge v6, v1, :cond_26

    aget-object v13, v0, v6

    invoke-interface {v13}, Lcom/google/android/gms/internal/ads/m82;->F()I

    move-result v13

    if-ne v9, v13, :cond_25

    if-nez v7, :cond_23

    aget-object v7, p2, v6

    aget-object v13, p3, v6

    iget v14, v4, Lcom/google/android/gms/internal/ads/ke2;->b:I

    iget v15, v4, Lcom/google/android/gms/internal/ads/ke2;->c:I

    iget v11, v4, Lcom/google/android/gms/internal/ads/ke2;->d:I

    iget v9, v4, Lcom/google/android/gms/internal/ads/ke2;->g:I

    iget v5, v4, Lcom/google/android/gms/internal/ads/ke2;->h:I

    iget-boolean v10, v4, Lcom/google/android/gms/internal/ads/ke2;->i:Z

    iget-boolean v12, v4, Lcom/google/android/gms/internal/ads/ke2;->e:Z

    iget-boolean v3, v4, Lcom/google/android/gms/internal/ads/ke2;->f:Z

    move/from16 v20, v1

    move-object/from16 v19, v4

    move/from16 v24, v8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v4, 0x0

    const/16 v21, 0x0

    const/16 v22, -0x1

    const/16 v23, -0x1

    :goto_1
    iget v8, v7, Lcom/google/android/gms/internal/ads/ee2;->a:I

    if-ge v0, v8, :cond_20

    invoke-virtual {v7, v0}, Lcom/google/android/gms/internal/ads/ee2;->a(I)Lcom/google/android/gms/internal/ads/ae2;

    move-result-object v8

    move-object/from16 v25, v7

    new-instance v7, Ljava/util/ArrayList;

    move-object/from16 v26, v2

    iget v2, v8, Lcom/google/android/gms/internal/ads/ae2;->a:I

    invoke-direct {v7, v2}, Ljava/util/ArrayList;-><init>(I)V

    move/from16 v27, v6

    const/4 v2, 0x0

    :goto_2
    iget v6, v8, Lcom/google/android/gms/internal/ads/ae2;->a:I

    if-ge v2, v6, :cond_0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_0
    const v2, 0x7fffffff

    if-eq v9, v2, :cond_d

    if-ne v5, v2, :cond_1

    goto/16 :goto_a

    :cond_1
    move/from16 v28, v1

    const/4 v6, 0x0

    :goto_3
    iget v1, v8, Lcom/google/android/gms/internal/ads/ae2;->a:I

    if-ge v6, v1, :cond_a

    invoke-virtual {v8, v6}, Lcom/google/android/gms/internal/ads/ae2;->a(I)Lcom/google/android/gms/internal/ads/e82;

    move-result-object v1

    move-object/from16 v29, v4

    iget v4, v1, Lcom/google/android/gms/internal/ads/e82;->k:I

    if-lez v4, :cond_8

    move/from16 v30, v12

    iget v12, v1, Lcom/google/android/gms/internal/ads/e82;->l:I

    if-lez v12, :cond_7

    if-eqz v10, :cond_4

    move/from16 v31, v10

    if-le v4, v12, :cond_2

    const/4 v10, 0x1

    goto :goto_4

    :cond_2
    const/4 v10, 0x0

    :goto_4
    move/from16 v32, v5

    if-le v9, v5, :cond_3

    const/4 v5, 0x1

    goto :goto_5

    :cond_3
    const/4 v5, 0x0

    :goto_5
    if-eq v10, v5, :cond_5

    move v5, v9

    move/from16 v33, v5

    move/from16 v10, v32

    goto :goto_6

    :cond_4
    move/from16 v32, v5

    move/from16 v31, v10

    :cond_5
    move v10, v9

    move/from16 v33, v10

    move/from16 v5, v32

    :goto_6
    mul-int v9, v4, v5

    move/from16 v34, v11

    mul-int v11, v12, v10

    if-lt v9, v11, :cond_6

    new-instance v5, Landroid/graphics/Point;

    invoke-static {v11, v4}, Lcom/google/android/gms/internal/ads/ag2;->a(II)I

    move-result v4

    invoke-direct {v5, v10, v4}, Landroid/graphics/Point;-><init>(II)V

    goto :goto_7

    :cond_6
    new-instance v4, Landroid/graphics/Point;

    invoke-static {v9, v12}, Lcom/google/android/gms/internal/ads/ag2;->a(II)I

    move-result v9

    invoke-direct {v4, v9, v5}, Landroid/graphics/Point;-><init>(II)V

    move-object v5, v4

    :goto_7
    iget v4, v1, Lcom/google/android/gms/internal/ads/e82;->k:I

    iget v1, v1, Lcom/google/android/gms/internal/ads/e82;->l:I

    mul-int v9, v4, v1

    iget v10, v5, Landroid/graphics/Point;->x:I

    int-to-float v10, v10

    const v11, 0x3f7ae148    # 0.98f

    mul-float v10, v10, v11

    float-to-int v10, v10

    if-lt v4, v10, :cond_9

    iget v4, v5, Landroid/graphics/Point;->y:I

    int-to-float v4, v4

    mul-float v4, v4, v11

    float-to-int v4, v4

    if-lt v1, v4, :cond_9

    if-ge v9, v2, :cond_9

    move v2, v9

    goto :goto_8

    :cond_7
    move/from16 v32, v5

    move/from16 v33, v9

    move/from16 v31, v10

    move/from16 v34, v11

    goto :goto_8

    :cond_8
    move/from16 v32, v5

    move/from16 v33, v9

    move/from16 v31, v10

    move/from16 v34, v11

    move/from16 v30, v12

    :cond_9
    :goto_8
    add-int/lit8 v6, v6, 0x1

    move-object/from16 v4, v29

    move/from16 v12, v30

    move/from16 v10, v31

    move/from16 v5, v32

    move/from16 v9, v33

    move/from16 v11, v34

    goto/16 :goto_3

    :cond_a
    move-object/from16 v29, v4

    move/from16 v32, v5

    move/from16 v33, v9

    move/from16 v31, v10

    move/from16 v34, v11

    move/from16 v30, v12

    const v1, 0x7fffffff

    if-eq v2, v1, :cond_e

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v4, 0x1

    sub-int/2addr v1, v4

    :goto_9
    if-ltz v1, :cond_e

    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-virtual {v8, v4}, Lcom/google/android/gms/internal/ads/ae2;->a(I)Lcom/google/android/gms/internal/ads/e82;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/e82;->a()I

    move-result v4

    const/4 v5, -0x1

    if-eq v4, v5, :cond_b

    if-le v4, v2, :cond_c

    :cond_b
    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    :cond_c
    add-int/lit8 v1, v1, -0x1

    goto :goto_9

    :cond_d
    :goto_a
    move/from16 v28, v1

    move-object/from16 v29, v4

    move/from16 v32, v5

    move/from16 v33, v9

    move/from16 v31, v10

    move/from16 v34, v11

    move/from16 v30, v12

    :cond_e
    aget-object v1, v13, v0

    move/from16 v5, v21

    move/from16 v6, v22

    move/from16 v9, v23

    move-object/from16 v4, v29

    const/4 v2, 0x0

    :goto_b
    iget v10, v8, Lcom/google/android/gms/internal/ads/ae2;->a:I

    if-ge v2, v10, :cond_1f

    aget v10, v1, v2

    invoke-static {v10, v3}, Lcom/google/android/gms/internal/ads/he2;->b(IZ)Z

    move-result v10

    if-eqz v10, :cond_1d

    invoke-virtual {v8, v2}, Lcom/google/android/gms/internal/ads/ae2;->a(I)Lcom/google/android/gms/internal/ads/e82;

    move-result-object v10

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v7, v11}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_12

    iget v11, v10, Lcom/google/android/gms/internal/ads/e82;->k:I

    const/4 v12, -0x1

    if-eq v11, v12, :cond_f

    if-gt v11, v14, :cond_12

    :cond_f
    iget v11, v10, Lcom/google/android/gms/internal/ads/e82;->l:I

    if-eq v11, v12, :cond_10

    if-gt v11, v15, :cond_12

    :cond_10
    iget v11, v10, Lcom/google/android/gms/internal/ads/e82;->c:I

    if-eq v11, v12, :cond_11

    move/from16 v12, v34

    if-gt v11, v12, :cond_13

    goto :goto_c

    :cond_11
    move/from16 v12, v34

    :goto_c
    const/4 v11, 0x1

    goto :goto_d

    :cond_12
    move/from16 v12, v34

    :cond_13
    const/4 v11, 0x0

    :goto_d
    if-nez v11, :cond_15

    if-eqz v30, :cond_14

    goto :goto_e

    :cond_14
    move-object/from16 v23, v1

    move/from16 v21, v3

    move-object/from16 v22, v4

    goto :goto_14

    :cond_15
    :goto_e
    move/from16 v21, v3

    move-object/from16 v22, v4

    if-eqz v11, :cond_16

    const/4 v3, 0x2

    goto :goto_f

    :cond_16
    const/4 v3, 0x1

    :goto_f
    aget v4, v1, v2

    move-object/from16 v23, v1

    const/4 v1, 0x0

    invoke-static {v4, v1}, Lcom/google/android/gms/internal/ads/he2;->b(IZ)Z

    move-result v4

    if-eqz v4, :cond_17

    add-int/lit16 v3, v3, 0x3e8

    :cond_17
    if-le v3, v5, :cond_18

    const/4 v1, 0x1

    goto :goto_10

    :cond_18
    const/4 v1, 0x0

    :goto_10
    if-ne v3, v5, :cond_1c

    invoke-virtual {v10}, Lcom/google/android/gms/internal/ads/e82;->a()I

    move-result v1

    if-eq v1, v6, :cond_19

    invoke-virtual {v10}, Lcom/google/android/gms/internal/ads/e82;->a()I

    move-result v1

    invoke-static {v1, v6}, Lcom/google/android/gms/internal/ads/he2;->a(II)I

    move-result v1

    goto :goto_11

    :cond_19
    iget v1, v10, Lcom/google/android/gms/internal/ads/e82;->c:I

    invoke-static {v1, v9}, Lcom/google/android/gms/internal/ads/he2;->a(II)I

    move-result v1

    :goto_11
    if-eqz v4, :cond_1a

    if-eqz v11, :cond_1a

    if-lez v1, :cond_1b

    goto :goto_12

    :cond_1a
    if-gez v1, :cond_1b

    :goto_12
    const/4 v1, 0x1

    goto :goto_13

    :cond_1b
    const/4 v1, 0x0

    :cond_1c
    :goto_13
    if-eqz v1, :cond_1e

    iget v1, v10, Lcom/google/android/gms/internal/ads/e82;->c:I

    invoke-virtual {v10}, Lcom/google/android/gms/internal/ads/e82;->a()I

    move-result v4

    move v9, v1

    move/from16 v28, v2

    move v5, v3

    move v6, v4

    move-object v4, v8

    goto :goto_15

    :cond_1d
    move-object/from16 v23, v1

    move/from16 v21, v3

    move-object/from16 v22, v4

    move/from16 v12, v34

    :cond_1e
    :goto_14
    move-object/from16 v4, v22

    :goto_15
    add-int/lit8 v2, v2, 0x1

    move/from16 v34, v12

    move/from16 v3, v21

    move-object/from16 v1, v23

    goto/16 :goto_b

    :cond_1f
    move/from16 v21, v3

    move-object/from16 v22, v4

    move/from16 v12, v34

    add-int/lit8 v0, v0, 0x1

    move/from16 v23, v9

    move v11, v12

    move-object/from16 v7, v25

    move-object/from16 v2, v26

    move/from16 v1, v28

    move/from16 v12, v30

    move/from16 v10, v31

    move/from16 v9, v33

    move/from16 v21, v5

    move/from16 v22, v6

    move/from16 v6, v27

    move/from16 v5, v32

    goto/16 :goto_1

    :cond_20
    move/from16 v28, v1

    move-object/from16 v26, v2

    move-object/from16 v29, v4

    move/from16 v27, v6

    if-nez v29, :cond_21

    const/4 v11, 0x0

    goto :goto_16

    :cond_21
    new-instance v11, Lcom/google/android/gms/internal/ads/je2;

    move/from16 v1, v28

    move-object/from16 v0, v29

    invoke-direct {v11, v0, v1}, Lcom/google/android/gms/internal/ads/je2;-><init>(Lcom/google/android/gms/internal/ads/ae2;I)V

    :goto_16
    aput-object v11, v26, v27

    aget-object v0, v26, v27

    if-eqz v0, :cond_22

    const/4 v0, 0x1

    goto :goto_17

    :cond_22
    const/4 v0, 0x0

    :goto_17
    move v7, v0

    goto :goto_18

    :cond_23
    move/from16 v20, v1

    move-object/from16 v26, v2

    move-object/from16 v19, v4

    move/from16 v27, v6

    move/from16 v24, v8

    :goto_18
    aget-object v0, p2, v27

    iget v0, v0, Lcom/google/android/gms/internal/ads/ee2;->a:I

    if-lez v0, :cond_24

    const/4 v12, 0x1

    goto :goto_19

    :cond_24
    const/4 v12, 0x0

    :goto_19
    or-int v8, v24, v12

    goto :goto_1a

    :cond_25
    move/from16 v20, v1

    move-object/from16 v26, v2

    move-object/from16 v19, v4

    move/from16 v27, v6

    move/from16 v24, v8

    :goto_1a
    add-int/lit8 v6, v27, 0x1

    move-object/from16 v3, p0

    move-object/from16 v0, p1

    move-object/from16 v4, v19

    move/from16 v1, v20

    move-object/from16 v2, v26

    goto/16 :goto_0

    :cond_26
    move-object/from16 v26, v2

    move-object/from16 v19, v4

    move/from16 v24, v8

    move v3, v1

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_1b
    if-ge v1, v3, :cond_4d

    aget-object v4, p1, v1

    invoke-interface {v4}, Lcom/google/android/gms/internal/ads/m82;->F()I

    move-result v4

    const/4 v6, 0x3

    const/4 v7, 0x1

    if-eq v4, v7, :cond_41

    const/4 v7, 0x2

    if-eq v4, v7, :cond_3f

    if-eq v4, v6, :cond_2f

    aget-object v4, p1, v1

    invoke-interface {v4}, Lcom/google/android/gms/internal/ads/m82;->F()I

    aget-object v4, p2, v1

    aget-object v5, p3, v1

    move-object/from16 v7, v19

    iget-boolean v6, v7, Lcom/google/android/gms/internal/ads/ke2;->f:Z

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    :goto_1c
    iget v12, v4, Lcom/google/android/gms/internal/ads/ee2;->a:I

    if-ge v9, v12, :cond_2d

    invoke-virtual {v4, v9}, Lcom/google/android/gms/internal/ads/ee2;->a(I)Lcom/google/android/gms/internal/ads/ae2;

    move-result-object v12

    aget-object v13, v5, v9

    const/4 v14, 0x0

    :goto_1d
    iget v15, v12, Lcom/google/android/gms/internal/ads/ae2;->a:I

    if-ge v14, v15, :cond_2c

    aget v15, v13, v14

    invoke-static {v15, v6}, Lcom/google/android/gms/internal/ads/he2;->b(IZ)Z

    move-result v15

    if-eqz v15, :cond_2a

    invoke-virtual {v12, v14}, Lcom/google/android/gms/internal/ads/ae2;->a(I)Lcom/google/android/gms/internal/ads/e82;

    move-result-object v15

    iget v15, v15, Lcom/google/android/gms/internal/ads/e82;->y:I

    const/16 v18, 0x1

    and-int/lit8 v15, v15, 0x1

    if-eqz v15, :cond_27

    const/4 v15, 0x1

    goto :goto_1e

    :cond_27
    const/4 v15, 0x0

    :goto_1e
    move/from16 v20, v3

    if-eqz v15, :cond_28

    const/4 v15, 0x2

    goto :goto_1f

    :cond_28
    const/4 v15, 0x1

    :goto_1f
    aget v3, v13, v14

    move-object/from16 v19, v4

    const/4 v4, 0x0

    invoke-static {v3, v4}, Lcom/google/android/gms/internal/ads/he2;->b(IZ)Z

    move-result v3

    if-eqz v3, :cond_29

    add-int/lit16 v15, v15, 0x3e8

    :cond_29
    if-le v15, v11, :cond_2b

    move-object v8, v12

    move v10, v14

    move v11, v15

    goto :goto_20

    :cond_2a
    move/from16 v20, v3

    move-object/from16 v19, v4

    :cond_2b
    :goto_20
    add-int/lit8 v14, v14, 0x1

    move-object/from16 v4, v19

    move/from16 v3, v20

    goto :goto_1d

    :cond_2c
    move/from16 v20, v3

    move-object/from16 v19, v4

    add-int/lit8 v9, v9, 0x1

    goto :goto_1c

    :cond_2d
    move/from16 v20, v3

    if-nez v8, :cond_2e

    const/4 v3, 0x0

    goto :goto_21

    :cond_2e
    new-instance v3, Lcom/google/android/gms/internal/ads/je2;

    invoke-direct {v3, v8, v10}, Lcom/google/android/gms/internal/ads/je2;-><init>(Lcom/google/android/gms/internal/ads/ae2;I)V

    :goto_21
    aput-object v3, v26, v1

    const/4 v5, -0x1

    const/4 v15, 0x0

    const/16 v17, 0x2

    goto/16 :goto_2b

    :cond_2f
    move/from16 v20, v3

    move-object/from16 v7, v19

    if-nez v2, :cond_40

    aget-object v2, p2, v1

    aget-object v3, p3, v1

    iget-boolean v4, v7, Lcom/google/android/gms/internal/ads/ke2;->f:Z

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    :goto_22
    iget v12, v2, Lcom/google/android/gms/internal/ads/ee2;->a:I

    if-ge v8, v12, :cond_3b

    invoke-virtual {v2, v8}, Lcom/google/android/gms/internal/ads/ee2;->a(I)Lcom/google/android/gms/internal/ads/ae2;

    move-result-object v12

    aget-object v13, v3, v8

    move-object v14, v11

    move v11, v10

    move v10, v9

    const/4 v9, 0x0

    :goto_23
    iget v15, v12, Lcom/google/android/gms/internal/ads/ae2;->a:I

    if-ge v9, v15, :cond_3a

    aget v15, v13, v9

    invoke-static {v15, v4}, Lcom/google/android/gms/internal/ads/he2;->b(IZ)Z

    move-result v15

    if-eqz v15, :cond_38

    invoke-virtual {v12, v9}, Lcom/google/android/gms/internal/ads/ae2;->a(I)Lcom/google/android/gms/internal/ads/e82;

    move-result-object v15

    iget v5, v15, Lcom/google/android/gms/internal/ads/e82;->y:I

    const/16 v18, 0x1

    and-int/lit8 v5, v5, 0x1

    if-eqz v5, :cond_30

    const/4 v5, 0x1

    goto :goto_24

    :cond_30
    const/4 v5, 0x0

    :goto_24
    iget v6, v15, Lcom/google/android/gms/internal/ads/e82;->y:I

    const/16 v17, 0x2

    and-int/lit8 v6, v6, 0x2

    move-object/from16 v22, v2

    const/4 v2, 0x0

    if-eqz v6, :cond_31

    const/4 v6, 0x1

    goto :goto_25

    :cond_31
    const/4 v6, 0x0

    :goto_25
    invoke-static {v15, v2}, Lcom/google/android/gms/internal/ads/he2;->a(Lcom/google/android/gms/internal/ads/e82;Ljava/lang/String;)Z

    move-result v23

    if-eqz v23, :cond_34

    if-eqz v5, :cond_32

    const/4 v2, 0x6

    goto :goto_26

    :cond_32
    if-nez v6, :cond_33

    const/4 v2, 0x5

    goto :goto_26

    :cond_33
    const/4 v2, 0x4

    goto :goto_26

    :cond_34
    if-eqz v5, :cond_35

    const/4 v2, 0x3

    goto :goto_26

    :cond_35
    if-eqz v6, :cond_39

    const/4 v2, 0x0

    invoke-static {v15, v2}, Lcom/google/android/gms/internal/ads/he2;->a(Lcom/google/android/gms/internal/ads/e82;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_36

    const/4 v2, 0x2

    goto :goto_26

    :cond_36
    const/4 v2, 0x1

    :goto_26
    aget v5, v13, v9

    const/4 v6, 0x0

    invoke-static {v5, v6}, Lcom/google/android/gms/internal/ads/he2;->b(IZ)Z

    move-result v5

    if-eqz v5, :cond_37

    add-int/lit16 v2, v2, 0x3e8

    :cond_37
    if-le v2, v11, :cond_39

    move v11, v2

    move v10, v9

    move-object v14, v12

    goto :goto_27

    :cond_38
    move-object/from16 v22, v2

    const/16 v17, 0x2

    :cond_39
    :goto_27
    add-int/lit8 v9, v9, 0x1

    move-object/from16 v2, v22

    const/4 v6, 0x3

    goto :goto_23

    :cond_3a
    move-object/from16 v22, v2

    const/16 v17, 0x2

    add-int/lit8 v8, v8, 0x1

    move v9, v10

    move v10, v11

    move-object v11, v14

    const/4 v6, 0x3

    goto :goto_22

    :cond_3b
    const/16 v17, 0x2

    if-nez v11, :cond_3c

    const/4 v2, 0x0

    goto :goto_28

    :cond_3c
    new-instance v2, Lcom/google/android/gms/internal/ads/je2;

    invoke-direct {v2, v11, v9}, Lcom/google/android/gms/internal/ads/je2;-><init>(Lcom/google/android/gms/internal/ads/ae2;I)V

    :goto_28
    aput-object v2, v26, v1

    aget-object v2, v26, v1

    if-eqz v2, :cond_3d

    const/4 v4, 0x1

    goto :goto_29

    :cond_3d
    const/4 v4, 0x0

    :goto_29
    move v2, v4

    :cond_3e
    :goto_2a
    const/4 v5, -0x1

    const/4 v15, 0x0

    :goto_2b
    const/16 v18, 0x1

    goto/16 :goto_33

    :cond_3f
    move/from16 v20, v3

    move-object/from16 v7, v19

    :cond_40
    const/16 v17, 0x2

    goto :goto_2a

    :cond_41
    move/from16 v20, v3

    move-object/from16 v7, v19

    const/16 v17, 0x2

    if-nez v0, :cond_3e

    aget-object v0, p2, v1

    aget-object v3, p3, v1

    iget-boolean v4, v7, Lcom/google/android/gms/internal/ads/ke2;->f:Z

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, -0x1

    const/4 v9, -0x1

    :goto_2c
    iget v10, v0, Lcom/google/android/gms/internal/ads/ee2;->a:I

    if-ge v5, v10, :cond_4a

    invoke-virtual {v0, v5}, Lcom/google/android/gms/internal/ads/ee2;->a(I)Lcom/google/android/gms/internal/ads/ae2;

    move-result-object v10

    aget-object v11, v3, v5

    move v12, v9

    move v9, v8

    move v8, v6

    const/4 v6, 0x0

    :goto_2d
    iget v13, v10, Lcom/google/android/gms/internal/ads/ae2;->a:I

    if-ge v6, v13, :cond_49

    aget v13, v11, v6

    invoke-static {v13, v4}, Lcom/google/android/gms/internal/ads/he2;->b(IZ)Z

    move-result v13

    if-eqz v13, :cond_47

    invoke-virtual {v10, v6}, Lcom/google/android/gms/internal/ads/ae2;->a(I)Lcom/google/android/gms/internal/ads/e82;

    move-result-object v13

    aget v14, v11, v6

    iget v15, v13, Lcom/google/android/gms/internal/ads/e82;->y:I

    const/16 v18, 0x1

    and-int/lit8 v15, v15, 0x1

    if-eqz v15, :cond_42

    const/4 v15, 0x0

    const/16 v16, 0x1

    goto :goto_2e

    :cond_42
    const/4 v15, 0x0

    const/16 v16, 0x0

    :goto_2e
    invoke-static {v13, v15}, Lcom/google/android/gms/internal/ads/he2;->a(Lcom/google/android/gms/internal/ads/e82;Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_44

    if-eqz v16, :cond_43

    const/4 v13, 0x4

    goto :goto_2f

    :cond_43
    const/4 v13, 0x3

    goto :goto_2f

    :cond_44
    if-eqz v16, :cond_45

    const/4 v13, 0x2

    goto :goto_2f

    :cond_45
    const/4 v13, 0x1

    :goto_2f
    const/4 v15, 0x0

    invoke-static {v14, v15}, Lcom/google/android/gms/internal/ads/he2;->b(IZ)Z

    move-result v14

    if-eqz v14, :cond_46

    add-int/lit16 v13, v13, 0x3e8

    :cond_46
    if-le v13, v8, :cond_48

    move v9, v5

    move v12, v6

    move v8, v13

    goto :goto_30

    :cond_47
    const/4 v15, 0x0

    const/16 v18, 0x1

    :cond_48
    :goto_30
    add-int/lit8 v6, v6, 0x1

    goto :goto_2d

    :cond_49
    const/4 v15, 0x0

    const/16 v18, 0x1

    add-int/lit8 v5, v5, 0x1

    move v6, v8

    move v8, v9

    move v9, v12

    goto :goto_2c

    :cond_4a
    const/4 v5, -0x1

    const/4 v15, 0x0

    const/16 v18, 0x1

    if-ne v8, v5, :cond_4b

    const/4 v3, 0x0

    goto :goto_31

    :cond_4b
    invoke-virtual {v0, v8}, Lcom/google/android/gms/internal/ads/ee2;->a(I)Lcom/google/android/gms/internal/ads/ae2;

    move-result-object v0

    new-instance v3, Lcom/google/android/gms/internal/ads/je2;

    invoke-direct {v3, v0, v9}, Lcom/google/android/gms/internal/ads/je2;-><init>(Lcom/google/android/gms/internal/ads/ae2;I)V

    :goto_31
    aput-object v3, v26, v1

    aget-object v0, v26, v1

    if-eqz v0, :cond_4c

    const/4 v4, 0x1

    goto :goto_32

    :cond_4c
    const/4 v4, 0x0

    :goto_32
    move v0, v4

    :goto_33
    add-int/lit8 v1, v1, 0x1

    move-object/from16 v19, v7

    move/from16 v3, v20

    goto/16 :goto_1b

    :cond_4d
    return-object v26
.end method
