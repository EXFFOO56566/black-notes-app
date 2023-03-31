.class final Lcom/google/android/gms/internal/ads/u72;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/r72;


# instance fields
.field private final a:[Lcom/google/android/gms/internal/ads/j82;

.field private final b:Lcom/google/android/gms/internal/ads/se2;

.field private final c:Lcom/google/android/gms/internal/ads/pe2;

.field private final d:Lcom/google/android/gms/internal/ads/sk1;

.field private final e:Lcom/google/android/gms/internal/ads/w72;

.field private final f:Ljava/util/concurrent/CopyOnWriteArraySet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArraySet<",
            "Lcom/google/android/gms/internal/ads/q72;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Lcom/google/android/gms/internal/ads/p82;

.field private final h:Lcom/google/android/gms/internal/ads/q82;

.field private i:Z

.field private j:Z

.field private k:I

.field private l:I

.field private m:I

.field private n:Z

.field private o:Lcom/google/android/gms/internal/ads/o82;

.field private p:Ljava/lang/Object;

.field private q:Lcom/google/android/gms/internal/ads/ee2;

.field private r:Lcom/google/android/gms/internal/ads/pe2;

.field private s:Lcom/google/android/gms/internal/ads/k82;

.field private t:Lcom/google/android/gms/internal/ads/z72;

.field private u:I

.field private v:J


# direct methods
.method public constructor <init>([Lcom/google/android/gms/internal/ads/j82;Lcom/google/android/gms/internal/ads/se2;Lcom/google/android/gms/internal/ads/i82;)V
    .locals 12
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "HandlerLeak"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lcom/google/android/gms/internal/ads/ag2;->e:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, 0x1a

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "Init ExoPlayerLib/2.4.2 ["

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "]"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ExoPlayerImpl"

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    array-length v0, p1

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/mf2;->b(Z)V

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/mf2;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-object v0, p1

    check-cast v0, [Lcom/google/android/gms/internal/ads/j82;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/u72;->a:[Lcom/google/android/gms/internal/ads/j82;

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/mf2;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-object v0, p2

    check-cast v0, Lcom/google/android/gms/internal/ads/se2;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/u72;->b:Lcom/google/android/gms/internal/ads/se2;

    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/u72;->j:Z

    iput v1, p0, Lcom/google/android/gms/internal/ads/u72;->k:I

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/u72;->f:Ljava/util/concurrent/CopyOnWriteArraySet;

    new-instance v0, Lcom/google/android/gms/internal/ads/pe2;

    array-length v1, p1

    new-array v1, v1, [Lcom/google/android/gms/internal/ads/ne2;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/pe2;-><init>([Lcom/google/android/gms/internal/ads/ne2;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/u72;->c:Lcom/google/android/gms/internal/ads/pe2;

    sget-object v0, Lcom/google/android/gms/internal/ads/o82;->a:Lcom/google/android/gms/internal/ads/o82;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/u72;->o:Lcom/google/android/gms/internal/ads/o82;

    new-instance v0, Lcom/google/android/gms/internal/ads/p82;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/p82;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/u72;->g:Lcom/google/android/gms/internal/ads/p82;

    new-instance v0, Lcom/google/android/gms/internal/ads/q82;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/q82;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/u72;->h:Lcom/google/android/gms/internal/ads/q82;

    sget-object v0, Lcom/google/android/gms/internal/ads/ee2;->d:Lcom/google/android/gms/internal/ads/ee2;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/u72;->q:Lcom/google/android/gms/internal/ads/ee2;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/u72;->c:Lcom/google/android/gms/internal/ads/pe2;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/u72;->r:Lcom/google/android/gms/internal/ads/pe2;

    sget-object v0, Lcom/google/android/gms/internal/ads/k82;->d:Lcom/google/android/gms/internal/ads/k82;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/u72;->s:Lcom/google/android/gms/internal/ads/k82;

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    goto :goto_1

    :cond_1
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    :goto_1
    new-instance v1, Lcom/google/android/gms/internal/ads/x72;

    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/internal/ads/x72;-><init>(Lcom/google/android/gms/internal/ads/u72;Landroid/os/Looper;)V

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/u72;->d:Lcom/google/android/gms/internal/ads/sk1;

    new-instance v10, Lcom/google/android/gms/internal/ads/z72;

    const-wide/16 v0, 0x0

    invoke-direct {v10, v2, v0, v1}, Lcom/google/android/gms/internal/ads/z72;-><init>(IJ)V

    iput-object v10, p0, Lcom/google/android/gms/internal/ads/u72;->t:Lcom/google/android/gms/internal/ads/z72;

    new-instance v0, Lcom/google/android/gms/internal/ads/w72;

    iget-boolean v7, p0, Lcom/google/android/gms/internal/ads/u72;->j:Z

    const/4 v8, 0x0

    iget-object v9, p0, Lcom/google/android/gms/internal/ads/u72;->d:Lcom/google/android/gms/internal/ads/sk1;

    move-object v3, v0

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    move-object v11, p0

    invoke-direct/range {v3 .. v11}, Lcom/google/android/gms/internal/ads/w72;-><init>([Lcom/google/android/gms/internal/ads/j82;Lcom/google/android/gms/internal/ads/se2;Lcom/google/android/gms/internal/ads/i82;ZILcom/google/android/gms/internal/ads/sk1;Lcom/google/android/gms/internal/ads/z72;Lcom/google/android/gms/internal/ads/r72;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/u72;->e:Lcom/google/android/gms/internal/ads/w72;

    return-void
.end method

.method private final b()I
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/u72;->o:Lcom/google/android/gms/internal/ads/o82;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/o82;->a()Z

    move-result v0

    if-nez v0, :cond_1

    iget v0, p0, Lcom/google/android/gms/internal/ads/u72;->l:I

    if-lez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/u72;->o:Lcom/google/android/gms/internal/ads/o82;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/u72;->t:Lcom/google/android/gms/internal/ads/z72;

    iget v1, v1, Lcom/google/android/gms/internal/ads/z72;->a:I

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/u72;->h:Lcom/google/android/gms/internal/ads/q82;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/o82;->a(ILcom/google/android/gms/internal/ads/q82;Z)Lcom/google/android/gms/internal/ads/q82;

    return v3

    :cond_1
    :goto_0
    iget v0, p0, Lcom/google/android/gms/internal/ads/u72;->u:I

    return v0
.end method


# virtual methods
.method public final H()J
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/u72;->o:Lcom/google/android/gms/internal/ads/o82;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/o82;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    return-wide v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/u72;->o:Lcom/google/android/gms/internal/ads/o82;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/u72;->b()I

    move-result v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/u72;->g:Lcom/google/android/gms/internal/ads/p82;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/o82;->a(ILcom/google/android/gms/internal/ads/p82;Z)Lcom/google/android/gms/internal/ads/p82;

    move-result-object v0

    iget-wide v0, v0, Lcom/google/android/gms/internal/ads/p82;->i:J

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/p72;->a(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public final T()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/u72;->k:I

    return v0
.end method

.method public final U()J
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/u72;->o:Lcom/google/android/gms/internal/ads/o82;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/o82;->a()Z

    move-result v0

    if-nez v0, :cond_1

    iget v0, p0, Lcom/google/android/gms/internal/ads/u72;->l:I

    if-lez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/u72;->o:Lcom/google/android/gms/internal/ads/o82;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/u72;->t:Lcom/google/android/gms/internal/ads/z72;

    iget v1, v1, Lcom/google/android/gms/internal/ads/z72;->a:I

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/u72;->h:Lcom/google/android/gms/internal/ads/q82;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/o82;->a(ILcom/google/android/gms/internal/ads/q82;Z)Lcom/google/android/gms/internal/ads/q82;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/u72;->h:Lcom/google/android/gms/internal/ads/q82;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/q82;->a()J

    move-result-wide v0

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/u72;->t:Lcom/google/android/gms/internal/ads/z72;

    iget-wide v2, v2, Lcom/google/android/gms/internal/ads/z72;->d:J

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ads/p72;->a(J)J

    move-result-wide v2

    add-long/2addr v0, v2

    return-wide v0

    :cond_1
    :goto_0
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/u72;->v:J

    return-wide v0
.end method

.method public final V()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/u72;->j:Z

    return v0
.end method

.method public final W()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/u72;->a:[Lcom/google/android/gms/internal/ads/j82;

    array-length v0, v0

    return v0
.end method

.method public final X()J
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/u72;->o:Lcom/google/android/gms/internal/ads/o82;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/o82;->a()Z

    move-result v0

    if-nez v0, :cond_1

    iget v0, p0, Lcom/google/android/gms/internal/ads/u72;->l:I

    if-lez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/u72;->o:Lcom/google/android/gms/internal/ads/o82;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/u72;->t:Lcom/google/android/gms/internal/ads/z72;

    iget v1, v1, Lcom/google/android/gms/internal/ads/z72;->a:I

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/u72;->h:Lcom/google/android/gms/internal/ads/q82;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/o82;->a(ILcom/google/android/gms/internal/ads/q82;Z)Lcom/google/android/gms/internal/ads/q82;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/u72;->h:Lcom/google/android/gms/internal/ads/q82;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/q82;->a()J

    move-result-wide v0

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/u72;->t:Lcom/google/android/gms/internal/ads/z72;

    iget-wide v2, v2, Lcom/google/android/gms/internal/ads/z72;->c:J

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ads/p72;->a(J)J

    move-result-wide v2

    add-long/2addr v0, v2

    return-wide v0

    :cond_1
    :goto_0
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/u72;->v:J

    return-wide v0
.end method

.method public final a()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/u72;->e:Lcom/google/android/gms/internal/ads/w72;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/w72;->b()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/u72;->d:Lcom/google/android/gms/internal/ads/sk1;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    return-void
.end method

.method public final a(J)V
    .locals 10

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/u72;->b()I

    move-result v0

    if-ltz v0, :cond_5

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/u72;->o:Lcom/google/android/gms/internal/ads/o82;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/o82;->a()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/u72;->o:Lcom/google/android/gms/internal/ads/o82;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/o82;->b()I

    move-result v1

    if-ge v0, v1, :cond_5

    :cond_0
    iget v1, p0, Lcom/google/android/gms/internal/ads/u72;->l:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/google/android/gms/internal/ads/u72;->l:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/u72;->u:I

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/u72;->o:Lcom/google/android/gms/internal/ads/o82;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/o82;->a()Z

    move-result v1

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    if-nez v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/u72;->o:Lcom/google/android/gms/internal/ads/o82;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/u72;->g:Lcom/google/android/gms/internal/ads/p82;

    const/4 v5, 0x0

    invoke-virtual {v1, v0, v4, v5}, Lcom/google/android/gms/internal/ads/o82;->a(ILcom/google/android/gms/internal/ads/p82;Z)Lcom/google/android/gms/internal/ads/p82;

    cmp-long v1, p1, v2

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/u72;->g:Lcom/google/android/gms/internal/ads/p82;

    iget-wide v6, v1, Lcom/google/android/gms/internal/ads/p82;->h:J

    goto :goto_0

    :cond_1
    invoke-static {p1, p2}, Lcom/google/android/gms/internal/ads/p72;->b(J)J

    move-result-wide v6

    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/u72;->g:Lcom/google/android/gms/internal/ads/p82;

    iget-wide v8, v1, Lcom/google/android/gms/internal/ads/p82;->j:J

    add-long/2addr v8, v6

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/u72;->o:Lcom/google/android/gms/internal/ads/o82;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/u72;->h:Lcom/google/android/gms/internal/ads/q82;

    invoke-virtual {v1, v5, v4, v5}, Lcom/google/android/gms/internal/ads/o82;->a(ILcom/google/android/gms/internal/ads/q82;Z)Lcom/google/android/gms/internal/ads/q82;

    move-result-object v1

    iget-wide v4, v1, Lcom/google/android/gms/internal/ads/q82;->c:J

    cmp-long v1, v4, v2

    if-eqz v1, :cond_2

    cmp-long v1, v8, v4

    :cond_2
    cmp-long v1, p1, v2

    if-nez v1, :cond_3

    const-wide/16 p1, 0x0

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/u72;->v:J

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/u72;->e:Lcom/google/android/gms/internal/ads/w72;

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/u72;->o:Lcom/google/android/gms/internal/ads/o82;

    invoke-virtual {p1, p2, v0, v2, v3}, Lcom/google/android/gms/internal/ads/w72;->a(Lcom/google/android/gms/internal/ads/o82;IJ)V

    return-void

    :cond_3
    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/u72;->v:J

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/u72;->e:Lcom/google/android/gms/internal/ads/w72;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/u72;->o:Lcom/google/android/gms/internal/ads/o82;

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/ads/p72;->b(J)J

    move-result-wide p1

    invoke-virtual {v1, v2, v0, p1, p2}, Lcom/google/android/gms/internal/ads/w72;->a(Lcom/google/android/gms/internal/ads/o82;IJ)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/u72;->f:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/ads/q72;

    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/q72;->a()V

    goto :goto_1

    :cond_4
    return-void

    :cond_5
    new-instance v1, Lcom/google/android/gms/internal/ads/f82;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/u72;->o:Lcom/google/android/gms/internal/ads/o82;

    invoke-direct {v1, v2, v0, p1, p2}, Lcom/google/android/gms/internal/ads/f82;-><init>(Lcom/google/android/gms/internal/ads/o82;IJ)V

    throw v1
.end method

.method final a(Landroid/os/Message;)V
    .locals 3

    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x1

    packed-switch v0, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :pswitch_0
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lcom/google/android/gms/internal/ads/o72;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/u72;->f:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/q72;

    invoke-interface {v1, p1}, Lcom/google/android/gms/internal/ads/q72;->a(Lcom/google/android/gms/internal/ads/o72;)V

    goto :goto_0

    :cond_0
    return-void

    :pswitch_1
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lcom/google/android/gms/internal/ads/k82;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/u72;->s:Lcom/google/android/gms/internal/ads/k82;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/k82;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/u72;->s:Lcom/google/android/gms/internal/ads/k82;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/u72;->f:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/q72;

    invoke-interface {v1, p1}, Lcom/google/android/gms/internal/ads/q72;->a(Lcom/google/android/gms/internal/ads/k82;)V

    goto :goto_1

    :cond_1
    return-void

    :pswitch_2
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lcom/google/android/gms/internal/ads/b82;

    iget v0, p0, Lcom/google/android/gms/internal/ads/u72;->l:I

    iget v1, p1, Lcom/google/android/gms/internal/ads/b82;->d:I

    sub-int/2addr v0, v1

    iput v0, p0, Lcom/google/android/gms/internal/ads/u72;->l:I

    iget v0, p0, Lcom/google/android/gms/internal/ads/u72;->m:I

    if-nez v0, :cond_5

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/b82;->a:Lcom/google/android/gms/internal/ads/o82;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/u72;->o:Lcom/google/android/gms/internal/ads/o82;

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/b82;->b:Ljava/lang/Object;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/u72;->p:Ljava/lang/Object;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/b82;->c:Lcom/google/android/gms/internal/ads/z72;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/u72;->t:Lcom/google/android/gms/internal/ads/z72;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/u72;->f:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/q72;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/u72;->o:Lcom/google/android/gms/internal/ads/o82;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/u72;->p:Ljava/lang/Object;

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/ads/q72;->a(Lcom/google/android/gms/internal/ads/o82;Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    return-void

    :pswitch_3
    iget v0, p0, Lcom/google/android/gms/internal/ads/u72;->l:I

    if-nez v0, :cond_5

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lcom/google/android/gms/internal/ads/z72;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/u72;->t:Lcom/google/android/gms/internal/ads/z72;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/u72;->f:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/q72;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/q72;->a()V

    goto :goto_3

    :cond_3
    return-void

    :pswitch_4
    iget v0, p0, Lcom/google/android/gms/internal/ads/u72;->l:I

    sub-int/2addr v0, v1

    iput v0, p0, Lcom/google/android/gms/internal/ads/u72;->l:I

    if-nez v0, :cond_5

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/internal/ads/z72;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/u72;->t:Lcom/google/android/gms/internal/ads/z72;

    iget p1, p1, Landroid/os/Message;->arg1:I

    if-eqz p1, :cond_5

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/u72;->f:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/q72;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/q72;->a()V

    goto :goto_4

    :cond_4
    return-void

    :pswitch_5
    iget v0, p0, Lcom/google/android/gms/internal/ads/u72;->m:I

    if-nez v0, :cond_5

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lcom/google/android/gms/internal/ads/ue2;

    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/u72;->i:Z

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/ue2;->a:Lcom/google/android/gms/internal/ads/ee2;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/u72;->q:Lcom/google/android/gms/internal/ads/ee2;

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/ue2;->b:Lcom/google/android/gms/internal/ads/pe2;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/u72;->r:Lcom/google/android/gms/internal/ads/pe2;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/u72;->b:Lcom/google/android/gms/internal/ads/se2;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/ue2;->c:Ljava/lang/Object;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/se2;->a(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/u72;->f:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/q72;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/u72;->q:Lcom/google/android/gms/internal/ads/ee2;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/u72;->r:Lcom/google/android/gms/internal/ads/pe2;

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/ads/q72;->a(Lcom/google/android/gms/internal/ads/ee2;Lcom/google/android/gms/internal/ads/pe2;)V

    goto :goto_5

    :cond_5
    return-void

    :pswitch_6
    iget p1, p1, Landroid/os/Message;->arg1:I

    if-eqz p1, :cond_6

    goto :goto_6

    :cond_6
    const/4 v1, 0x0

    :goto_6
    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/u72;->n:Z

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/u72;->f:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_7
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/q72;

    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/u72;->n:Z

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/q72;->a(Z)V

    goto :goto_7

    :cond_7
    return-void

    :pswitch_7
    iget p1, p1, Landroid/os/Message;->arg1:I

    iput p1, p0, Lcom/google/android/gms/internal/ads/u72;->k:I

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/u72;->f:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_8
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/q72;

    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/u72;->j:Z

    iget v2, p0, Lcom/google/android/gms/internal/ads/u72;->k:I

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/ads/q72;->a(ZI)V

    goto :goto_8

    :cond_8
    return-void

    :pswitch_8
    iget p1, p0, Lcom/google/android/gms/internal/ads/u72;->m:I

    sub-int/2addr p1, v1

    iput p1, p0, Lcom/google/android/gms/internal/ads/u72;->m:I

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final a(Lcom/google/android/gms/internal/ads/nd2;)V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/u72;->o:Lcom/google/android/gms/internal/ads/o82;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/o82;->a()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/u72;->p:Ljava/lang/Object;

    if-eqz v0, :cond_1

    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/ads/o82;->a:Lcom/google/android/gms/internal/ads/o82;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/u72;->o:Lcom/google/android/gms/internal/ads/o82;

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/u72;->p:Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/u72;->f:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/ads/q72;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/u72;->o:Lcom/google/android/gms/internal/ads/o82;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/u72;->p:Ljava/lang/Object;

    invoke-interface {v2, v3, v4}, Lcom/google/android/gms/internal/ads/q72;->a(Lcom/google/android/gms/internal/ads/o82;Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/u72;->i:Z

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/u72;->i:Z

    sget-object v0, Lcom/google/android/gms/internal/ads/ee2;->d:Lcom/google/android/gms/internal/ads/ee2;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/u72;->q:Lcom/google/android/gms/internal/ads/ee2;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/u72;->c:Lcom/google/android/gms/internal/ads/pe2;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/u72;->r:Lcom/google/android/gms/internal/ads/pe2;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/u72;->b:Lcom/google/android/gms/internal/ads/se2;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/se2;->a(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/u72;->f:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/q72;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/u72;->q:Lcom/google/android/gms/internal/ads/ee2;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/u72;->r:Lcom/google/android/gms/internal/ads/pe2;

    invoke-interface {v1, v2, v3}, Lcom/google/android/gms/internal/ads/q72;->a(Lcom/google/android/gms/internal/ads/ee2;Lcom/google/android/gms/internal/ads/pe2;)V

    goto :goto_1

    :cond_2
    iget v0, p0, Lcom/google/android/gms/internal/ads/u72;->m:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/google/android/gms/internal/ads/u72;->m:I

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/u72;->e:Lcom/google/android/gms/internal/ads/w72;

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/ads/w72;->a(Lcom/google/android/gms/internal/ads/nd2;Z)V

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/q72;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/u72;->f:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public final a(Z)V
    .locals 3

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/u72;->j:Z

    if-eq v0, p1, :cond_0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/u72;->j:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/u72;->e:Lcom/google/android/gms/internal/ads/w72;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/w72;->a(Z)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/u72;->f:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/q72;

    iget v2, p0, Lcom/google/android/gms/internal/ads/u72;->k:I

    invoke-interface {v1, p1, v2}, Lcom/google/android/gms/internal/ads/q72;->a(ZI)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final varargs a([Lcom/google/android/gms/internal/ads/s72;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/u72;->e:Lcom/google/android/gms/internal/ads/w72;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/w72;->b([Lcom/google/android/gms/internal/ads/s72;)V

    return-void
.end method

.method public final b(Lcom/google/android/gms/internal/ads/q72;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/u72;->f:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final varargs b([Lcom/google/android/gms/internal/ads/s72;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/u72;->e:Lcom/google/android/gms/internal/ads/w72;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/w72;->a([Lcom/google/android/gms/internal/ads/s72;)V

    return-void
.end method

.method public final stop()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/u72;->e:Lcom/google/android/gms/internal/ads/w72;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/w72;->c()V

    return-void
.end method
