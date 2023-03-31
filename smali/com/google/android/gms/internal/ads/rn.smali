.class final Lcom/google/android/gms/internal/ads/rn;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/tn;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/sn;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/un;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ads/un;-><init>(Lcom/google/android/gms/internal/ads/rn;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method
