.class final synthetic Lcom/google/android/gms/internal/ads/er0;
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

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/er0;->a:Lcom/google/android/gms/internal/ads/zf;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/lo1;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/er0;->a:Lcom/google/android/gms/internal/ads/zf;

    check-cast p1, Ljava/io/InputStream;

    new-instance v1, Ljava/lang/String;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/sm1;->a(Ljava/io/InputStream;)[B

    move-result-object p1

    sget-object v2, Lcom/google/android/gms/internal/ads/vk1;->a:Ljava/nio/charset/Charset;

    invoke-direct {v1, p1, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zf;->l:Ljava/lang/String;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/yn1;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    return-object p1
.end method
