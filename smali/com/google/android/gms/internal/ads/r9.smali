.class public final Lcom/google/android/gms/internal/ads/r9;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/i9;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<I:",
        "Ljava/lang/Object;",
        "O:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/i9<",
        "TI;TO;>;"
    }
.end annotation

.annotation runtime Ljavax/annotation/ParametersAreNonnullByDefault;
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/k9;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/k9<",
            "TO;>;"
        }
    .end annotation
.end field

.field private final b:Lcom/google/android/gms/internal/ads/j9;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/j9<",
            "TI;>;"
        }
    .end annotation
.end field

.field private final c:Lcom/google/android/gms/internal/ads/f8;

.field private final d:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/f8;Ljava/lang/String;Lcom/google/android/gms/internal/ads/j9;Lcom/google/android/gms/internal/ads/k9;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/f8;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/ads/j9<",
            "TI;>;",
            "Lcom/google/android/gms/internal/ads/k9<",
            "TO;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/r9;->c:Lcom/google/android/gms/internal/ads/f8;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/r9;->d:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/r9;->b:Lcom/google/android/gms/internal/ads/j9;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/r9;->a:Lcom/google/android/gms/internal/ads/k9;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/r9;)Lcom/google/android/gms/internal/ads/k9;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/r9;->a:Lcom/google/android/gms/internal/ads/k9;

    return-object p0
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/r9;Lcom/google/android/gms/internal/ads/s8;Lcom/google/android/gms/internal/ads/e9;Ljava/lang/Object;Lcom/google/android/gms/internal/ads/ro;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/ads/r9;->a(Lcom/google/android/gms/internal/ads/s8;Lcom/google/android/gms/internal/ads/e9;Ljava/lang/Object;Lcom/google/android/gms/internal/ads/ro;)V

    return-void
.end method

.method private final a(Lcom/google/android/gms/internal/ads/s8;Lcom/google/android/gms/internal/ads/e9;Ljava/lang/Object;Lcom/google/android/gms/internal/ads/ro;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/s8;",
            "Lcom/google/android/gms/internal/ads/e9;",
            "TI;",
            "Lcom/google/android/gms/internal/ads/ro<",
            "TO;>;)V"
        }
    .end annotation

    :try_start_0
    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->c()Lcom/google/android/gms/internal/ads/gl;

    invoke-static {}, Lcom/google/android/gms/internal/ads/gl;->b()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/ads/p4;->o:Lcom/google/android/gms/internal/ads/j5;

    new-instance v2, Lcom/google/android/gms/internal/ads/w9;

    invoke-direct {v2, p0, p1, p4}, Lcom/google/android/gms/internal/ads/w9;-><init>(Lcom/google/android/gms/internal/ads/r9;Lcom/google/android/gms/internal/ads/s8;Lcom/google/android/gms/internal/ads/ro;)V

    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/internal/ads/j5;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/l5;)V

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    const-string v2, "id"

    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "args"

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/r9;->b:Lcom/google/android/gms/internal/ads/j9;

    invoke-interface {v2, p3}, Lcom/google/android/gms/internal/ads/j9;->a(Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object p3

    invoke-virtual {v1, v0, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/r9;->d:Ljava/lang/String;

    invoke-interface {p2, p3, v1}, Lcom/google/android/gms/internal/ads/c8;->b(Ljava/lang/String;Lorg/json/JSONObject;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p2

    :try_start_1
    invoke-virtual {p4, p2}, Lcom/google/android/gms/internal/ads/ro;->a(Ljava/lang/Throwable;)Z

    const-string p3, "Unable to invokeJavascript"

    invoke-static {p3, p2}, Lcom/google/android/gms/internal/ads/co;->b(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/s8;->c()V

    return-void

    :catchall_0
    move-exception p2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/s8;->c()V

    throw p2
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/lo1;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TI;)",
            "Lcom/google/android/gms/internal/ads/lo1<",
            "TO;>;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/r9;->b(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/lo1;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TI;)",
            "Lcom/google/android/gms/internal/ads/lo1<",
            "TO;>;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/ads/ro;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/ro;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/r9;->c:Lcom/google/android/gms/internal/ads/f8;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/f8;->b(Lcom/google/android/gms/internal/ads/eq1;)Lcom/google/android/gms/internal/ads/s8;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/ads/u9;

    invoke-direct {v2, p0, v1, p1, v0}, Lcom/google/android/gms/internal/ads/u9;-><init>(Lcom/google/android/gms/internal/ads/r9;Lcom/google/android/gms/internal/ads/s8;Ljava/lang/Object;Lcom/google/android/gms/internal/ads/ro;)V

    new-instance p1, Lcom/google/android/gms/internal/ads/t9;

    invoke-direct {p1, p0, v0, v1}, Lcom/google/android/gms/internal/ads/t9;-><init>(Lcom/google/android/gms/internal/ads/r9;Lcom/google/android/gms/internal/ads/ro;Lcom/google/android/gms/internal/ads/s8;)V

    invoke-virtual {v1, v2, p1}, Lcom/google/android/gms/internal/ads/yo;->a(Lcom/google/android/gms/internal/ads/vo;Lcom/google/android/gms/internal/ads/to;)V

    return-object v0
.end method
