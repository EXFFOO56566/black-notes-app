.class public final Lcom/google/android/gms/internal/ads/da;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/ln1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<I:",
        "Ljava/lang/Object;",
        "O:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/ln1<",
        "TI;TO;>;"
    }
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

.field private final c:Ljava/lang/String;

.field private final d:Lcom/google/android/gms/internal/ads/lo1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/lo1<",
            "Lcom/google/android/gms/internal/ads/e9;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/lo1;Ljava/lang/String;Lcom/google/android/gms/internal/ads/j9;Lcom/google/android/gms/internal/ads/k9;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/lo1<",
            "Lcom/google/android/gms/internal/ads/e9;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/ads/j9<",
            "TI;>;",
            "Lcom/google/android/gms/internal/ads/k9<",
            "TO;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/da;->d:Lcom/google/android/gms/internal/ads/lo1;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/da;->c:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/da;->b:Lcom/google/android/gms/internal/ads/j9;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/da;->a:Lcom/google/android/gms/internal/ads/k9;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/da;)Lcom/google/android/gms/internal/ads/k9;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/da;->a:Lcom/google/android/gms/internal/ads/k9;

    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/lo1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TI;)",
            "Lcom/google/android/gms/internal/ads/lo1<",
            "TO;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/da;->d:Lcom/google/android/gms/internal/ads/lo1;

    new-instance v1, Lcom/google/android/gms/internal/ads/ca;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/ads/ca;-><init>(Lcom/google/android/gms/internal/ads/da;Ljava/lang/Object;)V

    sget-object p1, Lcom/google/android/gms/internal/ads/jo;->f:Lcom/google/android/gms/internal/ads/ko1;

    invoke-static {v0, v1, p1}, Lcom/google/android/gms/internal/ads/yn1;->a(Lcom/google/android/gms/internal/ads/lo1;Lcom/google/android/gms/internal/ads/ln1;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    return-object p1
.end method

.method final synthetic a(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/e9;)Lcom/google/android/gms/internal/ads/lo1;
    .locals 4

    new-instance v0, Lcom/google/android/gms/internal/ads/ro;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/ro;-><init>()V

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->c()Lcom/google/android/gms/internal/ads/gl;

    invoke-static {}, Lcom/google/android/gms/internal/ads/gl;->b()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/google/android/gms/internal/ads/p4;->o:Lcom/google/android/gms/internal/ads/j5;

    new-instance v3, Lcom/google/android/gms/internal/ads/fa;

    invoke-direct {v3, p0, v0}, Lcom/google/android/gms/internal/ads/fa;-><init>(Lcom/google/android/gms/internal/ads/da;Lcom/google/android/gms/internal/ads/ro;)V

    invoke-virtual {v2, v1, v3}, Lcom/google/android/gms/internal/ads/j5;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/l5;)V

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    const-string v3, "id"

    invoke-virtual {v2, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/da;->b:Lcom/google/android/gms/internal/ads/j9;

    invoke-interface {v1, p1}, Lcom/google/android/gms/internal/ads/j9;->a(Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object p1

    const-string v1, "args"

    invoke-virtual {v2, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/da;->c:Ljava/lang/String;

    invoke-interface {p2, p1, v2}, Lcom/google/android/gms/internal/ads/c8;->b(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-object v0
.end method
