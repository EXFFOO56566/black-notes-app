.class public final Lcom/google/android/gms/internal/ads/pv0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/mv0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/mv0<",
        "Lcom/google/android/gms/internal/ads/xe0;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/zd0;

.field private final b:Lcom/google/android/gms/internal/ads/ko1;

.field private final c:Lcom/google/android/gms/internal/ads/kh0;

.field private final d:Lcom/google/android/gms/internal/ads/ke1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/ke1<",
            "Lcom/google/android/gms/internal/ads/jj0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zd0;Lcom/google/android/gms/internal/ads/ko1;Lcom/google/android/gms/internal/ads/kh0;Lcom/google/android/gms/internal/ads/ke1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/zd0;",
            "Lcom/google/android/gms/internal/ads/ko1;",
            "Lcom/google/android/gms/internal/ads/kh0;",
            "Lcom/google/android/gms/internal/ads/ke1<",
            "Lcom/google/android/gms/internal/ads/jj0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/pv0;->a:Lcom/google/android/gms/internal/ads/zd0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/pv0;->b:Lcom/google/android/gms/internal/ads/ko1;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/pv0;->c:Lcom/google/android/gms/internal/ads/kh0;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/pv0;->d:Lcom/google/android/gms/internal/ads/ke1;

    return-void
.end method

