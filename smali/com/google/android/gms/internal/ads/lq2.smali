.class public final Lcom/google/android/gms/internal/ads/lq2;
.super Lcom/google/android/gms/internal/ads/ep2;
.source ""


# instance fields
.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/ep2;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/lq2;->b:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/lq2;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final B1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/lq2;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final U0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/lq2;->b:Ljava/lang/String;

    return-object v0
.end method
