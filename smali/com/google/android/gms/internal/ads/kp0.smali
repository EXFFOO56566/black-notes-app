.class final synthetic Lcom/google/android/gms/internal/ads/kp0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/ln1;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/jp0;

.field private final b:Lcom/google/android/gms/internal/ads/zf;

.field private final c:I


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/jp0;Lcom/google/android/gms/internal/ads/zf;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/kp0;->a:Lcom/google/android/gms/internal/ads/jp0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/kp0;->b:Lcom/google/android/gms/internal/ads/zf;

    iput p3, p0, Lcom/google/android/gms/internal/ads/kp0;->c:I

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/lo1;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/kp0;->a:Lcom/google/android/gms/internal/ads/jp0;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/kp0;->b:Lcom/google/android/gms/internal/ads/zf;

    iget v2, p0, Lcom/google/android/gms/internal/ads/kp0;->c:I

    check-cast p1, Lcom/google/android/gms/internal/ads/ar0;

    invoke-virtual {v0, v1, v2, p1}, Lcom/google/android/gms/internal/ads/jp0;->a(Lcom/google/android/gms/internal/ads/zf;ILcom/google/android/gms/internal/ads/ar0;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    return-object p1
.end method