.method private final a(Lcom/google/android/gms/internal/ads/vd1;Lcom/google/android/gms/internal/ads/id1;Lorg/json/JSONObject;)Lcom/google/android/gms/internal/ads/lo1;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/vd1;",
            "Lcom/google/android/gms/internal/ads/id1;",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/internal/ads/lo1<",
            "Lcom/google/android/gms/internal/ads/xe0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/pv0;->d:Lcom/google/android/gms/internal/ads/ke1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ke1;->a()Lcom/google/android/gms/internal/ads/lo1;

    move-result-object v4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/pv0;->c:Lcom/google/android/gms/internal/ads/kh0;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/kh0;->a(Lcom/google/android/gms/internal/ads/vd1;Lcom/google/android/gms/internal/ads/id1;Lorg/json/JSONObject;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object v3

    const/4 v0, 0x2

    new-array v0, v0, [Lcom/google/android/gms/internal/ads/lo1;

    const/4 v1, 0x0

    aput-object v4, v0, v1

    const/4 v1, 0x1

    aput-object v3, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/yn1;->b([Lcom/google/android/gms/internal/ads/lo1;)Lcom/google/android/gms/internal/ads/eo1;

    move-result-object v0

    new-instance v8, Lcom/google/android/gms/internal/ads/sv0;

    move-object v1, v8

    move-object v2, p0

    move-object v5, p1

    move-object v6, p2

    move-object v7, p3

    invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/internal/ads/sv0;-><init>(Lcom/google/android/gms/internal/ads/pv0;Lcom/google/android/gms/internal/ads/lo1;Lcom/google/android/gms/internal/ads/lo1;Lcom/google/android/gms/internal/ads/vd1;Lcom/google/android/gms/internal/ads/id1;Lorg/json/JSONObject;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/pv0;->b:Lcom/google/android/gms/internal/ads/ko1;

    invoke-virtual {v0, v8, p1}, Lcom/google/android/gms/internal/ads/eo1;->a(Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method final synthetic a(Lcom/google/android/gms/internal/ads/id1;Lcom/google/android/gms/internal/ads/jj0;)Lcom/google/android/gms/internal/ads/lo1;
    .locals 3

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const-string v1, "isNonagon"

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/an;->a(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/id1;->p:Lcom/google/android/gms/internal/ads/md1;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/md1;->c:Lorg/json/JSONObject;

    const-string v2, "response"

    invoke-virtual {v1, v2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p1, "sdk_params"

    invoke-virtual {v1, p1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p1, "google.afma.nativeAds.preProcessJson"

    invoke-virtual {p2, p1, v1}, Lcom/google/android/gms/internal/ads/jj0;->a(Ljava/lang/String;Lorg/json/JSONObject;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    new-instance v0, Lcom/google/android/gms/internal/ads/qv0;

    invoke-direct {v0, p0, p2}, Lcom/google/android/gms/internal/ads/qv0;-><init>(Lcom/google/android/gms/internal/ads/pv0;Lcom/google/android/gms/internal/ads/jj0;)V

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/pv0;->b:Lcom/google/android/gms/internal/ads/ko1;

    invoke-static {p1, v0, p2}, Lcom/google/android/gms/internal/ads/yn1;->a(Lcom/google/android/gms/internal/ads/lo1;Lcom/google/android/gms/internal/ads/ln1;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    return-object p1
.end method

.method final synthetic a(Lcom/google/android/gms/internal/ads/jj0;Lorg/json/JSONObject;)Lcom/google/android/gms/internal/ads/lo1;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/pv0;->d:Lcom/google/android/gms/internal/ads/ke1;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/yn1;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/ke1;->a(Lcom/google/android/gms/internal/ads/lo1;)V

    const-string p1, "success"

    invoke-virtual {p2, p1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "json"

    invoke-virtual {p2, p1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    const-string p2, "ads"

    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/yn1;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Lcom/google/android/gms/internal/ads/f9;

    const-string p2, "process json failed"

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/f9;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final a(Lcom/google/android/gms/internal/ads/vd1;Lcom/google/android/gms/internal/ads/id1;)Lcom/google/android/gms/internal/ads/lo1;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/vd1;",
            "Lcom/google/android/gms/internal/ads/id1;",
            ")",
            "Lcom/google/android/gms/internal/ads/lo1<",
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/ads/lo1<",
            "Lcom/google/android/gms/internal/ads/xe0;",
            ">;>;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/pv0;->d:Lcom/google/android/gms/internal/ads/ke1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ke1;->a()Lcom/google/android/gms/internal/ads/lo1;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/ov0;

    invoke-direct {v1, p0, p2}, Lcom/google/android/gms/internal/ads/ov0;-><init>(Lcom/google/android/gms/internal/ads/pv0;Lcom/google/android/gms/internal/ads/id1;)V

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/pv0;->b:Lcom/google/android/gms/internal/ads/ko1;

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/yn1;->a(Lcom/google/android/gms/internal/ads/lo1;Lcom/google/android/gms/internal/ads/ln1;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/rv0;

    invoke-direct {v1, p0, p1, p2}, Lcom/google/android/gms/internal/ads/rv0;-><init>(Lcom/google/android/gms/internal/ads/pv0;Lcom/google/android/gms/internal/ads/vd1;Lcom/google/android/gms/internal/ads/id1;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/pv0;->b:Lcom/google/android/gms/internal/ads/ko1;

    invoke-static {v0, v1, p1}, Lcom/google/android/gms/internal/ads/yn1;->a(Lcom/google/android/gms/internal/ads/lo1;Lcom/google/android/gms/internal/ads/ln1;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    return-object p1
.end method

.method final synthetic a(Lcom/google/android/gms/internal/ads/vd1;Lcom/google/android/gms/internal/ads/id1;Lorg/json/JSONArray;)Lcom/google/android/gms/internal/ads/lo1;
    .locals 5

    invoke-virtual {p3}, Lorg/json/JSONArray;->length()I

    move-result v0

    const/4 v1, 0x3

    if-nez v0, :cond_0

    new-instance p1, Lcom/google/android/gms/internal/ads/gp0;

    invoke-direct {p1, v1}, Lcom/google/android/gms/internal/ads/gp0;-><init>(I)V

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/yn1;->a(Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/vd1;->a:Lcom/google/android/gms/internal/ads/pd1;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/pd1;->a:Lcom/google/android/gms/internal/ads/zd1;

    iget v0, v0, Lcom/google/android/gms/internal/ads/zd1;->k:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-le v0, v3, :cond_3

    invoke-virtual {p3}, Lorg/json/JSONArray;->length()I

    move-result v0

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/pv0;->d:Lcom/google/android/gms/internal/ads/ke1;

    iget-object v4, p1, Lcom/google/android/gms/internal/ads/vd1;->a:Lcom/google/android/gms/internal/ads/pd1;

    iget-object v4, v4, Lcom/google/android/gms/internal/ads/pd1;->a:Lcom/google/android/gms/internal/ads/zd1;

    iget v4, v4, Lcom/google/android/gms/internal/ads/zd1;->k:I

    invoke-static {v0, v4}, Ljava/lang/Math;->min(II)I

    move-result v4

    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/ke1;->a(I)V

    new-instance v3, Ljava/util/ArrayList;

    iget-object v4, p1, Lcom/google/android/gms/internal/ads/vd1;->a:Lcom/google/android/gms/internal/ads/pd1;

    iget-object v4, v4, Lcom/google/android/gms/internal/ads/pd1;->a:Lcom/google/android/gms/internal/ads/zd1;

    iget v4, v4, Lcom/google/android/gms/internal/ads/zd1;->k:I

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    :goto_0
    iget-object v4, p1, Lcom/google/android/gms/internal/ads/vd1;->a:Lcom/google/android/gms/internal/ads/pd1;

    iget-object v4, v4, Lcom/google/android/gms/internal/ads/pd1;->a:Lcom/google/android/gms/internal/ads/zd1;

    iget v4, v4, Lcom/google/android/gms/internal/ads/zd1;->k:I

    if-ge v2, v4, :cond_2

    if-ge v2, v0, :cond_1

    invoke-virtual {p3, v2}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v4

    invoke-direct {p0, p1, p2, v4}, Lcom/google/android/gms/internal/ads/pv0;->a(Lcom/google/android/gms/internal/ads/vd1;Lcom/google/android/gms/internal/ads/id1;Lorg/json/JSONObject;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object v4

    goto :goto_1

    :cond_1
    new-instance v4, Lcom/google/android/gms/internal/ads/gp0;

    invoke-direct {v4, v1}, Lcom/google/android/gms/internal/ads/gp0;-><init>(I)V

    invoke-static {v4}, Lcom/google/android/gms/internal/ads/yn1;->a(Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object v4

    :goto_1
    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    invoke-static {v3}, Lcom/google/android/gms/internal/ads/yn1;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    return-object p1

    :cond_3
    invoke-virtual {p3, v2}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object p3

    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/pv0;->a(Lcom/google/android/gms/internal/ads/vd1;Lcom/google/android/gms/internal/ads/id1;Lorg/json/JSONObject;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    sget-object p2, Lcom/google/android/gms/internal/ads/tv0;->a:Lcom/google/android/gms/internal/ads/xk1;

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/pv0;->b:Lcom/google/android/gms/internal/ads/ko1;

    invoke-static {p1, p2, p3}, Lcom/google/android/gms/internal/ads/yn1;->a(Lcom/google/android/gms/internal/ads/lo1;Lcom/google/android/gms/internal/ads/xk1;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    return-object p1
.end method

.method final synthetic a(Lcom/google/android/gms/internal/ads/lo1;Lcom/google/android/gms/internal/ads/lo1;Lcom/google/android/gms/internal/ads/vd1;Lcom/google/android/gms/internal/ads/id1;Lorg/json/JSONObject;)Lcom/google/android/gms/internal/ads/xe0;
    .locals 3

    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/if0;

    invoke-interface {p2}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/ads/jj0;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/pv0;->a:Lcom/google/android/gms/internal/ads/zd0;

    new-instance v1, Lcom/google/android/gms/internal/ads/d30;

    const/4 v2, 0x0

    invoke-direct {v1, p3, p4, v2}, Lcom/google/android/gms/internal/ads/d30;-><init>(Lcom/google/android/gms/internal/ads/vd1;Lcom/google/android/gms/internal/ads/id1;Ljava/lang/String;)V

    new-instance p3, Lcom/google/android/gms/internal/ads/wf0;

    invoke-direct {p3, p1}, Lcom/google/android/gms/internal/ads/wf0;-><init>(Lcom/google/android/gms/internal/ads/if0;)V

    new-instance p4, Lcom/google/android/gms/internal/ads/le0;

    invoke-direct {p4, p5, p2}, Lcom/google/android/gms/internal/ads/le0;-><init>(Lorg/json/JSONObject;Lcom/google/android/gms/internal/ads/jj0;)V

    invoke-virtual {v0, v1, p3, p4}, Lcom/google/android/gms/internal/ads/zd0;->a(Lcom/google/android/gms/internal/ads/d30;Lcom/google/android/gms/internal/ads/wf0;Lcom/google/android/gms/internal/ads/le0;)Lcom/google/android/gms/internal/ads/kf0;

    move-result-object p3

    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/kf0;->i()Lcom/google/android/gms/internal/ads/gj0;

    move-result-object p4

    invoke-virtual {p4}, Lcom/google/android/gms/internal/ads/gj0;->a()V

    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/kf0;->j()Lcom/google/android/gms/internal/ads/sj0;

    move-result-object p4

    invoke-virtual {p4, p2}, Lcom/google/android/gms/internal/ads/sj0;->a(Lcom/google/android/gms/internal/ads/jj0;)V

    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/kf0;->k()Lcom/google/android/gms/internal/ads/li0;

    move-result-object p2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/if0;->t()Lcom/google/android/gms/internal/ads/ws;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/li0;->a(Lcom/google/android/gms/internal/ads/ws;)V

    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/hf0;->h()Lcom/google/android/gms/internal/ads/xe0;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lcom/google/android/gms/internal/ads/vd1;Lcom/google/android/gms/internal/ads/id1;)Z
    .locals 0

    iget-object p1, p2, Lcom/google/android/gms/internal/ads/id1;->p:Lcom/google/android/gms/internal/ads/md1;

    if-eqz p1, :cond_0

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/md1;->c:Lorg/json/JSONObject;

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
