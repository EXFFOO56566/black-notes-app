.class final synthetic Lcom/google/android/gms/internal/ads/mi0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/iu;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/gi0;

.field private final b:Lcom/google/android/gms/internal/ads/ws;

.field private final c:Lcom/google/android/gms/internal/ads/so;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/gi0;Lcom/google/android/gms/internal/ads/ws;Lcom/google/android/gms/internal/ads/so;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/mi0;->a:Lcom/google/android/gms/internal/ads/gi0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/mi0;->b:Lcom/google/android/gms/internal/ads/ws;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/mi0;->c:Lcom/google/android/gms/internal/ads/so;

    return-void
.end method


# virtual methods
.method public final a(Z)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/mi0;->a:Lcom/google/android/gms/internal/ads/gi0;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/mi0;->b:Lcom/google/android/gms/internal/ads/ws;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/mi0;->c:Lcom/google/android/gms/internal/ads/so;

    invoke-virtual {v0, v1, v2, p1}, Lcom/google/android/gms/internal/ads/gi0;->b(Lcom/google/android/gms/internal/ads/ws;Lcom/google/android/gms/internal/ads/so;Z)V

    return-void
.end method
