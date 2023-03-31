.class final synthetic Lcom/google/android/gms/internal/ads/nx0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/iu;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/gl0;

.field private final b:Lcom/google/android/gms/internal/ads/ws;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/gl0;Lcom/google/android/gms/internal/ads/ws;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/nx0;->a:Lcom/google/android/gms/internal/ads/gl0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/nx0;->b:Lcom/google/android/gms/internal/ads/ws;

    return-void
.end method


# virtual methods
.method public final a(Z)V
    .locals 1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/nx0;->a:Lcom/google/android/gms/internal/ads/gl0;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/nx0;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/gl0;->a()V

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->x()V

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->P()Lcom/google/android/gms/internal/ads/ju;

    move-result-object p1

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/ju;->a()V

    return-void
.end method
