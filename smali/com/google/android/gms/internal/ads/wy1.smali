.class final Lcom/google/android/gms/internal/ads/wy1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/t12;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/ty1;

.field private b:I

.field private c:I

.field private d:I


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ads/ty1;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/ads/wy1;->d:I

    const-string v0, "input"

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/uz1;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast p1, Lcom/google/android/gms/internal/ads/ty1;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    iput-object p0, p1, Lcom/google/android/gms/internal/ads/ty1;->d:Lcom/google/android/gms/internal/ads/wy1;

    return-void
.end method

.method public static a(Lcom/google/android/gms/internal/ads/ty1;)Lcom/google/android/gms/internal/ads/wy1;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ty1;->d:Lcom/google/android/gms/internal/ads/wy1;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/ads/wy1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/wy1;-><init>(Lcom/google/android/gms/internal/ads/ty1;)V

    return-object v0
.end method

.method private final a(Lcom/google/android/gms/internal/ads/f32;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/dz1;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/f32;",
            "Ljava/lang/Class<",
            "*>;",
            "Lcom/google/android/gms/internal/ads/dz1;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/internal/ads/yy1;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "unsupported field type."

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/wy1;->b()J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/wy1;->k()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/wy1;->r()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_3
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/wy1;->h()J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    :pswitch_4
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/wy1;->a()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_5
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/wy1;->f()J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    :pswitch_6
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/wy1;->t()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_7
    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/wy1;->a(I)V

    invoke-static {}, Lcom/google/android/gms/internal/ads/n12;->a()Lcom/google/android/gms/internal/ads/n12;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/n12;->a(Ljava/lang/Class;)Lcom/google/android/gms/internal/ads/z12;

    move-result-object p1

    invoke-direct {p0, p1, p3}, Lcom/google/android/gms/internal/ads/wy1;->c(Lcom/google/android/gms/internal/ads/z12;Lcom/google/android/gms/internal/ads/dz1;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_8
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/wy1;->l()J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    :pswitch_9
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/wy1;->q()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_a
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/wy1;->p()F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1

    :pswitch_b
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/wy1;->e()J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    :pswitch_c
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/wy1;->j()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_d
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/wy1;->o()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_e
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/wy1;->n()D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    return-object p1

    :pswitch_f
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/wy1;->d()Lcom/google/android/gms/internal/ads/dy1;

    move-result-object p1

    return-object p1

    :pswitch_10
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/wy1;->m()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
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

.method private final a(I)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/wy1;->b:I

    and-int/lit8 v0, v0, 0x7

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/ads/b02;->f()Lcom/google/android/gms/internal/ads/a02;

    move-result-object p1

    throw p1
.end method

.method private final a(Ljava/util/List;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;Z)V"
        }
    .end annotation

    iget v0, p0, Lcom/google/android/gms/internal/ads/wy1;->b:I

    and-int/lit8 v0, v0, 0x7

    const/4 v1, 0x2

    if-ne v0, v1, :cond_5

    instance-of v0, p1, Lcom/google/android/gms/internal/ads/i02;

    if-eqz v0, :cond_2

    if-nez p2, :cond_2

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/ads/i02;

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/wy1;->d()Lcom/google/android/gms/internal/ads/dy1;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/i02;->a(Lcom/google/android/gms/internal/ads/dy1;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ty1;->s()Z

    move-result p1

    if-eqz p1, :cond_1

    return-void

    :cond_1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ty1;->d()I

    move-result p1

    iget p2, p0, Lcom/google/android/gms/internal/ads/wy1;->b:I

    if-eq p1, p2, :cond_0

    iput p1, p0, Lcom/google/android/gms/internal/ads/wy1;->d:I

    return-void

    :cond_2
    if-eqz p2, :cond_3

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/wy1;->r()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/wy1;->i()Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->s()Z

    move-result v0

    if-eqz v0, :cond_4

    return-void

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->d()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/wy1;->b:I

    if-eq v0, v1, :cond_2

    iput v0, p0, Lcom/google/android/gms/internal/ads/wy1;->d:I

    return-void

    :cond_5
    invoke-static {}, Lcom/google/android/gms/internal/ads/b02;->f()Lcom/google/android/gms/internal/ads/a02;

    move-result-object p1

    throw p1
.end method

.method private static b(I)V
    .locals 0

    and-int/lit8 p0, p0, 0x7

    if-nez p0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/ads/b02;->h()Lcom/google/android/gms/internal/ads/b02;

    move-result-object p0

    throw p0
.end method

.method private final c(Lcom/google/android/gms/internal/ads/z12;Lcom/google/android/gms/internal/ads/dz1;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/internal/ads/z12<",
            "TT;>;",
            "Lcom/google/android/gms/internal/ads/dz1;",
            ")TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->m()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    iget v2, v1, Lcom/google/android/gms/internal/ads/ty1;->a:I

    iget v3, v1, Lcom/google/android/gms/internal/ads/ty1;->b:I

    if-ge v2, v3, :cond_0

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/ty1;->c(I)I

    move-result v0

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/z12;->a()Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    iget v3, v2, Lcom/google/android/gms/internal/ads/ty1;->a:I

    add-int/lit8 v3, v3, 0x1

    iput v3, v2, Lcom/google/android/gms/internal/ads/ty1;->a:I

    invoke-interface {p1, v1, p0, p2}, Lcom/google/android/gms/internal/ads/z12;->a(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/t12;Lcom/google/android/gms/internal/ads/dz1;)V

    invoke-interface {p1, v1}, Lcom/google/android/gms/internal/ads/z12;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/ty1;->a(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    iget p2, p1, Lcom/google/android/gms/internal/ads/ty1;->a:I

    add-int/lit8 p2, p2, -0x1

    iput p2, p1, Lcom/google/android/gms/internal/ads/ty1;->a:I

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/ty1;->d(I)V

    return-object v1

    :cond_0
    new-instance p1, Lcom/google/android/gms/internal/ads/b02;

    const-string p2, "Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit."

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/b02;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private static c(I)V
    .locals 0

    and-int/lit8 p0, p0, 0x3

    if-nez p0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/ads/b02;->h()Lcom/google/android/gms/internal/ads/b02;

    move-result-object p0

    throw p0
.end method

.method private final d(Lcom/google/android/gms/internal/ads/z12;Lcom/google/android/gms/internal/ads/dz1;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/internal/ads/z12<",
            "TT;>;",
            "Lcom/google/android/gms/internal/ads/dz1;",
            ")TT;"
        }
    .end annotation

    iget v0, p0, Lcom/google/android/gms/internal/ads/wy1;->c:I

    iget v1, p0, Lcom/google/android/gms/internal/ads/wy1;->b:I

    ushr-int/lit8 v1, v1, 0x3

    shl-int/lit8 v1, v1, 0x3

    or-int/lit8 v1, v1, 0x4

    iput v1, p0, Lcom/google/android/gms/internal/ads/wy1;->c:I

    :try_start_0
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/z12;->a()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1, v1, p0, p2}, Lcom/google/android/gms/internal/ads/z12;->a(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/t12;Lcom/google/android/gms/internal/ads/dz1;)V

    invoke-interface {p1, v1}, Lcom/google/android/gms/internal/ads/z12;->b(Ljava/lang/Object;)V

    iget p1, p0, Lcom/google/android/gms/internal/ads/wy1;->b:I

    iget p2, p0, Lcom/google/android/gms/internal/ads/wy1;->c:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne p1, p2, :cond_0

    iput v0, p0, Lcom/google/android/gms/internal/ads/wy1;->c:I

    return-object v1

    :cond_0
    :try_start_1
    invoke-static {}, Lcom/google/android/gms/internal/ads/b02;->h()Lcom/google/android/gms/internal/ads/b02;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    iput v0, p0, Lcom/google/android/gms/internal/ads/wy1;->c:I

    throw p1
.end method

.method private final d(I)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->t()I

    move-result v0

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/ads/b02;->a()Lcom/google/android/gms/internal/ads/b02;

    move-result-object p1

    throw p1
.end method


# virtual methods
.method public final a()I
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/wy1;->a(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->q()I

    move-result v0

    return v0
.end method

.method public final a(Lcom/google/android/gms/internal/ads/z12;Lcom/google/android/gms/internal/ads/dz1;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/internal/ads/z12<",
            "TT;>;",
            "Lcom/google/android/gms/internal/ads/dz1;",
            ")TT;"
        }
    .end annotation

    const/4 v0, 0x3

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/wy1;->a(I)V

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/wy1;->d(Lcom/google/android/gms/internal/ads/z12;Lcom/google/android/gms/internal/ads/dz1;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final a(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    instance-of v0, p1, Lcom/google/android/gms/internal/ads/q02;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/ads/q02;

    iget p1, p0, Lcom/google/android/gms/internal/ads/wy1;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ty1;->m()I

    move-result p1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/ty1;->t()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ty1;->e()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/ads/q02;->a(J)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ty1;->t()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/ads/wy1;->d(I)V

    return-void

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/ads/b02;->f()Lcom/google/android/gms/internal/ads/a02;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ty1;->e()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/q02;->a(J)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ty1;->s()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ty1;->d()I

    move-result p1

    iget v1, p0, Lcom/google/android/gms/internal/ads/wy1;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/google/android/gms/internal/ads/wy1;->d:I

    return-void

    :cond_4
    iget v0, p0, Lcom/google/android/gms/internal/ads/wy1;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->m()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/ty1;->t()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->e()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->t()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/ads/wy1;->d(I)V

    return-void

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/ads/b02;->f()Lcom/google/android/gms/internal/ads/a02;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->e()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->s()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->d()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/wy1;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/google/android/gms/internal/ads/wy1;->d:I

    return-void
.end method

.method public final a(Ljava/util/List;Lcom/google/android/gms/internal/ads/z12;Lcom/google/android/gms/internal/ads/dz1;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "TT;>;",
            "Lcom/google/android/gms/internal/ads/z12<",
            "TT;>;",
            "Lcom/google/android/gms/internal/ads/dz1;",
            ")V"
        }
    .end annotation

    iget v0, p0, Lcom/google/android/gms/internal/ads/wy1;->b:I

    and-int/lit8 v1, v0, 0x7

    const/4 v2, 0x2

    if-ne v1, v2, :cond_3

    :cond_0
    invoke-direct {p0, p2, p3}, Lcom/google/android/gms/internal/ads/wy1;->c(Lcom/google/android/gms/internal/ads/z12;Lcom/google/android/gms/internal/ads/dz1;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/ty1;->s()Z

    move-result v1

    if-nez v1, :cond_2

    iget v1, p0, Lcom/google/android/gms/internal/ads/wy1;->d:I

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/ty1;->d()I

    move-result v1

    if-eq v1, v0, :cond_0

    iput v1, p0, Lcom/google/android/gms/internal/ads/wy1;->d:I

    :cond_2
    :goto_0
    return-void

    :cond_3
    invoke-static {}, Lcom/google/android/gms/internal/ads/b02;->f()Lcom/google/android/gms/internal/ads/a02;

    move-result-object p1

    throw p1
.end method

.method public final a(Ljava/util/Map;Lcom/google/android/gms/internal/ads/t02;Lcom/google/android/gms/internal/ads/dz1;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Map<",
            "TK;TV;>;",
            "Lcom/google/android/gms/internal/ads/t02<",
            "TK;TV;>;",
            "Lcom/google/android/gms/internal/ads/dz1;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/wy1;->a(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/ty1;->m()I

    move-result v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/ty1;->c(I)I

    move-result v1

    iget-object v2, p2, Lcom/google/android/gms/internal/ads/t02;->b:Ljava/lang/Object;

    iget-object v3, p2, Lcom/google/android/gms/internal/ads/t02;->d:Ljava/lang/Object;

    :goto_0
    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/wy1;->s()I

    move-result v4

    const v5, 0x7fffffff

    if-eq v4, v5, :cond_4

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/ty1;->s()Z

    move-result v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v5, :cond_4

    const/4 v5, 0x1

    const-string v6, "Unable to parse map entry."

    if-eq v4, v5, :cond_2

    if-eq v4, v0, :cond_1

    :try_start_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/wy1;->g()Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_0

    :cond_0
    new-instance v4, Lcom/google/android/gms/internal/ads/b02;

    invoke-direct {v4, v6}, Lcom/google/android/gms/internal/ads/b02;-><init>(Ljava/lang/String;)V

    throw v4

    :cond_1
    iget-object v4, p2, Lcom/google/android/gms/internal/ads/t02;->c:Lcom/google/android/gms/internal/ads/f32;

    iget-object v5, p2, Lcom/google/android/gms/internal/ads/t02;->d:Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    invoke-direct {p0, v4, v5, p3}, Lcom/google/android/gms/internal/ads/wy1;->a(Lcom/google/android/gms/internal/ads/f32;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/dz1;)Ljava/lang/Object;

    move-result-object v3

    goto :goto_0

    :cond_2
    iget-object v4, p2, Lcom/google/android/gms/internal/ads/t02;->a:Lcom/google/android/gms/internal/ads/f32;

    const/4 v5, 0x0

    invoke-direct {p0, v4, v5, v5}, Lcom/google/android/gms/internal/ads/wy1;->a(Lcom/google/android/gms/internal/ads/f32;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/dz1;)Ljava/lang/Object;

    move-result-object v2
    :try_end_1
    .catch Lcom/google/android/gms/internal/ads/a02; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    :try_start_2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/wy1;->g()Z

    move-result v4

    if-eqz v4, :cond_3

    goto :goto_0

    :cond_3
    new-instance p1, Lcom/google/android/gms/internal/ads/b02;

    invoke-direct {p1, v6}, Lcom/google/android/gms/internal/ads/b02;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    invoke-interface {p1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/ads/ty1;->d(I)V

    return-void

    :catchall_0
    move-exception p1

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p2, v1}, Lcom/google/android/gms/internal/ads/ty1;->d(I)V

    throw p1
.end method

.method public final b()J
    .locals 2

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/wy1;->a(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->e()J

    move-result-wide v0

    return-wide v0
.end method

.method public final b(Lcom/google/android/gms/internal/ads/z12;Lcom/google/android/gms/internal/ads/dz1;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/internal/ads/z12<",
            "TT;>;",
            "Lcom/google/android/gms/internal/ads/dz1;",
            ")TT;"
        }
    .end annotation

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/wy1;->a(I)V

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/wy1;->c(Lcom/google/android/gms/internal/ads/z12;Lcom/google/android/gms/internal/ads/dz1;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    instance-of v0, p1, Lcom/google/android/gms/internal/ads/q02;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/ads/q02;

    iget p1, p0, Lcom/google/android/gms/internal/ads/wy1;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ty1;->m()I

    move-result p1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/ty1;->t()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ty1;->r()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/ads/q02;->a(J)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ty1;->t()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/ads/wy1;->d(I)V

    return-void

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/ads/b02;->f()Lcom/google/android/gms/internal/ads/a02;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ty1;->r()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/q02;->a(J)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ty1;->s()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ty1;->d()I

    move-result p1

    iget v1, p0, Lcom/google/android/gms/internal/ads/wy1;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/google/android/gms/internal/ads/wy1;->d:I

    return-void

    :cond_4
    iget v0, p0, Lcom/google/android/gms/internal/ads/wy1;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->m()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/ty1;->t()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->r()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->t()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/ads/wy1;->d(I)V

    return-void

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/ads/b02;->f()Lcom/google/android/gms/internal/ads/a02;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->r()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->s()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->d()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/wy1;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/google/android/gms/internal/ads/wy1;->d:I

    return-void
.end method

.method public final b(Ljava/util/List;Lcom/google/android/gms/internal/ads/z12;Lcom/google/android/gms/internal/ads/dz1;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "TT;>;",
            "Lcom/google/android/gms/internal/ads/z12<",
            "TT;>;",
            "Lcom/google/android/gms/internal/ads/dz1;",
            ")V"
        }
    .end annotation

    iget v0, p0, Lcom/google/android/gms/internal/ads/wy1;->b:I

    and-int/lit8 v1, v0, 0x7

    const/4 v2, 0x3

    if-ne v1, v2, :cond_3

    :cond_0
    invoke-direct {p0, p2, p3}, Lcom/google/android/gms/internal/ads/wy1;->d(Lcom/google/android/gms/internal/ads/z12;Lcom/google/android/gms/internal/ads/dz1;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/ty1;->s()Z

    move-result v1

    if-nez v1, :cond_2

    iget v1, p0, Lcom/google/android/gms/internal/ads/wy1;->d:I

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/ty1;->d()I

    move-result v1

    if-eq v1, v0, :cond_0

    iput v1, p0, Lcom/google/android/gms/internal/ads/wy1;->d:I

    :cond_2
    :goto_0
    return-void

    :cond_3
    invoke-static {}, Lcom/google/android/gms/internal/ads/b02;->f()Lcom/google/android/gms/internal/ads/a02;

    move-result-object p1

    throw p1
.end method

.method public final c()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/wy1;->b:I

    return v0
.end method

.method public final c(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    instance-of v0, p1, Lcom/google/android/gms/internal/ads/sz1;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/ads/sz1;

    iget p1, p0, Lcom/google/android/gms/internal/ads/wy1;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ty1;->m()I

    move-result p1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/ty1;->t()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ty1;->m()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/sz1;->a(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ty1;->t()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/ads/wy1;->d(I)V

    return-void

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/ads/b02;->f()Lcom/google/android/gms/internal/ads/a02;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ty1;->m()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/sz1;->a(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ty1;->s()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ty1;->d()I

    move-result p1

    iget v1, p0, Lcom/google/android/gms/internal/ads/wy1;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/google/android/gms/internal/ads/wy1;->d:I

    return-void

    :cond_4
    iget v0, p0, Lcom/google/android/gms/internal/ads/wy1;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->m()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/ty1;->t()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->m()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->t()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/ads/wy1;->d(I)V

    return-void

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/ads/b02;->f()Lcom/google/android/gms/internal/ads/a02;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->m()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->s()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->d()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/wy1;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/google/android/gms/internal/ads/wy1;->d:I

    return-void
.end method

.method public final d()Lcom/google/android/gms/internal/ads/dy1;
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/wy1;->a(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->l()Lcom/google/android/gms/internal/ads/dy1;

    move-result-object v0

    return-object v0
.end method

.method public final d(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    instance-of v0, p1, Lcom/google/android/gms/internal/ads/sz1;

    const/4 v1, 0x5

    const/4 v2, 0x2

    if-eqz v0, :cond_5

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/ads/sz1;

    iget p1, p0, Lcom/google/android/gms/internal/ads/wy1;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eq p1, v2, :cond_3

    if-ne p1, v1, :cond_2

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ty1;->i()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/sz1;->a(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ty1;->s()Z

    move-result p1

    if-eqz p1, :cond_1

    return-void

    :cond_1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ty1;->d()I

    move-result p1

    iget v1, p0, Lcom/google/android/gms/internal/ads/wy1;->b:I

    if-eq p1, v1, :cond_0

    iput p1, p0, Lcom/google/android/gms/internal/ads/wy1;->d:I

    return-void

    :cond_2
    invoke-static {}, Lcom/google/android/gms/internal/ads/b02;->f()Lcom/google/android/gms/internal/ads/a02;

    move-result-object p1

    throw p1

    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ty1;->m()I

    move-result p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/wy1;->c(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/ty1;->t()I

    move-result v1

    add-int v3, v1, p1

    :cond_4
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ty1;->i()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/sz1;->a(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ty1;->t()I

    move-result p1

    if-lt p1, v3, :cond_4

    return-void

    :cond_5
    iget v0, p0, Lcom/google/android/gms/internal/ads/wy1;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v2, :cond_9

    if-ne v0, v1, :cond_8

    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->i()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->s()Z

    move-result v0

    if-eqz v0, :cond_7

    return-void

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->d()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/wy1;->b:I

    if-eq v0, v1, :cond_6

    iput v0, p0, Lcom/google/android/gms/internal/ads/wy1;->d:I

    return-void

    :cond_8
    invoke-static {}, Lcom/google/android/gms/internal/ads/b02;->f()Lcom/google/android/gms/internal/ads/a02;

    move-result-object p1

    throw p1

    :cond_9
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->m()I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/wy1;->c(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/ty1;->t()I

    move-result v1

    add-int/2addr v1, v0

    :cond_a
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->i()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->t()I

    move-result v0

    if-lt v0, v1, :cond_a

    return-void
.end method

.method public final e()J
    .locals 2

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/wy1;->a(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->h()J

    move-result-wide v0

    return-wide v0
.end method

.method public final e(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    instance-of v0, p1, Lcom/google/android/gms/internal/ads/q02;

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/ads/q02;

    iget p1, p0, Lcom/google/android/gms/internal/ads/wy1;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eq p1, v2, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ty1;->m()I

    move-result p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/wy1;->b(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/ty1;->t()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ty1;->h()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/ads/q02;->a(J)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ty1;->t()I

    move-result p1

    if-lt p1, v1, :cond_0

    return-void

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/ads/b02;->f()Lcom/google/android/gms/internal/ads/a02;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ty1;->h()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/q02;->a(J)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ty1;->s()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ty1;->d()I

    move-result p1

    iget v1, p0, Lcom/google/android/gms/internal/ads/wy1;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/google/android/gms/internal/ads/wy1;->d:I

    return-void

    :cond_4
    iget v0, p0, Lcom/google/android/gms/internal/ads/wy1;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v2, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->m()I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/wy1;->b(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/ty1;->t()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->h()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->t()I

    move-result v0

    if-lt v0, v1, :cond_5

    return-void

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/ads/b02;->f()Lcom/google/android/gms/internal/ads/a02;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->h()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->s()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->d()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/wy1;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/google/android/gms/internal/ads/wy1;->d:I

    return-void
.end method

.method public final f()J
    .locals 2

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/wy1;->a(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->p()J

    move-result-wide v0

    return-wide v0
.end method

.method public final f(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;)V"
        }
    .end annotation

    instance-of v0, p1, Lcom/google/android/gms/internal/ads/mz1;

    const/4 v1, 0x5

    const/4 v2, 0x2

    if-eqz v0, :cond_5

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/ads/mz1;

    iget p1, p0, Lcom/google/android/gms/internal/ads/wy1;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eq p1, v2, :cond_3

    if-ne p1, v1, :cond_2

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ty1;->b()F

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/mz1;->a(F)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ty1;->s()Z

    move-result p1

    if-eqz p1, :cond_1

    return-void

    :cond_1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ty1;->d()I

    move-result p1

    iget v1, p0, Lcom/google/android/gms/internal/ads/wy1;->b:I

    if-eq p1, v1, :cond_0

    iput p1, p0, Lcom/google/android/gms/internal/ads/wy1;->d:I

    return-void

    :cond_2
    invoke-static {}, Lcom/google/android/gms/internal/ads/b02;->f()Lcom/google/android/gms/internal/ads/a02;

    move-result-object p1

    throw p1

    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ty1;->m()I

    move-result p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/wy1;->c(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/ty1;->t()I

    move-result v1

    add-int v3, v1, p1

    :cond_4
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ty1;->b()F

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/mz1;->a(F)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ty1;->t()I

    move-result p1

    if-lt p1, v3, :cond_4

    return-void

    :cond_5
    iget v0, p0, Lcom/google/android/gms/internal/ads/wy1;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v2, :cond_9

    if-ne v0, v1, :cond_8

    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->b()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->s()Z

    move-result v0

    if-eqz v0, :cond_7

    return-void

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->d()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/wy1;->b:I

    if-eq v0, v1, :cond_6

    iput v0, p0, Lcom/google/android/gms/internal/ads/wy1;->d:I

    return-void

    :cond_8
    invoke-static {}, Lcom/google/android/gms/internal/ads/b02;->f()Lcom/google/android/gms/internal/ads/a02;

    move-result-object p1

    throw p1

    :cond_9
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->m()I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/wy1;->c(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/ty1;->t()I

    move-result v1

    add-int/2addr v1, v0

    :cond_a
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->b()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->t()I

    move-result v0

    if-lt v0, v1, :cond_a

    return-void
.end method

.method public final g(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    instance-of v0, p1, Lcom/google/android/gms/internal/ads/sz1;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/ads/sz1;

    iget p1, p0, Lcom/google/android/gms/internal/ads/wy1;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ty1;->m()I

    move-result p1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/ty1;->t()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ty1;->q()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/sz1;->a(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ty1;->t()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/ads/wy1;->d(I)V

    return-void

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/ads/b02;->f()Lcom/google/android/gms/internal/ads/a02;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ty1;->q()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/sz1;->a(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ty1;->s()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ty1;->d()I

    move-result p1

    iget v1, p0, Lcom/google/android/gms/internal/ads/wy1;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/google/android/gms/internal/ads/wy1;->d:I

    return-void

    :cond_4
    iget v0, p0, Lcom/google/android/gms/internal/ads/wy1;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->m()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/ty1;->t()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->q()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->t()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/ads/wy1;->d(I)V

    return-void

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/ads/b02;->f()Lcom/google/android/gms/internal/ads/a02;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->q()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->s()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->d()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/wy1;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/google/android/gms/internal/ads/wy1;->d:I

    return-void
.end method

.method public final g()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->s()Z

    move-result v0

    if-nez v0, :cond_1

    iget v0, p0, Lcom/google/android/gms/internal/ads/wy1;->b:I

    iget v1, p0, Lcom/google/android/gms/internal/ads/wy1;->c:I

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/ty1;->b(I)Z

    move-result v0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public final h()J
    .locals 2

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/wy1;->a(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->r()J

    move-result-wide v0

    return-wide v0
.end method

.method public final h(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    instance-of v0, p1, Lcom/google/android/gms/internal/ads/q02;

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/ads/q02;

    iget p1, p0, Lcom/google/android/gms/internal/ads/wy1;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eq p1, v2, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ty1;->m()I

    move-result p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/wy1;->b(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/ty1;->t()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ty1;->p()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/ads/q02;->a(J)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ty1;->t()I

    move-result p1

    if-lt p1, v1, :cond_0

    return-void

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/ads/b02;->f()Lcom/google/android/gms/internal/ads/a02;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ty1;->p()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/q02;->a(J)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ty1;->s()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ty1;->d()I

    move-result p1

    iget v1, p0, Lcom/google/android/gms/internal/ads/wy1;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/google/android/gms/internal/ads/wy1;->d:I

    return-void

    :cond_4
    iget v0, p0, Lcom/google/android/gms/internal/ads/wy1;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v2, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->m()I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/wy1;->b(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/ty1;->t()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->p()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->t()I

    move-result v0

    if-lt v0, v1, :cond_5

    return-void

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/ads/b02;->f()Lcom/google/android/gms/internal/ads/a02;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->p()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->s()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->d()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/wy1;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/google/android/gms/internal/ads/wy1;->d:I

    return-void
.end method

.method public final i()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/wy1;->a(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->c()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final i(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/ads/dy1;",
            ">;)V"
        }
    .end annotation

    iget v0, p0, Lcom/google/android/gms/internal/ads/wy1;->b:I

    and-int/lit8 v0, v0, 0x7

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/wy1;->d()Lcom/google/android/gms/internal/ads/dy1;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->s()Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->d()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/wy1;->b:I

    if-eq v0, v1, :cond_0

    iput v0, p0, Lcom/google/android/gms/internal/ads/wy1;->d:I

    return-void

    :cond_2
    invoke-static {}, Lcom/google/android/gms/internal/ads/b02;->f()Lcom/google/android/gms/internal/ads/a02;

    move-result-object p1

    throw p1
.end method

.method public final j()I
    .locals 1

    const/4 v0, 0x5

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/wy1;->a(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->i()I

    move-result v0

    return v0
.end method

.method public final j(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/ads/wy1;->a(Ljava/util/List;Z)V

    return-void
.end method

.method public final k()I
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/wy1;->a(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->m()I

    move-result v0

    return v0
.end method

.method public final k(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    instance-of v0, p1, Lcom/google/android/gms/internal/ads/sz1;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/ads/sz1;

    iget p1, p0, Lcom/google/android/gms/internal/ads/wy1;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ty1;->m()I

    move-result p1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/ty1;->t()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ty1;->g()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/sz1;->a(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ty1;->t()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/ads/wy1;->d(I)V

    return-void

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/ads/b02;->f()Lcom/google/android/gms/internal/ads/a02;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ty1;->g()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/sz1;->a(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ty1;->s()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ty1;->d()I

    move-result p1

    iget v1, p0, Lcom/google/android/gms/internal/ads/wy1;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/google/android/gms/internal/ads/wy1;->d:I

    return-void

    :cond_4
    iget v0, p0, Lcom/google/android/gms/internal/ads/wy1;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->m()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/ty1;->t()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->g()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->t()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/ads/wy1;->d(I)V

    return-void

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/ads/b02;->f()Lcom/google/android/gms/internal/ads/a02;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->g()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->s()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->d()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/wy1;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/google/android/gms/internal/ads/wy1;->d:I

    return-void
.end method

.method public final l()J
    .locals 2

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/wy1;->a(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->f()J

    move-result-wide v0

    return-wide v0
.end method

.method public final l(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;)V"
        }
    .end annotation

    instance-of v0, p1, Lcom/google/android/gms/internal/ads/cz1;

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/ads/cz1;

    iget p1, p0, Lcom/google/android/gms/internal/ads/wy1;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eq p1, v2, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ty1;->m()I

    move-result p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/wy1;->b(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/ty1;->t()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ty1;->a()D

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/ads/cz1;->a(D)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ty1;->t()I

    move-result p1

    if-lt p1, v1, :cond_0

    return-void

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/ads/b02;->f()Lcom/google/android/gms/internal/ads/a02;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ty1;->a()D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/cz1;->a(D)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ty1;->s()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ty1;->d()I

    move-result p1

    iget v1, p0, Lcom/google/android/gms/internal/ads/wy1;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/google/android/gms/internal/ads/wy1;->d:I

    return-void

    :cond_4
    iget v0, p0, Lcom/google/android/gms/internal/ads/wy1;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v2, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->m()I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/wy1;->b(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/ty1;->t()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->a()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->t()I

    move-result v0

    if-lt v0, v1, :cond_5

    return-void

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/ads/b02;->f()Lcom/google/android/gms/internal/ads/a02;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->a()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->s()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->d()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/wy1;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/google/android/gms/internal/ads/wy1;->d:I

    return-void
.end method

.method public final m(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    instance-of v0, p1, Lcom/google/android/gms/internal/ads/sz1;

    const/4 v1, 0x5

    const/4 v2, 0x2

    if-eqz v0, :cond_5

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/ads/sz1;

    iget p1, p0, Lcom/google/android/gms/internal/ads/wy1;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eq p1, v2, :cond_3

    if-ne p1, v1, :cond_2

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ty1;->o()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/sz1;->a(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ty1;->s()Z

    move-result p1

    if-eqz p1, :cond_1

    return-void

    :cond_1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ty1;->d()I

    move-result p1

    iget v1, p0, Lcom/google/android/gms/internal/ads/wy1;->b:I

    if-eq p1, v1, :cond_0

    iput p1, p0, Lcom/google/android/gms/internal/ads/wy1;->d:I

    return-void

    :cond_2
    invoke-static {}, Lcom/google/android/gms/internal/ads/b02;->f()Lcom/google/android/gms/internal/ads/a02;

    move-result-object p1

    throw p1

    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ty1;->m()I

    move-result p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/wy1;->c(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/ty1;->t()I

    move-result v1

    add-int v3, v1, p1

    :cond_4
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ty1;->o()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/sz1;->a(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ty1;->t()I

    move-result p1

    if-lt p1, v3, :cond_4

    return-void

    :cond_5
    iget v0, p0, Lcom/google/android/gms/internal/ads/wy1;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v2, :cond_9

    if-ne v0, v1, :cond_8

    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->o()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->s()Z

    move-result v0

    if-eqz v0, :cond_7

    return-void

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->d()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/wy1;->b:I

    if-eq v0, v1, :cond_6

    iput v0, p0, Lcom/google/android/gms/internal/ads/wy1;->d:I

    return-void

    :cond_8
    invoke-static {}, Lcom/google/android/gms/internal/ads/b02;->f()Lcom/google/android/gms/internal/ads/a02;

    move-result-object p1

    throw p1

    :cond_9
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->m()I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/wy1;->c(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/ty1;->t()I

    move-result v1

    add-int/2addr v1, v0

    :cond_a
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->o()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->t()I

    move-result v0

    if-lt v0, v1, :cond_a

    return-void
.end method

.method public final m()Z
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/wy1;->a(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->j()Z

    move-result v0

    return v0
.end method

.method public final n()D
    .locals 2

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/wy1;->a(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->a()D

    move-result-wide v0

    return-wide v0
.end method

.method public final n(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/ads/wy1;->a(Ljava/util/List;Z)V

    return-void
.end method

.method public final o()I
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/wy1;->a(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->n()I

    move-result v0

    return v0
.end method

.method public final o(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    instance-of v0, p1, Lcom/google/android/gms/internal/ads/q02;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/ads/q02;

    iget p1, p0, Lcom/google/android/gms/internal/ads/wy1;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ty1;->m()I

    move-result p1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/ty1;->t()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ty1;->f()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/ads/q02;->a(J)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ty1;->t()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/ads/wy1;->d(I)V

    return-void

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/ads/b02;->f()Lcom/google/android/gms/internal/ads/a02;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ty1;->f()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/q02;->a(J)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ty1;->s()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ty1;->d()I

    move-result p1

    iget v1, p0, Lcom/google/android/gms/internal/ads/wy1;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/google/android/gms/internal/ads/wy1;->d:I

    return-void

    :cond_4
    iget v0, p0, Lcom/google/android/gms/internal/ads/wy1;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->m()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/ty1;->t()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->f()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->t()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/ads/wy1;->d(I)V

    return-void

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/ads/b02;->f()Lcom/google/android/gms/internal/ads/a02;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->f()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->s()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->d()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/wy1;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/google/android/gms/internal/ads/wy1;->d:I

    return-void
.end method

.method public final p()F
    .locals 1

    const/4 v0, 0x5

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/wy1;->a(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->b()F

    move-result v0

    return v0
.end method

.method public final p(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    instance-of v0, p1, Lcom/google/android/gms/internal/ads/sz1;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/ads/sz1;

    iget p1, p0, Lcom/google/android/gms/internal/ads/wy1;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ty1;->m()I

    move-result p1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/ty1;->t()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ty1;->n()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/sz1;->a(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ty1;->t()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/ads/wy1;->d(I)V

    return-void

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/ads/b02;->f()Lcom/google/android/gms/internal/ads/a02;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ty1;->n()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/sz1;->a(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ty1;->s()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ty1;->d()I

    move-result p1

    iget v1, p0, Lcom/google/android/gms/internal/ads/wy1;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/google/android/gms/internal/ads/wy1;->d:I

    return-void

    :cond_4
    iget v0, p0, Lcom/google/android/gms/internal/ads/wy1;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->m()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/ty1;->t()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->n()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->t()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/ads/wy1;->d(I)V

    return-void

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/ads/b02;->f()Lcom/google/android/gms/internal/ads/a02;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->n()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->s()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->d()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/wy1;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/google/android/gms/internal/ads/wy1;->d:I

    return-void
.end method

.method public final q()I
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/wy1;->a(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->g()I

    move-result v0

    return v0
.end method

.method public final q(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    instance-of v0, p1, Lcom/google/android/gms/internal/ads/by1;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/ads/by1;

    iget p1, p0, Lcom/google/android/gms/internal/ads/wy1;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ty1;->m()I

    move-result p1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/ty1;->t()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ty1;->j()Z

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/by1;->a(Z)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ty1;->t()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/ads/wy1;->d(I)V

    return-void

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/ads/b02;->f()Lcom/google/android/gms/internal/ads/a02;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ty1;->j()Z

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/by1;->a(Z)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ty1;->s()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ty1;->d()I

    move-result p1

    iget v1, p0, Lcom/google/android/gms/internal/ads/wy1;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/google/android/gms/internal/ads/wy1;->d:I

    return-void

    :cond_4
    iget v0, p0, Lcom/google/android/gms/internal/ads/wy1;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->m()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/ty1;->t()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->j()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->t()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/ads/wy1;->d(I)V

    return-void

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/ads/b02;->f()Lcom/google/android/gms/internal/ads/a02;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->j()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->s()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->d()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/wy1;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/google/android/gms/internal/ads/wy1;->d:I

    return-void
.end method

.method public final r()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/wy1;->a(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->k()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final s()I
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/ads/wy1;->d:I

    if-eqz v0, :cond_0

    iput v0, p0, Lcom/google/android/gms/internal/ads/wy1;->b:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/ads/wy1;->d:I

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->d()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/ads/wy1;->b:I

    :goto_0
    iget v0, p0, Lcom/google/android/gms/internal/ads/wy1;->b:I

    if-eqz v0, :cond_2

    iget v1, p0, Lcom/google/android/gms/internal/ads/wy1;->c:I

    if-ne v0, v1, :cond_1

    goto :goto_1

    :cond_1
    ushr-int/lit8 v0, v0, 0x3

    return v0

    :cond_2
    :goto_1
    const v0, 0x7fffffff

    return v0
.end method

.method public final t()I
    .locals 1

    const/4 v0, 0x5

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/wy1;->a(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wy1;->a:Lcom/google/android/gms/internal/ads/ty1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ty1;->o()I

    move-result v0

    return v0
.end method
