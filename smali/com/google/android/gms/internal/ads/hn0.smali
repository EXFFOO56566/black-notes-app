.class public final Lcom/google/android/gms/internal/ads/hn0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/z50;
.implements Lcom/google/android/gms/internal/ads/n60;
.implements Lcom/google/android/gms/internal/ads/t80;


# instance fields
.field private final b:Landroid/content/Context;

.field private final c:Lcom/google/android/gms/internal/ads/he1;

.field private final d:Lcom/google/android/gms/internal/ads/tn0;

.field private final e:Lcom/google/android/gms/internal/ads/vd1;

.field private final f:Lcom/google/android/gms/internal/ads/id1;

.field private g:Ljava/lang/Boolean;

.field private final h:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/he1;Lcom/google/android/gms/internal/ads/tn0;Lcom/google/android/gms/internal/ads/vd1;Lcom/google/android/gms/internal/ads/id1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/hn0;->b:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/hn0;->c:Lcom/google/android/gms/internal/ads/he1;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/hn0;->d:Lcom/google/android/gms/internal/ads/tn0;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/hn0;->e:Lcom/google/android/gms/internal/ads/vd1;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/hn0;->f:Lcom/google/android/gms/internal/ads/id1;

    sget-object p1, Lcom/google/android/gms/internal/ads/zr2;->B3:Lcom/google/android/gms/internal/ads/kr2;

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->e()Lcom/google/android/gms/internal/ads/vr2;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/vr2;->a(Lcom/google/android/gms/internal/ads/kr2;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/hn0;->h:Z

    return-void
.end method

.method private final a(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/sn0;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/hn0;->d:Lcom/google/android/gms/internal/ads/tn0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/tn0;->a()Lcom/google/android/gms/internal/ads/sn0;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/hn0;->e:Lcom/google/android/gms/internal/ads/vd1;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/vd1;->b:Lcom/google/android/gms/internal/ads/sd1;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/sd1;->b:Lcom/google/android/gms/internal/ads/kd1;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/sn0;->a(Lcom/google/android/gms/internal/ads/kd1;)Lcom/google/android/gms/internal/ads/sn0;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/hn0;->f:Lcom/google/android/gms/internal/ads/id1;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/sn0;->a(Lcom/google/android/gms/internal/ads/id1;)Lcom/google/android/gms/internal/ads/sn0;

    const-string v1, "action"

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/internal/ads/sn0;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/sn0;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/hn0;->f:Lcom/google/android/gms/internal/ads/id1;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/id1;->q:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/hn0;->f:Lcom/google/android/gms/internal/ads/id1;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/id1;->q:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    const-string v1, "ancn"

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/internal/ads/sn0;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/sn0;

    :cond_0
    return-object v0
.end method

.method private static a(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    const/4 v0, 0x0

    if-eqz p0, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    :try_start_0
    invoke-static {p0, p1}, Ljava/util/regex/Pattern;->matches(Ljava/lang/String;Ljava/lang/CharSequence;)Z

    move-result p0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :catch_0
    move-exception p0

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->g()Lcom/google/android/gms/internal/ads/ik;

    move-result-object p1

    const-string v1, "CsiActionsListener.isPatternMatched"

    invoke-virtual {p1, p0, v1}, Lcom/google/android/gms/internal/ads/ik;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    :cond_1
    :goto_0
    return v0
.end method

.method private final c()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/hn0;->g:Ljava/lang/Boolean;

    if-nez v0, :cond_1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/hn0;->g:Ljava/lang/Boolean;

    if-nez v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/ads/zr2;->L0:Lcom/google/android/gms/internal/ads/kr2;

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->e()Lcom/google/android/gms/internal/ads/vr2;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/vr2;->a(Lcom/google/android/gms/internal/ads/kr2;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->c()Lcom/google/android/gms/internal/ads/gl;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/hn0;->b:Landroid/content/Context;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/gl;->o(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/hn0;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/hn0;->g:Ljava/lang/Boolean;

    :cond_0
    monitor-exit p0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/hn0;->g:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public final K()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/hn0;->c()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string v0, "impression"

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/hn0;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/sn0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/sn0;->a()V

    return-void
.end method

.method public final O()V
    .locals 3

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/hn0;->h:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string v0, "ifts"

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/hn0;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/sn0;

    move-result-object v0

    const-string v1, "reason"

    const-string v2, "blocked"

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/sn0;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/sn0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/sn0;->a()V

    return-void
.end method

.method public final a()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/hn0;->c()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string v0, "adapter_impression"

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/hn0;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/sn0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/sn0;->a()V

    return-void
.end method

.method public final a(ILjava/lang/String;)V
    .locals 3

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/hn0;->h:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string v0, "ifts"

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/hn0;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/sn0;

    move-result-object v0

    const-string v1, "reason"

    const-string v2, "adapter"

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/sn0;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/sn0;

    if-ltz p1, :cond_1

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    const-string v1, "arec"

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/internal/ads/sn0;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/sn0;

    :cond_1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/hn0;->c:Lcom/google/android/gms/internal/ads/he1;

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/he1;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    const-string p2, "areec"

    invoke-virtual {v0, p2, p1}, Lcom/google/android/gms/internal/ads/sn0;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/sn0;

    :cond_2
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/sn0;->a()V

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/hd0;)V
    .locals 3

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/hn0;->h:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string v0, "ifts"

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/hn0;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/sn0;

    move-result-object v0

    const-string v1, "reason"

    const-string v2, "exception"

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/sn0;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/sn0;

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    const-string v1, "msg"

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/internal/ads/sn0;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/sn0;

    :cond_1
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/sn0;->a()V

    return-void
.end method

.method public final b()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/hn0;->c()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string v0, "adapter_shown"

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/hn0;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/sn0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/sn0;->a()V

    return-void
.end method
