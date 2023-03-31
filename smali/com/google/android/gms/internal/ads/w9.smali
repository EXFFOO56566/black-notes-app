.class final Lcom/google/android/gms/internal/ads/w9;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/l5;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/s8;

.field private final b:Lcom/google/android/gms/internal/ads/ro;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/ro<",
            "TO;>;"
        }
    .end annotation
.end field

.field private final synthetic c:Lcom/google/android/gms/internal/ads/r9;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/r9;Lcom/google/android/gms/internal/ads/s8;Lcom/google/android/gms/internal/ads/ro;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/s8;",
            "Lcom/google/android/gms/internal/ads/ro<",
            "TO;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/w9;->c:Lcom/google/android/gms/internal/ads/r9;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/w9;->a:Lcom/google/android/gms/internal/ads/s8;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/w9;->b:Lcom/google/android/gms/internal/ads/ro;

    return-void
.end method


# virtual methods
.method public final a(Lorg/json/JSONObject;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/w9;->b:Lcom/google/android/gms/internal/ads/ro;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/w9;->c:Lcom/google/android/gms/internal/ads/r9;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/r9;->a(Lcom/google/android/gms/internal/ads/r9;)Lcom/google/android/gms/internal/ads/k9;

    move-result-object v1

    invoke-interface {v1, p1}, Lcom/google/android/gms/internal/ads/k9;->a(Lorg/json/JSONObject;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/ro;->b(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catch_0
    :goto_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/w9;->a:Lcom/google/android/gms/internal/ads/s8;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/s8;->c()V

    return-void

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p1

    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/w9;->b:Lcom/google/android/gms/internal/ads/ro;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/ro;->a(Ljava/lang/Throwable;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :goto_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/w9;->a:Lcom/google/android/gms/internal/ads/s8;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/s8;->c()V

    throw p1
.end method

.method public final b(Ljava/lang/String;)V
    .locals 2

    if-nez p1, :cond_0

    :try_start_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/w9;->b:Lcom/google/android/gms/internal/ads/ro;

    new-instance v0, Lcom/google/android/gms/internal/ads/f9;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/f9;-><init>()V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/ro;->a(Ljava/lang/Throwable;)Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/w9;->b:Lcom/google/android/gms/internal/ads/ro;

    new-instance v1, Lcom/google/android/gms/internal/ads/f9;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/ads/f9;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/ro;->a(Ljava/lang/Throwable;)Z
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catch_0
    :goto_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/w9;->a:Lcom/google/android/gms/internal/ads/s8;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/s8;->c()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/w9;->a:Lcom/google/android/gms/internal/ads/s8;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/s8;->c()V

    throw p1
.end method
