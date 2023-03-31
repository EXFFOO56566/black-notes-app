.class public final Lcom/google/android/gms/internal/ads/vb2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/na2;
.implements Lcom/google/android/gms/internal/ads/sa2;


# static fields
.field private static final p:I


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/xf2;

.field private final b:Lcom/google/android/gms/internal/ads/xf2;

.field private final c:Lcom/google/android/gms/internal/ads/xf2;

.field private final d:Ljava/util/Stack;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Stack<",
            "Lcom/google/android/gms/internal/ads/jb2;",
            ">;"
        }
    .end annotation
.end field

.field private e:I

.field private f:I

.field private g:J

.field private h:I

.field private i:Lcom/google/android/gms/internal/ads/xf2;

.field private j:I

.field private k:I

.field private l:Lcom/google/android/gms/internal/ads/pa2;

.field private m:[Lcom/google/android/gms/internal/ads/xb2;

.field private n:J

.field private o:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/yb2;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/yb2;-><init>()V

    const-string v0, "qt  "

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/ag2;->d(Ljava/lang/String;)I

    move-result v0

    sput v0, Lcom/google/android/gms/internal/ads/vb2;->p:I

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/ads/xf2;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/xf2;-><init>(I)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/vb2;->c:Lcom/google/android/gms/internal/ads/xf2;

    new-instance v0, Ljava/util/Stack;

    invoke-direct {v0}, Ljava/util/Stack;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/vb2;->d:Ljava/util/Stack;

    new-instance v0, Lcom/google/android/gms/internal/ads/xf2;

    sget-object v1, Lcom/google/android/gms/internal/ads/sf2;->a:[B

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/xf2;-><init>([B)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/vb2;->a:Lcom/google/android/gms/internal/ads/xf2;

    new-instance v0, Lcom/google/android/gms/internal/ads/xf2;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/xf2;-><init>(I)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/vb2;->b:Lcom/google/android/gms/internal/ads/xf2;

    return-void
.end method

.method private final b(J)V
    .locals 19

    move-object/from16 v0, p0

    :cond_0
    :goto_0
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/vb2;->d:Ljava/util/Stack;

    invoke-virtual {v1}, Ljava/util/Stack;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_8

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/vb2;->d:Ljava/util/Stack;

    invoke-virtual {v1}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/jb2;

    iget-wide v3, v1, Lcom/google/android/gms/internal/ads/jb2;->z0:J

    cmp-long v1, v3, p1

    if-nez v1, :cond_8

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/vb2;->d:Ljava/util/Stack;

    invoke-virtual {v1}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/jb2;

    iget v3, v1, Lcom/google/android/gms/internal/ads/kb2;->a:I

    sget v4, Lcom/google/android/gms/internal/ads/kb2;->w:I

    if-ne v3, v4, :cond_7

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    const-wide v6, 0x7fffffffffffffffL

    const/4 v8, 0x0

    new-instance v9, Lcom/google/android/gms/internal/ads/ra2;

    invoke-direct {v9}, Lcom/google/android/gms/internal/ads/ra2;-><init>()V

    sget v10, Lcom/google/android/gms/internal/ads/kb2;->l0:I

    invoke-virtual {v1, v10}, Lcom/google/android/gms/internal/ads/jb2;->d(I)Lcom/google/android/gms/internal/ads/mb2;

    move-result-object v10

    if-eqz v10, :cond_1

    iget-boolean v8, v0, Lcom/google/android/gms/internal/ads/vb2;->o:Z

    invoke-static {v10, v8}, Lcom/google/android/gms/internal/ads/lb2;->a(Lcom/google/android/gms/internal/ads/mb2;Z)Lcom/google/android/gms/internal/ads/qc2;

    move-result-object v8

    if-eqz v8, :cond_1

    invoke-virtual {v9, v8}, Lcom/google/android/gms/internal/ads/ra2;->a(Lcom/google/android/gms/internal/ads/qc2;)Z

    :cond_1
    const/4 v11, 0x0

    :goto_1
    iget-object v12, v1, Lcom/google/android/gms/internal/ads/jb2;->B0:Ljava/util/List;

    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v12

    if-ge v11, v12, :cond_6

    iget-object v12, v1, Lcom/google/android/gms/internal/ads/jb2;->B0:Ljava/util/List;

    invoke-interface {v12, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/google/android/gms/internal/ads/jb2;

    iget v13, v12, Lcom/google/android/gms/internal/ads/kb2;->a:I

    sget v14, Lcom/google/android/gms/internal/ads/kb2;->y:I

    if-ne v13, v14, :cond_4

    sget v13, Lcom/google/android/gms/internal/ads/kb2;->x:I

    invoke-virtual {v1, v13}, Lcom/google/android/gms/internal/ads/jb2;->d(I)Lcom/google/android/gms/internal/ads/mb2;

    move-result-object v14

    const-wide v15, -0x7fffffffffffffffL    # -4.9E-324

    const/16 v17, 0x0

    iget-boolean v13, v0, Lcom/google/android/gms/internal/ads/vb2;->o:Z

    move/from16 v18, v13

    move-object v13, v12

    invoke-static/range {v13 .. v18}, Lcom/google/android/gms/internal/ads/lb2;->a(Lcom/google/android/gms/internal/ads/jb2;Lcom/google/android/gms/internal/ads/mb2;JLcom/google/android/gms/internal/ads/ba2;Z)Lcom/google/android/gms/internal/ads/zb2;

    move-result-object v13

    if-eqz v13, :cond_4

    sget v14, Lcom/google/android/gms/internal/ads/kb2;->z:I

    invoke-virtual {v12, v14}, Lcom/google/android/gms/internal/ads/jb2;->e(I)Lcom/google/android/gms/internal/ads/jb2;

    move-result-object v12

    sget v14, Lcom/google/android/gms/internal/ads/kb2;->A:I

    invoke-virtual {v12, v14}, Lcom/google/android/gms/internal/ads/jb2;->e(I)Lcom/google/android/gms/internal/ads/jb2;

    move-result-object v12

    sget v14, Lcom/google/android/gms/internal/ads/kb2;->B:I

    invoke-virtual {v12, v14}, Lcom/google/android/gms/internal/ads/jb2;->e(I)Lcom/google/android/gms/internal/ads/jb2;

    move-result-object v12

    invoke-static {v13, v12, v9}, Lcom/google/android/gms/internal/ads/lb2;->a(Lcom/google/android/gms/internal/ads/zb2;Lcom/google/android/gms/internal/ads/jb2;Lcom/google/android/gms/internal/ads/ra2;)Lcom/google/android/gms/internal/ads/bc2;

    move-result-object v12

    iget v14, v12, Lcom/google/android/gms/internal/ads/bc2;->a:I

    if-eqz v14, :cond_4

    new-instance v14, Lcom/google/android/gms/internal/ads/xb2;

    iget-object v15, v0, Lcom/google/android/gms/internal/ads/vb2;->l:Lcom/google/android/gms/internal/ads/pa2;

    iget v2, v13, Lcom/google/android/gms/internal/ads/zb2;->b:I

    invoke-interface {v15, v11, v2}, Lcom/google/android/gms/internal/ads/pa2;->a(II)Lcom/google/android/gms/internal/ads/ua2;

    move-result-object v2

    invoke-direct {v14, v13, v12, v2}, Lcom/google/android/gms/internal/ads/xb2;-><init>(Lcom/google/android/gms/internal/ads/zb2;Lcom/google/android/gms/internal/ads/bc2;Lcom/google/android/gms/internal/ads/ua2;)V

    iget v2, v12, Lcom/google/android/gms/internal/ads/bc2;->d:I

    add-int/lit8 v2, v2, 0x1e

    iget-object v15, v13, Lcom/google/android/gms/internal/ads/zb2;->f:Lcom/google/android/gms/internal/ads/e82;

    invoke-virtual {v15, v2}, Lcom/google/android/gms/internal/ads/e82;->a(I)Lcom/google/android/gms/internal/ads/e82;

    move-result-object v2

    iget v15, v13, Lcom/google/android/gms/internal/ads/zb2;->b:I

    const/4 v10, 0x1

    if-ne v15, v10, :cond_3

    invoke-virtual {v9}, Lcom/google/android/gms/internal/ads/ra2;->a()Z

    move-result v10

    if-eqz v10, :cond_2

    iget v10, v9, Lcom/google/android/gms/internal/ads/ra2;->a:I

    iget v15, v9, Lcom/google/android/gms/internal/ads/ra2;->b:I

    invoke-virtual {v2, v10, v15}, Lcom/google/android/gms/internal/ads/e82;->a(II)Lcom/google/android/gms/internal/ads/e82;

    move-result-object v2

    :cond_2
    if-eqz v8, :cond_3

    invoke-virtual {v2, v8}, Lcom/google/android/gms/internal/ads/e82;->a(Lcom/google/android/gms/internal/ads/qc2;)Lcom/google/android/gms/internal/ads/e82;

    move-result-object v2

    :cond_3
    iget-object v10, v14, Lcom/google/android/gms/internal/ads/xb2;->c:Lcom/google/android/gms/internal/ads/ua2;

    invoke-interface {v10, v2}, Lcom/google/android/gms/internal/ads/ua2;->a(Lcom/google/android/gms/internal/ads/e82;)V

    move-object v10, v8

    move-object v2, v9

    iget-wide v8, v13, Lcom/google/android/gms/internal/ads/zb2;->e:J

    invoke-static {v3, v4, v8, v9}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v3

    invoke-interface {v5, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v8, v12, Lcom/google/android/gms/internal/ads/bc2;->b:[J

    const/4 v9, 0x0

    aget-wide v12, v8, v9

    cmp-long v8, v12, v6

    if-gez v8, :cond_5

    move-wide v6, v12

    goto :goto_2

    :cond_4
    move-object v10, v8

    move-object v2, v9

    const/4 v9, 0x0

    :cond_5
    :goto_2
    add-int/lit8 v11, v11, 0x1

    move-object v9, v2

    move-object v8, v10

    goto/16 :goto_1

    :cond_6
    iput-wide v3, v0, Lcom/google/android/gms/internal/ads/vb2;->n:J

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v1

    new-array v1, v1, [Lcom/google/android/gms/internal/ads/xb2;

    invoke-interface {v5, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lcom/google/android/gms/internal/ads/xb2;

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/vb2;->m:[Lcom/google/android/gms/internal/ads/xb2;

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/vb2;->l:Lcom/google/android/gms/internal/ads/pa2;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/pa2;->d()V

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/vb2;->l:Lcom/google/android/gms/internal/ads/pa2;

    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/ads/pa2;->a(Lcom/google/android/gms/internal/ads/sa2;)V

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/vb2;->d:Ljava/util/Stack;

    invoke-virtual {v1}, Ljava/util/Stack;->clear()V

    const/4 v1, 0x2

    iput v1, v0, Lcom/google/android/gms/internal/ads/vb2;->e:I

    goto/16 :goto_0

    :cond_7
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/vb2;->d:Ljava/util/Stack;

    invoke-virtual {v2}, Ljava/util/Stack;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/vb2;->d:Ljava/util/Stack;

    invoke-virtual {v2}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/ads/jb2;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/jb2;->B0:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_8
    iget v1, v0, Lcom/google/android/gms/internal/ads/vb2;->e:I

    const/4 v2, 0x2

    if-eq v1, v2, :cond_9

    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/vb2;->d()V

    :cond_9
    return-void
.end method

.method private final d()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/ads/vb2;->e:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/vb2;->h:I

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/ma2;Lcom/google/android/gms/internal/ads/ta2;)I
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    :cond_0
    iget v3, v0, Lcom/google/android/gms/internal/ads/vb2;->e:I

    const/4 v4, -0x1

    const/16 v5, 0x8

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v3, :cond_15

    const-wide/32 v8, 0x40000

    const/4 v10, 0x2

    if-eq v3, v6, :cond_c

    if-ne v3, v10, :cond_b

    const-wide v12, 0x7fffffffffffffffL

    const/4 v3, 0x0

    const/4 v5, -0x1

    :goto_0
    iget-object v14, v0, Lcom/google/android/gms/internal/ads/vb2;->m:[Lcom/google/android/gms/internal/ads/xb2;

    array-length v15, v14

    if-ge v3, v15, :cond_2

    aget-object v14, v14, v3

    iget v15, v14, Lcom/google/android/gms/internal/ads/xb2;->d:I

    iget-object v14, v14, Lcom/google/android/gms/internal/ads/xb2;->b:Lcom/google/android/gms/internal/ads/bc2;

    iget v11, v14, Lcom/google/android/gms/internal/ads/bc2;->a:I

    if-eq v15, v11, :cond_1

    iget-object v11, v14, Lcom/google/android/gms/internal/ads/bc2;->b:[J

    aget-wide v14, v11, v15

    cmp-long v11, v14, v12

    if-gez v11, :cond_1

    move v5, v3

    move-wide v12, v14

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    if-ne v5, v4, :cond_3

    return v4

    :cond_3
    aget-object v3, v14, v5

    iget-object v4, v3, Lcom/google/android/gms/internal/ads/xb2;->c:Lcom/google/android/gms/internal/ads/ua2;

    iget v5, v3, Lcom/google/android/gms/internal/ads/xb2;->d:I

    iget-object v11, v3, Lcom/google/android/gms/internal/ads/xb2;->b:Lcom/google/android/gms/internal/ads/bc2;

    iget-object v12, v11, Lcom/google/android/gms/internal/ads/bc2;->b:[J

    aget-wide v13, v12, v5

    iget-object v11, v11, Lcom/google/android/gms/internal/ads/bc2;->c:[I

    aget v11, v11, v5

    iget-object v12, v3, Lcom/google/android/gms/internal/ads/xb2;->a:Lcom/google/android/gms/internal/ads/zb2;

    iget v12, v12, Lcom/google/android/gms/internal/ads/zb2;->g:I

    if-ne v12, v6, :cond_4

    const-wide/16 v16, 0x8

    add-long v13, v13, v16

    add-int/lit8 v11, v11, -0x8

    :cond_4
    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/ma2;->c()J

    move-result-wide v16

    sub-long v16, v13, v16

    iget v12, v0, Lcom/google/android/gms/internal/ads/vb2;->j:I

    move/from16 v18, v11

    int-to-long v10, v12

    add-long v10, v16, v10

    const-wide/16 v16, 0x0

    cmp-long v12, v10, v16

    if-ltz v12, :cond_a

    cmp-long v12, v10, v8

    if-ltz v12, :cond_5

    goto/16 :goto_4

    :cond_5
    long-to-int v2, v10

    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/ads/ma2;->b(I)V

    iget-object v2, v3, Lcom/google/android/gms/internal/ads/xb2;->a:Lcom/google/android/gms/internal/ads/zb2;

    iget v2, v2, Lcom/google/android/gms/internal/ads/zb2;->j:I

    if-eqz v2, :cond_8

    iget-object v8, v0, Lcom/google/android/gms/internal/ads/vb2;->b:Lcom/google/android/gms/internal/ads/xf2;

    iget-object v8, v8, Lcom/google/android/gms/internal/ads/xf2;->a:[B

    aput-byte v7, v8, v7

    aput-byte v7, v8, v6

    const/4 v9, 0x2

    aput-byte v7, v8, v9

    const/4 v8, 0x4

    rsub-int/lit8 v11, v2, 0x4

    move/from16 v8, v18

    :goto_1
    iget v9, v0, Lcom/google/android/gms/internal/ads/vb2;->j:I

    if-ge v9, v8, :cond_7

    iget v9, v0, Lcom/google/android/gms/internal/ads/vb2;->k:I

    if-nez v9, :cond_6

    iget-object v9, v0, Lcom/google/android/gms/internal/ads/vb2;->b:Lcom/google/android/gms/internal/ads/xf2;

    iget-object v9, v9, Lcom/google/android/gms/internal/ads/xf2;->a:[B

    invoke-interface {v1, v9, v11, v2}, Lcom/google/android/gms/internal/ads/ma2;->b([BII)V

    iget-object v9, v0, Lcom/google/android/gms/internal/ads/vb2;->b:Lcom/google/android/gms/internal/ads/xf2;

    invoke-virtual {v9, v7}, Lcom/google/android/gms/internal/ads/xf2;->c(I)V

    iget-object v9, v0, Lcom/google/android/gms/internal/ads/vb2;->b:Lcom/google/android/gms/internal/ads/xf2;

    invoke-virtual {v9}, Lcom/google/android/gms/internal/ads/xf2;->o()I

    move-result v9

    iput v9, v0, Lcom/google/android/gms/internal/ads/vb2;->k:I

    iget-object v9, v0, Lcom/google/android/gms/internal/ads/vb2;->a:Lcom/google/android/gms/internal/ads/xf2;

    invoke-virtual {v9, v7}, Lcom/google/android/gms/internal/ads/xf2;->c(I)V

    iget-object v9, v0, Lcom/google/android/gms/internal/ads/vb2;->a:Lcom/google/android/gms/internal/ads/xf2;

    const/4 v10, 0x4

    invoke-interface {v4, v9, v10}, Lcom/google/android/gms/internal/ads/ua2;->a(Lcom/google/android/gms/internal/ads/xf2;I)V

    iget v9, v0, Lcom/google/android/gms/internal/ads/vb2;->j:I

    add-int/2addr v9, v10

    iput v9, v0, Lcom/google/android/gms/internal/ads/vb2;->j:I

    add-int/2addr v8, v11

    goto :goto_1

    :cond_6
    invoke-interface {v4, v1, v9, v7}, Lcom/google/android/gms/internal/ads/ua2;->a(Lcom/google/android/gms/internal/ads/ma2;IZ)I

    move-result v9

    iget v10, v0, Lcom/google/android/gms/internal/ads/vb2;->j:I

    add-int/2addr v10, v9

    iput v10, v0, Lcom/google/android/gms/internal/ads/vb2;->j:I

    iget v10, v0, Lcom/google/android/gms/internal/ads/vb2;->k:I

    sub-int/2addr v10, v9

    iput v10, v0, Lcom/google/android/gms/internal/ads/vb2;->k:I

    goto :goto_1

    :cond_7
    move/from16 v20, v8

    goto :goto_3

    :cond_8
    :goto_2
    iget v2, v0, Lcom/google/android/gms/internal/ads/vb2;->j:I

    move/from16 v11, v18

    if-ge v2, v11, :cond_9

    sub-int v2, v11, v2

    invoke-interface {v4, v1, v2, v7}, Lcom/google/android/gms/internal/ads/ua2;->a(Lcom/google/android/gms/internal/ads/ma2;IZ)I

    move-result v2

    iget v8, v0, Lcom/google/android/gms/internal/ads/vb2;->j:I

    add-int/2addr v8, v2

    iput v8, v0, Lcom/google/android/gms/internal/ads/vb2;->j:I

    iget v8, v0, Lcom/google/android/gms/internal/ads/vb2;->k:I

    sub-int/2addr v8, v2

    iput v8, v0, Lcom/google/android/gms/internal/ads/vb2;->k:I

    move/from16 v18, v11

    goto :goto_2

    :cond_9
    move/from16 v20, v11

    :goto_3
    iget-object v1, v3, Lcom/google/android/gms/internal/ads/xb2;->b:Lcom/google/android/gms/internal/ads/bc2;

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/bc2;->e:[J

    aget-wide v17, v2, v5

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/bc2;->f:[I

    aget v19, v1, v5

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object/from16 v16, v4

    invoke-interface/range {v16 .. v22}, Lcom/google/android/gms/internal/ads/ua2;->a(JIIILcom/google/android/gms/internal/ads/xa2;)V

    iget v1, v3, Lcom/google/android/gms/internal/ads/xb2;->d:I

    add-int/2addr v1, v6

    iput v1, v3, Lcom/google/android/gms/internal/ads/xb2;->d:I

    iput v7, v0, Lcom/google/android/gms/internal/ads/vb2;->j:I

    iput v7, v0, Lcom/google/android/gms/internal/ads/vb2;->k:I

    return v7

    :cond_a
    :goto_4
    iput-wide v13, v2, Lcom/google/android/gms/internal/ads/ta2;->a:J

    return v6

    :cond_b
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    throw v1

    :cond_c
    iget-wide v3, v0, Lcom/google/android/gms/internal/ads/vb2;->g:J

    iget v10, v0, Lcom/google/android/gms/internal/ads/vb2;->h:I

    int-to-long v10, v10

    sub-long/2addr v3, v10

    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/ma2;->c()J

    move-result-wide v10

    add-long/2addr v10, v3

    iget-object v12, v0, Lcom/google/android/gms/internal/ads/vb2;->i:Lcom/google/android/gms/internal/ads/xf2;

    if-eqz v12, :cond_11

    iget-object v8, v12, Lcom/google/android/gms/internal/ads/xf2;->a:[B

    iget v9, v0, Lcom/google/android/gms/internal/ads/vb2;->h:I

    long-to-int v4, v3

    invoke-interface {v1, v8, v9, v4}, Lcom/google/android/gms/internal/ads/ma2;->b([BII)V

    iget v3, v0, Lcom/google/android/gms/internal/ads/vb2;->f:I

    sget v4, Lcom/google/android/gms/internal/ads/kb2;->b:I

    if-ne v3, v4, :cond_10

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/vb2;->i:Lcom/google/android/gms/internal/ads/xf2;

    invoke-virtual {v3, v5}, Lcom/google/android/gms/internal/ads/xf2;->c(I)V

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/xf2;->d()I

    move-result v4

    sget v5, Lcom/google/android/gms/internal/ads/vb2;->p:I

    if-ne v4, v5, :cond_d

    :goto_5
    const/4 v3, 0x1

    goto :goto_6

    :cond_d
    const/4 v4, 0x4

    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/xf2;->d(I)V

    :cond_e
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/xf2;->j()I

    move-result v4

    if-lez v4, :cond_f

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/xf2;->d()I

    move-result v4

    sget v5, Lcom/google/android/gms/internal/ads/vb2;->p:I

    if-ne v4, v5, :cond_e

    goto :goto_5

    :cond_f
    const/4 v3, 0x0

    :goto_6
    iput-boolean v3, v0, Lcom/google/android/gms/internal/ads/vb2;->o:Z

    goto :goto_7

    :cond_10
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/vb2;->d:Ljava/util/Stack;

    invoke-virtual {v3}, Ljava/util/Stack;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_12

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/vb2;->d:Ljava/util/Stack;

    invoke-virtual {v3}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/ads/jb2;

    new-instance v4, Lcom/google/android/gms/internal/ads/mb2;

    iget v5, v0, Lcom/google/android/gms/internal/ads/vb2;->f:I

    iget-object v8, v0, Lcom/google/android/gms/internal/ads/vb2;->i:Lcom/google/android/gms/internal/ads/xf2;

    invoke-direct {v4, v5, v8}, Lcom/google/android/gms/internal/ads/mb2;-><init>(ILcom/google/android/gms/internal/ads/xf2;)V

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/jb2;->A0:Ljava/util/List;

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_11
    cmp-long v5, v3, v8

    if-gez v5, :cond_13

    long-to-int v4, v3

    invoke-interface {v1, v4}, Lcom/google/android/gms/internal/ads/ma2;->b(I)V

    :cond_12
    :goto_7
    const/4 v3, 0x0

    goto :goto_8

    :cond_13
    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/ma2;->c()J

    move-result-wide v8

    add-long/2addr v8, v3

    iput-wide v8, v2, Lcom/google/android/gms/internal/ads/ta2;->a:J

    const/4 v3, 0x1

    :goto_8
    invoke-direct {v0, v10, v11}, Lcom/google/android/gms/internal/ads/vb2;->b(J)V

    if-eqz v3, :cond_14

    iget v3, v0, Lcom/google/android/gms/internal/ads/vb2;->e:I

    const/4 v4, 0x2

    if-eq v3, v4, :cond_14

    const/4 v7, 0x1

    :cond_14
    if-eqz v7, :cond_0

    return v6

    :cond_15
    iget v3, v0, Lcom/google/android/gms/internal/ads/vb2;->h:I

    if-nez v3, :cond_17

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/vb2;->c:Lcom/google/android/gms/internal/ads/xf2;

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/xf2;->a:[B

    invoke-interface {v1, v3, v7, v5, v6}, Lcom/google/android/gms/internal/ads/ma2;->a([BIIZ)Z

    move-result v3

    if-nez v3, :cond_16

    const/4 v6, 0x0

    goto/16 :goto_10

    :cond_16
    iput v5, v0, Lcom/google/android/gms/internal/ads/vb2;->h:I

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/vb2;->c:Lcom/google/android/gms/internal/ads/xf2;

    invoke-virtual {v3, v7}, Lcom/google/android/gms/internal/ads/xf2;->c(I)V

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/vb2;->c:Lcom/google/android/gms/internal/ads/xf2;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/xf2;->l()J

    move-result-wide v8

    iput-wide v8, v0, Lcom/google/android/gms/internal/ads/vb2;->g:J

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/vb2;->c:Lcom/google/android/gms/internal/ads/xf2;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/xf2;->d()I

    move-result v3

    iput v3, v0, Lcom/google/android/gms/internal/ads/vb2;->f:I

    :cond_17
    iget-wide v8, v0, Lcom/google/android/gms/internal/ads/vb2;->g:J

    const-wide/16 v10, 0x1

    cmp-long v3, v8, v10

    if-nez v3, :cond_18

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/vb2;->c:Lcom/google/android/gms/internal/ads/xf2;

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/xf2;->a:[B

    invoke-interface {v1, v3, v5, v5}, Lcom/google/android/gms/internal/ads/ma2;->b([BII)V

    iget v3, v0, Lcom/google/android/gms/internal/ads/vb2;->h:I

    add-int/2addr v3, v5

    iput v3, v0, Lcom/google/android/gms/internal/ads/vb2;->h:I

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/vb2;->c:Lcom/google/android/gms/internal/ads/xf2;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/xf2;->p()J

    move-result-wide v8

    iput-wide v8, v0, Lcom/google/android/gms/internal/ads/vb2;->g:J

    :cond_18
    iget v3, v0, Lcom/google/android/gms/internal/ads/vb2;->f:I

    sget v8, Lcom/google/android/gms/internal/ads/kb2;->w:I

    if-eq v3, v8, :cond_1a

    sget v8, Lcom/google/android/gms/internal/ads/kb2;->y:I

    if-eq v3, v8, :cond_1a

    sget v8, Lcom/google/android/gms/internal/ads/kb2;->z:I

    if-eq v3, v8, :cond_1a

    sget v8, Lcom/google/android/gms/internal/ads/kb2;->A:I

    if-eq v3, v8, :cond_1a

    sget v8, Lcom/google/android/gms/internal/ads/kb2;->B:I

    if-eq v3, v8, :cond_1a

    sget v8, Lcom/google/android/gms/internal/ads/kb2;->I:I

    if-ne v3, v8, :cond_19

    goto :goto_9

    :cond_19
    const/4 v3, 0x0

    goto :goto_a

    :cond_1a
    :goto_9
    const/4 v3, 0x1

    :goto_a
    if-eqz v3, :cond_1c

    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/ma2;->c()J

    move-result-wide v7

    iget-wide v9, v0, Lcom/google/android/gms/internal/ads/vb2;->g:J

    add-long/2addr v7, v9

    iget v3, v0, Lcom/google/android/gms/internal/ads/vb2;->h:I

    int-to-long v9, v3

    sub-long/2addr v7, v9

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/vb2;->d:Ljava/util/Stack;

    new-instance v5, Lcom/google/android/gms/internal/ads/jb2;

    iget v9, v0, Lcom/google/android/gms/internal/ads/vb2;->f:I

    invoke-direct {v5, v9, v7, v8}, Lcom/google/android/gms/internal/ads/jb2;-><init>(IJ)V

    invoke-virtual {v3, v5}, Ljava/util/Stack;->add(Ljava/lang/Object;)Z

    iget-wide v9, v0, Lcom/google/android/gms/internal/ads/vb2;->g:J

    iget v3, v0, Lcom/google/android/gms/internal/ads/vb2;->h:I

    int-to-long v11, v3

    cmp-long v3, v9, v11

    if-nez v3, :cond_1b

    invoke-direct {v0, v7, v8}, Lcom/google/android/gms/internal/ads/vb2;->b(J)V

    goto/16 :goto_10

    :cond_1b
    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/vb2;->d()V

    goto/16 :goto_10

    :cond_1c
    iget v3, v0, Lcom/google/android/gms/internal/ads/vb2;->f:I

    sget v8, Lcom/google/android/gms/internal/ads/kb2;->K:I

    if-eq v3, v8, :cond_1e

    sget v8, Lcom/google/android/gms/internal/ads/kb2;->x:I

    if-eq v3, v8, :cond_1e

    sget v8, Lcom/google/android/gms/internal/ads/kb2;->L:I

    if-eq v3, v8, :cond_1e

    sget v8, Lcom/google/android/gms/internal/ads/kb2;->M:I

    if-eq v3, v8, :cond_1e

    sget v8, Lcom/google/android/gms/internal/ads/kb2;->X:I

    if-eq v3, v8, :cond_1e

    sget v8, Lcom/google/android/gms/internal/ads/kb2;->Y:I

    if-eq v3, v8, :cond_1e

    sget v8, Lcom/google/android/gms/internal/ads/kb2;->Z:I

    if-eq v3, v8, :cond_1e

    sget v8, Lcom/google/android/gms/internal/ads/kb2;->J:I

    if-eq v3, v8, :cond_1e

    sget v8, Lcom/google/android/gms/internal/ads/kb2;->a0:I

    if-eq v3, v8, :cond_1e

    sget v8, Lcom/google/android/gms/internal/ads/kb2;->b0:I

    if-eq v3, v8, :cond_1e

    sget v8, Lcom/google/android/gms/internal/ads/kb2;->c0:I

    if-eq v3, v8, :cond_1e

    sget v8, Lcom/google/android/gms/internal/ads/kb2;->d0:I

    if-eq v3, v8, :cond_1e

    sget v8, Lcom/google/android/gms/internal/ads/kb2;->e0:I

    if-eq v3, v8, :cond_1e

    sget v8, Lcom/google/android/gms/internal/ads/kb2;->H:I

    if-eq v3, v8, :cond_1e

    sget v8, Lcom/google/android/gms/internal/ads/kb2;->b:I

    if-eq v3, v8, :cond_1e

    sget v8, Lcom/google/android/gms/internal/ads/kb2;->l0:I

    if-ne v3, v8, :cond_1d

    goto :goto_b

    :cond_1d
    const/4 v3, 0x0

    goto :goto_c

    :cond_1e
    :goto_b
    const/4 v3, 0x1

    :goto_c
    if-eqz v3, :cond_21

    iget v3, v0, Lcom/google/android/gms/internal/ads/vb2;->h:I

    if-ne v3, v5, :cond_1f

    const/4 v3, 0x1

    goto :goto_d

    :cond_1f
    const/4 v3, 0x0

    :goto_d
    invoke-static {v3}, Lcom/google/android/gms/internal/ads/mf2;->b(Z)V

    iget-wide v8, v0, Lcom/google/android/gms/internal/ads/vb2;->g:J

    const-wide/32 v10, 0x7fffffff

    cmp-long v3, v8, v10

    if-gtz v3, :cond_20

    const/4 v3, 0x1

    goto :goto_e

    :cond_20
    const/4 v3, 0x0

    :goto_e
    invoke-static {v3}, Lcom/google/android/gms/internal/ads/mf2;->b(Z)V

    new-instance v3, Lcom/google/android/gms/internal/ads/xf2;

    iget-wide v8, v0, Lcom/google/android/gms/internal/ads/vb2;->g:J

    long-to-int v9, v8

    invoke-direct {v3, v9}, Lcom/google/android/gms/internal/ads/xf2;-><init>(I)V

    iput-object v3, v0, Lcom/google/android/gms/internal/ads/vb2;->i:Lcom/google/android/gms/internal/ads/xf2;

    iget-object v8, v0, Lcom/google/android/gms/internal/ads/vb2;->c:Lcom/google/android/gms/internal/ads/xf2;

    iget-object v8, v8, Lcom/google/android/gms/internal/ads/xf2;->a:[B

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/xf2;->a:[B

    invoke-static {v8, v7, v3, v7, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_f

    :cond_21
    const/4 v3, 0x0

    iput-object v3, v0, Lcom/google/android/gms/internal/ads/vb2;->i:Lcom/google/android/gms/internal/ads/xf2;

    :goto_f
    iput v6, v0, Lcom/google/android/gms/internal/ads/vb2;->e:I

    :goto_10
    if-nez v6, :cond_0

    return v4
.end method

.method public final a(J)J
    .locals 8

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/vb2;->m:[Lcom/google/android/gms/internal/ads/xb2;

    array-length v1, v0

    const-wide v2, 0x7fffffffffffffffL

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v1, :cond_2

    aget-object v5, v0, v4

    iget-object v5, v5, Lcom/google/android/gms/internal/ads/xb2;->b:Lcom/google/android/gms/internal/ads/bc2;

    invoke-virtual {v5, p1, p2}, Lcom/google/android/gms/internal/ads/bc2;->a(J)I

    move-result v6

    const/4 v7, -0x1

    if-ne v6, v7, :cond_0

    invoke-virtual {v5, p1, p2}, Lcom/google/android/gms/internal/ads/bc2;->b(J)I

    move-result v6

    :cond_0
    iget-object v5, v5, Lcom/google/android/gms/internal/ads/bc2;->b:[J

    aget-wide v6, v5, v6

    cmp-long v5, v6, v2

    if-gez v5, :cond_1

    move-wide v2, v6

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    return-wide v2
.end method

.method public final a()V
    .locals 0

    return-void
.end method

.method public final a(JJ)V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/vb2;->d:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/Stack;->clear()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/ads/vb2;->h:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/vb2;->j:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/vb2;->k:I

    const-wide/16 v1, 0x0

    cmp-long v3, p1, v1

    if-nez v3, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/vb2;->d()V

    return-void

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/vb2;->m:[Lcom/google/android/gms/internal/ads/xb2;

    if-eqz p1, :cond_2

    array-length p2, p1

    :goto_0
    if-ge v0, p2, :cond_2

    aget-object v1, p1, v0

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/xb2;->b:Lcom/google/android/gms/internal/ads/bc2;

    invoke-virtual {v2, p3, p4}, Lcom/google/android/gms/internal/ads/bc2;->a(J)I

    move-result v3

    const/4 v4, -0x1

    if-ne v3, v4, :cond_1

    invoke-virtual {v2, p3, p4}, Lcom/google/android/gms/internal/ads/bc2;->b(J)I

    move-result v3

    :cond_1
    iput v3, v1, Lcom/google/android/gms/internal/ads/xb2;->d:I

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/pa2;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/vb2;->l:Lcom/google/android/gms/internal/ads/pa2;

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/ma2;)Z
    .locals 0

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/ac2;->a(Lcom/google/android/gms/internal/ads/ma2;)Z

    move-result p1

    return p1
.end method

.method public final b()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final c()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/vb2;->n:J

    return-wide v0
.end method
