.class final synthetic Lcom/google/android/gms/internal/ads/vu0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/ln1;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/wu0;

.field private final b:Lcom/google/android/gms/internal/ads/id1;

.field private final c:Lcom/google/android/gms/internal/ads/gl0;

.field private final d:Lcom/google/android/gms/internal/ads/vd1;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/wu0;Lcom/google/android/gms/internal/ads/id1;Lcom/google/android/gms/internal/ads/gl0;Lcom/google/android/gms/internal/ads/vd1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/vu0;->a:Lcom/google/android/gms/internal/ads/wu0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/vu0;->b:Lcom/google/android/gms/internal/ads/id1;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/vu0;->c:Lcom/google/android/gms/internal/ads/gl0;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/vu0;->d:Lcom/google/android/gms/internal/ads/vd1;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/lo1;
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/vu0;->a:Lcom/google/android/gms/internal/ads/wu0;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/vu0;->b:Lcom/google/android/gms/internal/ads/id1;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/vu0;->c:Lcom/google/android/gms/internal/ads/gl0;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/vu0;->d:Lcom/google/android/gms/internal/ads/vd1;

    invoke-virtual {v0, v1, v2, v3, p1}, Lcom/google/android/gms/internal/ads/wu0;->a(Lcom/google/android/gms/internal/ads/id1;Lcom/google/android/gms/internal/ads/gl0;Lcom/google/android/gms/internal/ads/vd1;Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    return-object p1
.end method
