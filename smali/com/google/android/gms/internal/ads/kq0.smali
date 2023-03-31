.class public final Lcom/google/android/gms/internal/ads/kq0;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcom/google/android/gms/internal/ads/fo;

.field private final c:Lcom/google/android/gms/internal/ads/zd1;

.field private final d:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/fo;Lcom/google/android/gms/internal/ads/zd1;Ljava/util/concurrent/Executor;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/kq0;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/kq0;->b:Lcom/google/android/gms/internal/ads/fo;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/kq0;->c:Lcom/google/android/gms/internal/ads/zd1;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/kq0;->d:Ljava/util/concurrent/Executor;

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/ads/lo1;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/internal/ads/lo1<",
            "Lcom/google/android/gms/internal/ads/vd1;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->p()Lcom/google/android/gms/internal/ads/h9;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/kq0;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/kq0;->b:Lcom/google/android/gms/internal/ads/fo;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/h9;->b(Landroid/content/Context;Lcom/google/android/gms/internal/ads/fo;)Lcom/google/android/gms/internal/ads/q9;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/ads/l9;->b:Lcom/google/android/gms/internal/ads/m9;

    const-string v2, "google.afma.response.normalize"

    invoke-virtual {v0, v2, v1, v1}, Lcom/google/android/gms/internal/ads/q9;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/j9;Lcom/google/android/gms/internal/ads/k9;)Lcom/google/android/gms/internal/ads/i9;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/kq0;->c:Lcom/google/android/gms/internal/ads/zd1;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/zd1;->d:Lcom/google/android/gms/internal/ads/rm2;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/rm2;->t:Lcom/google/android/gms/internal/ads/lm2;

    const-string v2, ""

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/yn1;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object v2

    new-instance v3, Lcom/google/android/gms/internal/ads/jq0;

    invoke-direct {v3, p0, v1}, Lcom/google/android/gms/internal/ads/jq0;-><init>(Lcom/google/android/gms/internal/ads/kq0;Lcom/google/android/gms/internal/ads/lm2;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/kq0;->d:Ljava/util/concurrent/Executor;

    invoke-static {v2, v3, v1}, Lcom/google/android/gms/internal/ads/yn1;->a(Lcom/google/android/gms/internal/ads/lo1;Lcom/google/android/gms/internal/ads/ln1;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/ads/mq0;

    invoke-direct {v2, v0}, Lcom/google/android/gms/internal/ads/mq0;-><init>(Lcom/google/android/gms/internal/ads/i9;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/kq0;->d:Ljava/util/concurrent/Executor;

    invoke-static {v1, v2, v0}, Lcom/google/android/gms/internal/ads/yn1;->a(Lcom/google/android/gms/internal/ads/lo1;Lcom/google/android/gms/internal/ads/ln1;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/lq0;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/lq0;-><init>(Lcom/google/android/gms/internal/ads/kq0;)V

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/kq0;->d:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/yn1;->a(Lcom/google/android/gms/internal/ads/lo1;Lcom/google/android/gms/internal/ads/ln1;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object v0

    return-object v0
.end method

.method final synthetic a(Lorg/json/JSONObject;)Lcom/google/android/gms/internal/ads/lo1;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/ads/vd1;

    new-instance v1, Lcom/google/android/gms/internal/ads/pd1;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/kq0;->c:Lcom/google/android/gms/internal/ads/zd1;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/ads/pd1;-><init>(Lcom/google/android/gms/internal/ads/zd1;)V

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v2, Ljava/io/StringReader;

    invoke-direct {v2, p1}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/sd1;->a(Ljava/io/Reader;)Lcom/google/android/gms/internal/ads/sd1;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lcom/google/android/gms/internal/ads/vd1;-><init>(Lcom/google/android/gms/internal/ads/pd1;Lcom/google/android/gms/internal/ads/sd1;)V

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/yn1;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    return-object p1
.end method
