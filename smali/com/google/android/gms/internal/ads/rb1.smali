.class public final Lcom/google/android/gms/internal/ads/rb1;
.super Lcom/google/android/gms/ads/x/a;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/u50;
.implements Lcom/google/android/gms/internal/ads/a60;
.implements Lcom/google/android/gms/internal/ads/j60;
.implements Lcom/google/android/gms/internal/ads/l70;
.implements Lcom/google/android/gms/internal/ads/b80;
.implements Lcom/google/android/gms/internal/ads/jb1;


# instance fields
.field private final b:Lcom/google/android/gms/internal/ads/df1;

.field private final c:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lcom/google/android/gms/ads/x/a;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lcom/google/android/gms/internal/ads/di;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lcom/google/android/gms/internal/ads/bi;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lcom/google/android/gms/internal/ads/eh;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lcom/google/android/gms/internal/ads/gi;",
            ">;"
        }
    .end annotation
.end field

.field private final h:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lcom/google/android/gms/internal/ads/zg;",
            ">;"
        }
    .end annotation
.end field

.field private final i:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lcom/google/android/gms/internal/ads/lp2;",
            ">;"
        }
    .end annotation
.end field

.field private j:Lcom/google/android/gms/internal/ads/rb1;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/df1;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/ads/x/a;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/rb1;->c:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/rb1;->d:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/rb1;->e:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/rb1;->f:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/rb1;->g:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/rb1;->h:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/rb1;->i:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/rb1;->j:Lcom/google/android/gms/internal/ads/rb1;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/rb1;->b:Lcom/google/android/gms/internal/ads/df1;

    return-void
.end method

.method public static a(Lcom/google/android/gms/internal/ads/rb1;)Lcom/google/android/gms/internal/ads/rb1;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/rb1;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/rb1;->b:Lcom/google/android/gms/internal/ads/df1;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/rb1;-><init>(Lcom/google/android/gms/internal/ads/df1;)V

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/ads/rb1;->a(Lcom/google/android/gms/internal/ads/jb1;)V

    return-object v0
.end method


# virtual methods
.method public final A()V
    .locals 2

    move-object v0, p0

    :goto_0
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/rb1;->j:Lcom/google/android/gms/internal/ads/rb1;

    if-eqz v1, :cond_0

    move-object v0, v1

    goto :goto_0

    :cond_0
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/rb1;->f:Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v1, Lcom/google/android/gms/internal/ads/bc1;->a:Lcom/google/android/gms/internal/ads/bb1;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/cb1;->a(Ljava/util/concurrent/atomic/AtomicReference;Lcom/google/android/gms/internal/ads/bb1;)V

    return-void
.end method

.method public final B()V
    .locals 3

    move-object v0, p0

    :goto_0
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/rb1;->j:Lcom/google/android/gms/internal/ads/rb1;

    if-eqz v1, :cond_0

    move-object v0, v1

    goto :goto_0

    :cond_0
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/rb1;->e:Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v2, Lcom/google/android/gms/internal/ads/hc1;->a:Lcom/google/android/gms/internal/ads/bb1;

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/cb1;->a(Ljava/util/concurrent/atomic/AtomicReference;Lcom/google/android/gms/internal/ads/bb1;)V

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/rb1;->f:Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v1, Lcom/google/android/gms/internal/ads/gc1;->a:Lcom/google/android/gms/internal/ads/bb1;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/cb1;->a(Ljava/util/concurrent/atomic/AtomicReference;Lcom/google/android/gms/internal/ads/bb1;)V

    return-void
.end method

.method public final G()V
    .locals 2

    move-object v0, p0

    :goto_0
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/rb1;->j:Lcom/google/android/gms/internal/ads/rb1;

    if-eqz v1, :cond_0

    move-object v0, v1

    goto :goto_0

    :cond_0
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/rb1;->f:Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v1, Lcom/google/android/gms/internal/ads/lc1;->a:Lcom/google/android/gms/internal/ads/bb1;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/cb1;->a(Ljava/util/concurrent/atomic/AtomicReference;Lcom/google/android/gms/internal/ads/bb1;)V

    return-void
.end method

.method public final a()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/rb1;->j:Lcom/google/android/gms/internal/ads/rb1;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/rb1;->a()V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/rb1;->c:Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v1, Lcom/google/android/gms/internal/ads/dc1;->a:Lcom/google/android/gms/internal/ads/bb1;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/cb1;->a(Ljava/util/concurrent/atomic/AtomicReference;Lcom/google/android/gms/internal/ads/bb1;)V

    return-void
.end method

.method public final a(I)V
    .locals 3

    move-object v0, p0

    :goto_0
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/rb1;->j:Lcom/google/android/gms/internal/ads/rb1;

    if-eqz v1, :cond_0

    move-object v0, v1

    goto :goto_0

    :cond_0
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/rb1;->d:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v2, Lcom/google/android/gms/internal/ads/fc1;

    invoke-direct {v2, p1}, Lcom/google/android/gms/internal/ads/fc1;-><init>(I)V

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/cb1;->a(Ljava/util/concurrent/atomic/AtomicReference;Lcom/google/android/gms/internal/ads/bb1;)V

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/rb1;->f:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v1, Lcom/google/android/gms/internal/ads/ec1;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/ads/ec1;-><init>(I)V

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/cb1;->a(Ljava/util/concurrent/atomic/AtomicReference;Lcom/google/android/gms/internal/ads/bb1;)V

    return-void
.end method

