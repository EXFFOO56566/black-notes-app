.class public final Lcom/google/android/gms/internal/ads/bq2;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/oa;

.field private final b:Lcom/google/android/gms/ads/p;

.field private final c:Lcom/google/android/gms/internal/ads/nn2;

.field private d:Lcom/google/android/gms/internal/ads/jm2;

.field private e:Lcom/google/android/gms/ads/b;

.field private f:[Lcom/google/android/gms/ads/e;

.field private g:Lcom/google/android/gms/ads/r/a;

.field private h:Lcom/google/android/gms/internal/ads/eo2;

.field private i:Lcom/google/android/gms/ads/r/c;

.field private j:Lcom/google/android/gms/ads/q;

.field private k:Ljava/lang/String;

.field private l:Landroid/view/ViewGroup;

.field private m:I

.field private n:Z

.field private o:Lcom/google/android/gms/ads/l;


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;I)V
    .locals 6

    sget-object v4, Lcom/google/android/gms/internal/ads/sm2;->a:Lcom/google/android/gms/internal/ads/sm2;

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/bq2;-><init>(Landroid/view/ViewGroup;Landroid/util/AttributeSet;ZLcom/google/android/gms/internal/ads/sm2;I)V

    return-void
.end method

.method public constructor <init>(Landroid/view/ViewGroup;Landroid/util/AttributeSet;ZI)V
    .locals 6

    sget-object v4, Lcom/google/android/gms/internal/ads/sm2;->a:Lcom/google/android/gms/internal/ads/sm2;

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/bq2;-><init>(Landroid/view/ViewGroup;Landroid/util/AttributeSet;ZLcom/google/android/gms/internal/ads/sm2;I)V

    return-void
.end method

.method private constructor <init>(Landroid/view/ViewGroup;Landroid/util/AttributeSet;ZLcom/google/android/gms/internal/ads/sm2;I)V
    .locals 7

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-object v4, p4

    move v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/bq2;-><init>(Landroid/view/ViewGroup;Landroid/util/AttributeSet;ZLcom/google/android/gms/internal/ads/sm2;Lcom/google/android/gms/internal/ads/eo2;I)V

    return-void
.end method

