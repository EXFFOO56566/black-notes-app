.class final synthetic Lcom/google/android/gms/internal/ads/yk0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/fh2;


# instance fields
.field private final b:Lcom/google/android/gms/internal/ads/ws;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/ws;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/yk0;->b:Lcom/google/android/gms/internal/ads/ws;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/hh2;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/yk0;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->P()Lcom/google/android/gms/internal/ads/ju;

    move-result-object v0

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/hh2;->d:Landroid/graphics/Rect;

    iget v1, p1, Landroid/graphics/Rect;->left:I

    iget p1, p1, Landroid/graphics/Rect;->top:I

    const/4 v2, 0x0

    invoke-interface {v0, v1, p1, v2}, Lcom/google/android/gms/internal/ads/ju;->a(IIZ)V

    return-void
.end method
