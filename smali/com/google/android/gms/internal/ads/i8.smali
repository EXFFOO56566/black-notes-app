.class final synthetic Lcom/google/android/gms/internal/ads/i8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final b:Lcom/google/android/gms/internal/ads/f8;

.field private final c:Lcom/google/android/gms/internal/ads/w8;

.field private final d:Lcom/google/android/gms/internal/ads/r7;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/f8;Lcom/google/android/gms/internal/ads/w8;Lcom/google/android/gms/internal/ads/r7;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/i8;->b:Lcom/google/android/gms/internal/ads/f8;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/i8;->c:Lcom/google/android/gms/internal/ads/w8;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/i8;->d:Lcom/google/android/gms/internal/ads/r7;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/i8;->b:Lcom/google/android/gms/internal/ads/f8;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/i8;->c:Lcom/google/android/gms/internal/ads/w8;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/i8;->d:Lcom/google/android/gms/internal/ads/r7;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/f8;->a(Lcom/google/android/gms/internal/ads/w8;Lcom/google/android/gms/internal/ads/r7;)V

    return-void
.end method
