.class final synthetic Lcom/google/android/gms/internal/ads/lp0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/ln1;


# static fields
.field static final a:Lcom/google/android/gms/internal/ads/ln1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/lp0;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/lp0;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/lp0;->a:Lcom/google/android/gms/internal/ads/ln1;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/lo1;
    .locals 0

    check-cast p1, Ljava/util/concurrent/ExecutionException;

    invoke-virtual {p1}, Ljava/util/concurrent/ExecutionException;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/yn1;->a(Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    return-object p1
.end method
