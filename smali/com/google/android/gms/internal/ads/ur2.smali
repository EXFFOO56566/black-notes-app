.class final synthetic Lcom/google/android/gms/internal/ads/ur2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/nl1;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/vr2;

.field private final b:Lcom/google/android/gms/internal/ads/kr2;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/vr2;Lcom/google/android/gms/internal/ads/kr2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ur2;->a:Lcom/google/android/gms/internal/ads/vr2;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/ur2;->b:Lcom/google/android/gms/internal/ads/kr2;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ur2;->a:Lcom/google/android/gms/internal/ads/vr2;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ur2;->b:Lcom/google/android/gms/internal/ads/kr2;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/vr2;->b(Lcom/google/android/gms/internal/ads/kr2;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
