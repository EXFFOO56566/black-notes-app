.class final synthetic Lcom/google/android/gms/internal/ads/j11;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/ln1;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/zf;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zf;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/j11;->a:Lcom/google/android/gms/internal/ads/zf;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/lo1;
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/j11;->a:Lcom/google/android/gms/internal/ads/zf;

    check-cast p1, Ljava/io/InputStream;

    new-instance v1, Lcom/google/android/gms/internal/ads/l11;

    new-instance v2, Landroid/util/JsonReader;

    new-instance v3, Ljava/io/InputStreamReader;

    invoke-direct {v3, p1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v2, v3}, Landroid/util/JsonReader;-><init>(Ljava/io/Reader;)V

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/ads/l11;-><init>(Landroid/util/JsonReader;)V

    iget-object p1, v0, Lcom/google/android/gms/internal/ads/zf;->b:Landroid/os/Bundle;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/l11;->a(Landroid/os/Bundle;)Lcom/google/android/gms/internal/ads/l11;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/yn1;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    return-object p1
.end method
