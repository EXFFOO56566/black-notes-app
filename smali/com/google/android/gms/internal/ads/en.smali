.class public final Lcom/google/android/gms/internal/ads/en;
.super Lcom/google/android/gms/internal/ads/sk;
.source ""


# instance fields
.field private final c:Lcom/google/android/gms/internal/ads/io;

.field private final d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->c()Lcom/google/android/gms/internal/ads/gl;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/gl;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p3, p1}, Lcom/google/android/gms/internal/ads/en;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/sk;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/ads/io;

    invoke-direct {v0, p2}, Lcom/google/android/gms/internal/ads/io;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/en;->c:Lcom/google/android/gms/internal/ads/io;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/en;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/en;->c:Lcom/google/android/gms/internal/ads/io;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/en;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/io;->a(Ljava/lang/String;)V

    return-void
.end method