.method public final a(Lcom/google/android/gms/ads/x/a;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/rb1;->c:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/bi;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/rb1;->e:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/di;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/rb1;->d:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/eh;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/rb1;->f:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/gi;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/rb1;->g:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/jb1;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/ads/rb1;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/rb1;->j:Lcom/google/android/gms/internal/ads/rb1;

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/lp2;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/rb1;->i:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/ug;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    move-object v0, p0

    :goto_0
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/rb1;->j:Lcom/google/android/gms/internal/ads/rb1;

    if-eqz v1, :cond_0

    move-object v0, v1

    goto :goto_0

    :cond_0
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/rb1;->e:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v2, Lcom/google/android/gms/internal/ads/xb1;

    invoke-direct {v2, p1}, Lcom/google/android/gms/internal/ads/xb1;-><init>(Lcom/google/android/gms/internal/ads/ug;)V

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/cb1;->a(Ljava/util/concurrent/atomic/AtomicReference;Lcom/google/android/gms/internal/ads/bb1;)V

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/rb1;->g:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v2, Lcom/google/android/gms/internal/ads/wb1;

    invoke-direct {v2, p1, p2, p3}, Lcom/google/android/gms/internal/ads/wb1;-><init>(Lcom/google/android/gms/internal/ads/ug;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/cb1;->a(Ljava/util/concurrent/atomic/AtomicReference;Lcom/google/android/gms/internal/ads/bb1;)V

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/rb1;->f:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v2, Lcom/google/android/gms/internal/ads/zb1;

    invoke-direct {v2, p1}, Lcom/google/android/gms/internal/ads/zb1;-><init>(Lcom/google/android/gms/internal/ads/ug;)V

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/cb1;->a(Ljava/util/concurrent/atomic/AtomicReference;Lcom/google/android/gms/internal/ads/bb1;)V

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/rb1;->h:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v1, Lcom/google/android/gms/internal/ads/yb1;

    invoke-direct {v1, p1, p2, p3}, Lcom/google/android/gms/internal/ads/yb1;-><init>(Lcom/google/android/gms/internal/ads/ug;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/cb1;->a(Ljava/util/concurrent/atomic/AtomicReference;Lcom/google/android/gms/internal/ads/bb1;)V

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/wm2;)V
    .locals 2

    move-object v0, p0

    :goto_0
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/rb1;->j:Lcom/google/android/gms/internal/ads/rb1;

    if-eqz v1, :cond_0

    move-object v0, v1

    goto :goto_0

    :cond_0
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/rb1;->i:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v1, Lcom/google/android/gms/internal/ads/cc1;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/ads/cc1;-><init>(Lcom/google/android/gms/internal/ads/wm2;)V

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/cb1;->a(Ljava/util/concurrent/atomic/AtomicReference;Lcom/google/android/gms/internal/ads/bb1;)V

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/zg;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/rb1;->h:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    return-void
.end method

.method public final d(I)V
    .locals 2

    move-object v0, p0

    :goto_0
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/rb1;->j:Lcom/google/android/gms/internal/ads/rb1;

    if-eqz v1, :cond_0

    move-object v0, v1

    goto :goto_0

    :cond_0
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/rb1;->e:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v1, Lcom/google/android/gms/internal/ads/ac1;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/ads/ac1;-><init>(I)V

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/cb1;->a(Ljava/util/concurrent/atomic/AtomicReference;Lcom/google/android/gms/internal/ads/bb1;)V

    return-void
.end method

.method public final s()V
    .locals 3

    move-object v0, p0

    :goto_0
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/rb1;->j:Lcom/google/android/gms/internal/ads/rb1;

    if-eqz v1, :cond_0

    move-object v0, v1

    goto :goto_0

    :cond_0
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/rb1;->d:Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v2, Lcom/google/android/gms/internal/ads/vb1;->a:Lcom/google/android/gms/internal/ads/bb1;

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/cb1;->a(Ljava/util/concurrent/atomic/AtomicReference;Lcom/google/android/gms/internal/ads/bb1;)V

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/rb1;->f:Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v1, Lcom/google/android/gms/internal/ads/ub1;->a:Lcom/google/android/gms/internal/ads/bb1;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/cb1;->a(Ljava/util/concurrent/atomic/AtomicReference;Lcom/google/android/gms/internal/ads/bb1;)V

    return-void
.end method

.method public final x()V
    .locals 3

    move-object v0, p0

    :goto_0
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/rb1;->j:Lcom/google/android/gms/internal/ads/rb1;

    if-eqz v1, :cond_0

    move-object v0, v1

    goto :goto_0

    :cond_0
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/rb1;->b:Lcom/google/android/gms/internal/ads/df1;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/df1;->a()V

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/rb1;->e:Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v2, Lcom/google/android/gms/internal/ads/jc1;->a:Lcom/google/android/gms/internal/ads/bb1;

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/cb1;->a(Ljava/util/concurrent/atomic/AtomicReference;Lcom/google/android/gms/internal/ads/bb1;)V

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/rb1;->f:Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v1, Lcom/google/android/gms/internal/ads/ic1;->a:Lcom/google/android/gms/internal/ads/bb1;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/cb1;->a(Ljava/util/concurrent/atomic/AtomicReference;Lcom/google/android/gms/internal/ads/bb1;)V

    return-void
.end method

.method public final y()V
    .locals 2

    move-object v0, p0

    :goto_0
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/rb1;->j:Lcom/google/android/gms/internal/ads/rb1;

    if-eqz v1, :cond_0

    move-object v0, v1

    goto :goto_0

    :cond_0
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/rb1;->f:Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v1, Lcom/google/android/gms/internal/ads/kc1;->a:Lcom/google/android/gms/internal/ads/bb1;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/cb1;->a(Ljava/util/concurrent/atomic/AtomicReference;Lcom/google/android/gms/internal/ads/bb1;)V

    return-void
.end method
