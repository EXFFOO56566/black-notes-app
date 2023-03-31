.class final Lcom/google/android/gms/internal/ads/xm1$l;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/ads/xm1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "l"
.end annotation


# static fields
.field static final c:Lcom/google/android/gms/internal/ads/xm1$l;


# instance fields
.field volatile a:Ljava/lang/Thread;
    .annotation runtime Lorg/checkerframework/checker/nullness/compatqual/NullableDecl;
    .end annotation
.end field

.field volatile b:Lcom/google/android/gms/internal/ads/xm1$l;
    .annotation runtime Lorg/checkerframework/checker/nullness/compatqual/NullableDecl;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/xm1$l;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/xm1$l;-><init>(Z)V

    sput-object v0, Lcom/google/android/gms/internal/ads/xm1$l;->c:Lcom/google/android/gms/internal/ads/xm1$l;

    return-void
.end method

.method constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lcom/google/android/gms/internal/ads/xm1;->f()Lcom/google/android/gms/internal/ads/xm1$b;

    move-result-object v0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v0, p0, v1}, Lcom/google/android/gms/internal/ads/xm1$b;->a(Lcom/google/android/gms/internal/ads/xm1$l;Ljava/lang/Thread;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method final a(Lcom/google/android/gms/internal/ads/xm1$l;)V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/ads/xm1;->f()Lcom/google/android/gms/internal/ads/xm1$b;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lcom/google/android/gms/internal/ads/xm1$b;->a(Lcom/google/android/gms/internal/ads/xm1$l;Lcom/google/android/gms/internal/ads/xm1$l;)V

    return-void
.end method
