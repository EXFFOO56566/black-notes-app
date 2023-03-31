.class final synthetic Lcom/google/android/gms/internal/ads/ov0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/ln1;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/pv0;

.field private final b:Lcom/google/android/gms/internal/ads/id1;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/pv0;Lcom/google/android/gms/internal/ads/id1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ov0;->a:Lcom/google/android/gms/internal/ads/pv0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/ov0;->b:Lcom/google/android/gms/internal/ads/id1;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/lo1;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ov0;->a:Lcom/google/android/gms/internal/ads/pv0;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ov0;->b:Lcom/google/android/gms/internal/ads/id1;

    check-cast p1, Lcom/google/android/gms/internal/ads/jj0;

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/internal/ads/pv0;->a(Lcom/google/android/gms/internal/ads/id1;Lcom/google/android/gms/internal/ads/jj0;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    return-object p1
.end method
