.class final synthetic Lcom/google/android/gms/internal/ads/ir;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/xe2;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/er;

.field private final b:Lcom/google/android/gms/internal/ads/xe2;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/er;Lcom/google/android/gms/internal/ads/xe2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ir;->a:Lcom/google/android/gms/internal/ads/er;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/ir;->b:Lcom/google/android/gms/internal/ads/xe2;

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/ads/ye2;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ir;->a:Lcom/google/android/gms/internal/ads/er;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ir;->b:Lcom/google/android/gms/internal/ads/xe2;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/er;->a(Lcom/google/android/gms/internal/ads/xe2;)Lcom/google/android/gms/internal/ads/ye2;

    move-result-object v0

    return-object v0
.end method