.method private constructor <init>(Landroid/view/ViewGroup;Landroid/util/AttributeSet;ZLcom/google/android/gms/internal/ads/sm2;Lcom/google/android/gms/internal/ads/eo2;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p4, Lcom/google/android/gms/internal/ads/oa;

    invoke-direct {p4}, Lcom/google/android/gms/internal/ads/oa;-><init>()V

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/bq2;->a:Lcom/google/android/gms/internal/ads/oa;

    new-instance p4, Lcom/google/android/gms/ads/p;

    invoke-direct {p4}, Lcom/google/android/gms/ads/p;-><init>()V

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/bq2;->b:Lcom/google/android/gms/ads/p;

    new-instance p4, Lcom/google/android/gms/internal/ads/aq2;

    invoke-direct {p4, p0}, Lcom/google/android/gms/internal/ads/aq2;-><init>(Lcom/google/android/gms/internal/ads/bq2;)V

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/bq2;->c:Lcom/google/android/gms/internal/ads/nn2;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/bq2;->l:Landroid/view/ViewGroup;

    const/4 p4, 0x0

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/bq2;->h:Lcom/google/android/gms/internal/ads/eo2;

    new-instance p4, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p5, 0x0

    invoke-direct {p4, p5}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput p6, p0, Lcom/google/android/gms/internal/ads/bq2;->m:I

    if-eqz p2, :cond_1

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p4

    :try_start_0
    new-instance p6, Lcom/google/android/gms/internal/ads/dn2;

    invoke-direct {p6, p4, p2}, Lcom/google/android/gms/internal/ads/dn2;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    invoke-virtual {p6, p3}, Lcom/google/android/gms/internal/ads/dn2;->a(Z)[Lcom/google/android/gms/ads/e;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/bq2;->f:[Lcom/google/android/gms/ads/e;

    invoke-virtual {p6}, Lcom/google/android/gms/internal/ads/dn2;->a()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/bq2;->k:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {p1}, Landroid/view/ViewGroup;->isInEditMode()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->a()Lcom/google/android/gms/internal/ads/sn;

    move-result-object p2

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/bq2;->f:[Lcom/google/android/gms/ads/e;

    aget-object p3, p3, p5

    iget p5, p0, Lcom/google/android/gms/internal/ads/bq2;->m:I

    sget-object p6, Lcom/google/android/gms/ads/e;->o:Lcom/google/android/gms/ads/e;

    invoke-virtual {p3, p6}, Lcom/google/android/gms/ads/e;->equals(Ljava/lang/Object;)Z

    move-result p6

    if-eqz p6, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/ads/um2;->j()Lcom/google/android/gms/internal/ads/um2;

    move-result-object p3

    goto :goto_0

    :cond_0
    new-instance p6, Lcom/google/android/gms/internal/ads/um2;

    invoke-direct {p6, p4, p3}, Lcom/google/android/gms/internal/ads/um2;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/e;)V

    invoke-static {p5}, Lcom/google/android/gms/internal/ads/bq2;->a(I)Z

    move-result p3

    iput-boolean p3, p6, Lcom/google/android/gms/internal/ads/um2;->k:Z

    move-object p3, p6

    :goto_0
    const-string p4, "Ads by Google"

    invoke-virtual {p2, p1, p3, p4}, Lcom/google/android/gms/internal/ads/sn;->a(Landroid/view/ViewGroup;Lcom/google/android/gms/internal/ads/um2;Ljava/lang/String;)V

    goto :goto_1

    :catch_0
    move-exception p2

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->a()Lcom/google/android/gms/internal/ads/sn;

    move-result-object p3

    new-instance p5, Lcom/google/android/gms/internal/ads/um2;

    sget-object p6, Lcom/google/android/gms/ads/e;->g:Lcom/google/android/gms/ads/e;

    invoke-direct {p5, p4, p6}, Lcom/google/android/gms/internal/ads/um2;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/e;)V

    invoke-virtual {p2}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p2}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p1, p5, p4, p2}, Lcom/google/android/gms/internal/ads/sn;->a(Landroid/view/ViewGroup;Lcom/google/android/gms/internal/ads/um2;Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    :goto_1
    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/bq2;)Lcom/google/android/gms/ads/p;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/bq2;->b:Lcom/google/android/gms/ads/p;

    return-object p0
.end method

