.class final synthetic Lcom/google/android/gms/internal/ads/wh0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/ln1;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/lo1;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/lo1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/wh0;->a:Lcom/google/android/gms/internal/ads/lo1;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/lo1;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wh0;->a:Lcom/google/android/gms/internal/ads/lo1;

    check-cast p1, Lcom/google/android/gms/internal/ads/ws;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/ws;->i()Lcom/google/android/gms/internal/ads/rt;

    move-result-object p1

    if-eqz p1, :cond_0

    return-object v0

    :cond_0
    new-instance p1, Lcom/google/android/gms/internal/ads/pw0;

    const/4 v0, 0x0

    const-string v1, "Retrieve video view in instream ad response failed."

    invoke-direct {p1, v1, v0}, Lcom/google/android/gms/internal/ads/pw0;-><init>(Ljava/lang/String;I)V

    throw p1
.end method
