.class public final Lcom/google/android/gms/internal/ads/jd2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/md2;
.implements Lcom/google/android/gms/internal/ads/nd2;


# instance fields
.field private final b:Landroid/net/Uri;

.field private final c:Lcom/google/android/gms/internal/ads/xe2;

.field private final d:Lcom/google/android/gms/internal/ads/oa2;

.field private final e:I

.field private final f:Lcom/google/android/gms/internal/ads/sk1;

.field private final g:Lcom/google/android/gms/internal/ads/id2;

.field private final h:Lcom/google/android/gms/internal/ads/q82;

.field private final i:I

.field private j:Lcom/google/android/gms/internal/ads/md2;

.field private k:Lcom/google/android/gms/internal/ads/o82;

.field private l:Z


# direct methods
.method public constructor <init>(Landroid/net/Uri;Lcom/google/android/gms/internal/ads/xe2;Lcom/google/android/gms/internal/ads/oa2;ILcom/google/android/gms/internal/ads/sk1;Lcom/google/android/gms/internal/ads/id2;Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/jd2;->b:Landroid/net/Uri;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/jd2;->c:Lcom/google/android/gms/internal/ads/xe2;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/jd2;->d:Lcom/google/android/gms/internal/ads/oa2;

    iput p4, p0, Lcom/google/android/gms/internal/ads/jd2;->e:I

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/jd2;->f:Lcom/google/android/gms/internal/ads/sk1;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/jd2;->g:Lcom/google/android/gms/internal/ads/id2;

    iput p8, p0, Lcom/google/android/gms/internal/ads/jd2;->i:I

    new-instance p1, Lcom/google/android/gms/internal/ads/q82;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/q82;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/jd2;->h:Lcom/google/android/gms/internal/ads/q82;

    return-void
.end method


# virtual methods
.method public final a(ILcom/google/android/gms/internal/ads/we2;)Lcom/google/android/gms/internal/ads/ld2;
    .locals 11

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/mf2;->a(Z)V

    new-instance p1, Lcom/google/android/gms/internal/ads/ad2;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/jd2;->b:Landroid/net/Uri;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/jd2;->c:Lcom/google/android/gms/internal/ads/xe2;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/xe2;->a()Lcom/google/android/gms/internal/ads/ye2;

    move-result-object v2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/jd2;->d:Lcom/google/android/gms/internal/ads/oa2;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/oa2;->a()[Lcom/google/android/gms/internal/ads/na2;

    move-result-object v3

    iget v4, p0, Lcom/google/android/gms/internal/ads/jd2;->e:I

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/jd2;->f:Lcom/google/android/gms/internal/ads/sk1;

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/jd2;->g:Lcom/google/android/gms/internal/ads/id2;

    const/4 v9, 0x0

    iget v10, p0, Lcom/google/android/gms/internal/ads/jd2;->i:I

    move-object v0, p1

    move-object v7, p0

    move-object v8, p2

    invoke-direct/range {v0 .. v10}, Lcom/google/android/gms/internal/ads/ad2;-><init>(Landroid/net/Uri;Lcom/google/android/gms/internal/ads/ye2;[Lcom/google/android/gms/internal/ads/na2;ILcom/google/android/gms/internal/ads/sk1;Lcom/google/android/gms/internal/ads/id2;Lcom/google/android/gms/internal/ads/md2;Lcom/google/android/gms/internal/ads/we2;Ljava/lang/String;I)V

    return-object p1
.end method

.method public final a()V
    .locals 0

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/ld2;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/ads/ad2;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ad2;->g()V

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/o82;Ljava/lang/Object;)V
    .locals 5

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/jd2;->h:Lcom/google/android/gms/internal/ads/q82;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p2, v0}, Lcom/google/android/gms/internal/ads/o82;->a(ILcom/google/android/gms/internal/ads/q82;Z)Lcom/google/android/gms/internal/ads/q82;

    move-result-object p2

    iget-wide v1, p2, Lcom/google/android/gms/internal/ads/q82;->c:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p2, v1, v3

    if-eqz p2, :cond_0

    const/4 v0, 0x1

    :cond_0
    iget-boolean p2, p0, Lcom/google/android/gms/internal/ads/jd2;->l:Z

    if-eqz p2, :cond_1

    if-nez v0, :cond_1

    return-void

    :cond_1
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/jd2;->k:Lcom/google/android/gms/internal/ads/o82;

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/jd2;->l:Z

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/jd2;->j:Lcom/google/android/gms/internal/ads/md2;

    const/4 v0, 0x0

    invoke-interface {p2, p1, v0}, Lcom/google/android/gms/internal/ads/md2;->a(Lcom/google/android/gms/internal/ads/o82;Ljava/lang/Object;)V

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/r72;ZLcom/google/android/gms/internal/ads/md2;)V
    .locals 2

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/jd2;->j:Lcom/google/android/gms/internal/ads/md2;

    new-instance p1, Lcom/google/android/gms/internal/ads/be2;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    const/4 p2, 0x0

    invoke-direct {p1, v0, v1, p2}, Lcom/google/android/gms/internal/ads/be2;-><init>(JZ)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/jd2;->k:Lcom/google/android/gms/internal/ads/o82;

    const/4 p2, 0x0

    invoke-interface {p3, p1, p2}, Lcom/google/android/gms/internal/ads/md2;->a(Lcom/google/android/gms/internal/ads/o82;Ljava/lang/Object;)V

    return-void
.end method

.method public final b()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/jd2;->j:Lcom/google/android/gms/internal/ads/md2;

    return-void
.end method
