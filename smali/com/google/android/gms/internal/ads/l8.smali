.class final synthetic Lcom/google/android/gms/internal/ads/l8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final b:Lcom/google/android/gms/internal/ads/r7;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ads/r7;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/l8;->b:Lcom/google/android/gms/internal/ads/r7;

    return-void
.end method

.method static a(Lcom/google/android/gms/internal/ads/r7;)Ljava/lang/Runnable;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/l8;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/l8;-><init>(Lcom/google/android/gms/internal/ads/r7;)V

    return-object v0
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/l8;->b:Lcom/google/android/gms/internal/ads/r7;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/r7;->destroy()V

    return-void
.end method
