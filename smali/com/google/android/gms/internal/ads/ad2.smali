.class final Lcom/google/android/gms/internal/ads/ad2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/pa2;
.implements Lcom/google/android/gms/internal/ads/ld2;
.implements Lcom/google/android/gms/internal/ads/xd2;
.implements Lcom/google/android/gms/internal/ads/jf2;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/pa2;",
        "Lcom/google/android/gms/internal/ads/ld2;",
        "Lcom/google/android/gms/internal/ads/xd2;",
        "Lcom/google/android/gms/internal/ads/jf2<",
        "Lcom/google/android/gms/internal/ads/ed2;",
        ">;"
    }
.end annotation


# instance fields
.field private A:[Z

.field private B:[Z

.field private C:Z

.field private D:J

.field private E:J

.field private F:J

.field private G:I

.field private H:Z

.field private I:Z

.field private final b:Landroid/net/Uri;

.field private final c:Lcom/google/android/gms/internal/ads/ye2;

.field private final d:I

.field private final e:Lcom/google/android/gms/internal/ads/sk1;

.field private final f:Lcom/google/android/gms/internal/ads/id2;

.field private final g:Lcom/google/android/gms/internal/ads/md2;

.field private final h:Lcom/google/android/gms/internal/ads/we2;

.field private final i:Ljava/lang/String;

.field private final j:J

.field private final k:Lcom/google/android/gms/internal/ads/gf2;

.field private final l:Lcom/google/android/gms/internal/ads/hd2;

.field private final m:Lcom/google/android/gms/internal/ads/of2;

.field private final n:Ljava/lang/Runnable;

.field private final o:Ljava/lang/Runnable;

.field private final p:Lcom/google/android/gms/internal/ads/sk1;

.field private final q:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lcom/google/android/gms/internal/ads/vd2;",
            ">;"
        }
    .end annotation
.end field

.field private r:Lcom/google/android/gms/internal/ads/kd2;

.field private s:Lcom/google/android/gms/internal/ads/sa2;

.field private t:Z

.field private u:Z

.field private v:Z

.field private w:Z

.field private x:I

.field private y:Lcom/google/android/gms/internal/ads/ee2;

.field private z:J


# direct methods
.method public constructor <init>(Landroid/net/Uri;Lcom/google/android/gms/internal/ads/ye2;[Lcom/google/android/gms/internal/ads/na2;ILcom/google/android/gms/internal/ads/sk1;Lcom/google/android/gms/internal/ads/id2;Lcom/google/android/gms/internal/ads/md2;Lcom/google/android/gms/internal/ads/we2;Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ad2;->b:Landroid/net/Uri;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/ad2;->c:Lcom/google/android/gms/internal/ads/ye2;

    iput p4, p0, Lcom/google/android/gms/internal/ads/ad2;->d:I

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/ad2;->e:Lcom/google/android/gms/internal/ads/sk1;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/ad2;->f:Lcom/google/android/gms/internal/ads/id2;

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/ad2;->g:Lcom/google/android/gms/internal/ads/md2;

    iput-object p8, p0, Lcom/google/android/gms/internal/ads/ad2;->h:Lcom/google/android/gms/internal/ads/we2;

    iput-object p9, p0, Lcom/google/android/gms/internal/ads/ad2;->i:Ljava/lang/String;

    int-to-long p1, p10

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/ad2;->j:J

    new-instance p1, Lcom/google/android/gms/internal/ads/gf2;

    const-string p2, "Loader:ExtractorMediaPeriod"

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/gf2;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ad2;->k:Lcom/google/android/gms/internal/ads/gf2;

    new-instance p1, Lcom/google/android/gms/internal/ads/hd2;

    invoke-direct {p1, p3, p0}, Lcom/google/android/gms/internal/ads/hd2;-><init>([Lcom/google/android/gms/internal/ads/na2;Lcom/google/android/gms/internal/ads/pa2;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ad2;->l:Lcom/google/android/gms/internal/ads/hd2;

    new-instance p1, Lcom/google/android/gms/internal/ads/of2;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/of2;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ad2;->m:Lcom/google/android/gms/internal/ads/of2;

    new-instance p1, Lcom/google/android/gms/internal/ads/zc2;

    invoke-direct {p1, p0}, Lcom/google/android/gms/internal/ads/zc2;-><init>(Lcom/google/android/gms/internal/ads/ad2;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ad2;->n:Ljava/lang/Runnable;

    new-instance p1, Lcom/google/android/gms/internal/ads/dd2;

    invoke-direct {p1, p0}, Lcom/google/android/gms/internal/ads/dd2;-><init>(Lcom/google/android/gms/internal/ads/ad2;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ad2;->o:Ljava/lang/Runnable;

    new-instance p1, Lcom/google/android/gms/internal/ads/sk1;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/sk1;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ad2;->p:Lcom/google/android/gms/internal/ads/sk1;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/ad2;->F:J

    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ad2;->q:Landroid/util/SparseArray;

    const-wide/16 p1, -0x1

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/ad2;->D:J

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/ad2;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/ad2;->j()V

    return-void
.end method

.method private final a(Lcom/google/android/gms/internal/ads/ed2;)V
    .locals 5

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/ad2;->D:J

    const-wide/16 v2, -0x1

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/ed2;->a(Lcom/google/android/gms/internal/ads/ed2;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/ad2;->D:J

    :cond_0
    return-void
.end method

.method static synthetic b(Lcom/google/android/gms/internal/ads/ad2;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/google/android/gms/internal/ads/ad2;->I:Z

    return p0
.end method

.method static synthetic c(Lcom/google/android/gms/internal/ads/ad2;)Lcom/google/android/gms/internal/ads/kd2;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/ad2;->r:Lcom/google/android/gms/internal/ads/kd2;

    return-object p0
.end method

.method static synthetic d(Lcom/google/android/gms/internal/ads/ad2;)Landroid/util/SparseArray;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/ad2;->q:Landroid/util/SparseArray;

    return-object p0
.end method

.method static synthetic e(Lcom/google/android/gms/internal/ads/ad2;)Lcom/google/android/gms/internal/ads/id2;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/ad2;->f:Lcom/google/android/gms/internal/ads/id2;

    return-object p0
.end method

.method static synthetic f(Lcom/google/android/gms/internal/ads/ad2;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/ad2;->i:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic g(Lcom/google/android/gms/internal/ads/ad2;)J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/ad2;->j:J

    return-wide v0
.end method

.method static synthetic h(Lcom/google/android/gms/internal/ads/ad2;)Ljava/lang/Runnable;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/ad2;->o:Ljava/lang/Runnable;

    return-object p0
.end method

.method static synthetic i(Lcom/google/android/gms/internal/ads/ad2;)Lcom/google/android/gms/internal/ads/sk1;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/ad2;->p:Lcom/google/android/gms/internal/ads/sk1;

    return-object p0
.end method

.method private final i()V
    .locals 9

    new-instance v6, Lcom/google/android/gms/internal/ads/ed2;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/ad2;->b:Landroid/net/Uri;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/ad2;->c:Lcom/google/android/gms/internal/ads/ye2;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/ad2;->l:Lcom/google/android/gms/internal/ads/hd2;

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/ad2;->m:Lcom/google/android/gms/internal/ads/of2;

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/ed2;-><init>(Lcom/google/android/gms/internal/ads/ad2;Landroid/net/Uri;Lcom/google/android/gms/internal/ads/ye2;Lcom/google/android/gms/internal/ads/hd2;Lcom/google/android/gms/internal/ads/of2;)V

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/ad2;->u:Z

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/ad2;->m()Z

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/mf2;->b(Z)V

    iget-wide v3, p0, Lcom/google/android/gms/internal/ads/ad2;->z:J

    cmp-long v0, v3, v1

    if-eqz v0, :cond_0

    iget-wide v7, p0, Lcom/google/android/gms/internal/ads/ad2;->F:J

    cmp-long v0, v7, v3

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/ad2;->H:Z

    iput-wide v1, p0, Lcom/google/android/gms/internal/ads/ad2;->F:J

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ad2;->s:Lcom/google/android/gms/internal/ads/sa2;

    iget-wide v3, p0, Lcom/google/android/gms/internal/ads/ad2;->F:J

    invoke-interface {v0, v3, v4}, Lcom/google/android/gms/internal/ads/sa2;->a(J)J

    move-result-wide v3

    iget-wide v7, p0, Lcom/google/android/gms/internal/ads/ad2;->F:J

    invoke-virtual {v6, v3, v4, v7, v8}, Lcom/google/android/gms/internal/ads/ed2;->a(JJ)V

    iput-wide v1, p0, Lcom/google/android/gms/internal/ads/ad2;->F:J

    :cond_1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/ad2;->k()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/ads/ad2;->G:I

    iget v0, p0, Lcom/google/android/gms/internal/ads/ad2;->d:I

    const/4 v3, -0x1

    if-ne v0, v3, :cond_4

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/ad2;->u:Z

    if-eqz v0, :cond_3

    iget-wide v3, p0, Lcom/google/android/gms/internal/ads/ad2;->D:J

    const-wide/16 v7, -0x1

    cmp-long v0, v3, v7

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ad2;->s:Lcom/google/android/gms/internal/ads/sa2;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/sa2;->c()J

    move-result-wide v3

    cmp-long v0, v3, v1

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x6

    goto :goto_1

    :cond_3
    :goto_0
    const/4 v0, 0x3

    :cond_4
    :goto_1
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ad2;->k:Lcom/google/android/gms/internal/ads/gf2;

    invoke-virtual {v1, v6, p0, v0}, Lcom/google/android/gms/internal/ads/gf2;->a(Lcom/google/android/gms/internal/ads/lf2;Lcom/google/android/gms/internal/ads/jf2;I)J

    return-void
.end method

.method private final j()V
    .locals 8

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/ad2;->I:Z

    if-nez v0, :cond_6

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/ad2;->u:Z

    if-nez v0, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ad2;->s:Lcom/google/android/gms/internal/ads/sa2;

    if-eqz v0, :cond_6

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/ad2;->t:Z

    if-nez v0, :cond_0

    goto/16 :goto_3

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ad2;->q:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_2

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/ad2;->q:Landroid/util/SparseArray;

    invoke-virtual {v3, v2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/ads/vd2;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/vd2;->e()Lcom/google/android/gms/internal/ads/e82;

    move-result-object v3

    if-nez v3, :cond_1

    return-void

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/ad2;->m:Lcom/google/android/gms/internal/ads/of2;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/of2;->c()Z

    new-array v2, v0, [Lcom/google/android/gms/internal/ads/ae2;

    new-array v3, v0, [Z

    iput-object v3, p0, Lcom/google/android/gms/internal/ads/ad2;->B:[Z

    new-array v3, v0, [Z

    iput-object v3, p0, Lcom/google/android/gms/internal/ads/ad2;->A:[Z

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/ad2;->s:Lcom/google/android/gms/internal/ads/sa2;

    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/sa2;->c()J

    move-result-wide v3

    iput-wide v3, p0, Lcom/google/android/gms/internal/ads/ad2;->z:J

    const/4 v3, 0x0

    :goto_1
    const/4 v4, 0x1

    if-ge v3, v0, :cond_5

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/ad2;->q:Landroid/util/SparseArray;

    invoke-virtual {v5, v3}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/ads/vd2;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/vd2;->e()Lcom/google/android/gms/internal/ads/e82;

    move-result-object v5

    new-instance v6, Lcom/google/android/gms/internal/ads/ae2;

    new-array v7, v4, [Lcom/google/android/gms/internal/ads/e82;

    aput-object v5, v7, v1

    invoke-direct {v6, v7}, Lcom/google/android/gms/internal/ads/ae2;-><init>([Lcom/google/android/gms/internal/ads/e82;)V

    aput-object v6, v2, v3

    iget-object v5, v5, Lcom/google/android/gms/internal/ads/e82;->g:Ljava/lang/String;

    invoke-static {v5}, Lcom/google/android/gms/internal/ads/tf2;->b(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_4

    invoke-static {v5}, Lcom/google/android/gms/internal/ads/tf2;->a(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_3

    goto :goto_2

    :cond_3
    const/4 v4, 0x0

    :cond_4
    :goto_2
    iget-object v5, p0, Lcom/google/android/gms/internal/ads/ad2;->B:[Z

    aput-boolean v4, v5, v3

    iget-boolean v5, p0, Lcom/google/android/gms/internal/ads/ad2;->C:Z

    or-int/2addr v4, v5

    iput-boolean v4, p0, Lcom/google/android/gms/internal/ads/ad2;->C:Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_5
    new-instance v0, Lcom/google/android/gms/internal/ads/ee2;

    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/ads/ee2;-><init>([Lcom/google/android/gms/internal/ads/ae2;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/ad2;->y:Lcom/google/android/gms/internal/ads/ee2;

    iput-boolean v4, p0, Lcom/google/android/gms/internal/ads/ad2;->u:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ad2;->g:Lcom/google/android/gms/internal/ads/md2;

    new-instance v1, Lcom/google/android/gms/internal/ads/be2;

    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/ad2;->z:J

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/ad2;->s:Lcom/google/android/gms/internal/ads/sa2;

    invoke-interface {v4}, Lcom/google/android/gms/internal/ads/sa2;->b()Z

    move-result v4

    invoke-direct {v1, v2, v3, v4}, Lcom/google/android/gms/internal/ads/be2;-><init>(JZ)V

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/ads/md2;->a(Lcom/google/android/gms/internal/ads/o82;Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ad2;->r:Lcom/google/android/gms/internal/ads/kd2;

    invoke-interface {v0, p0}, Lcom/google/android/gms/internal/ads/kd2;->a(Lcom/google/android/gms/internal/ads/ld2;)V

    :cond_6
    :goto_3
    return-void
.end method

.method private final k()I
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ad2;->q:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/ad2;->q:Landroid/util/SparseArray;

    invoke-virtual {v3, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/ads/vd2;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/vd2;->c()I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return v2
.end method

.method private final l()J
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ad2;->q:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v0

    const-wide/high16 v1, -0x8000000000000000L

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_0

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/ad2;->q:Landroid/util/SparseArray;

    invoke-virtual {v4, v3}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/ads/vd2;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/vd2;->b()J

    move-result-wide v4

    invoke-static {v1, v2, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-wide v1
.end method

.method private final m()Z
    .locals 5

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/ad2;->F:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method final a(ILcom/google/android/gms/internal/ads/g82;Lcom/google/android/gms/internal/ads/ca2;Z)I
    .locals 7

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/ad2;->w:Z

    if-nez v0, :cond_1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/ad2;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ad2;->q:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/ads/vd2;

    iget-boolean v4, p0, Lcom/google/android/gms/internal/ads/ad2;->H:Z

    iget-wide v5, p0, Lcom/google/android/gms/internal/ads/ad2;->E:J

    move-object v1, p2

    move-object v2, p3

    move v3, p4

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/vd2;->a(Lcom/google/android/gms/internal/ads/g82;Lcom/google/android/gms/internal/ads/ca2;ZZJ)I

    move-result p1

    return p1

    :cond_1
    :goto_0
    const/4 p1, -0x3

    return p1
.end method

.method public final synthetic a(Lcom/google/android/gms/internal/ads/lf2;JJLjava/io/IOException;)I
    .locals 4

    check-cast p1, Lcom/google/android/gms/internal/ads/ed2;

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/ad2;->a(Lcom/google/android/gms/internal/ads/ed2;)V

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/ad2;->e:Lcom/google/android/gms/internal/ads/sk1;

    if-eqz p2, :cond_0

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/ad2;->f:Lcom/google/android/gms/internal/ads/id2;

    if-eqz p3, :cond_0

    new-instance p3, Lcom/google/android/gms/internal/ads/fd2;

    invoke-direct {p3, p0, p6}, Lcom/google/android/gms/internal/ads/fd2;-><init>(Lcom/google/android/gms/internal/ads/ad2;Ljava/io/IOException;)V

    invoke-virtual {p2, p3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    instance-of p2, p6, Lcom/google/android/gms/internal/ads/ce2;

    if-eqz p2, :cond_1

    const/4 p1, 0x3

    return p1

    :cond_1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/ad2;->k()I

    move-result p2

    iget p3, p0, Lcom/google/android/gms/internal/ads/ad2;->G:I

    const/4 p4, 0x1

    const/4 p5, 0x0

    if-le p2, p3, :cond_2

    const/4 p2, 0x1

    goto :goto_0

    :cond_2
    const/4 p2, 0x0

    :goto_0
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/ad2;->D:J

    const-wide/16 v2, -0x1

    cmp-long p3, v0, v2

    if-nez p3, :cond_7

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/ad2;->s:Lcom/google/android/gms/internal/ads/sa2;

    if-eqz p3, :cond_3

    invoke-interface {p3}, Lcom/google/android/gms/internal/ads/sa2;->c()J

    move-result-wide v0

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p3, v0, v2

    if-nez p3, :cond_7

    :cond_3
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/ad2;->E:J

    iget-boolean p3, p0, Lcom/google/android/gms/internal/ads/ad2;->u:Z

    iput-boolean p3, p0, Lcom/google/android/gms/internal/ads/ad2;->w:Z

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/ad2;->q:Landroid/util/SparseArray;

    invoke-virtual {p3}, Landroid/util/SparseArray;->size()I

    move-result p3

    const/4 p6, 0x0

    :goto_1
    if-ge p6, p3, :cond_6

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/ad2;->q:Landroid/util/SparseArray;

    invoke-virtual {v2, p6}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/ads/vd2;

    iget-boolean v3, p0, Lcom/google/android/gms/internal/ads/ad2;->u:Z

    if-eqz v3, :cond_5

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/ad2;->A:[Z

    aget-boolean v3, v3, p6

    if-eqz v3, :cond_4

    goto :goto_2

    :cond_4
    const/4 v3, 0x0

    goto :goto_3

    :cond_5
    :goto_2
    const/4 v3, 0x1

    :goto_3
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/vd2;->a(Z)V

    add-int/lit8 p6, p6, 0x1

    goto :goto_1

    :cond_6
    invoke-virtual {p1, v0, v1, v0, v1}, Lcom/google/android/gms/internal/ads/ed2;->a(JJ)V

    :cond_7
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/ad2;->k()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/ads/ad2;->G:I

    if-eqz p2, :cond_8

    return p4

    :cond_8
    return p5
.end method

.method public final a()J
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/ads/ad2;->x:I

    if-nez v0, :cond_0

    const-wide/high16 v0, -0x8000000000000000L

    return-wide v0

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/ad2;->c()J

    move-result-wide v0

    return-wide v0
.end method

.method public final a([Lcom/google/android/gms/internal/ads/ne2;[Z[Lcom/google/android/gms/internal/ads/wd2;[ZJ)J
    .locals 5

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/ad2;->u:Z

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/mf2;->b(Z)V

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    array-length v2, p1

    const/4 v3, 0x1

    if-ge v1, v2, :cond_2

    aget-object v2, p3, v1

    if-eqz v2, :cond_1

    aget-object v2, p1, v1

    if-eqz v2, :cond_0

    aget-boolean v2, p2, v1

    if-nez v2, :cond_1

    :cond_0
    aget-object v2, p3, v1

    check-cast v2, Lcom/google/android/gms/internal/ads/gd2;

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/gd2;->a(Lcom/google/android/gms/internal/ads/gd2;)I

    move-result v2

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/ad2;->A:[Z

    aget-boolean v4, v4, v2

    invoke-static {v4}, Lcom/google/android/gms/internal/ads/mf2;->b(Z)V

    iget v4, p0, Lcom/google/android/gms/internal/ads/ad2;->x:I

    sub-int/2addr v4, v3

    iput v4, p0, Lcom/google/android/gms/internal/ads/ad2;->x:I

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/ad2;->A:[Z

    aput-boolean v0, v3, v2

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/ad2;->q:Landroid/util/SparseArray;

    invoke-virtual {v3, v2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/ads/vd2;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/vd2;->a()V

    const/4 v2, 0x0

    aput-object v2, p3, v1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    const/4 p2, 0x0

    const/4 v1, 0x0

    :goto_1
    array-length v2, p1

    if-ge p2, v2, :cond_6

    aget-object v2, p3, p2

    if-nez v2, :cond_5

    aget-object v2, p1, p2

    if-eqz v2, :cond_5

    aget-object v1, p1, p2

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/ne2;->length()I

    move-result v2

    if-ne v2, v3, :cond_3

    const/4 v2, 0x1

    goto :goto_2

    :cond_3
    const/4 v2, 0x0

    :goto_2
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/mf2;->b(Z)V

    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/ads/ne2;->a(I)I

    move-result v2

    if-nez v2, :cond_4

    const/4 v2, 0x1

    goto :goto_3

    :cond_4
    const/4 v2, 0x0

    :goto_3
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/mf2;->b(Z)V

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/ad2;->y:Lcom/google/android/gms/internal/ads/ee2;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/ne2;->a()Lcom/google/android/gms/internal/ads/ae2;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/ee2;->a(Lcom/google/android/gms/internal/ads/ae2;)I

    move-result v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/ad2;->A:[Z

    aget-boolean v2, v2, v1

    xor-int/2addr v2, v3

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/mf2;->b(Z)V

    iget v2, p0, Lcom/google/android/gms/internal/ads/ad2;->x:I

    add-int/2addr v2, v3

    iput v2, p0, Lcom/google/android/gms/internal/ads/ad2;->x:I

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/ad2;->A:[Z

    aput-boolean v3, v2, v1

    new-instance v2, Lcom/google/android/gms/internal/ads/gd2;

    invoke-direct {v2, p0, v1}, Lcom/google/android/gms/internal/ads/gd2;-><init>(Lcom/google/android/gms/internal/ads/ad2;I)V

    aput-object v2, p3, p2

    aput-boolean v3, p4, p2

    const/4 v1, 0x1

    :cond_5
    add-int/lit8 p2, p2, 0x1

    goto :goto_1

    :cond_6
    iget-boolean p1, p0, Lcom/google/android/gms/internal/ads/ad2;->v:Z

    if-nez p1, :cond_8

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/ad2;->q:Landroid/util/SparseArray;

    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result p1

    const/4 p2, 0x0

    :goto_4
    if-ge p2, p1, :cond_8

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/ad2;->A:[Z

    aget-boolean v2, v2, p2

    if-nez v2, :cond_7

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/ad2;->q:Landroid/util/SparseArray;

    invoke-virtual {v2, p2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/ads/vd2;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/vd2;->a()V

    :cond_7
    add-int/lit8 p2, p2, 0x1

    goto :goto_4

    :cond_8
    iget p1, p0, Lcom/google/android/gms/internal/ads/ad2;->x:I

    if-nez p1, :cond_9

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/ad2;->w:Z

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/ad2;->k:Lcom/google/android/gms/internal/ads/gf2;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/gf2;->a()Z

    move-result p1

    if-eqz p1, :cond_c

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/ad2;->k:Lcom/google/android/gms/internal/ads/gf2;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/gf2;->b()V

    goto :goto_7

    :cond_9
    iget-boolean p1, p0, Lcom/google/android/gms/internal/ads/ad2;->v:Z

    if-eqz p1, :cond_a

    if-eqz v1, :cond_c

    goto :goto_5

    :cond_a
    const-wide/16 p1, 0x0

    cmp-long v1, p5, p1

    if-eqz v1, :cond_c

    :goto_5
    invoke-virtual {p0, p5, p6}, Lcom/google/android/gms/internal/ads/ad2;->c(J)J

    move-result-wide p5

    :goto_6
    array-length p1, p3

    if-ge v0, p1, :cond_c

    aget-object p1, p3, v0

    if-eqz p1, :cond_b

    aput-boolean v3, p4, v0

    :cond_b
    add-int/lit8 v0, v0, 0x1

    goto :goto_6

    :cond_c
    :goto_7
    iput-boolean v3, p0, Lcom/google/android/gms/internal/ads/ad2;->v:Z

    return-wide p5
.end method

.method public final a(II)Lcom/google/android/gms/internal/ads/ua2;
    .locals 1

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/ad2;->q:Landroid/util/SparseArray;

    invoke-virtual {p2, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/ads/vd2;

    if-nez p2, :cond_0

    new-instance p2, Lcom/google/android/gms/internal/ads/vd2;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ad2;->h:Lcom/google/android/gms/internal/ads/we2;

    invoke-direct {p2, v0}, Lcom/google/android/gms/internal/ads/vd2;-><init>(Lcom/google/android/gms/internal/ads/we2;)V

    invoke-virtual {p2, p0}, Lcom/google/android/gms/internal/ads/vd2;->a(Lcom/google/android/gms/internal/ads/xd2;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ad2;->q:Landroid/util/SparseArray;

    invoke-virtual {v0, p1, p2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    :cond_0
    return-object p2
.end method

.method final a(IJ)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ad2;->q:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/vd2;

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/ad2;->H:Z

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/vd2;->b()J

    move-result-wide v0

    cmp-long v2, p2, v0

    if-lez v2, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/vd2;->f()V

    return-void

    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p1, p2, p3, v0}, Lcom/google/android/gms/internal/ads/vd2;->a(JZ)Z

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/e82;)V
    .locals 1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/ad2;->p:Lcom/google/android/gms/internal/ads/sk1;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ad2;->n:Ljava/lang/Runnable;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/kd2;J)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ad2;->r:Lcom/google/android/gms/internal/ads/kd2;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/ad2;->m:Lcom/google/android/gms/internal/ads/of2;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/of2;->b()Z

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/ad2;->i()V

    return-void
.end method

.method public final synthetic a(Lcom/google/android/gms/internal/ads/lf2;JJ)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/ads/ed2;

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/ad2;->a(Lcom/google/android/gms/internal/ads/ed2;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/ad2;->H:Z

    iget-wide p1, p0, Lcom/google/android/gms/internal/ads/ad2;->z:J

    const-wide p3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p5, p1, p3

    if-nez p5, :cond_1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/ad2;->l()J

    move-result-wide p1

    const-wide/high16 p3, -0x8000000000000000L

    cmp-long p5, p1, p3

    if-nez p5, :cond_0

    const-wide/16 p1, 0x0

    goto :goto_0

    :cond_0
    const-wide/16 p3, 0x2710

    add-long/2addr p1, p3

    :goto_0
    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/ad2;->z:J

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/ad2;->g:Lcom/google/android/gms/internal/ads/md2;

    new-instance p2, Lcom/google/android/gms/internal/ads/be2;

    iget-wide p3, p0, Lcom/google/android/gms/internal/ads/ad2;->z:J

    iget-object p5, p0, Lcom/google/android/gms/internal/ads/ad2;->s:Lcom/google/android/gms/internal/ads/sa2;

    invoke-interface {p5}, Lcom/google/android/gms/internal/ads/sa2;->b()Z

    move-result p5

    invoke-direct {p2, p3, p4, p5}, Lcom/google/android/gms/internal/ads/be2;-><init>(JZ)V

    const/4 p3, 0x0

    invoke-interface {p1, p2, p3}, Lcom/google/android/gms/internal/ads/md2;->a(Lcom/google/android/gms/internal/ads/o82;Ljava/lang/Object;)V

    :cond_1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/ad2;->r:Lcom/google/android/gms/internal/ads/kd2;

    invoke-interface {p1, p0}, Lcom/google/android/gms/internal/ads/yd2;->a(Lcom/google/android/gms/internal/ads/zd2;)V

    return-void
.end method

.method public final synthetic a(Lcom/google/android/gms/internal/ads/lf2;JJZ)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/ads/ed2;

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/ad2;->a(Lcom/google/android/gms/internal/ads/ed2;)V

    if-nez p6, :cond_1

    iget p1, p0, Lcom/google/android/gms/internal/ads/ad2;->x:I

    if-lez p1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/ad2;->q:Landroid/util/SparseArray;

    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result p1

    const/4 p2, 0x0

    :goto_0
    if-ge p2, p1, :cond_0

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/ad2;->q:Landroid/util/SparseArray;

    invoke-virtual {p3, p2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/google/android/gms/internal/ads/vd2;

    iget-object p4, p0, Lcom/google/android/gms/internal/ads/ad2;->A:[Z

    aget-boolean p4, p4, p2

    invoke-virtual {p3, p4}, Lcom/google/android/gms/internal/ads/vd2;->a(Z)V

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/ad2;->r:Lcom/google/android/gms/internal/ads/kd2;

    invoke-interface {p1, p0}, Lcom/google/android/gms/internal/ads/yd2;->a(Lcom/google/android/gms/internal/ads/zd2;)V

    :cond_1
    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/sa2;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ad2;->s:Lcom/google/android/gms/internal/ads/sa2;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/ad2;->p:Lcom/google/android/gms/internal/ads/sk1;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ad2;->n:Ljava/lang/Runnable;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method final a(I)Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/ad2;->H:Z

    if-nez v0, :cond_1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/ad2;->m()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ad2;->q:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/vd2;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/vd2;->d()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final a(J)Z
    .locals 0

    iget-boolean p1, p0, Lcom/google/android/gms/internal/ads/ad2;->H:Z

    if-nez p1, :cond_2

    iget-boolean p1, p0, Lcom/google/android/gms/internal/ads/ad2;->u:Z

    if-eqz p1, :cond_0

    iget p1, p0, Lcom/google/android/gms/internal/ads/ad2;->x:I

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/ad2;->m:Lcom/google/android/gms/internal/ads/of2;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/of2;->b()Z

    move-result p1

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/ad2;->k:Lcom/google/android/gms/internal/ads/gf2;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/gf2;->a()Z

    move-result p2

    if-nez p2, :cond_1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/ad2;->i()V

    const/4 p1, 0x1

    :cond_1
    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final b()J
    .locals 2

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/ad2;->w:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/ad2;->w:Z

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/ad2;->E:J

    return-wide v0

    :cond_0
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    return-wide v0
.end method

.method public final b(J)V
    .locals 0

    return-void
.end method

.method public final c()J
    .locals 8

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/ad2;->H:Z

    const-wide/high16 v1, -0x8000000000000000L

    if-eqz v0, :cond_0

    return-wide v1

    :cond_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/ad2;->m()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/ad2;->F:J

    return-wide v0

    :cond_1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/ad2;->C:Z

    if-eqz v0, :cond_3

    const-wide v3, 0x7fffffffffffffffL

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ad2;->q:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v0

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v0, :cond_4

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/ad2;->B:[Z

    aget-boolean v6, v6, v5

    if-eqz v6, :cond_2

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/ad2;->q:Landroid/util/SparseArray;

    invoke-virtual {v6, v5}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/google/android/gms/internal/ads/vd2;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/vd2;->b()J

    move-result-wide v6

    invoke-static {v3, v4, v6, v7}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v3

    :cond_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_3
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/ad2;->l()J

    move-result-wide v3

    :cond_4
    cmp-long v0, v3, v1

    if-nez v0, :cond_5

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/ad2;->E:J

    return-wide v0

    :cond_5
    return-wide v3
.end method

.method public final c(J)J
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ad2;->s:Lcom/google/android/gms/internal/ads/sa2;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/sa2;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const-wide/16 p1, 0x0

    :goto_0
    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/ad2;->E:J

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ad2;->q:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/ad2;->m()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_1
    if-eqz v1, :cond_2

    if-ge v3, v0, :cond_2

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/ad2;->A:[Z

    aget-boolean v4, v4, v3

    if-eqz v4, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ad2;->q:Landroid/util/SparseArray;

    invoke-virtual {v1, v3}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/vd2;

    invoke-virtual {v1, p1, p2, v2}, Lcom/google/android/gms/internal/ads/vd2;->a(JZ)Z

    move-result v1

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_2
    if-nez v1, :cond_4

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/ad2;->F:J

    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/ad2;->H:Z

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ad2;->k:Lcom/google/android/gms/internal/ads/gf2;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/gf2;->a()Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ad2;->k:Lcom/google/android/gms/internal/ads/gf2;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/gf2;->b()V

    goto :goto_3

    :cond_3
    const/4 v1, 0x0

    :goto_2
    if-ge v1, v0, :cond_4

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/ad2;->q:Landroid/util/SparseArray;

    invoke-virtual {v3, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/ads/vd2;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/ad2;->A:[Z

    aget-boolean v4, v4, v1

    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/vd2;->a(Z)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_4
    :goto_3
    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/ad2;->w:Z

    return-wide p1
.end method

.method public final d()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/ad2;->t:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ad2;->p:Lcom/google/android/gms/internal/ads/sk1;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ad2;->n:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final e()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ad2;->k:Lcom/google/android/gms/internal/ads/gf2;

    const/high16 v1, -0x80000000

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/gf2;->a(I)V

    return-void
.end method

.method public final f()Lcom/google/android/gms/internal/ads/ee2;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ad2;->y:Lcom/google/android/gms/internal/ads/ee2;

    return-object v0
.end method

.method public final g()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ad2;->l:Lcom/google/android/gms/internal/ads/hd2;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ad2;->k:Lcom/google/android/gms/internal/ads/gf2;

    new-instance v2, Lcom/google/android/gms/internal/ads/bd2;

    invoke-direct {v2, p0, v0}, Lcom/google/android/gms/internal/ads/bd2;-><init>(Lcom/google/android/gms/internal/ads/ad2;Lcom/google/android/gms/internal/ads/hd2;)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/gf2;->a(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ad2;->p:Lcom/google/android/gms/internal/ads/sk1;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/ad2;->I:Z

    return-void
.end method

.method final h()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ad2;->k:Lcom/google/android/gms/internal/ads/gf2;

    const/high16 v1, -0x80000000

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/gf2;->a(I)V

    return-void
.end method
