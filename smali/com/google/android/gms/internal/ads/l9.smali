.class public final Lcom/google/android/gms/internal/ads/l9;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static final a:Ljava/nio/charset/Charset;

.field public static final b:Lcom/google/android/gms/internal/ads/m9;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/m9<",
            "Lorg/json/JSONObject;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Lcom/google/android/gms/internal/ads/k9;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/k9<",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "UTF-8"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/l9;->a:Ljava/nio/charset/Charset;

    new-instance v0, Lcom/google/android/gms/internal/ads/n9;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/n9;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/l9;->b:Lcom/google/android/gms/internal/ads/m9;

    sget-object v0, Lcom/google/android/gms/internal/ads/o9;->a:Lcom/google/android/gms/internal/ads/k9;

    sput-object v0, Lcom/google/android/gms/internal/ads/l9;->c:Lcom/google/android/gms/internal/ads/k9;

    return-void
.end method

.method static final synthetic a(Lorg/json/JSONObject;)Ljava/io/InputStream;
    .locals 2

    new-instance v0, Ljava/io/ByteArrayInputStream;

    invoke-virtual {p0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p0

    sget-object v1, Lcom/google/android/gms/internal/ads/l9;->a:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    return-object v0
.end method