.method private static a(Landroid/content/Context;[Lcom/google/android/gms/ads/e;I)Lcom/google/android/gms/internal/ads/um2;
    .locals 4

    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    aget-object v2, p1, v1

    sget-object v3, Lcom/google/android/gms/ads/e;->o:Lcom/google/android/gms/ads/e;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/ads/e;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/ads/um2;->j()Lcom/google/android/gms/internal/ads/um2;

    move-result-object p0

    return-object p0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    new-instance v0, Lcom/google/android/gms/internal/ads/um2;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ads/um2;-><init>(Landroid/content/Context;[Lcom/google/android/gms/ads/e;)V

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/bq2;->a(I)Z

    move-result p0

    iput-boolean p0, v0, Lcom/google/android/gms/internal/ads/um2;->k:Z

    return-object v0
.end method

.method private static a(I)Z
    .locals 1

    const/4 v0, 0x1

    if-ne p0, v0, :cond_0

    return v0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final a()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bq2;->h:Lcom/google/android/gms/internal/ads/eo2;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bq2;->h:Lcom/google/android/gms/internal/ads/eo2;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/eo2;->destroy()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "#007 Could not call remote method."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/co;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final a(Lcom/google/android/gms/ads/b;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/bq2;->e:Lcom/google/android/gms/ads/b;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bq2;->c:Lcom/google/android/gms/internal/ads/nn2;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/nn2;->a(Lcom/google/android/gms/ads/b;)V

    return-void
.end method

.method public final a(Lcom/google/android/gms/ads/l;)V
    .locals 2

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/bq2;->o:Lcom/google/android/gms/ads/l;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bq2;->h:Lcom/google/android/gms/internal/ads/eo2;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bq2;->h:Lcom/google/android/gms/internal/ads/eo2;

    new-instance v1, Lcom/google/android/gms/internal/ads/zq2;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/ads/zq2;-><init>(Lcom/google/android/gms/ads/l;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/eo2;->a(Lcom/google/android/gms/internal/ads/lp2;)V
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

.method public final a(Lcom/google/android/gms/ads/q;)V
    .locals 2

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/bq2;->j:Lcom/google/android/gms/ads/q;

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bq2;->h:Lcom/google/android/gms/internal/ads/eo2;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bq2;->h:Lcom/google/android/gms/internal/ads/eo2;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/google/android/gms/internal/ads/er2;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/ads/er2;-><init>(Lcom/google/android/gms/ads/q;)V

    move-object p1, v1

    :goto_0
    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/eo2;->a(Lcom/google/android/gms/internal/ads/er2;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    return-void

    :catch_0
    move-exception p1

    const-string v0, "#007 Could not call remote method."

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/co;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final a(Lcom/google/android/gms/ads/r/a;)V
    .locals 2

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/bq2;->g:Lcom/google/android/gms/ads/r/a;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bq2;->h:Lcom/google/android/gms/internal/ads/eo2;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bq2;->h:Lcom/google/android/gms/internal/ads/eo2;

    if-eqz p1, :cond_0

    new-instance v1, Lcom/google/android/gms/internal/ads/ym2;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/ads/ym2;-><init>(Lcom/google/android/gms/ads/r/a;)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/eo2;->a(Lcom/google/android/gms/internal/ads/no2;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    return-void

    :catch_0
    move-exception p1

    const-string v0, "#007 Could not call remote method."

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/co;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final a(Lcom/google/android/gms/ads/r/c;)V
    .locals 2

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/bq2;->i:Lcom/google/android/gms/ads/r/c;

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bq2;->h:Lcom/google/android/gms/internal/ads/eo2;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bq2;->h:Lcom/google/android/gms/internal/ads/eo2;

    if-eqz p1, :cond_0

    new-instance v1, Lcom/google/android/gms/internal/ads/z;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/ads/z;-><init>(Lcom/google/android/gms/ads/r/c;)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/eo2;->a(Lcom/google/android/gms/internal/ads/u;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    return-void

    :catch_0
    move-exception p1

    const-string v0, "#007 Could not call remote method."

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/co;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/jm2;)V
    .locals 2

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/bq2;->d:Lcom/google/android/gms/internal/ads/jm2;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bq2;->h:Lcom/google/android/gms/internal/ads/eo2;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bq2;->h:Lcom/google/android/gms/internal/ads/eo2;

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

    const-string v0, "#007 Could not call remote method."

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/co;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/zp2;)V
    .locals 10

    const-string v0, "#007 Could not call remote method."

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/bq2;->h:Lcom/google/android/gms/internal/ads/eo2;

    if-nez v1, :cond_9

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/bq2;->f:[Lcom/google/android/gms/ads/e;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/bq2;->k:Ljava/lang/String;

    if-nez v1, :cond_1

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/bq2;->h:Lcom/google/android/gms/internal/ads/eo2;

    if-eqz v1, :cond_8

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/bq2;->l:Landroid/view/ViewGroup;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/bq2;->f:[Lcom/google/android/gms/ads/e;

    iget v3, p0, Lcom/google/android/gms/internal/ads/bq2;->m:I

    invoke-static {v1, v2, v3}, Lcom/google/android/gms/internal/ads/bq2;->a(Landroid/content/Context;[Lcom/google/android/gms/ads/e;I)Lcom/google/android/gms/internal/ads/um2;

    move-result-object v5

    const-string v2, "search_v2"

    iget-object v3, v5, Lcom/google/android/gms/internal/ads/um2;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const/4 v8, 0x0

    if-eqz v2, :cond_2

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->b()Lcom/google/android/gms/internal/ads/cn2;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/bq2;->k:Ljava/lang/String;

    new-instance v4, Lcom/google/android/gms/internal/ads/in2;

    invoke-direct {v4, v2, v1, v5, v3}, Lcom/google/android/gms/internal/ads/in2;-><init>(Lcom/google/android/gms/internal/ads/cn2;Landroid/content/Context;Lcom/google/android/gms/internal/ads/um2;Ljava/lang/String;)V

    invoke-virtual {v4, v1, v8}, Lcom/google/android/gms/internal/ads/ln2;->a(Landroid/content/Context;Z)Ljava/lang/Object;

    move-result-object v1

    :goto_0
    check-cast v1, Lcom/google/android/gms/internal/ads/eo2;

    goto :goto_1

    :cond_2
    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->b()Lcom/google/android/gms/internal/ads/cn2;

    move-result-object v3

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/bq2;->k:Ljava/lang/String;

    iget-object v7, p0, Lcom/google/android/gms/internal/ads/bq2;->a:Lcom/google/android/gms/internal/ads/oa;

    new-instance v9, Lcom/google/android/gms/internal/ads/en2;

    move-object v2, v9

    move-object v4, v1

    invoke-direct/range {v2 .. v7}, Lcom/google/android/gms/internal/ads/en2;-><init>(Lcom/google/android/gms/internal/ads/cn2;Landroid/content/Context;Lcom/google/android/gms/internal/ads/um2;Ljava/lang/String;Lcom/google/android/gms/internal/ads/ra;)V

    invoke-virtual {v9, v1, v8}, Lcom/google/android/gms/internal/ads/ln2;->a(Landroid/content/Context;Z)Ljava/lang/Object;

    move-result-object v1

    goto :goto_0

    :goto_1
    iput-object v1, p0, Lcom/google/android/gms/internal/ads/bq2;->h:Lcom/google/android/gms/internal/ads/eo2;

    new-instance v2, Lcom/google/android/gms/internal/ads/nm2;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/bq2;->c:Lcom/google/android/gms/internal/ads/nn2;

    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/ads/nm2;-><init>(Lcom/google/android/gms/ads/b;)V

    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/ads/eo2;->a(Lcom/google/android/gms/internal/ads/rn2;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/bq2;->d:Lcom/google/android/gms/internal/ads/jm2;

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/bq2;->h:Lcom/google/android/gms/internal/ads/eo2;

    new-instance v2, Lcom/google/android/gms/internal/ads/im2;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/bq2;->d:Lcom/google/android/gms/internal/ads/jm2;

    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/ads/im2;-><init>(Lcom/google/android/gms/internal/ads/jm2;)V

    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/ads/eo2;->a(Lcom/google/android/gms/internal/ads/qn2;)V

    :cond_3
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/bq2;->g:Lcom/google/android/gms/ads/r/a;

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/bq2;->h:Lcom/google/android/gms/internal/ads/eo2;

    new-instance v2, Lcom/google/android/gms/internal/ads/ym2;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/bq2;->g:Lcom/google/android/gms/ads/r/a;

    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/ads/ym2;-><init>(Lcom/google/android/gms/ads/r/a;)V

    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/ads/eo2;->a(Lcom/google/android/gms/internal/ads/no2;)V

    :cond_4
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/bq2;->i:Lcom/google/android/gms/ads/r/c;

    if-eqz v1, :cond_5

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/bq2;->h:Lcom/google/android/gms/internal/ads/eo2;

    new-instance v2, Lcom/google/android/gms/internal/ads/z;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/bq2;->i:Lcom/google/android/gms/ads/r/c;

    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/ads/z;-><init>(Lcom/google/android/gms/ads/r/c;)V

    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/ads/eo2;->a(Lcom/google/android/gms/internal/ads/u;)V

    :cond_5
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/bq2;->j:Lcom/google/android/gms/ads/q;

    if-eqz v1, :cond_6

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/bq2;->h:Lcom/google/android/gms/internal/ads/eo2;

    new-instance v2, Lcom/google/android/gms/internal/ads/er2;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/bq2;->j:Lcom/google/android/gms/ads/q;

    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/ads/er2;-><init>(Lcom/google/android/gms/ads/q;)V

    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/ads/eo2;->a(Lcom/google/android/gms/internal/ads/er2;)V

    :cond_6
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/bq2;->h:Lcom/google/android/gms/internal/ads/eo2;

    new-instance v2, Lcom/google/android/gms/internal/ads/zq2;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/bq2;->o:Lcom/google/android/gms/ads/l;

    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/ads/zq2;-><init>(Lcom/google/android/gms/ads/l;)V

    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/ads/eo2;->a(Lcom/google/android/gms/internal/ads/lp2;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/bq2;->h:Lcom/google/android/gms/internal/ads/eo2;

    iget-boolean v2, p0, Lcom/google/android/gms/internal/ads/bq2;->n:Z

    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/ads/eo2;->c(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/bq2;->h:Lcom/google/android/gms/internal/ads/eo2;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/eo2;->m1()Lb/c/b/a/d/a;

    move-result-object v1

    if-nez v1, :cond_7

    goto :goto_2

    :cond_7
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/bq2;->l:Landroid/view/ViewGroup;

    invoke-static {v1}, Lb/c/b/a/d/b;->Q(Lb/c/b/a/d/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :catch_0
    move-exception v1

    :try_start_2
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/co;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2

    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "The ad size and ad unit ID must be set before loadAd is called."

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    :goto_2
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/bq2;->h:Lcom/google/android/gms/internal/ads/eo2;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/bq2;->l:Landroid/view/ViewGroup;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2, p1}, Lcom/google/android/gms/internal/ads/sm2;->a(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zp2;)Lcom/google/android/gms/internal/ads/rm2;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/ads/eo2;->a(Lcom/google/android/gms/internal/ads/rm2;)Z

    move-result v1

    if-eqz v1, :cond_a

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/bq2;->a:Lcom/google/android/gms/internal/ads/oa;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zp2;->n()Ljava/util/Map;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/oa;->a(Ljava/util/Map;)V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_1

    :cond_a
    return-void

    :catch_1
    move-exception p1

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/co;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bq2;->k:Ljava/lang/String;

    if-nez v0, :cond_0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/bq2;->k:Ljava/lang/String;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "The ad unit ID can only be set once on AdView."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final a(Z)V
    .locals 1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/bq2;->n:Z

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bq2;->h:Lcom/google/android/gms/internal/ads/eo2;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bq2;->h:Lcom/google/android/gms/internal/ads/eo2;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/eo2;->c(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-void

    :catch_0
    move-exception p1

    const-string v0, "#007 Could not call remote method."

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/co;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final varargs a([Lcom/google/android/gms/ads/e;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bq2;->f:[Lcom/google/android/gms/ads/e;

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/bq2;->b([Lcom/google/android/gms/ads/e;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "The ad size can only be set once on AdView."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final b()Lcom/google/android/gms/ads/b;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bq2;->e:Lcom/google/android/gms/ads/b;

    return-object v0
.end method

.method public final varargs b([Lcom/google/android/gms/ads/e;)V
    .locals 3

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/bq2;->f:[Lcom/google/android/gms/ads/e;

    :try_start_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/bq2;->h:Lcom/google/android/gms/internal/ads/eo2;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/bq2;->h:Lcom/google/android/gms/internal/ads/eo2;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bq2;->l:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/bq2;->f:[Lcom/google/android/gms/ads/e;

    iget v2, p0, Lcom/google/android/gms/internal/ads/bq2;->m:I

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/bq2;->a(Landroid/content/Context;[Lcom/google/android/gms/ads/e;I)Lcom/google/android/gms/internal/ads/um2;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/ads/eo2;->a(Lcom/google/android/gms/internal/ads/um2;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v0, "#007 Could not call remote method."

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/co;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/bq2;->l:Landroid/view/ViewGroup;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->requestLayout()V

    return-void
.end method

.method public final c()Lcom/google/android/gms/ads/e;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bq2;->h:Lcom/google/android/gms/internal/ads/eo2;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bq2;->h:Lcom/google/android/gms/internal/ads/eo2;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/eo2;->Z1()Lcom/google/android/gms/internal/ads/um2;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/um2;->d()Lcom/google/android/gms/ads/e;

    move-result-object v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    const-string v1, "#007 Could not call remote method."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/co;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bq2;->f:[Lcom/google/android/gms/ads/e;

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    aget-object v0, v0, v1

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public final d()[Lcom/google/android/gms/ads/e;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bq2;->f:[Lcom/google/android/gms/ads/e;

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bq2;->k:Ljava/lang/String;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bq2;->h:Lcom/google/android/gms/internal/ads/eo2;

    if-eqz v0, :cond_0

    :try_start_0
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/eo2;->D1()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/bq2;->k:Ljava/lang/String;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "#007 Could not call remote method."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/co;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bq2;->k:Ljava/lang/String;

    return-object v0
.end method

.method public final f()Lcom/google/android/gms/ads/r/a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bq2;->g:Lcom/google/android/gms/ads/r/a;

    return-object v0
.end method

.method public final g()Ljava/lang/String;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bq2;->h:Lcom/google/android/gms/internal/ads/eo2;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bq2;->h:Lcom/google/android/gms/internal/ads/eo2;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/eo2;->V()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    const-string v1, "#007 Could not call remote method."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/co;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final h()Lcom/google/android/gms/ads/r/c;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bq2;->i:Lcom/google/android/gms/ads/r/c;

    return-object v0
.end method

.method public final i()Lcom/google/android/gms/ads/o;
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/bq2;->h:Lcom/google/android/gms/internal/ads/eo2;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/bq2;->h:Lcom/google/android/gms/internal/ads/eo2;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/eo2;->j()Lcom/google/android/gms/internal/ads/mp2;

    move-result-object v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v2, "#007 Could not call remote method."

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/ads/co;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/ads/o;->a(Lcom/google/android/gms/internal/ads/mp2;)Lcom/google/android/gms/ads/o;

    move-result-object v0

    return-object v0
.end method

.method public final j()Lcom/google/android/gms/ads/p;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bq2;->b:Lcom/google/android/gms/ads/p;

    return-object v0
.end method

.method public final k()Lcom/google/android/gms/ads/q;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bq2;->j:Lcom/google/android/gms/ads/q;

    return-object v0
.end method

.method public final l()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bq2;->h:Lcom/google/android/gms/internal/ads/eo2;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bq2;->h:Lcom/google/android/gms/internal/ads/eo2;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/eo2;->p()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "#007 Could not call remote method."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/co;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final m()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bq2;->h:Lcom/google/android/gms/internal/ads/eo2;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bq2;->h:Lcom/google/android/gms/internal/ads/eo2;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/eo2;->z()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "#007 Could not call remote method."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/co;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final n()Lcom/google/android/gms/internal/ads/rp2;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bq2;->h:Lcom/google/android/gms/internal/ads/eo2;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    :try_start_0
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/eo2;->getVideoController()Lcom/google/android/gms/internal/ads/rp2;

    move-result-object v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    const-string v2, "#007 Could not call remote method."

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/ads/co;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v1
.end method
