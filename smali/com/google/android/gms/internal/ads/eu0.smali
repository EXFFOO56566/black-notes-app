.class final synthetic Lcom/google/android/gms/internal/ads/eu0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/l20;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/le1;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ads/le1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/eu0;->a:Lcom/google/android/gms/internal/ads/le1;

    return-void
.end method

.method static a(Lcom/google/android/gms/internal/ads/le1;)Lcom/google/android/gms/internal/ads/l20;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/eu0;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/eu0;-><init>(Lcom/google/android/gms/internal/ads/le1;)V

    return-object v0
.end method


# virtual methods
.method public final getVideoController()Lcom/google/android/gms/internal/ads/rp2;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/eu0;->a:Lcom/google/android/gms/internal/ads/le1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/le1;->b()Lcom/google/android/gms/internal/ads/rp2;

    move-result-object v0

    return-object v0
.end method
