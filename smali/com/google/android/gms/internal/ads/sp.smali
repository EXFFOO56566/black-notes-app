.class final synthetic Lcom/google/android/gms/internal/ads/sp;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final b:Lcom/google/android/gms/internal/ads/rp;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ads/rp;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/sp;->b:Lcom/google/android/gms/internal/ads/rp;

    return-void
.end method

.method static a(Lcom/google/android/gms/internal/ads/rp;)Ljava/lang/Runnable;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/sp;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/sp;-><init>(Lcom/google/android/gms/internal/ads/rp;)V

    return-object v0
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sp;->b:Lcom/google/android/gms/internal/ads/rp;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/rp;->d()V

    return-void
.end method
