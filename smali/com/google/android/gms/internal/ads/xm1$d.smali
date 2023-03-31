.class final Lcom/google/android/gms/internal/ads/xm1$d;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/ads/xm1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "d"
.end annotation


# static fields
.field static final c:Lcom/google/android/gms/internal/ads/xm1$d;

.field static final d:Lcom/google/android/gms/internal/ads/xm1$d;


# instance fields
.field final a:Z

.field final b:Ljava/lang/Throwable;
    .annotation runtime Lorg/checkerframework/checker/nullness/compatqual/NullableDecl;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    invoke-static {}, Lcom/google/android/gms/internal/ads/xm1;->g()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    sput-object v1, Lcom/google/android/gms/internal/ads/xm1$d;->d:Lcom/google/android/gms/internal/ads/xm1$d;

    sput-object v1, Lcom/google/android/gms/internal/ads/xm1$d;->c:Lcom/google/android/gms/internal/ads/xm1$d;

    return-void

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/ads/xm1$d;

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1}, Lcom/google/android/gms/internal/ads/xm1$d;-><init>(ZLjava/lang/Throwable;)V

    sput-object v0, Lcom/google/android/gms/internal/ads/xm1$d;->d:Lcom/google/android/gms/internal/ads/xm1$d;

    new-instance v0, Lcom/google/android/gms/internal/ads/xm1$d;

    const/4 v2, 0x1

    invoke-direct {v0, v2, v1}, Lcom/google/android/gms/internal/ads/xm1$d;-><init>(ZLjava/lang/Throwable;)V

    sput-object v0, Lcom/google/android/gms/internal/ads/xm1$d;->c:Lcom/google/android/gms/internal/ads/xm1$d;

    return-void
.end method

.method constructor <init>(ZLjava/lang/Throwable;)V
    .locals 0
    .param p2    # Ljava/lang/Throwable;
        .annotation runtime Lorg/checkerframework/checker/nullness/compatqual/NullableDecl;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/xm1$d;->a:Z

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/xm1$d;->b:Ljava/lang/Throwable;

    return-void
.end method
