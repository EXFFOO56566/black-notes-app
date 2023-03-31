.class final synthetic Lcom/google/android/gms/internal/ads/rv0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/ln1;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/pv0;

.field private final b:Lcom/google/android/gms/internal/ads/vd1;

.field private final c:Lcom/google/android/gms/internal/ads/id1;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/pv0;Lcom/google/android/gms/internal/ads/vd1;Lcom/google/android/gms/internal/ads/id1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/rv0;->a:Lcom/google/android/gms/internal/ads/pv0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/rv0;->b:Lcom/google/android/gms/internal/ads/vd1;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/rv0;->c:Lcom/google/android/gms/internal/ads/id1;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/lo1;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/rv0;->a:Lcom/google/android/gms/internal/ads/pv0;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/rv0;->b:Lcom/google/android/gms/internal/ads/vd1;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/rv0;->c:Lcom/google/android/gms/internal/ads/id1;

    check-cast p1, Lorg/json/JSONArray;

    invoke-virtual {v0, v1, v2, p1}, Lcom/google/android/gms/internal/ads/pv0;->a(Lcom/google/android/gms/internal/ads/vd1;Lcom/google/android/gms/internal/ads/id1;Lorg/json/JSONArray;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    return-object p1
.end method
